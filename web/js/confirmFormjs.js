var a = document.querySelector(".cancel");
          a.addEventListener('click',()=>{
              var result = confirm('Do you really want to Cancel Booking');
              if (result===true)
              {
                  document.write("Your booking request has been cancelled !");
//                  window.navigate(http://localhost:27016/AudiGLB/userDashboard.jsp);
              }
          });