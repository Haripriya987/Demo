import java.awt.*;
import java.awt.event.*;
public class KeyDemo{
	public static void main(String args[]){
	Framek f=new Framek();
	f.setVisible(true);
	f.setSize(300,300);
	}
}
class Framek extends Frame implements KeyListener{
Label l1,l2,l3,l4;
	Framek(){
	super("Key Event Demo");
	l1=new Label("");
	l2=new Label("");
	l3=new Label("");
	l4=new Label("");
	setLayout(null);
	l1.setBounds(30,30,100,20);
	l2.setBounds(30,50,100,20);
	l3.setBounds(30,80,100,20);
	l4.setBounds(30,110,100,20);
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	addKeyListener(this);
}
	public void keyPressed(KeyEvent ke)
	{
		l1.setText("Key Pressed");
		l2.setText("");
	}
	public void keyReleased(KeyEvent ke)
	{
		l1.setText("Key Released");
		l3.setText("");
		l1.setText("");
		l4.setText("");
	}
	public void keyTyped(KeyEvent ke)
	{
		l3.setText("Key typed");
		l4.setText("");
	}
}