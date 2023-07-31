import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;
import java.awt.Color;

public class SwingMenuDemo{
	public static void main(String args[]){
	FrameMenuD f=new FrameMenuD();
	f.setVisible(true);
	f.setSize(800,800);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
class FrameMenuD extends JFrame  implements ActionListener
{
	JToolBar tb;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JTextArea ta;

	FrameMenuD(){
	super("ToolBar Menu");
	tb=new JToolBar();
	b1=new JButton("File ");
	b2=new JButton("Open ");
	b3=new JButton("new ");
	b4=new JButton("cut ");
	b5=new JButton("copy ");
	b6=new JButton("split ");
	b7=new JButton("close ");
	tb.add(b1);
	tb.add(b2);
	tb.add(b3);
	tb.add(new JToolBar.Separator());
	tb.add(b4);
	tb.add(b5);
	tb.add(b6);
	tb.add(b7);

	ta=new  JTextArea();
	JScrollPane sp=new JScrollPane(ta);
	add(tb,BorderLayout.NORTH);
	add(sp,BorderLayout.CENTER);

	JMenuBar mb=new JMenuBar();
	JMenu file=new JMenu("File");
	JMenuItem m1=new JMenuItem("save");
	JMenuItem m2=new JMenuItem("open");
	m2.setMnemonic(KeyEvent.VK_O);
	file.add(m1);
	file.addSeparator();
	file.add(m2);
	mb.add(file);
	setJMenuBar(mb);
	b2.setActionCommand("open");	
	b2.addActionListener(this);
	b1.addActionListener(this);
	m1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae){
	if(ae.getActionCommand().equals("open")){
	JFileChooser  fc=new JFileChooser();
	fc.showOpenDialog(this);
	File f=fc.getSelectedFile();
		try{
	FileInputStream fi=new FileInputStream(f);
	byte b[]=new byte[fi.available()];
	fi.read(b);
	String str=new String(b);
	ta.setText(str);
	fi.close();
		}
		catch(Exception e){}
		}
		else{
       Color col=JColorChooser.showDialog(this,"Font color",Color.RED);
	ta.setForeground(col);
		}
	
	}

}