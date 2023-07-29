import java.awt.*;
class MyFrame extends Frame{
	Label l;
	TextField t;
	Button b;
	public MyFrame(){	
		super("MyApp");
		setLayout(new FlowLayout());
		l=new Label("Name");
		t=new TextField(20);
		b=new Button("OK");
		add(l);
		add(t);
		add(b);
		}
	}
public class FirstApp{
	public static void main(String args[]){
	 MyFrame f=new MyFrame();
	f.setSize(400,400);
	f.setVisible(true);
	}
}