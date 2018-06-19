<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="NewFile.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Dosis|Poiret+One" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<h1 class="header">Sign Up</h1>
<div class="form-login">
<form action="/controllera" method="post">
 <input type="hidden" name="action" value="doInsert" />
<label>Firstname:</label><br />
<input class="frm" type="text" name="fname"><br />
<label>Lastname:</label><br />
<input class="frm" type="text" name="lname"><br />
<label>Email:</label><br />
<input class="frm" type="text" name="email"><br />
<label>Username:</label><br />
<input class="frm" type="text" name="uname"><br />
<label>Password</label><br />
<input class="frm" type="password" name="psw"><br /><br />
<input class="frm"type="submit" value="Register">



</form>


</div>

</body>
</html>