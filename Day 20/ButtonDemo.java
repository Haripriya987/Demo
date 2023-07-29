import java.awt.*;
import java.awt.event.*;
public class ButtonDemo{
	public static void main(String args[]){
	BDemo B=new BDemo();
	B.setSize(300,300);
	B.setVisible(true);
	}
}
class BDemo extends Frame implements ActionListener{
	int count=0;
	Label l;
	Button b;
	public BDemo(){
		super("Button Demo");
		l=new Label("      "+count);
		b=new Button("Click");
		b.addActionListener(this);
		setLayout(new FlowLayout());
		add(l);
		add(b);
		}
	public void actionPerformed(ActionEvent e){
		count++;
		l.setText("   "+count);
	}
}	


