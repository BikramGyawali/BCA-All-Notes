<?php

if(isset($_GET['user'])){
	echo "Welcome". $_GET['user'];
}else{
	echo "No data found";
}
?>