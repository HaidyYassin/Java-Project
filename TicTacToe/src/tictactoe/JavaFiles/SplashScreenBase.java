package tictactoe.JavaFiles;

import com.sun.javaws.ui.SplashScreen;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class SplashScreenBase extends Pane {

    protected final ImageView imageView;
       

    public SplashScreenBase(Stage stage) {

        imageView = new ImageView();

        setId("backGrd");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        imageView.setFitHeight(270.0);
        imageView.setFitWidth(299.0);
        imageView.setLayoutX(156.0);
        imageView.setLayoutY(65.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/splash_icon.png").toExternalForm()));

   
        getChildren().add(imageView);

    }

   
}
