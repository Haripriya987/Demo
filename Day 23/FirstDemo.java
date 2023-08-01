
import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.Button;
public class FirstDemo extends Application{
	public void start(Stage stage){
	  Button b=new Button("Click Me");
	  FlowPane fp=new FlowPane();
	  fp.getChildren().add(b);
	  Scene sc=new Scene(fp);
	  stage.setScene(sc);
	  stage.show();
	  }
	public static void main(String args[]){
	launch(args);

	}
}
		




//--add-modules javafx.controls,javafx.fxml