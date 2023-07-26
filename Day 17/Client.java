package reverseecho;
import java.net.*;
import java.io.*;
public class Client{
	public static void main(String args[]){
	try{
	Socket stk=new Socket("localhost",2000);
	BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
	BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));

	PrintStream ps=new PrintStream(stk.getOutputStream());
	String msg;
	do{
	msg=keyb.readLine();
	ps.println(msg);
	msg=br.readLine();
	System.out.println("From Server "+msg);
	
	}while(!msg.equals("0"));
	stk.close();
	
	}
	catch(Exception e){
	System.out.println(e);
	}
}
}

/*
hello
From Server olleh
 We are implemnting network concept in it
From Server ti ni tpecnoc krowten gnitnmelpmi era eW
0
From Server 0
*/