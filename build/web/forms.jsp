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
	<title>Form</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<style type="text/css">
		body
		{
			background-color: #ffc107;
		}
		.navbar
		{
			display: inline;
			float: right;
			margin:10px;
		}
		.back
		{
			position: absolute;
			top: 20%;
			left: 30%;
			background-color: #000;
			opacity: 0.9;
			width: 500px;
			height: 500px;
			color: #fff;
			overflow-y: scroll;
		}
		.label
		{
			margin: 15px;
			font-size: 1.2em;
		}
		.drop-down
		{
			width: 150px;

		}
	</style>
</head>
<body>
	<div class="py-3 container-fluid" style="background-color: #592106;margin: 0px;display: inline-block;">
		<div class="text-center" style="width: 80%;float: left;">
				<h2 style="color: white; font-family: Times New Roman;">G L Bajaj Institute of Technology and Management</h2>
		</div>
		<div style="width: 20%;float: right;color: #fff;">
			
			<!-- <a href="" class="navbar">hi</a>
			<a href="" class="navbar">hi</a>
			<a href="" class="navbar">hi</a>
			<a href="" class="navbar">hi</a> -->
			<p class="navbar">hii</p>
			<p class="navbar">hi</p>
			<p class="navbar">hi</p>
			<p class="navbar"><i class="fa fa-home" aria-hidden="true"></i></p>
		</div>
	</div>
	<div class="container">
		<div class="back">
			<h3 class="text-center" style="font-size: 3em;">Book Audi</h3>
                        <form action="confirmForm.jsp" method="post">
				<label class="label">Name of Department</label>
				<select class="drop-down">
					<option>Select</option>
					<option>CSE - Computer Science & Engineering</option>
					<option>IT - Information Technology</option>
					<option>MCA - Master of Computer Applications</option>
					<option>1st YR - </option>
					<option>ECE - Electornics & Communication Engineering</option>
					<option>EE - Electronics Engineering</option>
					<option>CE - Civil Enginnering</option>
					<option>MBA - Master of Business Administration</option>
				</select>
				<label class="label">Name of Event</label>
				<input type="text" name="eventName"/>
				<label class="label">Type of Event</label>
				<input type="radio" class="typeOfEvent" name="One" value="One  " checked="true">  One
				<input type="radio" class="typeOfEvent" name="Two" value="Two  ">  Two
                                <input type="radio" class="typeOfEvent" name="Three" value="Three  ">  Three
			        <label class="label">Chief Guest of the Event</label>
				<input type="text" name="eventChiefGuest"/>
				<div class="form-group">
                                    <label class="label">Date</label>
                                    <input type="date" name="eventDate" id="dateChooser" onchange=f()>
                                </div>
                                <div class="form-group">
                                    <label class="label">Time</label>
                                    <input type="time" name="usr_time1"> To <input type="time" name="usr_time2">
                                </div>
                                <div class="form-group">
                                    <label class="label">Expected Gathering</label>
				    <input type="text" name="eventGathering">
                                </div>
                                <center> <div  text-align="center" class="form-group">
                                        <input type="submit" class="btn-success" name="submit" value="Book Audi">
                                    </div>
                                </center>
                        </form>
		</div>
	</div>
	<script type="text/javascript" src="js/font-awesome.js"></script>
        <script>
            var d = new Date();
	var date = [
  d.getFullYear(),
  ('0' + (d.getMonth() + 1)).slice(-2),
  ('0' + d.getDate()).slice(-2)
].join('-');


	document.querySelector('#dateChooser').setAttribute("min",date);
	function f()
	{
		var a = document.getElementById('dateChooser').value; // value
                console.log(a);
	}
            </script>
</body>
</html>
<%
    }else{
        session.setAttribute("msg","Plz Login First");
        response.sendRedirect("login.jsp");
    }
%>