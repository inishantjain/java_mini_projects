<%@page language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Simple Form</title>
    <link rel="stylesheet" type="text/css" href="styles.css" />
  </head>
  <body>
    <div class="container">
      <h2>Details saved by form</h2>
      <div>
        <!--this way only works with session object-->
        <!--<p>Name : <%= session.getAttribute("name") %> </p>
            <p>Email : <%= session.getAttribute("email") %> </p>-->
        <!--easy way using curly braces-->
        <!-- <p>Name : <%= session.getAttribute("name") %> </p>
            <p>Email : <%= session.getAttribute("email") %> </p> -->
        <p>${user}</p>
        <p></p>
        <p>Welcome to the ${course} course.</p>
      </div>
    </div>
  </body>
</html>
