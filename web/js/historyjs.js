var a = document.querySelectorAll('.getDate');
var b = document.querySelectorAll('.cancelButton');
for (i=0;i<a.length;++i)
{
    var date = a[i].getAttribute('value');
    var todayDate = new Date().toISOString().slice(0,10);
    if (date >= todayDate)
    {
      b[i].classList.remove('cancelButton');
    }
}

