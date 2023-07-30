import java.awt.*;
import java.awt.event.*;
public class MenuDemo{
	public static void main(String args[]){
	MenuF f=new MenuF();
	f.setVisible(true);
	f.setSize(400,400);
	}
}
class MenuF extends Frame
{
	Menu file,sub;
	MenuItem open,save,close,closeall;
	CheckboxMenuItem auto;
	TextField tf;

	MenuF(){
	super("Menu Demo");
	open=new MenuItem("open");
	save=new MenuItem("save");
	close=new MenuItem("close");
	closeall=new MenuItem("closeAll");
	auto=new CheckboxMenuItem("Auto save");
	file=new Menu("File");
	sub=new Menu("close");

	file.add(open);
	file.add(save);
	file.add(sub);
	file.add(auto);
	
	sub.add(close);
	sub.add(closeall);
	
	MenuBar mb=new MenuBar();
	mb.add(file);
	setMenuBar(mb);
	
	tf=new TextField(20);
	setLayout(new FlowLayout());
	add(tf);

open.addActionListener((ActionEvent ae)->tf.setText("open"));
save.addActionListener((ActionEvent ae)->tf.setText("save"));
close.addActionListener((ActionEvent ae)->tf.setText("close"));
closeall.addActionListener((ActionEvent ae)->tf.setText("closeAll"));
auto.addItemListener((ItemEvent ie)->{
if(auto.getState())
	tf.setText("Auto On");
else
	tf.setText("Auto Off");
});



	}
	
	
}
