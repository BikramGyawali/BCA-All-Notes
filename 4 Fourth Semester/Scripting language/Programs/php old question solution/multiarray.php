<?php
 
 $array = [
	"os"=>[
		"bikram"=>30, "hari"=>40
	],
	"se"=>[
		"bikram"=>44, "hari"=>20
	],
	"nm"=>[
		"bikram"=>44, "hari"=>21
	],
	"sl"=>[
		"bikram"=>54, "hari"=>27
	],
	"dbms"=>[
		"bikram"=>42, "hari"=>23
	]
 ];
  $sum=["bikram"=>0, "hari"=>0];
  $count = count($array);
 foreach ($array as $subject){
	$sum["bikram"]+=$subject["bikram"];
	$sum["hari"]+=$subject["hari"];
 }
$avg=[
	"bikram"=>$sum["bikram"]/$count,
	"hari"=>$sum["hari"]/$count
];
echo"Average of Bikram ". $avg["bikram"] ."<br>";
echo "Avergae of Hari ". $avg["hari"];
//  print_r($array);

?>