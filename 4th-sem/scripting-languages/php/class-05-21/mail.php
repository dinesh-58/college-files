<?php
// mail()
$mailSent = mail("gurungsujal@hotmail.com", "Testing", "Hello");
if ($mailSent) echo "Sent";
else echo "Didn't send";
?>
