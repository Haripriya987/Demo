import java.awt.*;
import java.awt.event.*;
public class TextAreaDemo{
	public static void main(String args[]){
	FrameArea f=new FrameArea();
	f.setVisible(true);
	f.setSize(300,300);
	}
}
class FrameArea extends Frame implements ActionListener{
	TextArea ta;
	TextField tf;
	Label l;
	Button b;
	FrameArea(){
	super("Text Area Demo");
	l=new Label("No Text Entered");
	ta=new TextArea(10,30);
	tf=new TextField(20);
	b=new Button("Click");
	setLayout(new FlowLayout());
	add(ta);
	add(tf);
	add(l);
	add(b);
	b.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae){
	l.setText(ta.getSelectedText());
	ta.append(tf.getTex());
	}
}
