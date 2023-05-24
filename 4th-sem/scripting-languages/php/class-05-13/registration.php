<?php
    if (isset($_POST['fname']) && isset($_POST['lname']) && isset($_POST["email"])) {  
    // isset is used just to counter error produced when running file w/ xampp. 
    // error isn't produced while using php's localserver
        $firstName = $_POST['fname'];
        $lastName = $_POST['lname'];
        $email = $_POST['email'];
        if (preg_match("/^[a-zA-z]*$/", $firstName) && preg_match("/^[a-zA-z]*$/", $lastName)) {
            echo $firstName .' '.$lastName.'<br>';
        } else echo "only letters are allowed<br>";
        if (filter_var($email, FILTER_VALIDATE_EMAIL)) echo "Valid email address<br>";
        else echo "Invalid email address<br>";
    }
?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body>
    
        <h2>Registration form</h2>
        <form action="" method="post">
            <label>First Name <input type="text" name="fname"></label><br>
            <label>Last Name <input type="text" name="lname"></label><br>
            <label>Email <input type="text" name="email"></label><br>
        
            <button type="submit">Submit </button>
        </form>
    </body>
</html>
