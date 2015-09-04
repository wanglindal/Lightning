import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX=(int)(Math.random()*400+1);
int startY=0;
int endX=150;
int endY=0;


public void setup()
{
  size(400,600);
  strokeWeight(1);
  background(0);

  }

public void draw()
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


	

public void mousePressed()
{
	 startX=(int)(Math.random()*400+1);
 	startY=0;
	 endX=150;
	endY=0;
	
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
