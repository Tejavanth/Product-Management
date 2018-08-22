<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"  isErrorPage="True"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>New Employee</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="src/main/webapp/home.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<script>
		function validatedate(inputText) {
			var dateformat = /^(0?[1-9]|1[012])[\/\-](0?[1-9]|[12][0-9]|3[01])[\/\-]\d{4}$/;

			if (inputText.value.match(dateformat)) {
				document.form1.doj.focus();

				var opera1 = inputText.value.split('/');
				var opera2 = inputText.value.split('-');
				lopera1 = opera1.length;
				lopera2 = opera2.length;

				if (lopera1 > 1) {
					var pdate = inputText.value.split('/');
				} else if (lopera2 > 1) {
					var pdate = inputText.value.split('-');
				}
				var mm = parseInt(pdate[0]);
				var dd = parseInt(pdate[1]);
				var yy = parseInt(pdate[2]);

				var ListofDays = [ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,
						31 ];
				
				if(yy < 1950 || yy > 2050){
					alert('Invalid date format!');
					return false;
				}
				
				if (mm == 1 || mm > 2) {
					if (dd > ListofDays[mm - 1]) {
						alert('Invalid date format!');
						return false;
					}
				}
				if (mm == 2) {
					var lyear = false;
					if ((!(yy % 4) && yy % 100) || !(yy % 400)) {
						lyear = true;
					}
					if ((lyear == false) && (dd >= 29)) {
						alert('Invalid date format!');
						return false;
					}
					if ((lyear == true) && (dd > 29)) {
						alert('Invalid date format!');
						return false;
					}
				}
			} else {
				alert("Invalid date format!");
				document.form1.doj.focus();
				return false;
			}
		}
		
		function validateEmail(inputText)
		{
			var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			if(inputText.value.match(mailformat))
			{
				document.form1.email.focus();
				return true;
			}
			else
			{
				alert("You have entered an invalid email address!");
				document.form1.email.focus();
				return false;
			}
		}
	</script>

	<div align="center" class="table-title">
		<h1>New Employee</h1>
		<form:form action="save" method="post" modelAttribute="employee"
			name="form1"
			onsubmit="return  (validatedate(document.form1.doj) && validateEmail(document.form1.email))">
			<table>

				<tr>
					<div class="modal-body">
						<div class="form-group">
							<td>id:</td>


							<td><form:input path="id" required="required"
									class="form-control" /></td>
							<td> &nbsp;&nbsp;${errormessage }</td>
							<td>
						</div>
					</div>
				</tr>
				<tr>
					<div class="modal-body">
						<div class="form-group">
							<td>Name:</td>
							<td><form:input path="name" required="required"
									class="form-control" /></td>
						</div>
					</div>
				</tr>
				<tr>
					<div class="modal-body">
						<div class="form-group">
							<td>Email:</td>
							<td><form:input path="email" required="required"
									class="form-control" /></td>
						</div>
					</div>
				</tr>
				<tr>
					<div class="modal-body">
						<div class="form-group">
							<td>Address:</td>
							<td><form:input path="address" required="required"
									class="form-control" /></td>
						</div>
					</div>
				</tr>
				<tr>
					<div class="modal-body">
						<div class="form-group">
							<td>DOJ:</td>
							<td><form:input path="doj" required="required"
									class="form-control" /></td>
						</div>
					</div>
				</tr>


				<tr>

					<td colspan="2" align="left"><input type="submit" value="Save"
						class="btn btn-success"></td>

				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>