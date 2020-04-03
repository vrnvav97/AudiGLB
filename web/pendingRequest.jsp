<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.HashMap"%>
<%
    HashMap h=(HashMap)session.getAttribute("AdminDetails");
    if(h!=null){
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Pending Request List</title>
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
                left: 50%;
                background-color: #000;
                opacity: 0.9;
                width: 1200px;
                height: 600px;
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
            .audiSelectionDiv
            {
                display: none;
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
                <!--			<p class="navbar">hii</p>-->
                <p class="navbar"><a href="Logout.jsp">Logout</a></p>
                <p class="navbar"><%=(String)h.get("name")%></p>
                <p class="navbar"><a href="adminDashboard.jsp" ><i class="fa fa-home" aria-hidden="true" style="font-size: x-large"></i></a></p>
            </div>
        </div>
        <div class="container">
            <div class="panel panel-default text center">
                <div class="panel-heading text-center">
                    <h3>Audi Pending Request</h3>
                </div>
            </div>
        </div>
        </br>
        </br>
        <%
                                String m=(String)session.getAttribute("msg");
                                if(m!=null){
        %>
        <div class="panel">
            <div class="panel-body bg-danger text-center">
                <%=m%>
            </div>
        </div>
        <br>
        <%   
            session.setAttribute("msg",null);
        }
        %>
        <div class="container">
            <div class="back">        
                <%
                        dba.dbConnect db = new dba.dbConnect();
                        ResultSet rs = db.pendingRequest();
                        int i = 1;
                      while(rs.next()){
                %>    
                <hr style="background-color: #ffc107;">
                <div class="row">
                    <div class="col-lg-2">

                        &nbsp;&nbsp;<img src="img/Logo.jpg" width="150" height="200" padding-top: 25px;>                           

                    </div>
                    <div class="col-lg-10">
                        <form  class="form-horizontal" method="post" action="CancelAudi">
                            <div class="form-group">
                                <label class="label">S No</label>
                                <font size="4" color="green"><%=i%></font>
                                <label class="label">Name of Department</label>
                                <font size="4" color="green"><%= rs.getString("nameOfDepartment")%></font>
                                <label class="label">Name of Event</label>
                                <font size="4" color="green" value="<%= rs.getString("eventName")%> " id="<%=i%>_eventName"><%= rs.getString("eventName")%></font>
                                <label class="label">Type of Event</label>
                                <font size="4" color="green"><%= rs.getString("typeOfEvent")%></font><br>
                                <label class="label">Chief Guest of the Event</label>
                                <font size="4" color="green"><%= rs.getString("eventChiefGuest")%></font>
                                <label class="label">Date</label>
                                <font size="4" color="green"><%= rs.getString("eventDate")%></font><br>
                                <label class="label">Time</label>

                                <font size="4" color="green"><%= rs.getString("time1")%></font> &nbsp;&nbsp;&nbsp;&nbsp; To &nbsp;&nbsp;&nbsp;&nbsp;
                                <font size="4" color="green"><%= rs.getString("time2")%></font>

                                <label class="label">Expected Gathering</label>
                                <font size="4" color="green"><%= rs.getString("eventGathering")%></font> <br>
                                <label class="label">Request by</label>
                                <font size="4" color="green"><%= rs.getString("username")%></font> <br>
                                <%
                                String id = (String)rs.getString("bookingID");
                                                        
                                                      
                                %>
                                <center> 
                                    <div  text-align="center" class="form-group">
                                        <input type="hidden" name="bookingId" value="<%=id%>">
                                        <input type="submit" class="btn-danger" name="submit" value="Cancel" >&nbsp;&nbsp;&nbsp;&nbsp;
                                        <input type="button" id="<%=i%>" class="btn-success"name="submit" value="Book Audi" onclick=fun(this);>
                                    </div>
                                </center>

                            </div>
                        </form>
                        <div id="<%=i%>_div" class="audiSelectionDiv">
                            
                            <form method="post" action="AllowAudi">
                                <input type="hidden" name="bookingId" value="<%=id%>"> 
                                <input type="hidden" name="pageName" value="p">
                                <input type="radio" name="audiSelection" value="Audi01" selected="true">Audi01
                                &nbsp; &nbsp; <input type="radio" name="audiSelection" value="Audi02">Audi02
                                &nbsp; &nbsp;<input type="radio" name="audiSelection" value="SHD">SHD
                                &nbsp; &nbsp;<input type="radio" name="audiSelection" value="SBG">SBG
                                &nbsp; &nbsp;<input type="radio" name="audiSelection" value="PGDMHall">PGDM Hall
                                &nbsp; &nbsp; <input type="submit"  class="btn-success" name="Go" value="Go">
                            </form>
                        </div>    

                    </div>

                </div>
                <%
                    i++;
                            }
                %>
                <hr style="background-color: #ffc107;">

            </div>                                    
        </div>
        <script type="text/javascript" src="js/font-awesome.js"></script>
        <script type="text/javascript" src="js/pendingRequestjs.js"></script>
    </body>
</html>

<%
    }else{
        session.setAttribute("msg","Please Login First");
        response.sendRedirect("login.jsp");
    }
%>