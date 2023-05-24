<?php
// filehandling

$fileName = "example.txt";

if (file_exists($fileName)) {
    // $file = fopen("./example.txt", "r");
    // -- or --    
    $file = fopen($fileName, "r");
    // $content = fread($file, 5);
    // -- or --    
    $content = fread($file, filesize($fileName));
    echo $content;
    fclose($file);
} else die("File doesn't exist");

// same process but shorter w/ pre-defined function
//

if (file_exists($fileName)) {
    readfile($fileName) or die("Error reading file") ;
} else die("File doesn't exist");

if (file_exists($fileName)) {
    $content = file_get_contents($fileName) or die("Error reading file") ;
    echo $content;
} else die("File doesn't exist");


// Writing

$data = "This is a test";
$file = fopen($fileName, "w");
fwrite($file, $data);
fclose($file);

// because this opens file in 'w' mode, no need for it to exist beforehand
file_put_contents("test-put.md", "Written using file_put_contents()"); 
// rename("test-put.md", $fileName); // do a lil trolling

$removeFname = "remove.txt";
if (file_exists($removeFname)) {
    unlink($removeFname);
}
?>
