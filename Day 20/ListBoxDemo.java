import java.awt.*;
import java.awt.event.*;
public class ListBoxDemo{
	public static void main(String args[]){
		FrameList f=new FrameList();
		f.setSize(400,400);
		f.setVisible(true);
	}
}
class FrameList extends Frame implements ItemListener,ActionListener{
	List l;
	Choice c;
	TextArea ta;
	FrameList(){
	 	super("List Box Demo");
		l=new List(4,true);
		c=new Choice();
		ta=new TextArea(20,30);
		l.add("Monday");
		l.add("Tuesday");
		l.add("wednesday");
		l.add("Thursday");
		l.add("Friday");
		l.add("saturday");	
		c.add("January");
		c.add("february");
		c.add("March");
		c.add("April");
		c.add("May");
		c.add("June");
		setLayout(new FlowLayout());
		add(l);
		add(c);
		add(ta);
		l.addItemListener(this);
		c.addItemListener(this);
		l.addActionListener(this);
		}
		
	public void itemStateChanged(ItemEvent ie){
	if(ie.getSource()==l)
		ta.setText(l.getSelectedItem());
	else
		ta.setText(c.getSelectedItem());	
	} 
	public void actionPerformed(ActionEvent ae){
		String list[]=l.getSelectedItems();
		String txt=" ";
		for(String x:list)
		txt+=x+"\n";
		ta.setText(txt);
		l.addItem(txt);

	}
}