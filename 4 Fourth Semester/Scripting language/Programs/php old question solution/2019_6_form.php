<!-- Design following forms in HTML and write corresponding PHP and MySQL code to store the user's values after satisfying following validation rules.a. Length of Full name up to 40 charactersb. Email address must be valid email addressc. Username must be start with string and followed by number.d. Password length must be more than 8 characters. -->  

<?php
$server="localhost";
$user="root";
$pass="";

$conn = new mysqli($server,$user,$pass);
if (!$conn) {
    die("Connection failed: " . $conn->connect_error);
}

$conn->query("CREATE DATABASE IF NOT EXISTS OldQuestion4thsem");
$conn->select_db("OldQuestion4thsem");

$conn->query("
CREATE TABLE IF NOT EXISTS studentform (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(40),
    email VARCHAR(50),
    pass VARCHAR(200)
)");

if($_SERVER['REQUEST_METHOD']==="POST" && isset($_POST['submit'])){

    $name = trim($_POST["uname"]);
    $email = trim($_POST["email"]);
    $password = trim($_POST["pass"]);

    $errors = [];

    if(empty($name) || empty($email) || empty($password)){
        $errors[] = "All fields are required";
    }
 if(strlen($name)>40){
	$errors[]="User name must be less than 40";
 }
   
    if(!preg_match("/^[A-Za-z]+[0-9]+$/",$name)){
        $errors[] = "Username must start with letters followed by numbers (max 40 chars)";
    }


    if(!filter_var($email, FILTER_VALIDATE_EMAIL)){
        $errors[] = "Invalid email address";
    }

    if(strlen($password) < 8){
        $errors[] = "Password must be more than 8 characters";
    }

    if(!empty($errors)){
        foreach($errors as $error){
            echo "<p style='color:red;'>* $error</p>";
        }
    } else {

        $name = htmlspecialchars($name);
        $email = htmlspecialchars($email);
        $password = htmlspecialchars($password);

        $sql = "INSERT INTO studentform(username,email,pass)
                VALUES ('$name','$email','$password')";

        if($conn->query($sql)){
            echo "<p style='color:green;'>Data inserted successfully</p>";
        } else {
            echo "Insert failed";
        }
    }
}
?>


<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
</head>
<body>
<form action="" method="post">
	UserName: <input type="text" name="uname" id="uname"> <br>
	Email: <input type="email" name="email" id="email"> <br>
	Password: <input type="text" name="pass" id="pass"> <br>
	<input type="submit" name="submit" value="Submit">
</form>
</body>
</html>