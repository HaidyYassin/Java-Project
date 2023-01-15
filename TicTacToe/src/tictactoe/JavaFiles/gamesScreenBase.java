package tictactoe.JavaFiles;

import MemoryGameJavaFiles.CardGameFxmlBase;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class gamesScreenBase extends Pane {
    
    
    protected final ImageView imageView;
    protected final Pane pane;
    protected final Text text;
    protected final ImageView imageView0;
    
    public gamesScreenBase(Stage stage) {
        
        imageView = new ImageView();
        pane = new Pane();
        text = new Text();
        imageView0 = new ImageView();

        setId("APane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(768.0);
        setPrefWidth(1366.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        imageView.setFitHeight(463.0);
        imageView.setFitWidth(448.0);
        imageView.setLayoutX(750.0);
        imageView.setLayoutY(175.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/splash_icon.png").toExternalForm()));
        imageView.setOnMouseClicked(event -> { 
            try {
                Sound.clicksound();
                Parent root = new SplashScreenBase(stage);
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                
                stage.setResizable(false);
                Thread.sleep(3000);
                
                scene = new Scene(new HomeScreenBase(stage));
                stage.setScene(scene);
                stage.show(); 
                if(MusicPlayer.firstTime)
                    MusicPlayer.PlayMusic();
            } catch (InterruptedException ex) {
                Logger.getLogger(gamesScreenBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        pane.setId("signinPane");
        pane.setLayoutX(167.0);
        pane.setLayoutY(175.0);
        pane.setPrefHeight(419.0);
        pane.setPrefWidth(448.0);
        pane.setStyle("-fx-background-radius: 10;");
        pane.getStylesheets().add("/resources/cssFiles/CSS.css");

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setId("signintxt");
        text.setLayoutX(54.0);
        text.setLayoutY(71.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setStyle("-fx-font-family: Britannic Bold; -fx-font-size: 40;");
        text.setText("Fruits Card Game");
        text.setWrappingWidth(339.6630859375);

        imageView0.setFitHeight(273.0);
        imageView0.setFitWidth(356.0);
        imageView0.setLayoutX(46.0);
        imageView0.setLayoutY(102.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/resources/images/fruitsLogo.png").toExternalForm()));
        imageView0.setOnMouseClicked(event -> { 
            Sound.clicksound();
            Scene scene = new Scene(new CardGameFxmlBase(stage));
            stage.setScene(scene);
            stage.show();   
        });
        
        getChildren().add(imageView);
        pane.getChildren().add(text);
        pane.getChildren().add(imageView0);
        getChildren().add(pane);

    }
}
