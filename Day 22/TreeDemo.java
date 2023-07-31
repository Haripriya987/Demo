import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;
import javax.swing.tree.*;
import java.io.*;
import java.awt.*;
public class TreeDemo{
	public static void main(String args[]){
	FrameT f=new FrameT();
	f.setVisible(true);
	f.setSize(400,400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
class FrameT extends JFrame
{
	JTree tree;
	JLabel label;	
	FrameT(){
	super("Tree Demo");
	DefaultMutableTreeNode root=new  DefaultMutableTreeNode("C://users//lenovo//desktop//java");
	File f=new File("C://users//lenovo//desktop//java");
	
	for(File x:f.listFiles()){
		if(x.isDirectory()){
	DefaultMutableTreeNode temp=new  DefaultMutableTreeNode(x.getName());
	for(File y:x.listFiles()){
	temp.add(new DefaultMutableTreeNode(y.getName()));
	}
	root.add(temp);
	}
		else{
		root.add(new DefaultMutableTreeNode(x.getName()));
		}
	
	}
	tree=new JTree(root);
	label=new JLabel("No Files Selected");
	JScrollPane sp=new JScrollPane(tree);
	
	add(sp,BorderLayout.CENTER);
	add(label,BorderLayout.SOUTH);
	}
}