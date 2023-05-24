<?php
function getNumberOfArguements() {
    $numOfArgs = func_num_args();
    echo "Number of Arguements: $numOfArgs <br>";
}
getNumberOfArguements('a');

function twoArgs() {
    if (func_num_args() >= 2) echo "There are 2 or more arguements <br>";
else echo "Error: Please pass 2 or more arguements <br>";
}
twoArgs('a');

function getAllArguements() {
    $allArgs = func_get_args();
    var_dump($allArgs); // displays detailed variable info
}
//getAllArguements('a','b');

function sumAll() {
    $numArgs = func_num_args();
    $args = func_get_args();
    $sum = 0;
    /*
    for($i=0; $i<$numArgs; $i++) {
        $sum += $args[$i];     
    } 
    */
    foreach($args as $arg) {
        $sum += $arg;
    }
    return $sum;
}

echo sumAll().'<br>';
echo sumAll(2).'<br>';
echo sumAll(2,3).'<br>';

?>


