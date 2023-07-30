import java.awt.*;
import java.awt.event.*;
public class WindowAdapterDemo{
	public static void main(String args[]){
	  FrameA f=new FrameA();
		f.setVisible(true);
		f.setSize(300,300);
	}
}
class FrameA extends Frame{
	FrameA(){
	super("Adapter Demo");
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we){
	System.exit(0);
     }	
	});

	}
}
/* 
class My extends WindowAdapter{
	public void windowClosing(WindowEvent we){
	System.exit(0);
     }	
}
*/