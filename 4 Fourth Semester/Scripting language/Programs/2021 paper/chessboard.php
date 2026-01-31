

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
	<style>
		table{
		border:1px solid;
		
		
		}
  td{
	height:50px;
	width:50px;
  }
  .white{
	background-color:white;
  }
  .black{
	background-color:black;
  }
	</style>
</head>
<body>
 <table>
	 <?php
$row= 8;
$column=8;
for($i=1;$i<=$row;$i++){
	echo "<tr>";
	for($j=1;$j<=$column;$j++){
    if(($i+$j)%2==0){
		echo "<td class='white'> </td>";
	}
	else{
		echo  "<td class='black'> </td>";
	}
	}
}

echo"</tr>";
?>

 </table>
</body>
</html>