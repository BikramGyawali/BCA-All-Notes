 
<?php
 $con = new mysqli("localhost","root","");
 if($con->connect_error){
	echo "Error message" . $con->connect_error;
 }
 $con->query("CREATE DATABASE IF NOT EXISTS OLDFORM");
 $con->select_db("OLDFORM");
 $con->query("
 CREATE TABLE IF NOT EXISTS DATA(
 name varchar(50),
 email varchar(50) ,
 country varchar(50),
 gender varchar(30)
 )
 ");
$errors=[];
$name=$email=$country=$gender="";
if($_SERVER['REQUEST_METHOD']==='POST' ){
$name= trim($_POST["name"]);
$email = trim($_POST["email"]);
$country =$_POST["country"]??"";
$gender= $_POST["gender"]??"";

if(empty($name)||empty($email)||empty($country)||empty($gender)){
	$errors[]="All fields are required";
}

if(!filter_var($email,FILTER_VALIDATE_EMAIL)){
	$errors[]="Invalid format of Email";
}
 if (!empty($errors)){
	foreach($errors as $error){
		echo "<p style='color:red';>. * $error .</p> ";
	}
 }
	else{
		$sql= "INSERT INTO DATA VALUES ('$name','$email','$country','$gender')";
		if($con->query($sql)){

			echo "<p style='color:green;'>Data entered successfully.</p>";
			header("Location: ". $_SERVER['PHP_SELF']);
		} else{
		echo "Inser Fail";
	}
	}
	
	$con->close();
 }
?>
 <!DOCTYPE html>
 <html lang="en">
 <head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
	  <style>
      form {
        display: flex;
        flex-direction: column;
        margin: 3px;
        padding: 3px;
      }
      input {
        padding: 2px;
      }
      label {
        margin: 5px;
      }
      button {
        width: 10%;
        margin: 4px;
        padding: 5px;
      }
     
    </style>
 </head>
 <body>
	  <form action="" method="post">
  
      <label for="name"> Name: <input type="text" id="name" name="name" value="<?php echo $name ?>"/></label>
   
      <label for="email"> Email <input type="text" id="email" name="email"  value="<?php echo $email ?>" /></label>
      
      <label for=""
        >Country:
        <select id="country" name="country">
          <option value="">Select Country</option>
          <option value="Nepal"
		  <?php echo ($country=="Nepal")?"selected":"" ?>
		  >Nepal</option>
          <option value="India"
		  <?php  echo ($country=="India")?"selected":""  ?>
		  >India</option>
        </select>
      </label>
      <label for="gender"
        >Gender: <input type="radio" name="gender" value="Male"
		<?php echo ($gender=="Male")?"checked":""  ?>
		 /> Male
        <input type="radio" name="gender" value="Female" 
		<?php  echo ($gender=="Female")?"checked":"" ?>
		/> Female
      </label>

    
     
      <button type="submit" name="submit">SignUp</button>
      
    </form>
 </body>
 </html>