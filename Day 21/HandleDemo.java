import java.awt.*;
import java.awt.event.*;
public class HandleDemo{
	public static void main(String args[]){
	MyH f=new MyH();
	f.setVisible(true);
	f.setSize(300,300);
	}
}
class MyH extends Frame{
	TextField tf;
	Button b;
	int count=0;
	MyH(){
	super("Listeners in different ways");
	
	tf=new TextField("0",20);
	b=new Button("Click");
	setLayout(new FlowLayout());
	add(tf);
	add(b);
	AE a=new AE();
	b.addActionListener(a);
	}

	class AE implements ActionListener{
	public void actionPerformed(ActionEvent ae){
	count++;
	tf.setText(" "+count);
	}
         }
}



/*
b.addActionListener((ActionEvent ae)->{
	count++;
	tf.setText(String.valueOf(count));
});
*/
