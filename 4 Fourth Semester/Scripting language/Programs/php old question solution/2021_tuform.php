<?php
$server = "localhost";
$user = "root";
$pass = "";

// Create connection
$conn = new mysqli($server, $user, $pass);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Create database if not exists
$conn->query("CREATE DATABASE IF NOT EXISTS tuform");
$conn->select_db("tuform");

// Create table if not exists
$conn->query("
CREATE TABLE IF NOT EXISTS PROJECT(
    registernum INT PRIMARY KEY,
    email VARCHAR(50),
    file_name VARCHAR(100),
    upload_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)
");

$errors = [];
if ($_SERVER['REQUEST_METHOD'] === "POST" && isset($_POST["submit"])) {

    $registernum = trim($_POST['rnumber']);
    $email = trim($_POST["email"]);

    // Check mandatory fields
    if (empty($registernum) || empty($email)) {
        $errors[] = "Registration number and email are required.";
    }

    // Check email should not be proper
    if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $errors[] = "Email must be invalid.";
    }

    // Check if file is uploaded
    if (!isset($_FILES['file']) || $_FILES['file']['error'] === 4) {
        $errors[] = "Please upload your project file.";
    } else {
        $name = $_FILES['file']['name'];
        $size = $_FILES['file']['size'];
        $temp_name = $_FILES['file']['tmp_name'];

        $allowed = ['pdf', 'doc', 'docx', 'ppt', 'pptx', 'jpeg'];
        $ext = strtolower(pathinfo($name, PATHINFO_EXTENSION));

        if (!in_array($ext, $allowed)) {
            $errors[] = "Invalid file format. Allowed: pdf, doc, docx, ppt, pptx, jpeg.";
        }

        if ($size > (5 * 1024 * 1024)) {
            $errors[] = "File size must be less than 5 MB.";
        }
    }

    // Display errors
    if (!empty($errors)) {
        foreach ($errors as $error) {
            echo "<p style='color:red;'>* $error</p>";
        }
    } else {
        // Upload file
        if (!is_dir("uploads")) mkdir("uploads", 0777, true);
        move_uploaded_file($temp_name, "uploads/" . $name);

        // Insert data
        $statement = "INSERT INTO PROJECT (registernum, email, file_name) VALUES ('$registernum', '$email', '$name')";
        if ($conn->query($statement)) {
			 header("Location: " . $_SERVER['PHP_SELF'] );
    exit; 
            echo "<p style='color:green;'>Data entered successfully.</p>";
        } else {
            echo "<p style='color:red;'>Failed to insert data. Maybe duplicate registration number.</p>";
        }
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Project Submission Form</title>
    <style>
        table {
            border: 2px solid;
            border-collapse: collapse;
        }
        td {
            padding: 10px;
            border: 1px solid black;
        }
        button {
            padding: 5px 10px;
            border: 2px solid;
            border-radius: 5px;
            color: white;
            background: green;
            cursor: pointer;
        }
        button:hover {
            background: darkgreen;
        }
    </style>
</head>
<body>
    <h1>Online Project Submission Form</h1>
    <form action="" method="POST" enctype="multipart/form-data">
        <table>
            <tr>
                <td>TU Registration Number</td>
                <td><input type="number" name="rnumber" required></td>
            </tr>
            <tr>
                <td>Email Address</td>
                <td><input type="text" name="email" required></td>
            </tr>
            <tr>
                <td>Upload Your Project File (pdf, doc, docx, ppt, pptx, jpeg)</td>
                <td><input type="file" name="file" required></td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit" name="submit">Submit</button>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
