package tictactoe.JavaFiles;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import static javafx.scene.control.ContentDisplay.GRAPHIC_ONLY;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Window;
import static tictactoe.JavaFiles.GameFxmlBase.status;

public class localMultiPlayer {

//    Socket socket;
//    DataInputStream dis;
//    PrintStream ps;

    public OnlineGame game;
    int XO_turn;
    boolean has_winner;
    Button[][] board;

    public localMultiPlayer() {
        game = new OnlineGame();
        XO_turn = 1;
        has_winner = false;
        board = new Button[3][3];
        onlineMode("x");
    }

    public void onlineMode(String symbol) {
        game.btn1.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (!has_winner) {
                    if (game.btn1.getText() == " " && XO_turn % 2 != 0) {
                        if (symbol.equals("x")) {
                            game.btn1.setText("X");
                            game.btn1.setGraphic(drawXIcon());
                        } else if (symbol.equals("o")) {
                            game.btn1.setText("O");
                            game.btn1.setGraphic(drawOIcon());
                        }
                        game.btn1.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      gamerecord.gameStepForPlayer(1);
                        XO_turn++;
                    } else if (game.btn1.getText() == " " && XO_turn % 2 == 0) {
                        if (symbol.equals("x")) {
                            game.btn1.setText("O");
                            game.btn1.setGraphic(drawOIcon());
                        } else if (symbol.equals("o")) {
                            game.btn1.setText("X");
                            game.btn1.setGraphic(drawXIcon());
                        }
                        game.btn1.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      {
//                          gamerecord.StepNum++;
//                           gamerecord.gameSteps+=gamerecord.StepNum+"."+HomeScreenBase.name+": O"+1+" , ";
//                      }

                        XO_turn++;
                    }
//                  else {
//                  System.out.print( "The field is not empty \n");
//                  }

                    has_winner = checkWinner(board) != 1;
                }

//              int result = checkWinner(board);
//                if(result == 0) {
//                       System.out.print("Tie \n");
//                       if(isrecord)
//                        gamerecord.writeStateOnFile("Tie");
//                 } 
//                else if(result == 2 || result==-2 ){
//                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
//                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
//                }
//                else{
//                    System.out.println("playing");
//                 }
//                gamerecord.writeStateOnFile(checkStatus());
//                if(isrecord)
//                gamerecord.writeStepToFile();
            }
        });
        game.btn2.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!has_winner) {
                    if (game.btn2.getText() == " " && XO_turn % 2 != 0) {
                        if (symbol.equals("x")) {
                            game.btn2.setText("X");
                            game.btn2.setGraphic(drawXIcon());
                        } else if (symbol.equals("o")) {
                            game.btn2.setText("O");
                            game.btn2.setGraphic(drawOIcon());
                        }
                        game.btn2.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      gamerecord.gameStepForPlayer(2);
                        XO_turn++;
                    } else if (game.btn2.getText() == " " && XO_turn % 2 == 0) {
                        if (symbol.equals("x")) {
                            game.btn2.setText("O");
                            game.btn2.setGraphic(drawOIcon());
                        } else if (symbol.equals("o")) {
                            game.btn2.setText("X");
                            game.btn2.setGraphic(drawXIcon());
                        }
                        game.btn2.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      {
//                          gamerecord.StepNum++;
//                           gamerecord.gameSteps+=gamerecord.StepNum+"."+HomeScreenBase.name+": O"+2+" , ";
//                      }
                        XO_turn++;
                    }
//                  else {
//                  System.out.print( "The field is not empty \n");
//                  }

                    has_winner = checkWinner(board) != 1;
                }

//              int result = checkWinner(board);
//                if(result == 0) {
//                       System.out.print("Tie \n");
//                       if(isrecord)
//                        gamerecord.writeStateOnFile("Tie");
//                 } 
//                else if(result == 2 || result==-2 ){
//                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
//                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
//                }
//                else{
//                    System.out.println("playing");
//                 }
//                gamerecord.writeStateOnFile(checkStatus());
//                if(isrecord)
//                gamerecord.writeStepToFile();
            }
        });
        game.btn3.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!has_winner) {
                    if (game.btn3.getText() == " " && XO_turn % 2 != 0) {
                        if (symbol.equals("x")) {
                            game.btn3.setText("X");
                            game.btn3.setGraphic(drawXIcon());
                        } else if (symbol.equals("o")) {
                            game.btn3.setText("O");
                            game.btn3.setGraphic(drawOIcon());
                        }
                        game.btn3.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      gamerecord.gameStepForPlayer(3);
                        XO_turn++;
                    } else if (game.btn3.getText() == " " && XO_turn % 2 == 0) {
                        if (symbol.equals("x")) {
                            game.btn3.setText("O");
                            game.btn3.setGraphic(drawOIcon());
                        } else if (symbol.equals("o")) {
                            game.btn3.setText("X");
                            game.btn3.setGraphic(drawXIcon());
                        }
                        game.btn3.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      {
//                          gamerecord.StepNum++;
//                           gamerecord.gameSteps+=gamerecord.StepNum+"."+HomeScreenBase.name+": O"+3+" , ";
//                      }
                        XO_turn++;
                    }
//                  else {
//                  System.out.print( "The field is not empty \n");
//                  }

                    has_winner = checkWinner(board) != 1;
                }

//              int result = checkWinner(board);
//                if(result == 0) {
//                       System.out.print("Tie \n");
//                       if(isrecord)
//                        gamerecord.writeStateOnFile("Tie");
//                 } 
//                else if(result == 2 || result==-2 ){
//                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
//                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
//                }
//                else{
//                    System.out.println("playing");
//                 }
//                gamerecord.writeStateOnFile(checkStatus());
//                if(isrecord)
//                gamerecord.writeStepToFile();
            }
        });
        game.btn4.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!has_winner) {
                    if (game.btn4.getText() == " " && XO_turn % 2 != 0) {
                        if (symbol.equals("x")) {
                            game.btn4.setText("X");
                            game.btn4.setGraphic(drawXIcon());
                        } else if (symbol.equals("o")) {
                            game.btn4.setText("O");
                            game.btn4.setGraphic(drawOIcon());
                        }
                        game.btn4.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      gamerecord.gameStepForPlayer(4);
                        XO_turn++;
                    } else if (game.btn4.getText() == " " && XO_turn % 2 == 0) {
                        if (symbol.equals("x")) {
                            game.btn4.setText("O");
                            game.btn4.setGraphic(drawOIcon());
                        } else if (symbol.equals("o")) {
                            game.btn4.setText("X");
                            game.btn4.setGraphic(drawXIcon());
                        }
                        game.btn4.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      {
//                          gamerecord.StepNum++;
//                           gamerecord.gameSteps+=gamerecord.StepNum+"."+HomeScreenBase.name+": O"+4+" , ";
//                      }
                        XO_turn++;
                    }
//                  else {
//                  System.out.print( "The field is not empty \n");
//                  }

                    has_winner = checkWinner(board) != 1;
                }
//              int result = checkWinner(board);
//                if(result == 0) {
//                       System.out.print("Tie \n");
//                       if(isrecord)
//                        gamerecord.writeStateOnFile("Tie");
//                 } 
//                else if(result == 2 || result==-2 ){
//                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
//                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
//                }
//                else{
//                    System.out.println("playing");
//                 }
//                gamerecord.writeStateOnFile(checkStatus());
//                if(isrecord)
//                gamerecord.writeStepToFile();
            }
        });
        game.btn5.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!has_winner) {
                    if (game.btn5.getText() == " " && XO_turn % 2 != 0) {
                        if (symbol.equals("x")) {
                            game.btn5.setText("X");
                            game.btn5.setGraphic(drawXIcon());
                        } else if (symbol.equals("o")) {
                            game.btn5.setText("O");
                            game.btn5.setGraphic(drawOIcon());
                        }
                        game.btn5.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      gamerecord.gameStepForPlayer(5);
                        XO_turn++;
                    } else if (game.btn5.getText() == " " && XO_turn % 2 == 0) {
                        if (symbol.equals("x")) {
                            game.btn5.setText("O");
                            game.btn5.setGraphic(drawOIcon());
                        } else if (symbol.equals("o")) {
                            game.btn5.setText("X");
                            game.btn5.setGraphic(drawXIcon());
                        }
                        game.btn5.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      {
//                          gamerecord.StepNum++;
//                           gamerecord.gameSteps+=gamerecord.StepNum+"."+HomeScreenBase.name+": O"+5+" , ";
//                      }
                        XO_turn++;
                    }
//                  else {
//                  System.out.print( "The field is not empty \n");
//                  }

                    has_winner = checkWinner(board) != 1;
                }

//              int result = checkWinner(board);
//                if(result == 0) {
//                       System.out.print("Tie \n");
//                       if(isrecord)
//                        gamerecord.writeStateOnFile("Tie");
//                 } 
//                else if(result == 2 || result==-2 ){
//                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
//                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
//                }
//                else{
//                    System.out.println("playing");
//                 }
//                gamerecord.writeStateOnFile(checkStatus());
//                if(isrecord)
//                gamerecord.writeStepToFile();
            }
        });
        game.btn6.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!has_winner) {
                    if (game.btn6.getText() == " " && XO_turn % 2 != 0) {
                        if (symbol.equals("x")) {
                            game.btn6.setText("X");
                            game.btn6.setGraphic(drawXIcon());
                        } else if (symbol.equals("o")) {
                            game.btn6.setText("O");
                            game.btn6.setGraphic(drawOIcon());
                        }
                        game.btn6.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      gamerecord.gameStepForPlayer(6);
                        XO_turn++;
                    } else if (game.btn6.getText() == " " && XO_turn % 2 == 0) {
                        if (symbol.equals("x")) {
                            game.btn6.setText("O");
                            game.btn6.setGraphic(drawOIcon());
                        } else if (symbol.equals("o")) {
                            game.btn6.setText("X");
                            game.btn6.setGraphic(drawXIcon());
                        }
                        game.btn6.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      {
//                          gamerecord.StepNum++;
//                           gamerecord.gameSteps+=gamerecord.StepNum+"."+HomeScreenBase.name+": O"+6+" , ";
//                      }
                        XO_turn++;
                    }
//                  else {
//                  System.out.print( "The field is not empty \n");
//                  }

                    has_winner = checkWinner(board) != 1;
                }

//              int result = checkWinner(board);
//                if(result == 0) {
//                       System.out.print("Tie \n");
//                       if(isrecord)
//                        gamerecord.writeStateOnFile("Tie");
//                 } 
//                else if(result == 2 || result==-2 ){
//                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
//                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
//                }
//                else{
//                    System.out.println("playing");
//                 }
//                gamerecord.writeStateOnFile(checkStatus());
//                if(isrecord)
//                gamerecord.writeStepToFile();
            }
        });
        game.btn7.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!has_winner) {
                    if (game.btn7.getText() == " " && XO_turn % 2 != 0) {
                        if (symbol.equals("x")) {
                            game.btn7.setText("X");
                            game.btn7.setGraphic(drawXIcon());
                        } else if (symbol.equals("o")) {
                            game.btn7.setText("O");
                            game.btn7.setGraphic(drawOIcon());
                        }
                        game.btn7.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      gamerecord.gameStepForPlayer(7);
                        XO_turn++;
                    } else if (game.btn7.getText() == " " && XO_turn % 2 == 0) {
                        if (symbol.equals("x")) {
                            game.btn7.setText("O");
                            game.btn7.setGraphic(drawOIcon());
                        } else if (symbol.equals("o")) {
                            game.btn7.setText("X");
                            game.btn7.setGraphic(drawXIcon());
                        }
                        game.btn7.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      {
//                          gamerecord.StepNum++;
//                           gamerecord.gameSteps+=gamerecord.StepNum+"."+HomeScreenBase.name+": O"+7+" , ";
//                      }
                        XO_turn++;
                    }
//                  else {
//                  System.out.print( "The field is not empty \n");
//                  }

                    has_winner = checkWinner(board) != 1;
                }
//              int result = checkWinner(board);
//                if(result == 0) {
//                       System.out.print("Tie \n");
//                       if(isrecord)
//                        gamerecord.writeStateOnFile("Tie");
//                 } 
//                else if(result == 2 || result==-2 ){
//                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
//                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
//                }
//                else{
//                    System.out.println("playing");
//                 }
//                gamerecord.writeStateOnFile(checkStatus());
//                if(isrecord)
//                gamerecord.writeStepToFile();
            }
        });
        game.btn8.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!has_winner) {
                    if (game.btn8.getText() == " " && XO_turn % 2 != 0) {
                        if (symbol.equals("x")) {
                            game.btn8.setText("X");
                            game.btn8.setGraphic(drawXIcon());
                        } else if (symbol.equals("o")) {
                            game.btn8.setText("O");
                            game.btn8.setGraphic(drawOIcon());
                        }
                        game.btn8.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      gamerecord.gameStepForPlayer(8);
                        XO_turn++;
                    } else if (game.btn8.getText() == " " && XO_turn % 2 == 0) {
                        if (symbol.equals("x")) {
                            game.btn8.setText("O");
                            game.btn8.setGraphic(drawOIcon());
                        } else if (symbol.equals("o")) {
                            game.btn8.setText("X");
                            game.btn8.setGraphic(drawXIcon());
                        }
                        game.btn8.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      {
//                          gamerecord.StepNum++;
//                           gamerecord.gameSteps+=gamerecord.StepNum+"."+HomeScreenBase.name+": O"+8+" , ";
//                      }
                        XO_turn++;
                    }
//                  else {
//                  System.out.print( "The field is not empty \n");
//                  }

                    has_winner = checkWinner(board) != 1;
                }

//              int result = checkWinner(board);
//                if(result == 0) {
//                       System.out.print("Tie \n");
//                       if(isrecord)
//                        gamerecord.writeStateOnFile("Tie");
//                 } 
//                else if(result == 2 || result==-2 ){
//                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
//                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
//                }
//                else{
//                    System.out.println("playing");
//                 }
//                gamerecord.writeStateOnFile(checkStatus());
//                if(isrecord)
//                gamerecord.writeStepToFile();
            }
        });
        game.btn9.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!has_winner) {
                    if (game.btn9.getText() == " " && XO_turn % 2 != 0) {
                        if (symbol.equals("x")) {
                            game.btn9.setText("X");
                            game.btn9.setGraphic(drawXIcon());
                        } else if (symbol.equals("o")) {
                            game.btn9.setText("O");
                            game.btn9.setGraphic(drawOIcon());
                        }
                        game.btn9.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      gamerecord.gameStepForPlayer(9);
                        XO_turn++;
                    } else if (game.btn9.getText() == " " && XO_turn % 2 == 0) {
                        if (symbol.equals("x")) {
                            game.btn9.setText("O");
                            game.btn9.setGraphic(drawOIcon());
                        } else if (symbol.equals("o")) {
                            game.btn9.setText("X");
                            game.btn9.setGraphic(drawXIcon());
                        }
                        game.btn9.setContentDisplay(GRAPHIC_ONLY);
//                      if(isrecord)
//                      {
//                          gamerecord.StepNum++;
//                           gamerecord.gameSteps+=gamerecord.StepNum+"."+HomeScreenBase.name+": O"+9+" , ";
//                      }
                        XO_turn++;
                    }
//                  else {
//                  System.out.print( "The field is not empty \n");
//                  }

                    has_winner = checkWinner(board) != 1;
                }
