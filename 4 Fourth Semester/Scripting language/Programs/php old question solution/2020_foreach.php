
<!-- Explain an array using suitable example and discuss how foreach loop accessing of elements is stored in an array using PHP.
 
-->

<?php
 $numbers= [1,2,3,4,5];
$users=array("name"=>"Bikram Gyawali",
	"address"=>"ktm");
	
 foreach($numbers as $n){
	echo "Number in the array". $n."<br>";
 }
 foreach($users as $key=>$value){
	echo $key." : ".$value ."<br>";
 }
?>