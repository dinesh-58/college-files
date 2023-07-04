<!DOCTYPE html>
<html lang="en">
    <head>
        <title></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <?php
        // forces browser to load new css file when it has been changed.
        // for testing purposes. only works on dev computer.
        $fileName = 'style.css';
        $version = substr(md5(filemtime($fileName)), 0, 6);
        ?>

        <link rel="stylesheet" href="<?="$fileName?v=$version"?>">
    </head>

    <body>
        <dialog id="submitDialog">
            <p></p> 
            <button>OK</button>
        </dialog>

        <form method="get">
            <label>Full Name: <input type="text" name="fName" required></label>
            <label>Email: <input type="text" name="email" required></label>
            <label>Username: <input type="text" name="username" required placeholder="must start with number"></label>
            <label>Password: <input type="password" name="password" required></label>
            <button name="submit">Submit</button>
        </form>

        <script>
            const submitDialog = document.querySelector('#submitDialog');
            submitDialog.querySelector('button').onclick = () => submitDialog.close();
            const submitMessage = submitDialog.querySelector('p');
        </script>
    </body>
</html>

<?php
$isFormValid = true;
$errorMsgCombined = '';

function setError($errorMsg) {
    global $errorMsgCombined, $isFormValid; // f'ns don't inherit gloabl variables by default
    $isFormValid = false;
    $errorMsgCombined .= "<li>$errorMsg</li>";
}

if(isset($_GET['submit'])) {
    $fName = $_GET['fName'];
    // filter_input will return input value if valid, else returns false 
    $email = filter_input(INPUT_GET, 'email', FILTER_VALIDATE_EMAIL);
    $username = filter_input(INPUT_GET, 'username', FILTER_VALIDATE_REGEXP, ['options'=>['regexp'=>'/^[0-9]/']]);
    $password = $_GET['password'];
    $password = filter_input(INPUT_GET, 'password', FILTER_VALIDATE_REGEXP, ['options'=>['regexp'=>'/^\S{8}/']]);

    if(strlen($fName) > 40) setError('Name cannot exceed 40 characters');
    if($email == false) setError('Email must be name@domain.extension with extension of 3 letters');
    if($username == false) setError('username must start with a number');
    if($password == false) setError('password must be at least 8 characters');

    if($isFormValid) {
        // store in DB`
        // create connection
        $conn = new mysqli('localhost', 'root', '', 'scr-lab4');
        $sql = "insert into users(fullname, email, username, password) 
            values('$fName', '$email', '$username', '$password')";
        $result = $conn->query($sql);
        if($result) {
?>
        <!-- if block hasn't been closed yet so the script will only run if result is true-->
            <script type="text/javascript">
                submitDialog.showModal();
                submitMessage.innerText = 'Succesfully registered!';
                submitDialog.classList.add('submit-success');
            </script>
<?php
        }
    } else {  // runs if form isn't valid
        ?>
            <script>
                submitDialog.showModal();
                submitMessage.innerHTML='<?= "Error(s): <ul>$errorMsgCombined</ul>" ?>';
                submitDialog.classList.add('submit-fail');
            </script>
<?php
    }
}
?>
