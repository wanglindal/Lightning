int startX=(int)(Math.random()*300+1);
int startY=0;
int endX=150;
int endY=0;
void setup()
{
  size(300,300);
  strokeWeight(1);
  background(0);
  
}
void draw()
{

	int colorR= (int)(Math.random()*256);
	int colorG= (int)(Math.random()*256);
	int colorB= (int)(Math.random()*256);
	stroke(colorR,colorG,colorB);
	while(endX<300)
	{
	endX=startX+(int)(Math.random()*19-9);
	endY=startY+(int)(Math.random()*9+1);
	line(startX,startY,endX,endY);
	startX=endX;
	startY=endY;
}


}
void mousePressed()
{
	 startX=(int)(Math.random()*300+1);
 	startY=0;
	 endX=150;
	endY=0;
}

