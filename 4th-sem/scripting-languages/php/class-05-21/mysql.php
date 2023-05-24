<?php
$host = 'localhost';
$username = 'root';
$password = '';
$db = 'student';

// connecting by creating an object for our connection
$connection = new mysqli($host, $username, $password); 
if ($connection->connect_errno != 0) die("connection failed");
echo "Connected!";
?>
