import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
public class LayoutFlowPanefx extends Application{
	public void start(Stage stage) throws Exception
	{

	Button b1=new Button("One");
	Button b2=new Button("Two");
	Button b3=new Button("Three");
	Button b4=new Button("Four");
	Button b5=new Button("Five");
	
	FlowPane root=new FlowPane();
	root.setHgap(10);
	root.setVgap(10);
	root.getChildren().addAll(b1,b2,b3,b4,b5);
	
	Scene sc=new Scene(root,400,400);
	
	stage.setScene(sc);
	stage.show();

	}

public static void main(String args[]){
launch(args);

	}
}