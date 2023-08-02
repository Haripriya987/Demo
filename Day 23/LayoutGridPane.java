import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.*;

public class LayoutGridPane extends Application
 {
 	public void start(Stage stage) throws Exception
	{

	Button b1=new Button("One");
	Button b2=new Button("Two");
	Button b3=new Button("Three");
	Button b4=new Button("Four");
	Button b5=new Button("Five");
	
	
GridPane root=new GridPane();
root.add(b1,0,0);
root.add(b2,1,2);
root.add(b3,2,3);
root.add(b4,4,5);
root.add(b5,2,4);
	
	Scene sc=new Scene(root,400,400);
	
	stage.setScene(sc);
	stage.show();

	}

public static void main(String args[]){
launch(args);

	}
   
}
