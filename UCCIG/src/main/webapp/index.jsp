<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>UCCIG | Login</title>
<script src="js/jquery-2.1.1.js"></script>
<script src="js/bootstrap.min.js"></script>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="font-awesome/css/font-awesome.css" rel="stylesheet">

<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">


</head>
<body class="gray-bg">
	<s:if
		test="hasFieldErrors() || hasActionMessages() || hasActionErrors()">
		<s:actionerror id="errorMessage" />
		<s:fielderror />
		<s:actionmessage />
	</s:if>
	<div>
		<h1 class="logo-name text-center">Market+</h1>
		<div class="middle-box text-center loginscreen animated fadeInDown">
			<h3>A product for UCCIG</h3>
			<p>Please enter your credentials to login.</p>
			<form class="m-t" role="form" action="login.action" method="post">
				<div class="form-group">
					<input id="emailAddress" name="emailAddress" type="email"
						class="form-control" placeholder="Username" required>
				</div>
				<div class="form-group">
					<input id="password" name="password" type="password"
						class="form-control" placeholder="Password" required>
				</div>
				<button type="submit" class="btn btn-success block full-width m-b">Login</button>
			</form>
			<a href="#"><medium>Forgot password?</medium></a>
			<p class="text-muted text-center">
				<small>Do not have an account?</small>
			</p>
			<a class="btn btn-primary block full-width m-b" href="register.html">Create
				an account</a>
		</div>
	</div>

	<!-- Mainly scripts -->


</body>

</html>
