import java.awt.*;
import java.awt.event.*;
public class WindowDemo{
	public static void main(String args[]){
	FrameW f=new FrameW();
	f.setVisible(true);
	f.setSize(300,300);
	}
}
class FrameW extends Frame implements WindowListener
{
	Label l;	
	FrameW(){
	super("window Event Demo");
	l=new Label("                                ");
	setLayout(new FlowLayout());
	add(l);
	addWindowListener(this);
	
	}
	public void windowOpened(WindowEvent we){
	l.setText("window opened");
	}
	public void windowClosing(WindowEvent we){
	l.setText("window closing");
	System.exit(0);
	}
	public void windowClosed(WindowEvent we){
	l.setText("window closed");

	}
	public void windowIconified(WindowEvent we){
	l.setText("window Iconifed");

	}
	public void windowDeiconified(WindowEvent we){
	l.setText("window deiconified");

	}
	public void windowActivated(WindowEvent we){
	l.setText("window Activated");

	}
	public void windowDeactivated(WindowEvent we){
	l.setText("window Deactivated");

	}

}
