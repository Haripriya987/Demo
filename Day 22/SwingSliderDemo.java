import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import javax.swing.event.*;

public class SwingSliderDemo 
{
    public static void main(String[] args) 
    {
      FrameSlider  a=new FrameSlider();
       a.setSize(800,800);
       a.setVisible(true);
       
       a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
class FrameSlider extends JFrame implements ChangeListener
{
	JSlider sl;
	JPanel p1,p2;
	JProgressBar pb;
	int w=50;

	FrameSlider(){
	sl=new JSlider(0,100,50);
	sl.setMajorTickSpacing(10);
	sl.setMinorTickSpacing(1);
	sl.setPaintTicks(true);	
	sl.setPaintLabels(true);
	
	pb=new JProgressBar();
	pb.setString("50%");
	pb.setStringPainted(true);
	//pb.setIndeterminate(true);
	
	p1=new JPanel(){
	public void paintComponent(Graphics g){
	g.drawOval(200,200,w,w);
	}
	};
	p2=new JPanel();
	p2.add(pb);
	
	add(sl,BorderLayout.NORTH);
	add(p1,BorderLayout.CENTER);
	add(p2,BorderLayout.SOUTH);	
	sl.addChangeListener(this);
	}

	public void stateChanged(ChangeEvent e){
		w=sl.getValue();
		p1.repaint();
		pb.setString(w+ "%");
		pb.setValue(w);

}	
}