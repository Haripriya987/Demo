import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class SampleSwing{
	public static void main(String args[]){
	     MyFrame f=new MyFrame();
	     f.setSize(400,400);
	     f.setVisible(true);
	     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MyFrame extends JFrame{
	JLabel l;
	JButton b;
	int count=0;
	MyFrame(){
	super("Swing Demo");
	setLayout(new FlowLayout());
	l=new JLabel("Clicked"+" "+count+" "+"Times");
	b=new JButton("Click");
	add(l);
	add(b);
	Handler h=new Handler();
	b.addActionListener(h);
	}
	class Handler implements ActionListener{
	public void actionPerformed(ActionEvent ae){
	count++;
	l.setText("Clicked"+" "+count+" " +"Times");
	}
}
}	