<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME PAGE</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<style>
* {
	box-sizing: border-box;
}

/* Create two equal columns that floats next to each other */
.column {
	float: left;
	width: 50%;
	padding: 10px;
	height: 500px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}
</style>
</head>

<body>
<br>
	<br>
	<br>
	<br>
	<h1 align="center">
		<br> <b>Learn for Life</b>
	</h1>
	<br>
	<br>
	<br>
<div class="container">
		<div class="col-xs-12 col-md-12">


			<div class="row">
				<div class="column">
					<h2 align="center">Login</h2>
					<div class="col-xs-12 col-md-12">
						<form action="login" method="POST">
						<div class="form-group">
								<select class="form-control" name="role" required id="role">
									<optgroup label="Role">
										<option value="student">Student</option>
										<option value="tutor">Tutor</option>
									</optgroup>
								</select>
							</div>
							<div class="form-group" >
								<input type="text" class="form-control" name="username" required
									id="username" placeholder="username">
							</div>
							<div class="form-group">
								<input type="text" class="form-control" name="password" required
									id="password" placeholder="password">
							</div>
							<div class="form-group">
								<div align="center">
									<button align="center" class="btn btn-success btn-lg">Login</button>
									
								</div>
							</div>
						</form>
						<div align="center">
							<button align="center" class="btn btn-warning btn-lg">Forgot
								Password ?</button>
						</div>
					</div>

				</div>
				<div class="column">
					<h2 align="center">Registration</h2>
					<div class="col-xs-12 col-md-12">
						<form action="register" method="POST">
							<div class="form-group">
								<input type="text" class="form-control" name="username" required
									id="username" placeholder="username">
							</div>
							<div class="form-group">
								<input type="text" class="form-control" name="password" required
									id="password" placeholder="password">
							</div>
							<div class="form-group">
								<input type="email" class="form-control" name="email" required
									id="email" placeholder="email">
							</div>
							<div class="form-group">
								<select class="form-control" name="role" required id="role">
									<optgroup label="Role">
										<option value="student">Student</option>
										<option value="tutor">Tutor</option>
									</optgroup>
								</select>
							</div>

							<div class="form-group">
								<label class="radio-inline"> <input type="radio"
									name="gender">male
								</label> <label class="radio-inline"> <input type="radio"
									name="gender">female`
								</label>
							</div>
							<div class="form-group">

								<div class="form-group">
									<div class='input-group date' id='datetimepicker1'>
										<!-- <input type='date' class="form-control" placeholder="dob" /> -->
										<input type="date" name="dob">
										<!-- <span class="input-group-addon"> <span
											class="glyphicon glyphicon-calendar"></span>
										</span>
										 -->
									</div>
								</div>
							</div>
							<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
							<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
							<script type="text/javascript">
								$(function() {
									$('#datetimepicker1').datetimepicker();
								});
							</script>
					</div>
					<br>
					<div class="form-group">
						<div align="center">
							<button align="center" class="btn btn-success btn-lg">Register</button>
						</div>
					</div>
					</form>
				</div>


			</div>
		</div>


	</div>
	</div>

</body>
</html>