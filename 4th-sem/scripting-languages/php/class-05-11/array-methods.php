<?php
// array_merge
$boys = ['ram', 'shyam', 'hari'];
$girls = ['sita', 'rita', 'gita'];
$students = array_merge($boys, $girls);
// print_r($students);
//array_merge_recursive
    // array keys should be unique; can't be repeated
    // if multiple arrays have the same key,
    // this function creates separate array for elements w/ same key

$bikes = [
    "yamaha" => 'FZ-S',
    "pulsar" => '250',
    "hero" => 'honda'
];
$scooters = [
    "hero" => 'aaaaaa',
    "dio" => 'bbbbb'
];
$twoWheelers = array_merge_recursive($bikes, $scooters);
print_r($twoWheelers);

// sort() // in ascending order
// rsort() // in descending order
// these modify passed array itself rather than returning a sorted array;

$unsorted = [99, 3];
sort($unsorted);
print_r($unsorted);

// searching 
 // array_key_exists() // checks if given key or index exists
 $hasPulsar = array_key_exists('pulsar', $bikes);
print_r($hasPulsar);
//var_dump($hasPulsar);
//
// in_array()
$hasHero = in_array('hero', $bikes);
var_dump($hasHero);
?>
