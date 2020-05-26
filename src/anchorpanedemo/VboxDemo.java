
package anchorpanedemo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class VboxDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        VBox vbox=new VBox();
        vbox.setMinHeight(300);
        vbox.setMinWidth(500);
        
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(20);
        
        TextField textField= new TextField();
        textField.setMaxWidth(300);
        textField.setAlignment(Pos.CENTER);
        Button btn= new Button("Click Me");
        
        vbox.getChildren().addAll(textField,btn);
       
        
        Scene scene=new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
}
