import java.awt.*;
import java.awt.event.*;
public class FlowLayoutDemo{
	public static void main(String args[]){
	FrameFlow f=new FrameFlow();
	f.setVisible(true);
	f.setSize(400,400);
	}
}
class FrameFlow extends Frame{
	Button b1,b2,b3,b4,b5,b6;
	public FrameFlow(){
		super("Flow Layout Demo");
		b1=new Button("one");
		b2=new Button("two");
		b3=new Button("three");
		b4=new Button("Four");
		b5=new Button("Five");
		b6=new Button("six");
		FlowLayout f1=new FlowLayout();
		f1.setAlignment(FlowLayout.RIGHT);
		f1.setHgap(50);
		setLayout(f1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
	}
}
						