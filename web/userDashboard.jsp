<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.HashMap"%>
<%
    HashMap h=(HashMap)session.getAttribute("UserDetails");
    if(h!=null){
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Dashboard</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<style type="text/css">
		body
		{
			background-color: #ffc107;
		}
		i
		{
			position: relative;
		}
		.badge
		{
			position: absolute;
			top: -10px;
			right: -10px;
			padding: 5px;
			border-radius: 50%;
			background:red;
			color: white;
		}
		.navbar
		{
			display: inline;
			float: right;
			margin:10px;
		}
		.box
		{
			background-color: #592106;
			width: 220px;
			height: 220px;
			display: relative;
			border-radius: 20px;
			margin: 70px;
			float: left;
		}
		.box-inner
		{
			width: 220px;
			height: 75px;
			background-color: #17a2b8;
			border-radius: 20px 20px 0px 0px;
		}
		.box-inner h3
		{
			margin: 5px;
			line-height: 50px;
		}
		.box-inner-down
		{
			color: #fff;
			height: 145px;
			position: relative;
		}
		.icon
		{
			position: relative;
			left: 25%;
			top: 5%;
		}
		.container h3
		{
			color: #fff;
		}
	</style>
</head>
<body>
	<div class="py-3 container-fluid" style="background-color: #592106;margin: 0px;display: inline-block;">
		<div class="text-center" style="width: 70%;float: left;">
				<h2 style="color: white; font-family: Times New Roman;">G L Bajaj Institute of Technology and Management</h2>
		</div>
		<div style="width: 30%;float: right;color: #fff;">
			
			<!-- <a href="" class="navbar">hi</a>
			<a href="" class="navbar">hi</a>
			<a href="" class="navbar">hi</a>
			<a href="" class="navbar">hi</a> -->
<!--			<p class="navbar"></p>-->
			<p class="navbar">Logout</p>
			<p class="navbar"><%=(String)h.get("name")%></p>
			<p class="navbar"><i class="fa fa-bell" aria-hidden="true" ><span class="badge">1</span></i></p>
		</div>
	</div>
		<div class="container">
			
			<a href="forms.jsp">
				<div class="box">
					<div class="box-inner">
					<h3 class="text-center">Book Audi</h3>
					</div>
					<div class="box-inner-down">
						<i class="fa fa-plus-circle icon" aria-hidden="true" style="font-size: 8em"></i>
					</div>
				</div>
			</a>

			<a href="">
				<div class="box">
					<div class="box-inner">
						<h3 class="text-center">Active Booking</h3>
					</div>
					<div class="box-inner-down">
						<i class="fa fa-bookmark icon" aria-hidden="true" style="font-size: 8em"></i>
					</div>
				</div>
			</a>

			<a href="history.jsp">
				<div class="box">
					<div class="box-inner">
						<h3 class="text-center">History</h3>
					</div>
					<div class="box-inner-down">
					<i class="fa fa-history icon" aria-hidden="true" style="font-size: 8em"></i>
					</div>
				</div>
			</a>

		</div>
		<script src="//netdna.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<!-- <script src="https://use.fontawesome.com/5b68f82424.js"></script> -->
<script type="text/javascript" src="js/font-awesome.js"></script>
</body>
</html>
<%
    }else{
        session.setAttribute("msg","Plz Login First");
        response.sendRedirect("login.jsp");
    }
%>