/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.JavaFiles;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
/**
 *
 * @author DELL
 */
public class Sound {
    public static void clicksound()
 {
   try 
   {
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("..\\TicTacToe\\src\\resources\\music\\click.wav").getAbsoluteFile( ));
    Clip clip = AudioSystem.getClip( );
    clip.open(audioInputStream);
    clip.start( );
   }
   catch(Exception ex)
   {
     System.out.println("Error with playing sound.");
     ex.printStackTrace( );
   }
 }
}
