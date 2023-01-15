/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;


import java.io.File;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import tictactoe.JavaFiles.HomeScreenBase;
import tictactoe.JavaFiles.MusicPlayer;
import tictactoe.JavaFiles.OnlineGame;
import tictactoe.JavaFiles.SignInBase;
import tictactoe.JavaFiles.SplashScreenBase;
import tictactoe.JavaFiles.UsersFxml1Base;
import tictactoe.JavaFiles.gamesScreenBase;

/**
 *
 * @author DELL
 */
public class TicTacToe extends Application {
    
    MediaPlayer mediaPlayer;
    
    @Override
    public void start(Stage stage) throws Exception { 
       
        Parent root = new gamesScreenBase(stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false); 
        stage.setOnCloseRequest((event) -> {
            System.exit(1);
        }); 
        stage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        launch(args);
    }  
}