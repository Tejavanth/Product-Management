<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
 <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
       
    </head>
    <body>
    <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-6" align="center">
    	
	        	<h1>Employee List</h1>
	        </div>
	        </div>
	        <div class="col-sm-6">
	        <a href="new" class="btn btn-success" >
	        <i class="material-icons">&#xE147;</i><span>Add Employee</span></a>
	        </div>
	        <table class="table table-striped table-hover">
	        <thead>
	        	<th>S.No</th>
	        	<th>Id</th>
	        	<th>Name</th>
	        	<th>Email</th>
	        	<th>Address</th>
	   			<th>Date of Joining</th>
	        	<th>Actions</th>
	        	
	        	</thead>
	        	<tbody>
				<c:forEach var="emp" items="${employees}" varStatus="status">
	        	<tr>
	        		<td >${status.index + 1}</td>
					<td id="empid" >${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.email}</td>
					<td>${emp.address}</td>
					<td>${emp.doj}</td>
					
					<td>
					
						<a href="update?eid=${emp.id}" class="edit" data-toggle="modal">
						<i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i>Update</a>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="delete?eid=${emp.id}" class="delete" data-toggle="modal">
						<i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i>Delete</a>
					</td>
							
	        	</tr>
				</c:forEach>
				</tbody>	        	
			</table>
			
    	</div>
    	</div>
    	
    </body>
</html>
