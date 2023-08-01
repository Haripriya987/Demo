import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class EventHandleDemo  extends Application implements EventHandler<ActionEvent>
{
        Button b;
        int count=0;
        public void start(Stage stage)throws Exception
        {
             b=new Button("OK");
              b.setPrefSize(100,30);
        
            b.setOnAction(this);

            FlowPane f=new FlowPane(b);

            Scene sc=new Scene(f,400,400);

            stage.setScene(sc);
            stage.show();


        }
         public void handle(ActionEvent ae){
            count++;
            b.setText(""+count);
        }

       
    public static void main(String args[]){
        launch(args);
    }
}
