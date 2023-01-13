/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.JavaFiles;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordGame {
    File gamefile;
    public List<String> WriteLines;
    public static int StepNum=0;
    String gameState;
    public static String gameSteps="";
    String Score;
    String Date;
    String contender;

    public RecordGame() {
        try{
             File folder = new File("..\\TicTacToe\\recordedFiles\\local");
             int name=folder.list().length+1;
            gamefile=new File("..\\TicTacToe\\recordedFiles\\local\\"+name+".txt");
            gamefile.createNewFile();
            String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
            PrintWriter writer = new PrintWriter(gamefile, "UTF-8");
            
            writer.println(" ");
            writer.println(" ");
            writer.println(" ");
            writer.println(" ");
            writer.println(" ");
            writer.println(" ");
            writer.close();
            if(gamefile.exists()){
            WriteLines= Files.readAllLines(gamefile.toPath());
            WriteLines.set(0, timeStamp);
            WriteLines.set(1, "Bot");
            
            }else{
                gamefile.createNewFile();
            }
            
            }catch(Exception e){
                e.printStackTrace();
            }
    }
    
     void gameStepForPlayer(int n){
	StepNum++;
    	gameSteps+=StepNum+"."+"You: X"+n+" , ";
    }
    void writeStepToFile(){
        WriteLines.set(2, gameSteps);
        try {
            Files.write(gamefile.toPath(), WriteLines);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
   
    }
 
 void writeStateOnFile(String state){
     WriteLines.set(3, state);
     if(state=="Tie")
         WriteLines.set(4,"5");
     else if(state=="Win")
         WriteLines.set(4,"10");
     else
          WriteLines.set(4,"0");
 }
}
    
