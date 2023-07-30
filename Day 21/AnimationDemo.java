import java.awt.*;
import java.awt.event.*;
public class AnimationDemo{
	public static void main(String args[]){
	FrameA f=new FrameA();
	f.setVisible(true);
	f.setSize(500,450);

	}
}
class FrameA extends Frame implements Runnable
{
	int x,y,tx,ty;	

	FrameA(){
		x=100;
		y=100;
		tx=ty=1;

	Thread t=new Thread(this);
	t.start();
		
	}

	public void paint(Graphics g){
	g.setColor(Color.RED);
	g.fillOval(x,y,50,50);

	}
	public void run(){
	while(true){
	x+=tx;
	y+=ty;
	
	if(x<0||x>450)
	tx=tx*-1;
	if(y<0||y>400)
	ty=ty*-1;
	repaint();
	try{Thread.sleep(3);}catch(Exception e){}
	}
	}	

}