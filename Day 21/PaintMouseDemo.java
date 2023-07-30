import java.awt.*;
import java.awt.event.*;
public class PaintMouseDemo{
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
	   addMouseMotionListener(new MouseAdapter(){
	public void mouseMoved(MouseEvent me){
	x=me.getX();
	y=me.getY();
	repaint();
	}
	
	});

	}
	public void paint(Graphics g){
	g.setColor(Color.blue);
	g.setFont(new Font("Note Worthy",Font.BOLD,30));
	g.drawString("Hello",x,y);
	}
}	

