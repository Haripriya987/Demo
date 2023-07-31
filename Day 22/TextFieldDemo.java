import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TextFieldDemo{
	public static void main(String args[]){
	     FrameT f=new FrameT();
	     f.setSize(400,400);
	     f.setVisible(true);
	     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class FrameT  extends JFrame{
		
	FrameT(){
	JTextField tf1=new JTextField(15);
	DateFormat df=new SimpleDateFormat("dd/MMMM/yyyy");
	JFormattedTextField tf2=new JFormattedTextField(df);
	tf2.setColumns(15);
	tf2.setValue(new Date());
	setLayout(new FlowLayout());
	add(tf1);
	add(tf2);


	}		

}	