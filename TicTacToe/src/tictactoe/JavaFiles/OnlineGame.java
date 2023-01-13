package tictactoe.JavaFiles;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class OnlineGame extends AnchorPane {

    protected final ImageView imageView;
    protected final Blend blend;
    protected final ImageView imageView0;
    protected final Pane pane;
    protected final Blend blend0;
    protected final Text text;
    protected final Text text0;
    protected final ImageView imageView1;
    protected final Pane pane0;
    protected final Blend blend1;
    protected final Text text1;
    protected final Text contender_txtview;
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
    String email;

    public OnlineGame(Stage stage,String email,String name,String imgUrl) {
        this.email=email;
        imageView = new ImageView();
        blend = new Blend();
        imageView0 = new ImageView();
        pane = new Pane();
        blend0 = new Blend();
        text = new Text();
        text0 = new Text();
        imageView1 = new ImageView();
        pane0 = new Pane();
        blend1 = new Blend();
        text1 = new Text();
        contender_txtview = new Text();
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

        setId("APane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(768.0);
        setPrefWidth(1366.0);
        getStylesheets().add("/tictactoe/XML files/../../resources/cssFiles/CSS.css");

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

        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setLayoutX(47.0);
        text0.setLayoutY(64.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("You");
        text0.setFont(new Font("Britannic Bold", 18.0));

        imageView1.setFitHeight(44.0);
        imageView1.setFitWidth(110.0);
        imageView1.setLayoutX(23.0);
        imageView1.setLayoutY(81.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/resources/images/xImage.png").toExternalForm()));

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

        contender_txtview.setFill(javafx.scene.paint.Color.WHITE);
        contender_txtview.setLayoutX(40.0);
        contender_txtview.setLayoutY(59.0);
        contender_txtview.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        contender_txtview.setStrokeWidth(0.0);
        contender_txtview.setText(name);
        contender_txtview.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        contender_txtview.setFont(new Font("Britannic Bold", 18.0));

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

        btn1.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn1.setLayoutX(4.0);
        btn1.setLayoutY(1.0);
        btn1.setMnemonicParsing(false);
        btn1.setPrefHeight(150.0);
        btn1.setPrefWidth(200.0);
        btn1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn1.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn2.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn2.setLayoutX(205.0);
        btn2.setLayoutY(4.0);
        btn2.setMnemonicParsing(false);
        btn2.setPrefHeight(150.0);
        btn2.setPrefWidth(200.0);

        btn3.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn3.setLayoutX(409.0);
        btn3.setLayoutY(1.0);
        btn3.setMnemonicParsing(false);
        btn3.setPrefHeight(150.0);
        btn3.setPrefWidth(200.0);

        btn4.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn4.setLayoutX(4.0);
        btn4.setLayoutY(158.0);
        btn4.setMnemonicParsing(false);
        btn4.setPrefHeight(150.0);
        btn4.setPrefWidth(200.0);
        btn4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn4.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn5.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn5.setLayoutX(209.0);
        btn5.setLayoutY(158.0);
        btn5.setMnemonicParsing(false);
        btn5.setPrefHeight(150.0);
        btn5.setPrefWidth(200.0);
        btn5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn5.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn6.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn6.setLayoutX(409.0);
        btn6.setLayoutY(155.0);
        btn6.setMnemonicParsing(false);
        btn6.setPrefHeight(150.0);
        btn6.setPrefWidth(200.0);

        btn7.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn7.setLayoutX(4.0);
        btn7.setLayoutY(312.0);
        btn7.setMnemonicParsing(false);
        btn7.setPrefHeight(147.0);
        btn7.setPrefWidth(200.0);
        btn7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn7.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn8.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn8.setLayoutX(205.0);
        btn8.setLayoutY(312.0);
        btn8.setMnemonicParsing(false);
        btn8.setPrefHeight(147.0);
        btn8.setPrefWidth(200.0);
        btn8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn8.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn9.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn9.setLayoutX(409.0);
        btn9.setLayoutY(312.0);
        btn9.setMnemonicParsing(false);
        btn9.setPrefHeight(147.0);
        btn9.setPrefWidth(200.0);
        btn9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn9.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        /*newGame_btn.setCache(true);
        newGame_btn.setId("but_ClearAll");
        newGame_btn.setLayoutX(413.0);
        newGame_btn.setLayoutY(637.0);
        newGame_btn.setMnemonicParsing(false);
        newGame_btn.setPrefHeight(59.0);
        newGame_btn.setPrefWidth(210.0);
        newGame_btn.setStyle("-fx-background-color: #4D0DA5; -fx-text-fill: white; -fx-background-radius: 22; -fx-font-size: 24;");
        newGame_btn.getStylesheets().add("/resources/cssFiles/CSS.css");
        newGame_btn.setText("New Game");
        newGame_btn.setTextFill(javafx.scene.paint.Color.valueOf("#efefef"));*/

        exit_btn.setCache(true);
        exit_btn.setId("exitGame_btn");
        exit_btn.setLayoutX(752.0);
        exit_btn.setLayoutY(637.0);
        exit_btn.setMnemonicParsing(false);
        exit_btn.setPrefHeight(59.0);
        exit_btn.setPrefWidth(210.0);
        exit_btn.setStyle("-fx-background-color: #4D0DA5; -fx-text-fill: white; -fx-background-radius: 22; -fx-font-size: 24;");
        exit_btn.getStylesheets().add("/resources/cssFiles/CSS.css");
        exit_btn.setText("Exit");
        exit_btn.setOnAction((event) -> {
            
        });
        exit_btn.setTextFill(javafx.scene.paint.Color.valueOf("#efefef"));

        pane2.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        pane2.setId("paneX");
        pane2.setLayoutX(166.0);
        pane2.setLayoutY(515.0);
        pane2.setOpacity(0.87);
        pane2.setPrefHeight(44.0);
        pane2.setPrefWidth(55.0);
        pane2.getStylesheets().add("/resources/cssFiles/CSS.css");

        player1Score.setFitHeight(62.0);
        player1Score.setFitWidth(63.0);
        player1Score.setLayoutX(-1.0);
        player1Score.setLayoutY(2.0);
        player1Score.setPickOnBounds(true);
        player1Score.setPreserveRatio(true);
        player1Score.setImage(new Image(getClass().getResource("/resources/images/1.png").toExternalForm()));

        pane3.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        pane3.setId("paneX");
        pane3.setLayoutX(1122.0);
        pane3.setLayoutY(515.0);
        pane3.setPrefHeight(44.0);
        pane3.setPrefWidth(55.0);
        pane3.getStylesheets().add("/resources/cssFiles/CSS.css");

        player2Score.setFitHeight(59.0);
        player2Score.setFitWidth(63.0);
        player2Score.setLayoutX(-1.0);
        player2Score.setLayoutY(-2.0);
        player2Score.setPickOnBounds(true);
        player2Score.setPreserveRatio(true);
        player2Score.setImage(new Image(getClass().getResource("/resources/images/2.png").toExternalForm()));

        setEffect(blend2);
        setOpaqueInsets(new Insets(0.0));

        getChildren().add(imageView);
        getChildren().add(imageView0);
        pane.getChildren().add(text);
        pane.getChildren().add(text0);
        pane.getChildren().add(imageView1);
        getChildren().add(pane);
        pane0.getChildren().add(text1);
        pane0.getChildren().add(contender_txtview);
        pane0.getChildren().add(imageView2);
        getChildren().add(pane0);
        getChildren().add(label);
        pane1.getChildren().add(line);
        pane1.getChildren().add(line0);
        pane1.getChildren().add(line1);
        pane1.getChildren().add(line2);
        pane1.getChildren().add(btn1);
        pane1.getChildren().add(btn2);
        pane1.getChildren().add(btn3);
        pane1.getChildren().add(btn4);
        pane1.getChildren().add(btn5);
        pane1.getChildren().add(btn6);
        pane1.getChildren().add(btn7);
        pane1.getChildren().add(btn8);
        pane1.getChildren().add(btn9);
        getChildren().add(pane1);
        getChildren().add(newGame_btn);
        getChildren().add(exit_btn);
        pane2.getChildren().add(player1Score);
        getChildren().add(pane2);
        pane3.getChildren().add(player2Score);
        getChildren().add(pane3);

    }
}
