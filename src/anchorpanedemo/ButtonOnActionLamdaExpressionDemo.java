/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anchorpanedemo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Hadi
 */
public class ButtonOnActionLamdaExpressionDemo extends Application {
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
        
        btn.setOnAction(e->buttonAction(label,textField));
        
         vbox.getChildren().addAll(textField, btn, label);
        


        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    void buttonAction(Label lbl, TextField textField){
        String str = textField.getText();
        lbl.setText("Hello "+ str);
    }
}
