import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class SwingSpinnerDemo 
{
    public static void main(String[] args) 
    {
      FrameSpin  a=new FrameSpin();
       a.setSize(800,800);
       a.setVisible(true);
       
       a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
class FrameSpin extends JFrame implements ActionListener,ListSelectionListener,ChangeListener
{
	JComboBox cb;
	JList list;
	JSpinner sp1,sp2;
	JTextField tf;
	FrameSpin(){
		super("Spinner Demo");
	String countries[]={"India","US","UK","Canada","Japan"};
	String months[]={"January","february","march","april","may","june","july","aug","sep","oct","nov","dec"};
	String days[]={"sun","mon","tue","wed","thur","fri","sat"};
	cb=new JComboBox(countries);
	list=new JList(months);
	list.setVisibleRowCount(3);
	tf=new JTextField(15);
	
	sp1=new JSpinner(new SpinnerNumberModel(1,1,31,1));//intial,min,max,increment
	sp2=new JSpinner(new SpinnerListModel(days));

	setLayout(new FlowLayout());
	add(cb);
	add(sp1);
	add(sp2);
	add(list);
	add(tf);
	cb.addActionListener(this);
	list.addListSelectionListener(this);
	sp1.addChangeListener(this);
	sp2.addChangeListener(this);

	}	
	public void actionPerformed(ActionEvent ae){
	tf.setText((String)cb.getSelectedItem());
	}

	public void valueChanged(ListSelectionEvent e){
	tf.setText((String)list.getSelectedValue());		
	}
	public void stateChanged(ChangeEvent e){
		if(e.getSource()==sp1)
			tf.setText(sp1.getValue()+" ");
		else
			tf.setText((String)sp2.getValue());
		
	}
}

