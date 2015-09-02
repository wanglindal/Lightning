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

int startX=0;
int startY=150;
int endX=0;
int endY=150;
public void setup()
{
  size(300,300);
  strokeWeight(10);
  background(0);
}
public void draw()
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
public void mousePressed()
{

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
