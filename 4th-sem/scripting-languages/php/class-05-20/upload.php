<?php
/**
 * php.ini settings required for file handling
 * a lot of these are already set by default but we can define custom values using ini_set()
 
file_uploads = On // enable file uploads
max_input_time = 60  // max time to spend parsing the file. error if it takes longer
max_file_uploads = 20 // max uploads at a time
memory_limit = 16M; 
post_max_size = 8M // Maximum size of a POST request 
upload_max_filesize = 2M
**/


if(isset($_POST['submit'])) { // just checking if submit button sends a POST request
// do not use else die for this condition because form will not be submitted at first load & die will automatically execute without even showing form to user
    if(isset($_FILES['photo']['error']) && $_FILES['photo']['error'] == 0) {
    // check if error key exists in FILES array & if there is no error
        $photo = $_FILES['photo'];
        $tmpName = $photo['tmp_name'];
        $destination = './uploads/photos/'.$photo['name']; // using original file name to set name
        $isUploaded = move_uploaded_file($tmpName, $destination);
        
        echo $isUploaded ? 'File uploaded successfully' : 'File upload failed';
    } else die('Error uploading file');
}
?>


<!DOCTYPE html>
<html lang="en">
    <head>
        <title></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
        <form method="post" enctype="multipart/form-data">
            <label>Upload a photo:
                <input type="file" name="photo" id="">
            </label>
            <button name="submit">Submit</button>
        </form>
    
    </body>
</html>
