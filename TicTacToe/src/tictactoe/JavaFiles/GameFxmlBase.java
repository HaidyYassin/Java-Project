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
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final Button button8;
    protected final Blend blend2;

    public GameFxmlBase(Stage stage) {

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
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        button8 = new Button();
        blend2 = new Blend();

        setId("APane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(768.0);
        setPrefWidth(1366.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        imageView.setFitHeight(156.0);
        imageView.setFitWidth(160.0);
        imageView.setId("player1");
        imageView.setLayoutX(1140.0);
        imageView.setLayoutY(266.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/player1.png").toExternalForm()));

        imageView.setEffect(blend);

        imageView0.setFitHeight(131.0);
        imageView0.setFitWidth(101.0);
        imageView0.setId("player2");
        imageView0.setLayoutX(69.0);
        imageView0.setLayoutY(288.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/tictactoe/XML files/../../resources/images/player2.png").toExternalForm()));

        pane.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        pane.setId("paneX");
        pane.setLayoutX(1156.0);
        pane.setLayoutY(419.0);
        pane.setOpacity(0.85);
        pane.setPrefHeight(146.99999999999997);
        pane.setPrefWidth(123.02623191958844);
        pane.setStyle("-fx-background-radius: 7;");
        pane.getStylesheets().add("/tictactoe/XML files/../../resources/cssFiles/CSS.css");

        blend0.setMode(javafx.scene.effect.BlendMode.MULTIPLY);
        pane.setEffect(blend0);

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(19.0);
        text.setLayoutY(36.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Player1");
        text.setFont(new Font("Arial Bold", 24.0));

        imageView1.setFitHeight(67.0);
        imageView1.setFitWidth(110.0);
        imageView1.setLayoutX(7.0);
        imageView1.setLayoutY(74.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/tictactoe/XML files/../../resources/images/xImage.png").toExternalForm()));

        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setLayoutX(47.0);
        text0.setLayoutY(64.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("You");
        text0.setFont(new Font("Britannic Bold", 18.0));

        pane0.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        pane0.setCache(true);
        pane0.setId("paneX");
        pane0.setLayoutX(69.0);
        pane0.setLayoutY(419.0);
        pane0.setOpacity(0.85);
        pane0.setPrefHeight(146.99999999999997);
        pane0.setPrefWidth(123.02623191958844);
        pane0.setStyle("-fx-background-radius: 7;");
        pane0.getStylesheets().add("/tictactoe/XML files/../../resources/cssFiles/CSS.css");

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
        text2.setLayoutX(30.0);
        text2.setLayoutY(59.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Omar");
        text2.setFont(new Font("Britannic Bold", 18.0));

        imageView2.setFitHeight(62.0);
        imageView2.setFitWidth(117.0);
        imageView2.setLayoutX(7.0);
        imageView2.setLayoutY(74.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("/tictactoe/XML files/../../resources/images/oImage.png").toExternalForm()));

        label.setLayoutX(413.0);
        label.setLayoutY(441.0);
        label.setPrefHeight(44.0);
        label.setPrefWidth(110.0);

        pane1.setId("gameBox");
        pane1.setLayoutX(376.0);
        pane1.setLayoutY(136.0);
        pane1.setPrefHeight(462.0);
        pane1.setPrefWidth(548.0);
        pane1.getStylesheets().add("/tictactoe/XML files/../../resources/cssFiles/CSS.css");

        line.setEndX(291.0);
        line.setLayoutX(257.0);
        line.setLayoutY(156.0);
        line.setStartX(-257.0);

        line0.setEndX(291.0);
        line0.setLayoutX(258.0);
        line0.setLayoutY(318.0);
        line0.setStartX(-257.0);

        line1.setEndX(289.0);
        line1.setEndY(141.0);
        line1.setLayoutX(82.0);
        line1.setLayoutY(321.0);
        line1.setStartX(289.0);
        line1.setStartY(-321.0);

        line2.setEndX(289.0);
        line2.setEndY(141.0);
        line2.setLayoutX(-119.0);
        line2.setLayoutY(321.0);
        line2.setStartX(289.0);
        line2.setStartY(-321.0);

        button.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        button.setLayoutX(168.0);
        button.setLayoutY(1.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(156.0);
        button.setPrefWidth(200.0);

        button0.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        button0.setLayoutX(372.0);
        button0.setLayoutY(1.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(156.0);
        button0.setPrefWidth(172.0);

        button1.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        button1.setLayoutX(170.0);
        button1.setLayoutY(6.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(147.0);
        button1.setPrefWidth(200.0);
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        button2.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        button2.setLayoutX(4.0);
        button2.setLayoutY(158.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(156.0);
        button2.setPrefWidth(164.0);
        button2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button2.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        button3.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        button3.setLayoutX(4.0);
        button3.setLayoutY(319.0);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(141.0);
        button3.setPrefWidth(164.0);
        button3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button3.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        button4.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        button4.setLayoutX(174.0);
        button4.setLayoutY(163.0);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(156.0);
        button4.setPrefWidth(192.0);
        button4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button4.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        button5.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        button5.setLayoutX(172.0);
        button5.setLayoutY(317.0);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(141.0);
        button5.setPrefWidth(200.0);
        button5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button5.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        button6.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        button6.setLayoutX(375.0);
        button6.setLayoutY(319.0);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(141.0);
        button6.setPrefWidth(172.0);
        button6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button6.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        button7.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        button7.setLayoutX(375.0);
        button7.setLayoutY(158.0);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(156.0);
        button7.setPrefWidth(172.0);

        button8.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        button8.setLayoutX(4.0);
        button8.setLayoutY(1.0);
        button8.setMnemonicParsing(false);
        button8.setPrefHeight(156.0);
        button8.setPrefWidth(164.0);
        button8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button8.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

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
        pane1.getChildren().add(line);
        pane1.getChildren().add(line0);
        pane1.getChildren().add(line1);
        pane1.getChildren().add(line2);
        pane1.getChildren().add(button);
        pane1.getChildren().add(button0);
        pane1.getChildren().add(button1);
        pane1.getChildren().add(button2);
        pane1.getChildren().add(button3);
        pane1.getChildren().add(button4);
        pane1.getChildren().add(button5);
        pane1.getChildren().add(button6);
        pane1.getChildren().add(button7);
        pane1.getChildren().add(button8);
        getChildren().add(pane1);

    }
}
