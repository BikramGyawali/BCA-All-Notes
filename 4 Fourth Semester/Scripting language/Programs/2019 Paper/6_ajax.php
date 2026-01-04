<?php
// if (isset($_POST["username"])) {
//     echo "Welcome " . $_POST["username"];
// } else {
//     echo "No data received";
// }

//for get

if(isset($_GET['username'])){
	echo "Welcome " .$_GET['username']. " to our page";
}
else{
	echo"No data found";
}
?>
