/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
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
    private final SimpleStringProperty Date;
    private final SimpleStringProperty score;
    private final SimpleStringProperty status;
    private final SimpleStringProperty Contender;
    private  CheckBox checkBox;
    private String gameSteps;
    
    public HistoryTableModel(File file) throws IOException  {
            this.num = new SimpleStringProperty(file.getName().substring(0, file.getName().indexOf('.')));
            this.Date = new SimpleStringProperty(Files.readAllLines(file.toPath()).get(0));
            this.Contender = new SimpleStringProperty(Files.readAllLines(file.toPath()).get(1));
            this.status = new SimpleStringProperty(Files.readAllLines(file.toPath()).get(3));
            this.score = new SimpleStringProperty(Files.readAllLines(file.toPath()).get(4));
            this.checkBox=new CheckBox();
            this.gameSteps=Files.readAllLines(file.toPath()).get(2);
        
    }

    public String getDate() {
        return Date.get();
    }
    public void setDate(String date) {
        this.gameSteps = date;
    }
    public String getGameSteps() {
        return gameSteps;
    }

    public void setGameSteps(String gs) {
        this.gameSteps = gs;
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
  
    
}