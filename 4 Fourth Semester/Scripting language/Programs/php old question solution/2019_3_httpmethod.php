<!-- Explain the two HTTP functions to accept the user values from interface with suitable PHP program -->


<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
</head>
<body>
	<?php
	//for get 
	if(isset($_GET["getdata"])){
		$user=$_GET["username"];
		echo"Wlecome Back" . $user;
		exit();
	}

	if(isset($_POST["postdata"])){
		$user=$_POST["username"];
		echo"Wlecome Back" . $user;
		exit();
	}
	?>
	<form action="<?php echo $_SERVER['PHP_SELF'] ?>" method="get">
	UserName:	<input type="text" name="username">
<input type="submit" name="getdata" value="Submit Get">
	</form>  <br>
	<form action="<?php echo $_SERVER['PHP_SELF'] ?>" method="post">
	UserName:	<input type="text" name="username">
<input type="submit" name="postdata" value="Submit Post">
	</form>  
</body>
</html>