import java.awt.*;
import java.awt.event.*;
public class GridLayoutDemo{
	public static void main(String args[]){
	FrameGrid f=new FrameGrid();
	f.setVisible(true);
	f.setSize(400,400);
	}
}
class FrameGrid extends Frame{
	Button  b1,b2,b3,b4,b5,b6;
	public FrameGrid(){
	super("Grid LayoutDemo");
	setLayout(new GridLayout(2,3));
	b1=new Button("one");
	b2=new Button("two");
	b3=new Button("three");
	b4=new Button("four");
	b5=new Button("five");
	b6=new Button("six");
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	add(b6);
	}		
}