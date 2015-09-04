int startX=(int)(Math.random()*400+1);
int startY=0;
int endX=150;
int endY=0;


void setup()
{
  size(400,600);
  strokeWeight(1);
  background(0);

  }

void draw()
{
	//cloud();
	int colorR= (int)(Math.random()*256);
	int colorG= (int)(Math.random()*256);
	int colorB= (int)(Math.random()*256);
	stroke(colorR,colorG,colorB);
	while(endX<400)
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
	 startX=(int)(Math.random()*400+1);
 	startY=0;
	 endX=150;
	endY=0;
	
}

