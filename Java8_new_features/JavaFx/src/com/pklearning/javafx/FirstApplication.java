package com.pklearning.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FirstApplication extends Application {

    public void start(Stage stage){
        //callback
        Label label=new Label("Hello World!");
        label.setFont(new Font(50));
        Scene scene=new Scene(label);
        stage.setScene(scene);
        stage.setTitle("Hello");
        stage.show();

    }
    public static void main(String[] args) {
        launch();

    }
}
