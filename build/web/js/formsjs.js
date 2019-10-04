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