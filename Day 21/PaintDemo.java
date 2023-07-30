import java.awt.*;
import java.awt.event.*;
public class PaintDemo{
	public static void main(String args[]){
	FrameP f=new FrameP();
	f.setVisible(true);
	f.setSize(400,400);
	}
}
class FrameP extends Frame
{
	int x=0,y=0;
	FrameP(){
	  super("painting");
	   addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent me){
	x=me.getX();
	y=me.getY();
	repaint();
	}
	
	});

	}
	public void paint(Graphics g){
	g.setColor(Color.blue);
	g.fillOval(x,y,50,50);
	}
}	

