<?php
session_start();
if(isset($_SESSION['pageCount'])) $_SESSION['pageCount']+=1;
else $_SESSION['pageCount'] = 1;
echo "This page has been visited ". $_SESSION['pageCount']." times";
?>
