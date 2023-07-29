import java.awt.*;
import java.awt.event.*;
public class TextFieldDemo{
	public static void main(String args[]){
	    FrameDemo2 f=new FrameDemo2();
	    f.setVisible(true);
	    f.setSize(300,300);
	    	
	}
}
class FrameDemo2 extends Frame {
	Label l1,l2;
	TextField tf;
	FrameDemo2(){
	super("Text Field Demo");
	l1=new Label("No Text is entered yet");
	l2=new Label("Enter key is not yet");
	tf=new TextField(20);
	Handler h=new Handler();
	
	tf.addActionListener(h);
	setLayout(new FlowLayout());
	add(l1);
	add(l2);
	add(tf);
	}
	

class Handler implements TextListener,ActionListener{
	public void textValueChanged(TextEvent e){
	l1.setText(tf.getText());
	}
	public void actionPerformed(ActionEvent ae){
	l2.setText(tf.getText());
	}
}
}