import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class RadioBoxDemo{
	public static void main(String args[]){
	FrameR f=new FrameR();
	f.setVisible(true);
	f.setSize(400,400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
class FrameR extends JFrame implements ActionListener{
	JRadioButton r1,r2;
	JTextField tf;
	FrameR(){
	super("Demo of RadioButton");
	tf=new JTextField("Demo Text",20);
	r1=new JRadioButton("lower");
	r2=new JRadioButton("UPPER");
	ButtonGroup by=new ButtonGroup();
	by.add(r1);
	by.add(r2);
	r1.setActionCommand("lower");
	r2.setActionCommand("UPPER");

	add(r1);
	add(r2);
	add(tf);
	setLayout(new FlowLayout());
	r1.addActionListener(this);
	r2.addActionListener(this);
		}
	public void actionPerformed(ActionEvent ae){
	switch(ae.getActionCommand()){
	case "lower": tf.setText(tf.getText().toLowerCase());
			break;
	case "UPPER":tf.setText(tf.getText().toUpperCase());
		break;
	
	}
}
}