<?php
// Database connection
$server = "localhost";
$user = "root";
$pass = "";
$db = "oldquestion4thsem";

$conn = new mysqli($server, $user, $pass, $db);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Create table if not exists
$sql = "CREATE TABLE IF NOT EXISTS form (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(40),
    email VARCHAR(40),
    age VARCHAR(30) NOT NULL
)";
$conn->query($sql);

// Initialize variables for form
$name = $email = $age = "";
$update = false;
$id = 0;

// Handle Edit request
if (isset($_GET['edit'])) {
    $id = intval($_GET['edit']);
    $res = $conn->query("SELECT * FROM form WHERE id=$id");
    if ($res->num_rows == 1) {
        $row = $res->fetch_assoc();
        $name = $row['name'];
        $email = $row['email'];
        $age = $row['age'];
        $update = true;
    }
}

// Handle Delete request
if (isset($_GET['delete'])) {
    $id = intval($_GET['delete']);  //intvla is use to convert value to integer
    $conn->query("DELETE FROM form WHERE id=$id");
    header("Location: ".$_SERVER['PHP_SELF']);
    exit();
}

// Handle form submission
if ($_SERVER['REQUEST_METHOD'] === "POST" && isset($_POST['submit'])) {
    $name = ($_POST['name']);
    $email = ($_POST['email']);
    $age = ($_POST['age']);

    if (isset($_POST['id']) && $_POST['id'] != 0) {
        // Update existing record
        $id = intval($_POST['id']);
        $sql = "UPDATE form SET name='$name', email='$email', age='$age' WHERE id=$id";
        $conn->query($sql);
    } else {
        // Insert new record
        $sql = "INSERT INTO form (name, email, age) VALUES ('$name','$email','$age')";
        $conn->query($sql);
    }

    // Redirect to avoid resubmission
    header("Location: ".$_SERVER['PHP_SELF']);
    exit();
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CRUD Form</title>
</head>
<body>
    <h2><?php echo $update ? "Edit User" : "Add User"; ?></h2>
    <form action="" method="post">
        <input type="hidden" name="id" value="<?php echo $id; ?>">
        Name: <input type="text" name="name" value="<?php echo $name; ?>" required><br><br>
        Email: <input type="email" name="email" value="<?php echo $email; ?>" required><br><br>
        Age: <input type="text" name="age" value="<?php echo $age; ?>" required><br><br>
        <button type="submit" name="submit"><?php echo $update ? "Update" : "Add"; ?></button>
        <!-- <?php if ($update): ?>
            <a href="<?php echo $_SERVER['PHP_SELF']; ?>">Cancel</a>
        <?php endif; ?> -->
    </form>

    <hr>

    <h3>All Users</h3>
    <?php
    $result = $conn->query("SELECT * FROM form ORDER BY id ASC");
    if ($result->num_rows > 0) {
        echo "<table border='1' cellpadding='5' cellspacing='0'>";
        echo "<tr><th>ID</th><th>Name</th><th>Email</th><th>Age</th><th>Actions</th></tr>";
        while ($row = $result->fetch_assoc()) {
            echo "<tr>
                    <td>{$row['id']}</td>
                    <td>{$row['name']}</td>
                    <td>{$row['email']}</td>
                    <td>{$row['age']}</td>
                    <td>
                        <a href='?edit={$row['id']}'>Edit</a> |
                        <a href='?delete={$row['id']}' onclick=\"return confirm('Are you sure to delete?')\">Delete</a>
                    </td>
                  </tr>";
        }
        echo "</table>";
    } else {
        echo "No users found.";
    }

    $conn->close();
    ?>
</body>
</html>
