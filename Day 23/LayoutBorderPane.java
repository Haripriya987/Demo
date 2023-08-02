import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.application.*;

public class LayoutBorderPane extends Application
{
    public void start(Stage stage) throws Exception
	{

	Button b1=new Button("One");
	Button b2=new Button("Two");
	Button b3=new Button("Three");
	Button b4=new Button("Four");
	Button b5=new Button("Five");
	
    BorderPane root=new BorderPane();
		root.setTop(b1);
	root.setBottom(b2);
	root.setLeft(b3);
	root.setRight(b4);
	root.setCenter(b5);


	
	Scene sc=new Scene(root,400,400);
	
	stage.setScene(sc);
	stage.show();

	}

public static void main(String args[]){
launch(args);

	}
}
