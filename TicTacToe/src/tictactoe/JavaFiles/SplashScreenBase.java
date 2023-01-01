package tictactoe.JavaFiles;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SplashScreenBase extends Pane {

    protected final ImageView imageView;

    public SplashScreenBase(Stage stage) {

        imageView = new ImageView();

        setId("APane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(758.0);
        setPrefWidth(1356.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        imageView.setFitHeight(627.0);
        imageView.setFitWidth(981.0);
        imageView.setLayoutX(348.0);
        imageView.setLayoutY(71.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/splash_icon.png").toExternalForm()));

        getChildren().add(imageView);

    }
}
