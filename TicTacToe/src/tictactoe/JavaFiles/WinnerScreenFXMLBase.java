package tictactoe.JavaFiles;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WinnerScreenFXMLBase extends AnchorPane {

    protected final Pane pane;
    protected final Text text;
    protected final MediaView mediaView;
    Media m;
    MediaPlayer mp;

    public WinnerScreenFXMLBase(Stage stage) {

        pane = new Pane();
        text = new Text();
        mediaView = new MediaView();
        m = new Media(getClass().getResource("Vedio/winner.mp4").toExternalForm());
        mp = new MediaPlayer(m);

        setId("APane");
        setPrefHeight(768.0);
        setPrefWidth(1366.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        pane.setId("panal");
        pane.setLayoutX(233.0);
        pane.setLayoutY(34.0);
        pane.setPrefHeight(700.0);
        pane.setPrefWidth(900.0);
        pane.setStyle("-fx-background-radius: 12;");
        pane.getStylesheets().add("/resources/cssFiles/CSS.css");

        text.setFill(javafx.scene.paint.Color.valueOf("#07ee41fa"));
        text.setLayoutX(344.0);
        text.setLayoutY(110.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("You Win");
        text.setFont(new Font("Britannic Bold", 62.0));

        mediaView.setFitHeight(400.0);
        mediaView.setFitWidth(600.0);
        mediaView.setLayoutX(154.0);
        mediaView.setLayoutY(194.0);
        mediaView.setMediaPlayer(mp);
        mp.play();
       
        pane.getChildren().add(text);
        pane.getChildren().add(mediaView);
        getChildren().add(pane);
    }
}
