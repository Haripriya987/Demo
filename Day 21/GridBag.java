import java.awt.*;
import java.awt.event.*;
public class GridBag{
	public static void main(String args[]){
	FrameGridB f=new FrameGridB();
	f.setVisible(true);
	f.setSize(400,400);
	}
}
class FrameGridB extends Frame{
	Button b1,b2,b3,b4;
	public FrameGridB(){
	super("GridBag Layout");
	GridBagLayout gb=new GridBagLayout();
	GridBagConstraints gbc=new GridBagConstraints();
	setLayout(gb);
	b1=new Button("one");
	b2=new Button("two");
	b3=new Button("three");
	b4=new Button("four");

	gbc.gridx=4;
	gbc.gridy=4;
	add(b1,gbc);
	gbc.gridx=1;
	gbc.gridy=3;
	add(b2,gbc);
	gbc.gridx=2;
	gbc.gridy=3;
	add(b3,gbc);
	gbc.gridx=	1;
	gbc.gridy=4;
	add(b4,gbc);	
	}
}
