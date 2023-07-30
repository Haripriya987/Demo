import java.awt.*;
import java.awt.event.*;
public class BorderLayoutDemo{
	public static void main(String args[]){
	FrameBorder f=new FrameBorder();
	f.setVisible(true);
	f.setSize(400,400);
	}
}
class FrameBorder extends Frame{
	Button b1,b2,b3,b4,b5,b6;
	public FrameBorder(){
		super("Border Layout Demo");
		b1=new Button("one");
		b2=new Button("two");
		b3=new Button("three");
		b4=new Button("Four");
		b5=new Button("Five");
		b6=new Button("six");
		
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.CENTER);
		add(b4,BorderLayout.EAST);
		add(b5,BorderLayout.SOUTH);
		//add(b6);
	}
}
						