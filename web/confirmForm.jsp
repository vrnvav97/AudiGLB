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
	<title>Confirm Form</title>
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
			/*position: absolute;*/
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
                * {
                box-sizing: border-box;
              }

              .column {
                float: left;
                padding: 10px;
                height: 500px;
              }

              .left {
                width: 50%;
              }

              .right {
                width: 50%;
              }

              .row:after {
                content: "";
                display: table;
                clear: both;
              }
	</style>
</head>
<body>
	<div class="py-3 container-fluid" style="background-color: #592106;margin: 0px;display: inline-block;">
		<div class="text-center" style="width: 80%;float: left;">
				<h2 style="color: white; font-family: Times New Roman;">G L Bajaj Institute of Technology and Management</h2>
		</div>
		<div style="width: 20%;float: right;color: #fff; ">
			
			<!-- <a href="" class="navbar">hi</a>
			<a href="" class="navbar">hi</a>
			<a href="" class="navbar">hi</a>
			<a href="" class="navbar">hi</a> -->
<!--			<p class="navbar">hii</p>-->
			<p class="navbar">hi</p>
                        <p class="navbar"><%= (String)h.get("name")%></p>
<!--			<p class="navbar"><i class="fa fa-home" aria-hidden="true"></i></p>-->
                           <%
                             String temp = (String)h.get("post");
                             if (temp.equals("admin"))
                             {
                         %>
                         <%= "<p class='navbar'><a href='adminDashboard.jsp' ><i class='fa fa-home' aria-hidden='true' style='font-size:x-large'></i></a></p>" %>
                          <%   }
                            else
                            {
                            %>
                            <%= "<p class='navbar'><a href='userDashboard.jsp' ><i class='fa fa-home' aria-hidden='true' style='font-size:x-large'></i></a></p>" %>
                            <% } %>
		</div>
	</div>
	<div class="container" >
                <div class="row">
                    <div class="column left" style="background-color:#ffc107;">
                      <img src="img/glbajaj-banner.jpg" alt="Text of the image" height="500" width="700">
                    </div>
                    <div class="column right" style="background-color:#ffc107;">
                                <div class="back">
                                  <h3 class="text-center" style="font-size: 3em;">Confirm</h3>
                                  <form>
                                          <label class="label">Name of Department</label>
                                          <font size="4" color="green"><%=request.getParameter("nameOfDepartment")%></font> <br>
                                          <label class="label">Name of Event</label>
                                          <font size="4" color="green"><%=request.getParameter("eventName")%></font> <br>
                                          <label class="label">Type of Event</label>
                                          <font size="4" color="green"><%=request.getParameter("typeOfEvent")%></font> <br>
                                          <label class="label">Chief Guest of the Event</label>
                                          <font size="4" color="green"><%=request.getParameter("eventChiefGuest")%></font> <br>
                                              <label class="label">Date</label>
                                          <font size="4" color="green"><%=request.getParameter("eventDate")%></font> <br>
                                              <label class="label">Time</label>
                                              
                                          <font size="4" color="green"><%=request.getParameter("time1")%></font> To 
                                          <font size="4" color="green"><%=request.getParameter("time2")%></font> <br>
                                          
                                              <label class="label">Expected Gathering</label>
                                              <font size="4" color="green"><%=request.getParameter("eventGathering")%></font> <br><br>
                                          <center> 
                                              <div  text-align="center" class="form-group">
                                                  <input type="button" class="btn-danger cancel" name="submit" value="Cancel">&nbsp;&nbsp;&nbsp;&nbsp;
                                                  <input type="button" class="btn-success"name="submit" value="Book Audi">
                                              </div>
                                          </center>
                                  </form>
                          </div>
                    </div>
                </div>

		
	</div>
	<script type="text/javascript" src="js/font-awesome.js"></script>
        <script>
          var a = document.querySelector(".cancel");
          a.addEventListener('click',()=>{
              var result = confirm('Do you really want to Cancel Booking');
              if (result===true)
              {
                  document.write("Your booking request has been cancelled !");
//                  window.navigate(http://localhost:27016/AudiGLB/userDashboard.jsp);
              }
          });
        </script>
</body>
</html>
<%
    }else{
        session.setAttribute("msg","Plz Login First");
        response.sendRedirect("login.jsp");
    }
%>