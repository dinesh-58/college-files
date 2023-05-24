<?php
// setcookie('dark', 'true', time('tomorrow'));
setcookie('dark', 'true');

$darkMode = false;
if(isset($_COOKIE['dark'])) {
    if($_COOKIE['dark'] == 'true') $darkMode = true;
}
var_dump($darkMode);
?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/style.css" rel="stylesheet">

        <style>
            body {
                background-color: <?php echo $darkMode ? 'black' : 'white'; ?>;
                color: <?php echo $darkMode ? 'white' : 'black'; ?>;
            }
        </style>
    
    </head>
    <body> 
        <p>Lorem ipsum dolor sit amet, qui minim labore adipisicing minim sint cillum sint consectetur cupidatat.</p>
    </body>
</html>
