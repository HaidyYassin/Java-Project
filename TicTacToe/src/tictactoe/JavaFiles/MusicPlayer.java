/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.JavaFiles;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author DELL
 */
public class MusicPlayer {
    static Clip clip ;
    static long clipTimePosition;
    public static boolean streaming= true;
    public static boolean firstTime = true;
    public static void PlayMusic()
    {
        try
        {          
            File musicpath = new File("..\\TicTacToe\\src\\resources\\music\\bensound-bluebay.wav");
            if(musicpath.exists())
            {
                AudioInputStream audio = AudioSystem.getAudioInputStream(musicpath);
                clip  = AudioSystem.getClip();
                clip.open(audio);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                streaming = true;
                firstTime = false;
                
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
    
    public static void PauseMusic(){
       clipTimePosition = clip.getMicrosecondPosition();
       clip.stop();
       streaming = false;
    }
    
    public static void ResumeMusic(){
       clip.setMicrosecondPosition(clipTimePosition);
       clip.start();
       streaming = true;
    }
}
