import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

public class TextArea extends Application 
{
	public void start(Stage stage)throws Exception
	{
	
	javafx.scene.control.TextArea ta = new javafx.scene.control.TextArea();
  
	ta.setPrefColumnCount(100);
	ta.setPrefRowCount(20);
	
	Slider s1=new Slider(10,50,10);
	s1.setMajorTickUnit(5);
	s1.setShowTickMarks(true);
	s1.valueProperty().addListener(e->ta.setFont(Font.font(s1.getValue())));
	
	
	HBox h1=new HBox();
	h1.getChildren().addAll(ta);
	HBox h2=new HBox(s1);
	VBox vb=new VBox();
	vb.getChildren().addAll(h1,h2);
	
	
	
	Scene sc=new Scene(vb,500,500);
	stage.setScene(sc);
	stage.show();

	}
public static void main(String args[]){
	launch(args);

	}
}

