<?php
// complet file is inside htdocs
$conn = new mysqli('localhost', 'root', '');
$sql = 'select count(*) from student.students';

$resultSet = $con->query($sql);
var_dump($resultSet);
/*
if ($resultSet->num_rows) {
}
*/
