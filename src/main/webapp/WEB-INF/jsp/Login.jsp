<html>
<head>
<title>Login Page</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<font color="red">${errorMessage}</font>
<form method="POST">

<fieldset class="form-group">
	<label>Username</label> 
	<input name="name" type="text" class="form-control" required="required"/>
</fieldset>

<fieldset class="form-group">
	<label>Password</label> 
	<input name="password" type="password" class="form-control" required="required"/>
</fieldset>
<fieldset class="form-group">
	<button type="submit" class="btn btn-success">Login</button>
</fieldset>
        <!-- Name : <input name="name" type="text" /><br/>
        Password : <input type="password" name="password" /> <br/>
        <input type="submit" /> -->
</form>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>