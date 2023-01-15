package tictactoe.JavaFiles;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import static javafx.scene.control.ContentDisplay.GRAPHIC_ONLY;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.stage.Window;

public class OnlineGame extends AnchorPane implements Runnable {

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

    static Stage stage;
    String symbole;
    String level;
    int stepCounter, roundCounter;
    boolean isYourTurn, isrecord;
    int XO_turn;
    boolean has_winner;
    String player2Sympole;
    Button[] btnArr = new Button[9];
    Button board[][] = new Button[3][3];
    RecordGame gamerecord;
    MediaPlayer player;
    MediaView mediaView;
    static String Rlevel;
    static String RSymbol;
    static int status;
    ConnectWithServer con;
    DataInputStream dis;
    PrintStream ps;
    boolean yourTurn;
    Thread th;
    String recivedLetter;
    StringTokenizer token;
    int MiniMaxStep;
    String textMsg;
    String[] msg;
    int counter;
    boolean contenderTurn;

    public OnlineGame(Stage stage, String contenderEmail, String contenderUserName, String Img) {

        this.stage = stage;
        this.level = level;
        this.symbole = symbole;
        this.isrecord = isrecord;
        yourTurn = true;
        contenderTurn = false;

        this.stage = stage;
        this.level = level;
        this.Rlevel = level;
        this.symbole = symbole;
        this.RSymbol = symbole;
        this.isrecord = isrecord;
        checkPlayer2Sympol();
        has_winner = false;
        stepCounter = 0;
        roundCounter = 0;
        isYourTurn = true;
        XO_turn = 1;
        status = -1;
        counter = 0;
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
        round_btn = new Button();
        player = new MediaPlayer(new Media(getClass().getResource("Vedio/winnerVedio.mp4").toExternalForm()));
        mediaView = new MediaView(player);

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
//        if (level.equals("easy") || level.equals("medium") || level.equals("hard")) {
//            imageView0.setImage(new Image(getClass().getResource("/resources/images/robot.png").toExternalForm()));
//        } else {
//            imageView0.setImage(new Image(getClass().getResource("/resources/images/player2.png").toExternalForm()));
//        }

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

        if (isrecord) {
            gamerecord = new RecordGame();
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
                gamerecord = new RecordGame();
                round_btn.setText("First round");
                roundCounter = 0;
                XO_turn = 1;
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
        //getChildren().add(round_btn);
        getChildren().add(exit_btn);

        addBtns();

        th = new Thread(this);
        th.start();
        dis = ConnectWithServer.dis;
        ps = ConnectWithServer.ps;
        onlineMode();
        // recieveFromServer();

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

    static ImageView drawOIcon() {

        ImageView vimgO;
        Image imgo;
        imgo = new Image("/resources/images/oImage.png");
        vimgO = new ImageView(imgo);
        vimgO.setFitWidth(140);
        vimgO.setFitHeight(130);
        // vimgO.setBlendMode(javafx.scene.effect.BlendMode.MULTIPLY);
        return vimgO;

    }

    static ImageView drawIcon(String s) {
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

    static ImageView drawXIcon() {
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
    public boolean haveTheSameValueAndNotEmpty(Button x, Button y, Button z) {
        if (x.getText() == y.getText() && x.getText() == z.getText() && !(x.getText().equals(" "))) {
            //x.setStyle("-fx-background-color:#FFEB3B;");

            x.setStyle("-fx-background-color:#FFEB3B;");
            y.setStyle("-fx-background-color:#FFEB3B;");
            z.setStyle("-fx-background-color:#FFEB3B;");
            //setRound(x.getText());
            if (level.equals("local")) {
                ViewVedio();
            } else if (x.getText().equals(symbole)) {
                ViewVedio();
            }

            return true;
        }
        //setRound("t");
        return false;
    }

    public void ViewVedio() {
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle("You are The Winner");

        Label label = new Label("Yaaaaay!!!");
        VBox content = new VBox(10, label, mediaView);
        content.setAlignment(Pos.CENTER);
        alert.getDialogPane().setContent(content);

        alert.setOnShowing(e -> player.play());
        Window window = alert.getDialogPane().getScene().getWindow();
        window.setOnCloseRequest(e
                -> {
            player.stop();
            alert.hide();
        });
        alert.showAndWait();
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

    public String checkStatus() {
        switch (status) {
            case 0:
                return "Tie";
            case 2:
                return ("Win");
            case -2:
                return ("Loss");
            default:
                return ("playing");
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
        gamerecord.gameSteps = " ";
        has_winner = false;
        isYourTurn = true;
        yourTurn = true;
        stepCounter = 0;
        MiniMaxStep = 0;
        counter = 0;
        gamerecord.StepNum = 0;
    }

    public void checkPlayer2Sympol() {
        if (symbole == "x") {
            player2Sympole = "o";
        } else {
            player2Sympole = "x";

        }
    }

    public void returnColor() {
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

    @Override
    public void run() {
        try {
            while (true) {

                textMsg = dis.readLine();
                //EnabledBtns();
                System.out.print(textMsg);
                // msg = textMsg.split(" ");
                // onlineMode();
                recieveFromServer(textMsg);
            }
        } catch (IOException ex) {
            Logger.getLogger(OnlineGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hello From run");
    }

    public void setBtnAction(Button btn, int n) {
        if (!has_winner) {
            if (btn.getText() == " ") {
                if (XO_turn % 2 != 0) {
                    btn.setText("x");
                    btn.setGraphic(drawIcon("x"));
                    ps.println("game " + n + " " + "x");
                    XO_turn++;
                    has_winner = checkWinner(board) != 1;
                    counter++;
                } else {
                    btn.setText("o");
                    btn.setGraphic(drawIcon("o"));
                    ps.println("game " + n + " " + "o");
                    XO_turn++;
                    has_winner = checkWinner(board) != 1;
                    counter++;
                }
                btn.setContentDisplay(GRAPHIC_ONLY);
                // has_winner = checkWinner(board) != 1;

            }
        }

    }

    public void onlineMode() {

        btn1.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (yourTurn == true) {
                    setBtnAction(btn1, 0);
                    yourTurn = false;
                }

            }
        });
        btn2.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (yourTurn == true) {
                    setBtnAction(btn2, 1);
                    yourTurn = false;
                }

            }
        });
        btn3.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (yourTurn == true) {
                    setBtnAction(btn3, 2);
                    yourTurn = false;
                }

            }
        });
        btn4.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (yourTurn == true) {
                    setBtnAction(btn4, 3);
                    yourTurn = false;
                }

            }
        });
        btn5.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (yourTurn == true) {
                    setBtnAction(btn5, 4);
                    yourTurn = false;
                }

            }
        });
        btn6.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (yourTurn == true) {
                    setBtnAction(btn6, 5);
                    yourTurn = false;
                }
               
            }
        });
        btn7.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (yourTurn == true) {
                    setBtnAction(btn7, 6);
                    yourTurn = false;
                }
                
            }
        });
        btn8.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (yourTurn == true) {
                    setBtnAction(btn8, 7);
                    yourTurn = false;
                }

            }
        });
        btn9.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (yourTurn == true) {
                    setBtnAction(btn9, 8);
                    yourTurn = false;
                }
               

            }
        });
    }

    public void recieveFromServer(String textMsg) {
        // textMsg = dis.readLine();
        //System.out.print(textMsg);
        msg = textMsg.split(" ");
        // recivedLetter = msg[2];
        if (msg[0].equals("game")) {
            System.out.print("From if ");
            int btnNum = Integer.parseInt(msg[1]);

            Platform.runLater(() -> {
                // btnArr[6].setGraphic(drawOIcon());
                if (!has_winner) {
                    if (btnArr[btnNum].getText() == " ") {
                        if (XO_turn % 2 != 0) {
                            btnArr[btnNum].setText("x");
                            btnArr[btnNum].setGraphic(drawIcon("x"));
                            ps.println("game " + btnNum + " " + "x");
                            yourTurn=true;
                            XO_turn++;

                        } else {
                            btnArr[btnNum].setText("o");
                            btnArr[btnNum].setGraphic(drawIcon("o"));
                            ps.println("game " + btnNum + " " + "o");
                            yourTurn=true;
                            XO_turn++;
                        }
                    }
                    btnArr[btnNum].setContentDisplay(GRAPHIC_ONLY);
                    // takeTurn();

                }
                //has_winner = checkWinner(board) != 1;
            });

        }

    }
//
//    public void disabledBtns() {
//        for (int i = 0; i <= 8; i++) {
//            btnArr[i].setDisable(true);
//        }
//    }
//
//    public void EnabledBtns() {
//        for (int i = 0; i <= 8; i++) {
//            if (btnArr[i].getText().equals(null)) {
//                btnArr[i].setDisable(false);
//            }
//        }
//    }
//
//    public void takeTurn() {
//        for (int i = 0; i <= 8; i++) {
//            if (btnArr[i].getText() != " ") {
//                counter++;
//            }
//        }
//
//    }

}
