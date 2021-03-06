/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkjpa;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author rant
 */
public class HomeworkJPA extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       Pane studentTableView =  FXMLLoader.load(getClass().getResource("stdView.fxml"));         
        Scene scene = new Scene(studentTableView);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JPA");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
