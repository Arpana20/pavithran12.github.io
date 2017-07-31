function eliminate_common_letters(name1,name2){    // Function to eliminate similar letters in names
	console.log(name1);
	console.log(name2);
	for (var i = 0; i <= name1.length; i++) {
		var key=name2.includes(name1[i])
		if(key){
			var n1=name1.indexOf(name1[i]);
			var n2=name2.indexOf(name1[i]);
			name1=name1.substr(0,n1) + name1.substr(n1+1,name1.length);
			name2=name2.substr(0,n2) + name2.substr(n2+1,name2.length);
			i-=1;
		}
	}
	return name1.length+name2.length;
}

function get_value(string){                   //function to get corresponding string
	var key="";
	switch(string){
		case 'f':key="Friend";
				 break;
		case 'l':key="Love";
				 break;
		case 'a':key="Affection";
				 break;
		case 'm':key="Marriage";
				 break;
		case 'e':key="Enemy";
				 break;
		case 's':key="Sister";
				 break;
	}
	return key;
}

function calculate_flames(num){               //to calculate flames
	var string="flames";
	var i=6;
	var count=0;
	for (var i = 6; i > 1; i--) {
		var key=num;
		while(key!=0){
			if(count===i)
				count=1;
			else
				count+=1;
			key--;
		}
		string=string.substr(0,count-1) + string.substr(count,string.length);
		count-=1;
	}
	return get_value(string);
}

function flames(){
	var first_name=document.getElementById("first_name").value;
	var second_name=document.getElementById("second_name").value;
	if(first_name==="" || second_name==""){
		alert("All fields are required");
	}
	else{
		//document.getElementById("1").innerHTML=first_name;
		//document.getElementById("2").innerHTML=second_name;
		var num=eliminate_common_letters(first_name.toLowerCase(),second_name.toLowerCase());
		var ans=calculate_flames(num);
		document.getElementById("answer").innerHTML="The Relation between "+first_name+" and "+second_name+" is "
		document.getElementById("ans").innerHTML=ans;
		console.log(ans);
	}
}