int startX=0;
int startY=150;
int endX=0;
int endY=150;
void setup()
{
  size(300,300);
  strokeWeight(10);
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
	endX=startX+8;
	endY=startY+8;
	line(startX,startY,endX,endY);
	/*startX=endX;
	startY=endY;*/
}


}
void mousePressed()
{

}

