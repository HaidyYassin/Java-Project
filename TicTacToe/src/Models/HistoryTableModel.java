/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;


/**
 *
 * @author yelbt
 */

public class HistoryTableModel implements Serializable {

    private final SimpleStringProperty num;
    private final SimpleStringProperty score;
    private final SimpleStringProperty status;
    private final SimpleStringProperty Contender;
    private  CheckBox checkBox;
    FileInputStream fileInputStream;
    

    public HistoryTableModel(String num, String score, String status, String Contender)  {
        this.num = new SimpleStringProperty(num);
        this.score = new SimpleStringProperty(score);
        this.status = new SimpleStringProperty(status);
        this.Contender = new SimpleStringProperty(Contender);
        this.checkBox=new CheckBox();
       
        
    }
    
    

    public String getGameNumber(){
    
        return  num.get();
    }
    public String getGameScore(){
    
        return  score.get();
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(CheckBox checkBox) {
        this.checkBox = checkBox;
    }


    public String getGameStatus(){
    
        return  status.get();
    }
    public String getGameContender(){
    
        return  Contender.get();
    }
    
    public void setGameNumber(String number){
    
        num.set(number);
    }
    public void setGameScore(String Score){
    
        this.score.set(Score);
    }
    public void setGameStatus(String status){
    
        this.status.set(status);
    }
    public void setGameContender(String con){
    
        Contender.set(con);
    }
    public String getRecordFile(){
            String record="";
        try{
                    fileInputStream = new FileInputStream("D:\\MAD43-SV\\Java\\tic tac toe game\\tictactoejava\\Java-Project\\Java-Project\\TicTacToe\\recordedFiles\\"+num.get()+".txt");
                    //byte[]b =event.getText().getBytes();
                    int size = fileInputStream.available();
                    byte[] b = new byte[size];
                    fileInputStream.read(b);
                     record=new String(b);
                    fileInputStream.close();
                }catch(Exception ex){
                    
                    System.out.println(ex.getMessage());
                }
        System.out.println("The record file"+record);
        return record;

    }
    
}