//              int result = checkWinner(board);
//                if(result == 0) {
//                       System.out.print("Tie \n");
//                       if(isrecord)
//                        gamerecord.writeStateOnFile("Tie");
//                 } 
//                else if(result == 2 || result==-2 ){
//                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
//                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
//                }
//                else{
//                    System.out.println("playing");
//                 }
//                gamerecord.writeStateOnFile(checkStatus());
//                if(isrecord)
//                gamerecord.writeStepToFile();
            }
        });
    }

    static private ImageView drawOIcon() {

        ImageView vimgO;
        Image imgo;
        imgo = new Image("/resources/images/oImage.png");
        vimgO = new ImageView(imgo);
        vimgO.setFitWidth(140);
        vimgO.setFitHeight(130);
        // vimgO.setBlendMode(javafx.scene.effect.BlendMode.MULTIPLY);
        return vimgO;

    }

    ;

    static private ImageView drawXIcon() {
        Image imgX;
        ImageView vimgX;
        imgX = new Image("/resources/images/xImage.png");
        vimgX = new ImageView(imgX);
        vimgX.pickOnBoundsProperty();
        vimgX.preserveRatioProperty();
        // vimgX.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        vimgX.setFitWidth(140);
        vimgX.setFitHeight(130);

        return vimgX;

    }

    ;
     public boolean haveTheSameValueAndNotEmpty(Button x, Button y, Button z) {
        if (x.getText() == y.getText() && x.getText() == z.getText() && !(x.getText().equals(" "))) {
            //x.setStyle("-fx-background-color:#FFEB3B;");

            x.setStyle("-fx-background-color:#FFEB3B;");
            y.setStyle("-fx-background-color:#FFEB3B;");
            z.setStyle("-fx-background-color:#FFEB3B;");
            //setRound(x.getText());
            return true;
        }
        //setRound("t");
        return false;
    }

    public int checkWinner(Button board[][]) {
        //  2: X winner
        // -2: O winner
        //  0: Tie
        //  1: No winner

        // For rows
        for (int i = 0; i < 3; i++) {
            if (haveTheSameValueAndNotEmpty(board[i][0], board[i][1], board[i][2])) {

                has_winner = true;
                if (board[i][0].getText().equals("X")) {
                    status = 2;
                } else {
                    status = -2;
                }
                return status;

            }
        }

        // For cols
        for (int i = 0; i < 3; i++) {
            if (haveTheSameValueAndNotEmpty(board[0][i], board[1][i], board[2][i])) {

                has_winner = true;
                if (board[i][0].getText().equals("X")) {
                    status = 2;
                } else {
                    status = -2;
                }
                return status;
            }
        }

        // Diameter 1
        if (haveTheSameValueAndNotEmpty(board[0][0], board[1][1], board[2][2])) {
            has_winner = true;
            if (board[0][0].getText().equals("X")) {
                status = 2;
            } else {
                status = -2;
            }
            return status;
        }
        // Diameter 2
        if (haveTheSameValueAndNotEmpty(board[2][0], board[1][1], board[0][2])) {
            has_winner = true;
            if (board[2][0].getText().equals("X")) {
                status = 2;
            } else {
                status = -2;
            }
            return status;
        }
        // For Tie Case
        boolean tie = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].getText() == " ") {
                    tie = false;
                }
            }
        }
        if (tie) {
            status = 0;
            return 0;
        }

        // Else
        return 1;
    }
}
