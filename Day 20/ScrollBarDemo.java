import java.awt.*;
import java.awt.event.*;
public class ScrollBarDemo{
	public static void main(String args[]){
		FrameScroll f=new FrameScroll();
		f.setVisible(true);
		f.setSize(300,300);
	}
}
class FrameScroll extends Frame implements AdjustmentListener{
	Scrollbar red,green,blue;
	TextField tf;
	FrameScroll(){
	super("ScrollBar Demo");
	red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
	green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
	blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
	tf=new TextField(20);
	red.setBounds(50,150,300,30);
	green.setBounds(50,200,300,30);
	blue.setBounds(50,250,300,30);
	tf.setBounds(50,100,300,50);
	setLayout(null);
	add(tf);
	add(red);
	add(green);
	add(blue);
	red.addAdjustmentListener(this);
	green.addAdjustmentListener(this);
	blue.addAdjustmentListener(this);		
	}
	public void adjustmentValueChanged(AdjustmentEvent e){
	tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
	}
}