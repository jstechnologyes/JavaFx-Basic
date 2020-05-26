
package anchorpanedemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class BorderPaneDemo extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        BorderPane pane= new BorderPane();
        pane.setMinHeight(300);
        pane.setMinWidth(500);
         
        VBox vbox= new VBox();
        vbox.setMinHeight(50);
        vbox.setMinWidth(500);
        vbox.setStyle("-fx-background-color:blue");
        pane.setTop(vbox);
        
        VBox vbox1= new VBox();
        vbox1.setMinHeight(50);
        vbox1.setMinWidth(500);
        vbox1.setStyle("-fx-background-color:blue");
        pane.setBottom(vbox1);
        
        HBox hbox= new HBox();
        hbox.setMinHeight(200);
        hbox.setMinWidth(100);
        hbox.setStyle("-fx-background-color:green");
        pane.setLeft(hbox);
        
        HBox hbox1= new HBox();
        hbox1.setMinHeight(200);
        hbox1.setMinWidth(100);
        hbox1.setStyle("-fx-background-color:green");
        pane.setRight(hbox1);
        
        
        
        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
