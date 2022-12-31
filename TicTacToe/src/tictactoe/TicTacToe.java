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
import tictactoe.JavaFiles.SignInBase;
import tictactoe.JavaFiles.SplashScreenBase;

/**
 *
 * @author DELL
 */
public class TicTacToe extends Application {
    
    MediaPlayer mediaPlayer;
    
    @Override
    public void start(Stage stage) throws Exception {
        
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
    

    public static void music(String filepath)
    {
        try
        {          
            File musicpath = new File(filepath);
            if(musicpath.exists())
            {
                AudioInputStream audio = AudioSystem.getAudioInputStream(musicpath);
                Clip clip  = AudioSystem.getClip();
                clip.open(audio);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            else
            {
                System.out.println("can't find file");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        music("D:\\MAD43-SV\\Java\\tic tac toe game\\tictactoejava\\Java-Project\\Java-Project\\TicTacToe\\src\\resources\\cssFiles\\bensound-bluebay.wav");
        launch(args);
    }  
}