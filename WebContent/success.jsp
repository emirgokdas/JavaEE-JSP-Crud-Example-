<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="style.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Dosis|Poiret+One" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Artifex</title>
</head>
<body>

<style>
body{
background-color:#34495e;
}

</style>
<div class="navbar">
<ul class="menu">
<a href=""><div class="logo">Artifex</div></a>
<a href="#"><li class="mli">Home</li></a>
<a href="#"><li class="mli">Profile</li></a>
<a href="#"><li class="mli">Messages</li></a>

</ul>

</div>
<div class="profile-side">
<h2>Profile</h2><hr>
<img src="profile-img.jpg">
<input type="submit" name="submit-img" value="Change Profile Image">
<hr>
<h3>Username</h3><hr>
<h3>Email</h3><hr>


</div>
<div class="category">
<h2>Category</h2><hr>
<ul class="cat-ul">
<a href="#"><li>Technology</li></a>
<a href="#"><li>Politics</li></a>
<a href="#"><li>Sport</li></a>
<a href="#"><li>Recent</li></a>
<a href="#"><li>Magazine</li></a>
<a href="#"><li>Science</li></a>
<a href="#"><li>Economy</li></a>
<a href="#"><li>Politics</li></a>
</ul>
</div>
<div class="post">
<form action="post.jsp" method="post">
 <input type="hidden" name="actionsuccess" value="doArticle" />
<label>Article name</label><br>
<input type="text" class="name" name="artname"><br>
<label>Article Content</label><br>
<textarea class="content" name="artcontent"></textarea><br>
<input type="submit" class="btn">





</form>



</div>
</body>
</html>