/*Serialization is a process of  Storing and retrieving the state of a object.It can be achieved by ObjectStreamClasses.
There are three important points to remember in serialization:
1)The class Must implement the Serializable Interface.
2)It must  have non parameterized constructor.
3)static & transient members of class cannot be serializable.
*/
import java.io.*;
class Student implements Serializable{
	private int rollno;
	private String name;
	private float avg;
	private String dept;
	static int no=0;
	Student(){
	}
	Student(int r,String n,float a,String d){
	rollno=r;
	name=n;
	avg=a;
	dept=d;
	no=200;
	}
	public String toString(){
	return "\nStudentDetails\n"+" "+rollno+" "+name+" "+avg+" "+dept+" "+no;
		
	}
}
public class SerializationDemo{
	public static void main(String args[]){
	/*try{
	FileOutputStream fos=new FileOutputStream("Student1.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	Student s=new Student(10,"HariPriya",90.3f,"CS");
	oos.writeObject(s);
	fos.close();
	oos.close();
	}
	catch(Exception e){
	}*/
	try{
	FileInputStream fis=new FileInputStream("Student1.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Student s=(Student)ois.readObject();
	System.out.println(s);
	fis.close();
	ois.close();
	}
	catch(Exception e){
	}
	

}
}

/*StudentDetails
 10 HariPriya 90.3 CS 0
*/			