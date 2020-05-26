
package anchorpanedemo;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class AnchorPaneDemo1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        AnchorPane pane= new AnchorPane();
        
        pane.setMinHeight(300);
        pane.setMinWidth(500);
        
        TextField textField= new TextField();
        textField.setMinHeight(50);
        textField.setLayoutX(100);
        textField.setLayoutY(30);
        
        Button btn=new Button("Ok");
        btn.setLayoutX(150);
        btn.setLayoutY(100);
        pane.getChildren().addAll(textField, btn);
        
        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
