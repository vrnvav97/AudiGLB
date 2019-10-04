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