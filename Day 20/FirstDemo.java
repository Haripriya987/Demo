import java.awt.*;
public class FirstDemo{
	public static void main(String args[]){
	    Frame f=new Frame("My First App");
	    f.setLayout(new FlowLayout());
	   Button b=new Button("OK");
	   Label l=new Label("Name");
	   TextField t=new TextField(20);
	    f.setSize(300,300);
	    f.setVisible(true);
	   f.add(t); 
	   f.add(b);
	   f.add(l);
	   

	}
}