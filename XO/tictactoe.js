		//canvas,ctx are global variables
var canvas,ctx;
var data;
window.onload=function main(){
	
	canvas=document.createElement("canvas");
	canvas.width=canvas.height=3*120+20;
	ctx=canvas.getContext("2d");
	
	document.body.appendChild(canvas);
	canvas.addEventListener("mousedown",mouseDown);
	//used for timer
	init();
	tick();
}
function mouseDown(evt){
	var el= evt.target;

	var px=evt.clientX -el.offsetLeft;
	var py=evt.clientY -el.offsetTop;

	if( px%120 >= 20 && py%120>=20){
		var idx= Math.floor(px/120);
		idx += Math.floor(py/120);
		console.log(idx);
	}

	if(data[idx].hasData()){
		return;
	}
	data[idx].flip(Tile.NOUGHT); 
}
function init(){
	if(data ==null){
		data=[];   
	
	for (var i=0;i<9;i++) {
		var x=(i%3)*120+20; 
		var y= Math.floor(i/3)*120+20;
		data.push(new Tile(x,y));
	}
	}
	 
}
function tick(){
	window.requestAnimationFrame(tick);

	//update and render is to update and render time
	update();
	render();
}
function update(){
	for (var i =data.length;i--;) {
		data[i].update();
	}
}
function render(){
	ctx.clearRect(0,0,canvas.width,canvas.height);
	for (var i =data.length;i--;) {
		data[i].draw(ctx);
	}

}
function Tile(x,y) {
	

	var x=x,y=y;
	var anim=0;
	var tile=Tile.BLANK;

	if(tile==null)
	{

		var _c=document.createElement("canvas");
		_c.width = _c. height = 100;
		_ctx= _c.getContext("2d");
	
		_ctx.fillStyle="skyblue"
		_ctx.lineWidth=4;
		_ctx.strokeStyle="white";
		_ctx.lineCap="round";
		//blank
		_ctx.fillRect(0,0,100,100);
		Tile.BLANK=new Image();
		Tile.BLANK.src=_c.toDataURL();
	
		//Nought
		_ctx.fillRect(0,0,100,100);
	   	//for circle
		_ctx.beginPath();
		//30 is radius 6.50 is angle
		_ctx.arc(50,50,30,0,2*Math.PI);
		_ctx.stroke();

		Tile.NOUGHT=new Image();
		Tile.NOUGHT.src=_c.toDataURL();


		//Cross
		_ctx.fillRect(0,0,100,100);
	   	//for cross
		_ctx.beginPath();
		//top 20 20
		_ctx.moveTo(20,20);
		//bottom 80 80
		_ctx.lineTo(80,80);
		//bottom right
		_ctx.moveTo(80,20);
		//top left   
		_ctx.lineTo(20,80);
		_ctx.stroke();
		
		Tile.CROSS=new Image();
		Tile.CROSS.src=_c.toDataURL();
		 
		tile =Tile.BLANK ; 
	}
	this.hasData=function() {
		return tile !==Tile.BLANK;
	}
	this.flip=function(next){
		tile=next;
		anim=1;
	}
	this.update=function(){
		if(anim >0)
			{
				anim-=0.02;
			}
	}
	this.draw=function(ctx){
		if (anim<=0){
			ctx.drawImage(tile,x,y);
			return; 
		}
		var res =2;
		var t=anim>0.5 ? Tile.BLANK:tile; 
		var p=-Math.abs(2*anim-1)+1 ;
		for(var i=0;i<100;i+=res){
			var j =anim >0.5?100-i:i;
			ctx.drawImage(t,i,0,res,100,
				x +i -p*i + 50*p,
				y -j*p*0.2,
				res, 
				100+j*p*0.4
				);
		}
		ctx.drawImage(t,x,y);
	}
}
