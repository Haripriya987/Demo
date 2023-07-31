import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class CheckBoxDemo{
	public static void main(String args[]){
	FrameC f=new FrameC();
	f.setVisible(true);
	f.setSize(400,400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
class FrameC extends JFrame implements ActionListener
{
	JCheckBox c1,c2;
	JTextField tf;	
	FrameC(){
	super("Demo of Checkbox");
	tf=new JTextField("Demo Text",20);
	tf.setBounds(10,20,100,80);
	c1=new JCheckBox("Bold");
	c1.setMnemonic(KeyEvent.VK_B);
	c2=new JCheckBox("Italic");
	c2.setMnemonic(KeyEvent.VK_B);
	add(c1);
	add(c2);
	add(tf);
	setLayout(new FlowLayout());
	c1.addActionListener(this);
	c2.addActionListener(this);
	
	}

	public void actionPerformed(ActionEvent ae){
	/*switch(ae.getActionCommand()){
	case "lower": tf.setText(tf.getText().toLowerCase());
			break;
	case "UPPER":tf.setText(tf.getText().toUpperCase());
		break;
	
	}*/
	int  b=0,i=0;
	if(c1.isSelected())
	b=Font.BOLD;
	if(c2.isSelected())
	i=Font.ITALIC;
	Font t=new Font("Times New Roman",b|i,15);
	tf.setFont(t);

	}
}