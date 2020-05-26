
package anchorpanedemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class OnActionButtonDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
            
        VBox vbox = new VBox();
        vbox.setMinHeight(300);
        vbox.setMinWidth(500);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(20);
        
        TextField textField = new TextField();
        textField.setMaxWidth(300);
        Button btn = new Button("Submit");
        
        Label label = new Label();
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               String str = textField.getText();
                label.setText("Hello "+str);
            }
        });
        
        
        vbox.getChildren().addAll(textField, btn, label);
        


        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
        


    }
    
}
