<html>
	<head>
		<title>Login JSP</title>
	<body>
	
		<div class = "container">
		
			<h1>Welcome to Login JSP</h1>
		
			<form method=post>
				Name : <input type="text" name="name"> Password : <input
					type="password" name="password"> <input type="submit">
			</form>
			<pre>${errorMessage}</pre>
		</div>
	</body>
	</head>
</html>