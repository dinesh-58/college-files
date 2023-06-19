<?php

class LongMessageException extends Exception { // custom Exception class
}

function sendMessaege($message) {
    // if (strlen($message) > 20) throw new Exception('String message must be less than 20 characters'); 
    if ($message == '') throw new Exception('Must specify a message');
    if (strlen($message) > 20) throw new LongMessageException('String message must be less than 20 characters'); 
    echo $message;  // no need for else because if exception is thrown, program control moves to catch block
}

try {
    sendMessaege('test');
    sendMessaege('Lorem ipsum dolor sit amet, qui minim labore adipisicing minim sint cillum sint consectetur cupidatat.');
} 
catch(Exception $e) {    // only catches exceptions of Exception class i.e. executed only when generic error thrown
    echo 'Generic error: '.$e->getMessage();
}
catch(LongMessageException $lme) {    // only catches exceptions of LongMessageException class i.e. executed
    echo 'Error: '.$lme->getMessage();
}


