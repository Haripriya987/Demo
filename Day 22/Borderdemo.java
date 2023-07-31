import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
public class Borderdemo{
	public static void main(String args[]){
	FrameB f=new FrameB();
	f.setVisible(true);
	f.setSize(400,400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
class FrameB extends JFrame {
	JButton b;
	JLabel l;
	JPanel p;
	JTextField tf;
	FrameB(){
	super("Border Demo");
	l=new JLabel("Name");
	tf=new JTextField(20);
	b=new JButton("OK");
	p=new JPanel();
	p.add(l);
	p.add(tf);
	p.add(b);
	
	Border br=BorderFactory.createLineBorder(Color.RED,3);
	p.setBorder(br);
	setLayout(new FlowLayout());
	add(p);
	

	}
}