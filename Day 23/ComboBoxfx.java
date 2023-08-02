/*we are using hash map to store the data 
key is customer id
value is customer Information.These are objects of customer class.
When we save Entire hash map is stored in a file called customer.txt
*/
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

class Customer 
{
private int custid;
private String name;
private String address;
 	public Customer(int c,String n,String a){
	custid=c;
	name=n;
	address=a;
	}
	public int getId(){return custid;}
	public String getName(){return name;}
	public String getAddress(){return address;}
	public void setAddress(String add){address=add;}


}


public class ComboBoxfx extends Application
{
	int count=0;

	public void start(Stage stage){
                HashMap<Integer,Customer> hm=new HashMap<>();
	
	Font f=new Font("Times New Roman",20);
	Label l1=new Label("Customer ID");
	l1.setFont(f);
	Label l2=new Label("Name");
	l2.setFont(f);
	Label l3=new Label("Adress");
	l3.setFont(f);
	
	ComboBox<Integer> cust=new ComboBox<>();
	
	cust.setStyle("-fx-font-size:20");
	TextField name=new TextField();
	TextField add=new TextField();
	name.setPrefColumnCount(15);
	add.setPrefColumnCount(20);

	Button b1=new Button("Save");
	Button b2=new Button("Create");
	//Button b3=new Button("Search");
	b2.setOnAction(e->
	{
	++count;
	cust.getItems().add(count);
	cust.setValue(count);
	name.setText("");
	add.setText("");
		});
	b1.setOnAction(e ->
	{
	Customer c=new Customer(cust.getValue(),name.getText(),add.getText());
	hm.put(count,c);
	
	try(PrintStream ps=new PrintStream(new FileOutputStream("CUSTOMER2.txt"))){
	for(Customer ct:hm.values())
	{
		ps.println(ct.getId());
		ps.println(ct.getName());
		ps.println(ct.getAddress());		
	}
}
	catch(Exception ex){}
	
	cust.valueProperty().addListener(x->{
		int a=cust.getValue();
		Customer cx=hm.get(a);
		
		name.setText(cx.getName());
		add.setText(cx.getAddress());
		

	});


	}
	);	

	HBox hb1=new HBox();
	hb1.setAlignment(Pos.CENTER);
	HBox hb2=new HBox();
	hb2.setAlignment(Pos.CENTER);

	HBox hb3=new HBox();
	hb3.setAlignment(Pos.CENTER);

	HBox hb4=new HBox();
	hb4.setAlignment(Pos.CENTER);
	
	hb1.getChildren().addAll(l1,cust);
	hb2.getChildren().addAll(l2,name);
	hb3.getChildren().addAll(l3,add);
	hb4.getChildren().addAll(b2,b1);
	
	VBox v1=new VBox();
	v1.getChildren().addAll(hb1,hb2,hb3,hb4);

	try(Scanner s=new Scanner(new FileInputStream("customer.txt"))){
	int c;
	String nme;
	String ad;
		while(s.hasNext()){
			c=s.nextInt();
			nme=s.next();
			ad=s.next();
			hm.put(c,new Customer(c,nme,ad));
			if(c>count)count=c;
			cust.getItems().add(c);
		}
}
	catch(Exception ex){}


	
	Scene sc=new Scene(v1,500,500);
	stage.setScene(sc);
	stage.show();
	
	}
public static void main(String args[]){
launch(args);
}
}
