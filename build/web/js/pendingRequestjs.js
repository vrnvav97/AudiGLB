            function fun(e)
            {
               var element = document.getElementById(e.getAttribute('id'));
               element.style.display='none';
            var a = document.getElementById(e.getAttribute('id')+'_div');
            a.style.display = 'inline';

             }
             
             function sum (ee)
             {
                 var result = confirm ('Do you really want to cancel request ?');
             }