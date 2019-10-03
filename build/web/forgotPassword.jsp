
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Audi Booking App</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<style type="text/css">
		/*html
		{
		background:url("img/glbajaj-banner.jpg") no-repeat center center fixed;
		background-size: cover;	
		height: 100%;
		overflow: hidden;
		}*/
		body
		{
			margin:0;
			background-image: url("img/glbajaj-banner.jpg");
			height: 100%;
			background-repeat: no-repeat;
			background-attachment: fixed;
			background-position: center;
			background-size: cover;
			
		}
		.login
		{
			position: absolute;
			top: 20%;
			left: 30%;
			background-color: #000;
			opacity: 0.5;
			width: 440px;
			height: 211px;
			color: #fff;
		}

	</style>
</head>
<body>
		<div class="intro py-3 text-center" style="background-color: #592106">
			<div class="container">
				<h2 class="" style="color: white; font-family: Times New Roman">G L Bajaj Institute of Technology and Management</h2>
			</div>
		</div>

		<div class="container">
                         
			<div class="login">
                             
				<h3 class="text-center" style="text-transform: uppercase;margin-top: 10px;">Enter Registered Email Id</h3>
				<br>
                                <form class="text-center" style="font-size:20px" method="post" action="ForgotPasswordPro.jsp">
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

                                    <p><span>Username</span> <input type="text" name="username"><br><br>
					
                                    <div class="text-center">
                                    <input class="submitButton" type="submit" name="" value="Submit" style="border-radius: 30px; width: 100px; margin-left: 20px;margin-right: 20px;">
                                    <a href = "login.jsp" ><input class="backButton" type="button" name="" value="Back" style="border-radius: 30px; width: 100px;margin-left: 20px;margin-right: 20px; "></a>
                                    </div>
				</form>
			</div>
		</div>	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rGF8kKXvvmYtT4zNGqicXRjvuAnmmbvPZX.109773641.100148163.100148163.109773641.100148163.100148163.109773641.100148163.109773641.100148163.100148163.109773641.100148163.109773641.100148163.100148163.109773641.100148163.109773641.100148163vH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSXgi164MCGG3u5RKXaBGVBabmxQTVRAAVECCPSEWY5UMdx9nDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script>
            var a = [`#6eff00`,`#fff700`,`#00ffad`];
            var b = parseInt((Math.random()*3)+0);
            var c = document.querySelector('.forgotPass');
            var d = document.querySelector('.submitButton');
            c.setAttribute('style','color:'+a[b]);
            d.onmouseover = function()
            {
                this.style.boxShadow = '0px 3px 5px 1px ' + a[b];
            }
            d.onmouseout = function()
            {
                this.style.boxShadow = '0px 0px 0px 0px ' + a[b];
            }
        </script>
</body>
</html>