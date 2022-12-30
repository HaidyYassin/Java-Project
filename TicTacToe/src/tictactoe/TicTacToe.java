/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tictactoe.JavaFiles.RecordedHistoryTable;
import tictactoe.JavaFiles.RecordedMatchScreenBase;
import tictactoe.JavaFiles.SignInBase;
import tictactoe.JavaFiles.SplashScreenBase;

/**
 *
 * @author DELL
 */
public class TicTacToe extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
         
        //Parent root = new SplashScreenBase( stage);
        Parent root = new SplashScreenBase( stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        
        stage.show();
        stage.setResizable(false); 
        Thread.sleep(3000);   
        
        scene = new Scene(new SignInBase(stage));
        stage.setScene(scene);
        stage.show();   
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

   
   
}
