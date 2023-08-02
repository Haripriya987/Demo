import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;
import java.io.FileInputStream;
import javafx.application.*;
//import javafx.scene.control.*;
import javafx.scene.image.*;


public class LayoutSplitPane extends Application
 {
  public void start(Stage stage) throws Exception
	{

        ImageView i1=null;
        ImageView i2=null;
        ImageView i3=null;

        i1=new ImageView(new Image(new FileInputStream("img/image1.jpg")));
         i2=new ImageView(new Image(new FileInputStream("img/image2.jpg")));
         i3=new ImageView(new Image(new FileInputStream("img/image3.jpg")));

        /* ScrollPane sp1=new ScrollPane(i1);
         ScrollPane sp2=new ScrollPane(i2);
        ScrollPane sp3=new ScrollPane(i3);
 

         SplitPane root=new SplitPane(sp1,sp2,sp3);
        root.setDividerPositions(0.33,0.66);*/
        /* 
        ScrollPane sp1=new ScrollPane(i1);
         ScrollPane sp2=new ScrollPane(i2);
        ScrollPane sp3=new ScrollPane(i3);
        Tab t1=new Tab("img1",sp1);
        Tab t2=new Tab("img1",sp2);
        Tab t3=new Tab("img1",sp3);
        TabPane root=new TabPane();
        root.getTabs().addAll(t1,t2,t3);*/

        ScrollPane sp1=new ScrollPane(i1);
         ScrollPane sp2=new ScrollPane(i2);
        ScrollPane sp3=new ScrollPane(i3);
        TitledPane t1=new TitledPane("img1",sp1);
        TitledPane t2=new TitledPane("img2",sp2);
        TitledPane t3=new TitledPane("img3",sp3);
        Accordion root=new Accordion();
        root.getPanes().addAll(t1,t2,t3);



  Scene sc=new Scene(root,400,400);
	
	stage.setScene(sc);
	stage.show();

	}

public static void main(String args[]){
launch(args);

	}
}
