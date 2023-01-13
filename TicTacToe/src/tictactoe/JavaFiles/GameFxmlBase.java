package tictactoe.JavaFiles;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import static javafx.scene.control.ContentDisplay.GRAPHIC_ONLY;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class GameFxmlBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Blend blend;
    protected final ImageView imageView0;
    protected final Pane pane;
    protected final Blend blend0;
    protected final Text text;
    protected final ImageView imageView1;
    protected final Text text0;
    protected final Pane pane0;
    protected final Blend blend1;
    protected final Text text1;
    protected final Text text2;
    protected final ImageView imageView2;
    protected final Label label;
    protected final Pane pane1;
    protected final Line line;
    protected final Line line0;
    protected final Line line1;
    protected final Line line2;
    protected final Button btn1;
    protected final Button btn2;
    protected final Button btn3;
    protected final Button btn4;
    protected final Button btn5;
    protected final Button btn6;
    protected final Button btn7;
    protected final Button btn8;
    protected final Button btn9;
    protected final Button newGame_btn;
    protected final Button exit_btn;
    protected final Pane pane2;
    protected final ImageView player1Score;
    protected final Pane pane3;
    protected final ImageView player2Score;
    protected final Blend blend2;
    protected final Button round_btn;

    Stage stage;
    String symbole;
    String level;
    int stepCounter,roundCounter;
    boolean isYourTurn, isrecord;
    int XO_turn;
    boolean has_winner;
    String computerSympole;
    Button[] btnArr = new Button[9];
    Button board[][] = new Button[3][3];
    RecordGame gamerecord;
    public GameFxmlBase(Stage stage, String level, boolean isrecord,String symbole) {
        
        this.stage=stage;
        this.level = level;
        this.symbole = symbole;
        this.isrecord=isrecord;

        this.stage = stage;
        this.level = level;
        this.symbole = symbole;
        this.isrecord = isrecord;
        checkComputerSympol();
        has_winner = false;
        stepCounter = 0;
        roundCounter=0;
        isYourTurn = true;
        XO_turn = 1;

        imageView = new ImageView();
        blend = new Blend();
        imageView0 = new ImageView();
        pane = new Pane();
        blend0 = new Blend();
        text = new Text();
        imageView1 = new ImageView();
        text0 = new Text();
        pane0 = new Pane();
        blend1 = new Blend();
        text1 = new Text();
        text2 = new Text();
        imageView2 = new ImageView();
        label = new Label();
        pane1 = new Pane();
        line = new Line();
        line0 = new Line();
        line1 = new Line();
        line2 = new Line();
        btn1 = new Button();
        btn2 = new Button();
        btn3 = new Button();
        btn4 = new Button();
        btn5 = new Button();
        btn6 = new Button();
        btn7 = new Button();
        btn8 = new Button();
        btn9 = new Button();
        newGame_btn = new Button();
        exit_btn = new Button();
        pane2 = new Pane();
        player1Score = new ImageView();
        pane3 = new Pane();
        player2Score = new ImageView();
        blend2 = new Blend();
        round_btn=new Button();

        setId("APane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(768.0);
        setPrefWidth(1366.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        imageView.setFitHeight(150.0);
        imageView.setFitWidth(150.0);
        imageView.setId("player1");
        imageView.setLayoutX(1081.0);
        imageView.setLayoutY(190.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/player1.png").toExternalForm()));

        imageView.setEffect(blend);

        imageView0.setFitHeight(130.0);
        imageView0.setFitWidth(100.0);
        imageView0.setId("player2");
        imageView0.setLayoutX(143.0);
        imageView0.setLayoutY(210.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/resources/images/player2.png").toExternalForm()));

        pane.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        pane.setId("paneX");
        pane.setLayoutX(1094.0);
        pane.setLayoutY(360.0);
        pane.setOpacity(0.85);
        pane.setPrefHeight(146.99999999999997);
        pane.setPrefWidth(123.02623191958844);
        pane.setStyle("-fx-background-radius: 7;");
        pane.getStylesheets().add("/resources/cssFiles/CSS.css");

        blend0.setMode(javafx.scene.effect.BlendMode.MULTIPLY);
        pane.setEffect(blend0);

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(19.0);
        text.setLayoutY(36.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Player1");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setFont(new Font("Arial Bold", 24.0));

        imageView1.setFitHeight(67.0);
        imageView1.setFitWidth(110.0);
        imageView1.setLayoutX(7.0);
        imageView1.setLayoutY(74.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/resources/images/xImage.png").toExternalForm()));

        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setLayoutX(47.0);
        text0.setLayoutY(64.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("You");
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text0.setFont(new Font("Britannic Bold", 18.0));

        pane0.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        pane0.setCache(true);
        pane0.setId("paneX");
        pane0.setLayoutX(132.0);
        pane0.setLayoutY(360.0);
        pane0.setOpacity(0.85);
        pane0.setPrefHeight(146.99999999999997);
        pane0.setPrefWidth(123.02623191958844);
        pane0.setStyle("-fx-background-radius: 7;");
        pane0.getStylesheets().add("/resources/cssFiles/CSS.css");

        pane0.setEffect(blend1);

        text1.setBlendMode(javafx.scene.effect.BlendMode.SCREEN);
        text1.setFill(javafx.scene.paint.Color.WHITE);
        text1.setLayoutX(18.0);
        text1.setLayoutY(29.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Player2");
        text1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1.setWrappingWidth(88.0);
        text1.setFont(new Font("Arial Bold", 24.0));

        text2.setFill(javafx.scene.paint.Color.WHITE);
        text2.setLayoutX(38.0);
        text2.setTextAlignment(javafx.scene.text.TextAlignment.LEFT);
        text2.setLayoutY(59.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Computer");
        text2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text2.setFont(new Font("Britannic Bold", 18.0));

        imageView2.setFitHeight(62.0);
        imageView2.setFitWidth(117.0);
        imageView2.setLayoutX(7.0);
        imageView2.setLayoutY(74.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("/resources/images/oImage.png").toExternalForm()));

        label.setLayoutX(413.0);
        label.setLayoutY(441.0);
        label.setPrefHeight(44.0);
        label.setPrefWidth(110.0);

        pane1.setId("gameBox");
        pane1.setLayoutX(376.0);
        pane1.setLayoutY(134.0);
        pane1.setPrefHeight(461.0);
        pane1.setPrefWidth(610.0);
        pane1.getStylesheets().add("/resources/cssFiles/CSS.css");

        line.setEndX(352.0);
        line.setEndY(-1.0);
        line.setLayoutX(257.0);
        line.setLayoutY(156.0);
        line.setStartX(-257.0);
        line.setStartY(-1.0);

        line0.setEndX(352.0);
        line0.setEndY(-7.0);
        line0.setLayoutX(258.0);
        line0.setLayoutY(318.0);
        line0.setStartX(-258.0);
        line0.setStartY(-7.0);

        line1.setEndX(325.0);
        line1.setEndY(140.0);
        line1.setLayoutX(82.0);
        line1.setLayoutY(321.0);
        line1.setStartX(325.0);
        line1.setStartY(-321.0);

        line2.setEndX(323.0);
        line2.setEndY(140.0);
        line2.setLayoutX(-119.0);
        line2.setLayoutY(321.0);
        line2.setStartX(323.0);
        line2.setStartY(-320.0);
        
        btn1.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        btn1.setStyle("-fx-background-color:#4D0DA5;");
        btn1.setLayoutX(4.0);
        btn1.setLayoutY(1.0);
        btn1.setMnemonicParsing(false);
        btn1.setPrefHeight(153.0);
        btn1.setPrefWidth(200.0);
        btn1.setText(" ");
        btn1.setContentDisplay(GRAPHIC_ONLY);
        btn1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn1.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn2.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        btn2.setStyle("-fx-background-color:#4D0DA5;");
        btn2.setLayoutX(205.0);
        btn2.setLayoutY(1.0);
        btn2.setMnemonicParsing(false);
        btn2.setPrefHeight(153.2);
        btn2.setPrefWidth(203.0);
        btn2.setText(" ");
        btn2.setContentDisplay(GRAPHIC_ONLY);
       

        btn3.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        btn3.setStyle("-fx-background-color:#4D0DA5;");
        btn3.setLayoutX(409.0);
        btn3.setLayoutY(1.0);
        btn3.setMnemonicParsing(false);
        btn3.setPrefHeight(154.0);
        btn3.setPrefWidth(200.0);
        btn3.setText(" ");
        btn3.setContentDisplay(GRAPHIC_ONLY);
        

        btn4.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        btn4.setStyle("-fx-background-color:#4D0DA5;");
        btn4.setLayoutX(4.0);
        btn4.setLayoutY(158.0);
        btn4.setMnemonicParsing(false);
        btn4.setPrefHeight(149.8);
        btn4.setPrefWidth(200.0);
        btn4.setText(" ");
        btn4.setContentDisplay(GRAPHIC_ONLY);
        btn4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn4.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn5.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        btn5.setStyle("-fx-background-color:#4D0DA5;");
        btn5.setLayoutX(205.0);
        btn5.setLayoutY(158.0);
        btn5.setMnemonicParsing(false);
        btn5.setPrefHeight(149.8);
        btn5.setPrefWidth(203.0);
        btn5.setText(" ");
        btn5.setContentDisplay(GRAPHIC_ONLY);
        btn5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn5.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn6.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        btn6.setStyle("-fx-background-color:#4D0DA5;");
        btn6.setLayoutX(409.0);
        btn6.setLayoutY(158.0);
        btn6.setMnemonicParsing(false);
        btn6.setPrefHeight(150.0);
        btn6.setPrefWidth(200.0);
        btn6.setContentDisplay(GRAPHIC_ONLY);
        btn6.setText(" ");

        btn7.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        btn7.setStyle("-fx-background-color:#4D0DA5;");
        btn7.setLayoutX(4.0);
        btn7.setLayoutY(312.0);
        btn7.setMnemonicParsing(false);
        btn7.setPrefHeight(147.0);
        btn7.setPrefWidth(200.0);
        btn7.setText(" ");
        btn7.setContentDisplay(GRAPHIC_ONLY);
        btn7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn7.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn8.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        btn8.setStyle("-fx-background-color:#4D0DA5;");
        btn8.setContentDisplay(GRAPHIC_ONLY);
        btn8.setLayoutX(205.0);
        btn8.setLayoutY(312.0);
        btn8.setMnemonicParsing(false);
        btn8.setPrefHeight(147.0);
        btn8.setPrefWidth(203.0);
        btn8.setText(" ");
        btn8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn8.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn9.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        btn9.setStyle("-fx-background-color:#4D0DA5;");
        btn9.setLayoutX(409.0);
        btn9.setLayoutY(312.0);
        btn9.setMnemonicParsing(false);
        btn9.setPrefHeight(147.0);
        btn9.setPrefWidth(200.0);
        btn9.setContentDisplay(GRAPHIC_ONLY);
        btn9.setPrefWidth(200.0);
        btn9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn9.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        btn9.setText(" ");

        pane2.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        pane2.setId("paneX");
        pane2.setLayoutX(166.0);
        pane2.setLayoutY(515.0);
        pane2.setOpacity(0.87);
        pane2.setPrefHeight(44.0);
        pane2.setPrefWidth(55.0);
        pane2.getStylesheets().add("/resources/cssFiles/CSS.css");

        pane3.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        pane3.setId("paneX");
        pane3.setLayoutX(1122.0);
        pane3.setLayoutY(515.0);
        pane3.setPrefHeight(44.0);
        pane3.setPrefWidth(55.0);
        pane3.getStylesheets().add("/resources/cssFiles/CSS.css");
        
        if(isrecord){
            gamerecord=new RecordGame();
        }
        
        newGame_btn.setCache(true);
        newGame_btn.setId("but_ClearAll");
        newGame_btn.setLayoutX(335.0);
        newGame_btn.setLayoutY(629.0);
        newGame_btn.setMnemonicParsing(false);
        newGame_btn.setPrefHeight(59.0);
        newGame_btn.setPrefWidth(210.0);
        newGame_btn.setStyle("-fx-background-color: #ECC216; -fx-text-fill: white; -fx-background-radius: 22; -fx-font-size: 24;");
        newGame_btn.getStylesheets().add("/resources/cssFiles/CSS.css");
        newGame_btn.setText("New Game");
        newGame_btn.setTextFill(javafx.scene.paint.Color.valueOf("#efefef"));
        newGame_btn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                player1Score.setImage(new Image(getClass().getResource("/resources/images/0.png").toExternalForm()));
                player2Score.setImage(new Image(getClass().getResource("/resources/images/0.png").toExternalForm()));
                clearRecordedMatchCells();
                gamerecord=new RecordGame();
                round_btn.setText("First round");
                roundCounter=0;
            }
        });

        exit_btn.setCache(true);
        exit_btn.setId("but_ClearAll");
        exit_btn.setLayoutX(837.0);
        exit_btn.setLayoutY(629.0);
        exit_btn.setMnemonicParsing(false);
        exit_btn.setPrefHeight(59.0);
        exit_btn.setPrefWidth(210.0);
        exit_btn.setStyle("-fx-background-color: #4D0DA5; -fx-text-fill: white; -fx-background-radius: 22; -fx-font-size: 24;");
        exit_btn.getStylesheets().add("/resources/cssFiles/CSS.css");
        exit_btn.setText("Exit");
        exit_btn.setTextFill(javafx.scene.paint.Color.valueOf("#efefef"));
        exit_btn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                HomeScreenBase homeScreen = new HomeScreenBase(stage);

                Scene scene = new Scene(homeScreen);
                stage.setScene(scene);
                stage.show();
            }
        });
        round_btn.setCache(true);
        round_btn.setId("but_ClearAll");
        round_btn.setLayoutX(592.0);
        round_btn.setLayoutY(629.0);
        round_btn.setMnemonicParsing(false);
        round_btn.setPrefHeight(59.0);
        round_btn.setPrefWidth(210.0);
        round_btn.setBlendMode(BlendMode.MULTIPLY);
        round_btn.setStyle("-fx-background-color: #4D0DA5; -fx-text-fill: white; -fx-background-radius: 22; -fx-font-size: 24;");
        round_btn.getStylesheets().add("/resources/cssFiles/CSS.css");
        round_btn.setText("First round");
        round_btn.setDisable(true);
        round_btn.setTextFill(javafx.scene.paint.Color.valueOf("#efefef"));
        round_btn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clearRecordedMatchCells();
                round_btn.setBlendMode(BlendMode.MULTIPLY);
                round_btn.setDisable(true);
                
            }
        });
        
            
        
        player1Score.setFitHeight(62.0);
        player1Score.setFitWidth(63.0);
        player1Score.setLayoutX(-1.0);
        player1Score.setLayoutY(2.0);
        player1Score.setPickOnBounds(true);
        player1Score.setPreserveRatio(true);
        player1Score.setImage(new Image(getClass().getResource("/resources/images/0.png").toExternalForm()));

        player2Score.setFitHeight(62.0);
        player2Score.setFitWidth(63.0);
        player2Score.setLayoutX(-1.0);
        player2Score.setLayoutY(-2.0);
        player2Score.setPickOnBounds(true);
        player2Score.setPreserveRatio(true);
        player2Score.setImage(new Image(getClass().getResource("/resources/images/0.png").toExternalForm()));

        setEffect(blend2);
        setOpaqueInsets(new Insets(0.0));

        getChildren().add(imageView);
        getChildren().add(imageView0);
        pane.getChildren().add(text);
        pane.getChildren().add(imageView1);
        pane.getChildren().add(text0);
        getChildren().add(pane);
        pane0.getChildren().add(text1);
        pane0.getChildren().add(text2);
        pane0.getChildren().add(imageView2);
        getChildren().add(pane0);
        getChildren().add(label);
        pane1.getChildren().add(btn1);
        pane1.getChildren().add(btn2);
        pane1.getChildren().add(btn3);
        pane1.getChildren().add(btn4);
        pane1.getChildren().add(btn5);
        pane1.getChildren().add(btn6);
        pane1.getChildren().add(btn7);
        pane1.getChildren().add(btn8);
        pane1.getChildren().add(btn9);
        pane1.getChildren().add(line);
        pane1.getChildren().add(line0);
        pane1.getChildren().add(line1);
        pane1.getChildren().add(line2);
        getChildren().add(pane1);
        getChildren().add(newGame_btn);
        getChildren().add(round_btn);
        getChildren().add(exit_btn);
        pane2.getChildren().add(player1Score);
        getChildren().add(pane2);
        pane3.getChildren().add(player2Score);
        getChildren().add(pane3);
        addBtns();

        myTurn(level, symbole);
        //playEasy(level, symbole);
    }

    public void addBtns() {
        btnArr[0] = btn1;
        btnArr[1] = btn2;
        btnArr[2] = btn3;
        btnArr[3] = btn4;
        btnArr[4] = btn5;
        btnArr[5] = btn6;
        btnArr[6] = btn7;
        btnArr[7] = btn8;
        btnArr[8] = btn9;

        board[0][0] = btn1;
        board[0][1] = btn2;
        board[0][2] = btn3;
        board[1][0] = btn4;
        board[1][1] = btn5;
        board[1][2] = btn6;
        board[2][0] = btn7;
        board[2][1] = btn8;
        board[2][2] = btn9;
    }

    public void disableBtns() {
        for (int i = 0; i <= 8; i++) {
            btnArr[i].setDisable(true);
        }
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
    
    static private ImageView drawIcon(String s) {
        ImageView vimg;
        Image img;
        if (s == "x") {
            img = new Image("/resources/images/xImage.png");
        } else {
            img = new Image("/resources/images/oImage.png");
        }
        vimg = new ImageView(img);
        vimg.setFitWidth(140);
        vimg.setFitHeight(130);
        return vimg;
    }

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
    
    public boolean isEnd() {
        if (stepCounter < 8) {
            return false;
        }
        return true;
    }

    //hard level
    public  boolean haveTheSameValueAndNotEmpty(Button x, Button y, Button z) {
        if (x.getText() == y.getText() && x.getText() == z.getText() && !(x.getText().equals(" "))) {
            //x.setStyle("-fx-background-color:#FFEB3B;");

            x.setStyle("-fx-background-color:#FFEB3B;");
            y.setStyle("-fx-background-color:#FFEB3B;");
            z.setStyle("-fx-background-color:#FFEB3B;");
            setRound(x.getText());
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
                return board[i][0].getText() == "X" ? 2 : -2;

            }
        }

        // For cols
        for (int i = 0; i < 3; i++) {
            if (haveTheSameValueAndNotEmpty(board[0][i], board[1][i], board[2][i])) {

                has_winner = true;
                return board[0][i].getText() == "X" ? 2 : -2;
            }
        }

        // Diameter 1
        if (haveTheSameValueAndNotEmpty(board[0][0], board[1][1], board[2][2])) {
            has_winner = true;
            return board[0][0].getText() == "X" ? 2 : -2;
        }
        // Diameter 2
        if (haveTheSameValueAndNotEmpty(board[2][0], board[1][1], board[0][2])) {
            has_winner = true;
            return board[2][0].getText() == "X" ? 2 : -2;
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
            return 0;
        }

        // Else
        return 1;
    }
    int  MiniMaxStep=0;
    public int minimax(Button board[][], int depth, boolean isMaximizing, boolean firstTime) {
        int result = checkWinner(board);
        if (depth == 0 || result != 1) {
            return result;
        }

        if (isMaximizing) {
            int finalScore = -10;
            int finalI = 0, finalJ = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j].getText() == " ") {
                        board[i][j].setText("X");
                        board[i][j].setContentDisplay(GRAPHIC_ONLY);

                        int score = minimax(board, depth - 1, false, false);
                        board[i][j].setText(" ");
                        if (score > finalScore) {
                            finalScore = score;
                            finalI = i;
                            finalJ = j;
                        }
                        if (firstTime) {
                            System.out.print("score," + i + "," + j + ": " + score + "\n");
                        }
                    }
                }
            }
            if (firstTime) {
                board[finalI][finalJ].setText("X");
                board[finalI][finalJ].setGraphic(drawXIcon());
                board[finalI][finalJ].setContentDisplay(GRAPHIC_ONLY);
            }
            return finalScore;
        } else {
            int finalScore = 10;
            int finalI = 0, finalJ = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j].getText() == " ") {
                        board[i][j].setText("O");
                        board[i][j].setContentDisplay(GRAPHIC_ONLY);
                        //drawOIcon();
                        int score = minimax(board, depth - 1, true, false);
                        board[i][j].setText(" ");
                        if (score < finalScore) {
                            finalScore = score;
                            finalI = i;
                            finalJ = j;
                        }
                        if (firstTime) {
                            System.out.print("score," + i + "," + j + ": " + score + "\n");
                        }
                    }
                }
            }
            if (firstTime) {
                MiniMaxStep++;
                if(this.level=="easy")
                {
                        int min = 0;
                        int max = 2;
                        int rand1 = (int)(Math.random()*(max - min + 1) + min);
                        int rand2 = (int)(Math.random()*(max - min + 1) + min);

                        while( board[rand1][rand2].getGraphic() != null)
                        {
                            rand1 = (int)(Math.random()*(max - min + 1) + min);
                            rand2 = (int)(Math.random()*(max - min + 1) + min);
                        }
                        if(board[rand1][rand2].getGraphic() == null)
                        {
                            board[rand1][rand2].setText("O");
                            board[rand1][rand2].setGraphic(drawOIcon());
                            board[rand1][rand2].setContentDisplay(GRAPHIC_ONLY);
                            System.out.println("Random Minimax");
                            gamerecord.StepNum++;
                            int index = (rand1 * 3 + rand2)+1;
                            gamerecord.gameSteps+=gamerecord.StepNum+"."+"Bot: O"+index+" , ";
                        }
                
                }
                else if(this.level=="medium"&&(MiniMaxStep==1||MiniMaxStep==4)){
                
                
                        int min = 0;
                        int max = 2;
                        int rand1 = (int)(Math.random()*(max - min + 1) + min);
                        int rand2 = (int)(Math.random()*(max - min + 1) + min);

                        while( board[rand1][rand2].getGraphic() != null)
                        {
                            rand1 = (int)(Math.random()*(max - min + 1) + min);
                            rand2 = (int)(Math.random()*(max - min + 1) + min);
                        }
                        if(board[rand1][rand2].getGraphic() == null)
                        {
                            board[rand1][rand2].setText("O");
                            board[rand1][rand2].setGraphic(drawOIcon());
                            board[rand1][rand2].setContentDisplay(GRAPHIC_ONLY);
                            System.out.println("Random Minimax mi");
                            gamerecord.StepNum++;
                            int index = (rand1 * 3 + rand2)+1;
                            gamerecord.gameSteps+=gamerecord.StepNum+"."+"Bot: O"+index+" , ";
                        }
                }
                else{
                board[finalI][finalJ].setText("O");
                board[finalI][finalJ].setGraphic(drawOIcon());
                board[finalI][finalJ].setContentDisplay(GRAPHIC_ONLY);
                gamerecord.StepNum++;
                int index = (finalI * 3 + finalJ)+1;
                gamerecord.gameSteps+=gamerecord.StepNum+"."+"Bot: O"+index+" , ";
                }
                
            }
            return finalScore;
        }
    }

     private void clearRecordedMatchCells() {
        btn1.setGraphic(null);
        btn2.setGraphic(null);
        btn3.setGraphic(null);
        btn4.setGraphic(null);
        btn5.setGraphic(null);
        btn6.setGraphic(null);
        btn7.setGraphic(null);
        btn8.setGraphic(null);
        btn9.setGraphic(null);
        btn1.setText(" ");
        btn2.setText(" ");
        btn3.setText(" ");
        btn4.setText(" ");
        btn5.setText(" ");
        btn6.setText(" ");
        btn7.setText(" ");
        btn8.setText(" ");
        btn9.setText(" ");
        returnColor();
        has_winner = false;
        isYourTurn = true;
        stepCounter = 0;
        MiniMaxStep=0;
        gamerecord.StepNum=0;
        gamerecord.gameSteps="";
          
    }

    public void checkComputerSympol() {
        if (symbole == "x") {
            computerSympole = "o";
        } else {
            computerSympole = "x";
    
        }
    }

   

    public void myTurn(String level, String s) {
        
        if (this.level == "local") {
            playLocalMode(s);

        }
        else{
            playHardOrMedium();

        }
    }

    public void playLocalMode(String symbol ) {
            btn1.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent event) {
              if(!has_winner) {
                  if(btn1.getText() == " " && XO_turn % 2 != 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn1.setText("X");
                          btn1.setGraphic(drawXIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn1.setText("O");
                          btn1.setGraphic(drawOIcon());
                      }
                      btn1.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else if(btn1.getText() == " " && XO_turn % 2 == 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn1.setText("O");
                          btn1.setGraphic(drawOIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn1.setText("X");
                          btn1.setGraphic(drawXIcon());
                      }
                      btn1.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else {
                  System.out.print( "The field is not empty \n");
                  }

                  has_winner = checkWinner(board) != 1;
              }

              int result = checkWinner(board);
                if(result == 0) {
                       System.out.print("Tie \n");
                 }
                else if(result == 2 || result==-2 ){
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
          }
      });
            btn2.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent event) {
             if(!has_winner) {
                  if(btn2.getText() == " " && XO_turn % 2 != 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn2.setText("X");
                          btn2.setGraphic(drawXIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn2.setText("O");
                          btn2.setGraphic(drawOIcon());
                      }
                      btn2.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else if(btn2.getText() == " " && XO_turn % 2 == 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn2.setText("O");
                          btn2.setGraphic(drawOIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn2.setText("X");
                          btn2.setGraphic(drawXIcon());
                      }
                      btn2.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else {
                  System.out.print( "The field is not empty \n");
                  }

                  has_winner = checkWinner(board) != 1;
              }

              int result = checkWinner(board);
                if(result == 0) {
                       System.out.print("Tie \n");
                 }
                else if(result == 2 || result==-2 ){
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
         }
      });
            btn3.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent event) {
             if(!has_winner) {
                  if(btn3.getText() == " " && XO_turn % 2 != 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn3.setText("X");
                          btn3.setGraphic(drawXIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn3.setText("O");
                          btn3.setGraphic(drawOIcon());
                      }
                      btn3.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else if(btn3.getText() == " " && XO_turn % 2 == 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn3.setText("O");
                          btn3.setGraphic(drawOIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn3.setText("X");
                          btn3.setGraphic(drawXIcon());
                      }
                      btn3.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else {
                  System.out.print( "The field is not empty \n");
                  }

                  has_winner = checkWinner(board) != 1;
              }

              int result = checkWinner(board);
                if(result == 0) {
                       System.out.print("Tie \n");
                 }
                else if(result == 2 || result==-2 ){
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
         }
      });
            btn4.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent event) {
             if(!has_winner) {
                  if(btn4.getText() == " " && XO_turn % 2 != 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn4.setText("X");
                          btn4.setGraphic(drawXIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn4.setText("O");
                          btn4.setGraphic(drawOIcon());
                      }
                      btn4.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else if(btn4.getText() == " " && XO_turn % 2 == 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn4.setText("O");
                          btn4.setGraphic(drawOIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn4.setText("X");
                          btn4.setGraphic(drawXIcon());
                      }
                      btn4.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else {
                  System.out.print( "The field is not empty \n");
                  }

                  has_winner = checkWinner(board) != 1;
              }
              int result = checkWinner(board);
                if(result == 0) {
                       System.out.print("Tie \n");
                 }
                else if(result == 2 || result==-2 ){
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
         }
      });
            btn5.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent event) {
             if(!has_winner) {
                  if(btn5.getText() == " " && XO_turn % 2 != 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn5.setText("X");
                          btn5.setGraphic(drawXIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn5.setText("O");
                          btn5.setGraphic(drawOIcon());
                      }
                      btn5.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else if(btn5.getText() == " " && XO_turn % 2 == 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn5.setText("O");
                          btn5.setGraphic(drawOIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn5.setText("X");
                          btn5.setGraphic(drawXIcon());
                      }
                      btn5.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else {
                  System.out.print( "The field is not empty \n");
                  }

                  has_winner = checkWinner(board) != 1;
              }

              int result = checkWinner(board);
                if(result == 0) {
                       System.out.print("Tie \n");
                 }
                else if(result == 2 || result==-2 ){
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
         }
      });
            btn6.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent event) {
             if(!has_winner) {
                  if(btn6.getText() == " " && XO_turn % 2 != 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn6.setText("X");
                          btn6.setGraphic(drawXIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn6.setText("O");
                          btn6.setGraphic(drawOIcon());
                      }
                      btn6.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else if(btn6.getText() == " " && XO_turn % 2 == 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn6.setText("O");
                          btn6.setGraphic(drawOIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn6.setText("X");
                          btn6.setGraphic(drawXIcon());
                      }
                      btn6.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else {
                  System.out.print( "The field is not empty \n");
                  }

                  has_winner = checkWinner(board) != 1;
              }

              int result = checkWinner(board);
                if(result == 0) {
                       System.out.print("Tie \n");
                 }
                else if(result == 2 || result==-2 ){
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
         }
      });
            btn7.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent event) {
             if(!has_winner) {
                  if(btn7.getText() == " " && XO_turn % 2 != 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn7.setText("X");
                          btn7.setGraphic(drawXIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn7.setText("O");
                          btn7.setGraphic(drawOIcon());
                      }
                      btn7.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else if(btn7.getText() == " " && XO_turn % 2 == 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn7.setText("O");
                          btn7.setGraphic(drawOIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn7.setText("X");
                          btn7.setGraphic(drawXIcon());
                      }
                      btn7.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else {
                  System.out.print( "The field is not empty \n");
                  }

                  has_winner = checkWinner(board) != 1;
              }
              int result = checkWinner(board);
                if(result == 0) {
                       System.out.print("Tie \n");
                 }
                else if(result == 2 || result==-2 ){
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
         }
      });
            btn8.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent event) {
             if(!has_winner) {
                  if(btn8.getText() == " " && XO_turn % 2 != 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn8.setText("X");
                          btn8.setGraphic(drawXIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn8.setText("O");
                          btn8.setGraphic(drawOIcon());
                      }
                      btn8.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else if(btn8.getText() == " " && XO_turn % 2 == 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn8.setText("O");
                          btn8.setGraphic(drawOIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn8.setText("X");
                          btn8.setGraphic(drawXIcon());
                      }
                      btn8.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else {
                  System.out.print( "The field is not empty \n");
                  }

                  has_winner = checkWinner(board) != 1;
              }

              int result = checkWinner(board);
                if(result == 0) {
                       System.out.print("Tie \n");
                 }
                else if(result == 2 || result==-2 ){
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
         }
      });
            btn9.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent event) {
             if(!has_winner) {
                  if(btn9.getText() == " " && XO_turn % 2 != 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn9.setText("X");
                          btn9.setGraphic(drawXIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn9.setText("O");
                          btn9.setGraphic(drawOIcon());
                      }
                      btn9.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else if(btn9.getText() == " " && XO_turn % 2 == 0)
                  {
                      if(symbol.equals("x"))
                      {
                          btn9.setText("O");
                          btn9.setGraphic(drawOIcon());
                      }
                      else if(symbol.equals("o"))
                      {
                          btn9.setText("X");
                          btn9.setGraphic(drawXIcon());
                      }
                      btn9.setContentDisplay(GRAPHIC_ONLY);
                      XO_turn ++;
                  }
                  else {
                  System.out.print( "The field is not empty \n");
                  }

                  has_winner = checkWinner(board) != 1;
              }
              int result = checkWinner(board);
              if(result == 0) {
                     System.out.print("Tie \n");
               }
              else if(result == 2 || result==-2 ){
                      System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
              }
              else{
                  System.out.println("playing");
               }
         }
      });
    }

      
      public void playHardOrMedium() {
        btn1.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(!has_winner) {
                  if(btn1.getText() == " ") {
                      btn1.setText("X");
                      btn1.setGraphic(drawXIcon());
                      btn1.setContentDisplay(GRAPHIC_ONLY);
                      gamerecord.gameStepForPlayer(1);
            // player == 'X' ? player = 'O' : player = 'X';
                       int result = minimax(board, 100, false,true);
                       returnColor();
                       //System.out.print( "result: " + result + "\n");
                        has_winner = checkWinner(board) != 1;
        } else {
            System.out.print( "The field is not empty \n");
        }
                }
                int result = checkWinner(board);
                if(result == 0) {
                       System.out.print("Tie \n");
                       gamerecord.writeStateOnFile("Tie");
                 }
                else if(result == 2 || result==-2 ){
                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
                gamerecord.writeStepToFile();
            }});
            btn2.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(!has_winner) {
                  if(btn2.getText() == " ") {
                      btn2.setText("X");
                      btn2.setGraphic(drawXIcon());
                      btn2.setContentDisplay(GRAPHIC_ONLY);
                     gamerecord.gameStepForPlayer(2);
            // player == 'X' ? player = 'O' : player = 'X';
                       int result = minimax(board, 100, false,true);
                       returnColor();
                      // System.out.print( "result: " + result + "\n");
                        has_winner = checkWinner(board) != 1;
        } else {
            System.out.print( "The field is not empty \n");
        }
                }
                int result = checkWinner(board);
                if(result == 0) {
                       gamerecord.writeStateOnFile("Tie");
                 } 
                else if(result == 2 || result==-2 ){
                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
                gamerecord.writeStepToFile();
            }});
            btn3.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(!has_winner) {
                  if(btn3.getText() == " ") {
                      btn3.setText("X");
                      btn3.setGraphic(drawXIcon());
                      btn3.setContentDisplay(GRAPHIC_ONLY);
                      gamerecord.gameStepForPlayer(3);
            // player == 'X' ? player = 'O' : player = 'X';
                       int result = minimax(board, 100, false,true);
                       returnColor();
                      // System.out.print( "result: " + result + "\n");
                        has_winner = checkWinner(board) != 1;
        } else {
            System.out.print( "The field is not empty \n");
        }
                }
                int result = checkWinner(board);
                if(result == 0) {
                       System.out.print("Tie \n");
                        gamerecord.writeStateOnFile("Tie");
                 } 
                else if(result == 2 || result==-2 ){
                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
                gamerecord.writeStepToFile();
            }});
            btn4.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(!has_winner) {
                  if(btn4.getText() == " ") {
                      btn4.setText("X");
                      btn4.setGraphic(drawXIcon());
                      btn4.setContentDisplay(GRAPHIC_ONLY);
                      gamerecord.gameStepForPlayer(4);
            // player == 'X' ? player = 'O' : player = 'X';
                       int result = minimax(board, 100, false,true);
                       returnColor();
                       //System.out.print( "result: " + result + "\n");
                        has_winner = checkWinner(board) != 1;
        } else {
            System.out.print( "The field is not empty \n");
        }
                }
                int result = checkWinner(board);
                if(result == 0) {
                       gamerecord.writeStateOnFile("Tie");
                       System.out.print("Tie \n");
                 }
                 else if(result == 2 || result==-2 ){
                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                 else{
                    System.out.println("playing");
                 }
                 gamerecord.writeStepToFile();
            }});
            btn5.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(!has_winner) {
                  if(btn5.getText() == " ") {
                      btn5.setText("X");
                     btn5.setGraphic(drawXIcon());
                     btn5.setContentDisplay(GRAPHIC_ONLY);
                     gamerecord.gameStepForPlayer(5);

            // player == 'X' ? player = 'O' : player = 'X';
                       int result = minimax(board, 100, false,true);
                       returnColor();
                      // System.out.print( "result: " + result + "\n");
                        has_winner = checkWinner(board) != 1;
        } else {
            System.out.print( "The field is not empty \n");
        }
                }
                int result = checkWinner(board);
                if(result == 0) {
                        gamerecord.writeStateOnFile("Tie");
                       System.out.print("Tie \n");
                 }
                else if(result == 2 || result==-2 ){
                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
                gamerecord.writeStepToFile();
            }});
            btn6.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(!has_winner) {
                  if(btn6.getText() == " ") {
                      btn6.setText("X");
                      btn6.setGraphic(drawXIcon());
                      btn6.setContentDisplay(GRAPHIC_ONLY);
                      gamerecord.gameStepForPlayer(6);

            // player == 'X' ? player = 'O' : player = 'X';
                       int result = minimax(board, 100, false,true);
                       returnColor();
                     //  System.out.print( "result: " + result + "\n");
                        has_winner = checkWinner(board) != 1;
        } else {
            System.out.print( "The field is not empty \n");
        }
                }
                int result = checkWinner(board);
                if(result == 0) {
                       gamerecord.writeStateOnFile("Tie");
                       System.out.print("Tie \n");
                 }
                else if(result == 2 || result==-2 ){
                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
                gamerecord.writeStepToFile();
            }});
            btn7.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(!has_winner) {
                  if(btn7.getText() == " ") {
                      btn7.setText("X");
                      btn7.setGraphic(drawXIcon());
                      btn7.setContentDisplay(GRAPHIC_ONLY);
                      gamerecord.gameStepForPlayer(7);
            // player == 'X' ? player = 'O' : player = 'X';
                       int result = minimax(board, 100, false,true);
                       returnColor();
                     //  System.out.print( "result: " + result + "\n");
                        has_winner = checkWinner(board) != 1;
        } else {
            System.out.print( "The field is not empty \n");
        }
                }
                int result = checkWinner(board);
                if(result == 0) {
                        gamerecord.writeStateOnFile("Tie");
                       System.out.print("Tie \n");
                 }
                else if(result == 2 || result==-2 ){
                         gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
                gamerecord.writeStepToFile();
            }});
            btn8.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(!has_winner) {
                  if(btn8.getText() == " ") {
                      btn8.setText("X");
                      btn8.setGraphic(drawXIcon());
                      btn8.setContentDisplay(GRAPHIC_ONLY);
                     gamerecord.gameStepForPlayer(8);
            // player == 'X' ? player = 'O' : player = 'X';
                       int result = minimax(board, 100, false,true);
                       returnColor();
                      // System.out.print( "result: " + result + "\n");
                        has_winner = checkWinner(board) != 1;
        } else {
            System.out.print( "The field is not empty \n");
        }
                }
                int result = checkWinner(board);
                if(result == 0) {
                        gamerecord.writeStateOnFile("Tie");
                       System.out.print("Tie \n");
                 }
                else if(result == 2 || result==-2 ){
                       gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
                gamerecord.writeStepToFile();
            }});
            btn9.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(!has_winner) {
                  if(btn9.getText() == " ") {
                      btn9.setText("X");
                      btn9.setGraphic(drawXIcon());
                      btn9.setContentDisplay(GRAPHIC_ONLY);
                      gamerecord.gameStepForPlayer(9);
            // player == 'X' ? player = 'O' : player = 'X';
                       int result = minimax(board, 100, false,true);
                       returnColor();
                      // System.out.print( "result: " + result + "\n");
                        has_winner = checkWinner(board) != 1;
             } else {
             System.out.print( "The field is not empty \n");
             }
                }
                int result = checkWinner(board);
                if(result == 0) {
                    gamerecord.writeStateOnFile("Tie");
                       System.out.print("Tie \n");
                 }
                else if(result == 2 || result==-2 ){
                        gamerecord.writeStateOnFile(((result == 2) ? "Win" : "Loss"));
                        System.out.print( ((result == 2) ? "X" : "O") + " player wins \n");
                }
                else{
                    System.out.println("playing");
                 }
                gamerecord.writeStepToFile();
            }});
         
         
            

    }
      public void returnColor(){
      btn1.setStyle("-fx-background-color:#4D0DA5;");
      btn2.setStyle("-fx-background-color:#4D0DA5;");
      btn3.setStyle("-fx-background-color:#4D0DA5;");
      btn4.setStyle("-fx-background-color:#4D0DA5;");
      btn5.setStyle("-fx-background-color:#4D0DA5;");
      btn6.setStyle("-fx-background-color:#4D0DA5;");
      btn7.setStyle("-fx-background-color:#4D0DA5;");
      btn8.setStyle("-fx-background-color:#4D0DA5;");
      btn9.setStyle("-fx-background-color:#4D0DA5;");
 }
     
    public void setRound(String winer){
        if (roundCounter<=2){
         if(winer=="x"){
            if (roundCounter==0){
                player2Score.setImage(new Image(getClass().getResource("/resources/images/1.png").toExternalForm()));
                roundCounter++;
                round_btn.setDisable(false);
                round_btn.setText("Second round");
                round_btn.setBlendMode(BlendMode.SRC_OVER);
              }
            else if (roundCounter==1){
                player2Score.setImage(new Image(getClass().getResource("/resources/images/2.png").toExternalForm()));
                roundCounter++;
                round_btn.setDisable(false);
                round_btn.setText("Third round");
                round_btn.setBlendMode(BlendMode.SRC_OVER);
              }
            else if (roundCounter==2) {
                player2Score.setImage(new Image(getClass().getResource("/resources/images/3.png").toExternalForm()));
                roundCounter++;
                round_btn.setDisable(false);
                round_btn.setText("Finished");
                round_btn.setDisable(true);
                round_btn.setBlendMode(BlendMode.MULTIPLY);
              }
                
            }
        
        } 
    }
    
}
    
   