function check(){
	var name=document.getElementById("name").value;
	var password=document.getElementById("pass").value;
	if(name===""||pass===""){
		document.getElementById("alert").innerHTML="Please fill the fields";
	}
	else {
	document.getElementById("alert").innerHTML="";
	}
	
}
