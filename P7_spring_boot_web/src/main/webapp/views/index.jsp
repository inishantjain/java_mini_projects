<%@page language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Form</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Simple Form</h2>
        <form action="addUser">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" value="nishant" placeholder="Enter your name" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" value="nishant@xyz" placeholder="Enter your email" required>
            </div>
            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>
