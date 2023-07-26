package reverseecho;
import java.net.*;
import java.io.*;
public class ReverseEcho{
	public static void main(String args[]){
	try{
	ServerSocket ss=new ServerSocket(2000);
	Socket stk=ss.accept();
	BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
	PrintStream ps=new PrintStream(stk.getOutputStream());
	String msg;
	StringBuilder sb;
	do{
	msg=br.readLine();
	sb=new StringBuilder(msg);
	sb.reverse();
	msg=sb.toString();
	ps.println(msg);
	
	}while(!msg.equals("0"));
	ss.close();
	}
	catch(Exception e){
	System.out.println(e);
	}
}
}