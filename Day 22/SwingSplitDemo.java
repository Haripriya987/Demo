
import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import javax.swing.event.*;

public class SwingSplitDemo 
{
    public static void main(String[] args) 
    {
      FrameS  a=new FrameS();
       a.setSize(800,800);
       a.setVisible(true);
       
       a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
class FrameS extends JFrame implements ListSelectionListener
{
	JSplitPane sp;
	JList list;
	JLabel lb;

	FrameS(){
	super("Split demo");
	String cols[]={"RED","GREEN","BLUE","YELLOW","MAGNETA","ORANGE","BLACK"};
	list=new JList(cols);
	list.setSelectedIndex(0);
	list.addListSelectionListener(this);
	JScrollPane p1=new JScrollPane(list);
	
	lb=new JLabel(" ");
	lb.setOpaque(true);
	lb.setBackground(Color.RED);
	JScrollPane p2=new JScrollPane(lb);
	
	sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
	sp.setDividerLocation(200);
	add(sp);
		
	}
	public void valueChanged(ListSelectionEvent e)
	{
	        String str = (String)list.getSelectedValue();
   	   
            	switch (str) {
                case "RED":
                    lb.setBackground(Color.RED);
                    break;
                case "GREEN":
                    lb.setBackground(Color.GREEN);
                    break;
                case "BLUE":
                    lb.setBackground(Color.BLUE);
                    break;
                case "YELLOW":
                    lb.setBackground(Color.YELLOW);
                    break;
                case "MAGENTA":
                    lb.setBackground(Color.MAGENTA);
                    break;
                case "ORANGE":
                    lb.setBackground(Color.ORANGE);
                    break;
                case "BLACK":
                    lb.setBackground(Color.BLACK);
                    break;
            }
        


	}
}