/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.JavaFiles;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import static javafx.scene.control.ContentDisplay.GRAPHIC_ONLY;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class HardLevel {

    boolean isrecord;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private final RecordGame gamerecord;
    public HardLevel(Button btn1, Button btn2, Button btn3, Button btn4, Button btn5, Button btn6, Button btn7, Button btn8, Button btn9,RecordGame gamerecord, boolean isrecord) {
      
        this.btn1 = btn1;
        this.btn2 = btn2;
        this.btn3 = btn3;
        this.btn4 = btn4;
        this.btn5 = btn5;
        this.btn6 = btn6;
        this.btn7 = btn7;
        this.btn8 = btn8;
        this.btn9 = btn9;
        this.gamerecord =gamerecord;
        this.isrecord = isrecord;
    }
    
    
     Button [][] board = { {btn1, btn2, btn3}, {btn4, btn5, btn6}, {btn7, btn8, btn9} };  
     public static boolean haveTheSameValueAndNotEmpty(Button x, Button y, Button z) {
        if(x.getText() == y.getText() && x.getText() == z.getText() && !(x.getText().equals(" "))) {
              x.setStyle("-fx-background-color:#FFEB3B;");
              y.setStyle("-fx-background-color:#FFEB3B;");
              z.setStyle("-fx-background-color:#FFEB3B;");
            return true;
        }
        return false;
}

    public static int checkWinner(Button board[][]) {
    //  2: X winner
    // -2: O winner
    //  0: Tie
    //  1: No winner

    // For rows
    for(int i = 0; i < 3; i++) {
        if(haveTheSameValueAndNotEmpty(board[i][0], board[i][1], board[i][2])) {
            return board[i][0].getText() == "X" ? 2 : -2;
        }
    }

    // For cols
    for(int i = 0; i < 3; i++) {
        if(haveTheSameValueAndNotEmpty(board[0][i], board[1][i], board[2][i])) {
            return board[0][i] .getText() == "X" ? 2 : -2;
        }
    }
    
    // Diameter 1
    if(haveTheSameValueAndNotEmpty(board[0][0], board[1][1], board[2][2])) {
        return board[0][0].getText() == "X" ? 2 : -2;
    }

    // Diameter 2
    else if(haveTheSameValueAndNotEmpty(board[2][0], board[1][1], board[0][2])) {
        return board[2][0] .getText() == "X" ? 2 : -2;
    }

    // For Tie Case
    boolean tie = true;
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            if(board[i][j].getText() == " ") {
                tie = false;
            }
        }   
    }
    if(tie) return 0;

    // Else
    return 1;
}
   
   
    
    
    public int minimaxalgo(Button board[][], int depth, boolean isMaximizing, boolean firstTime){   
    int result = checkWinner(board);
    if(depth == 0 || result != 1) {
        return result;
    }

    if(isMaximizing) {
        int finalScore = -10;
        int finalI = 0, finalJ = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i][j].getText() == " ") {
                    board[i][j].setText("X");
                    board[i][j].setContentDisplay(GRAPHIC_ONLY);

                    int score = minimaxalgo(board, depth - 1, false, false);
                    board[i][j].setText(" ");
                    if(score > finalScore) {
                        finalScore = score;
                        finalI = i;
                        finalJ = j;
                    }
                }
            }   
        }
        if(firstTime) {
            board[finalI][finalJ].setText("X");
            board[finalI][finalJ].setGraphic(drawXIcon());
            board[finalI][finalJ].setContentDisplay(GRAPHIC_ONLY);
        }
        return finalScore;
    } else {
        int finalScore = 10;
        int finalI = 0, finalJ = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i][j].getText() == " ") {
                    board[i][j].setText("O");
                    board[i][j].setContentDisplay(GRAPHIC_ONLY);
                    int score = minimaxalgo(board, depth - 1, true, false);
                    board[i][j].setText(" ");
                    if(score < finalScore) {
                        finalScore = score;
                        finalI = i;
                        finalJ = j;
                    }
                }
            }   
        }
        if(firstTime) {
            board[finalI][finalJ].setText("O");
            board[finalI][finalJ].setGraphic(drawOIcon());
            board[finalI][finalJ].setContentDisplay(GRAPHIC_ONLY);
            
            if(isrecord)
            {
               gamerecord.StepNum++;
               int index = (finalI * 3 + finalJ)+1;
               gamerecord.gameSteps+=gamerecord.StepNum+"."+"Bot: O"+index+" , ";
            }       
        }
        return finalScore;
    }
}
    
    
    static private ImageView drawOIcon() {

        ImageView vimgO;
        Image imgo;
        imgo = new Image("/resources/images/oImage.png");
        vimgO = new ImageView(imgo);
        vimgO.setFitWidth(140);
        vimgO.setFitHeight(130);
        return vimgO;

    }
    
     static private ImageView drawXIcon() {
        Image imgX;
        ImageView vimgX;
        imgX = new Image("/resources/images/xImage.png");
        vimgX = new ImageView(imgX);
        vimgX.pickOnBoundsProperty();
        vimgX.preserveRatioProperty();
        vimgX.setFitWidth(140);
        vimgX.setFitHeight(130);

        return vimgX;

    }
}
