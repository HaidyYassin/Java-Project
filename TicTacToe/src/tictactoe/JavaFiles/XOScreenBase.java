package tictactoe.JavaFiles;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class XOScreenBase extends AnchorPane {

    protected final Pane pane;
    protected final Text SelectYourSymbolleTxt;
    protected final ImageView XImg;
    protected final ImageView OImg;
    Stage stage;
    String level;

    public XOScreenBase(Stage stage, String level) {
        this.stage=stage;
        this.level = level;
        pane = new Pane();
        SelectYourSymbolleTxt = new Text();
        XImg = new ImageView();
        OImg = new ImageView();

        setId("backGrd");
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        pane.setId("XOpane");
        pane.setLayoutX(70.0);
        pane.setLayoutY(55.0);
        pane.setPrefHeight(291.0);
        pane.setPrefWidth(460.0);
        pane.setStyle("-fx-background-radius: 12;");
        pane.getStylesheets().add("/resources/cssFiles/CSS.css");

        SelectYourSymbolleTxt.setFill(javafx.scene.paint.Color.WHITE);
        SelectYourSymbolleTxt.setLayoutX(67.0);
        SelectYourSymbolleTxt.setLayoutY(53.0);
        SelectYourSymbolleTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        SelectYourSymbolleTxt.setStrokeWidth(0.0);
        SelectYourSymbolleTxt.setStyle("-fx-font-size: 35;");
        SelectYourSymbolleTxt.setText("Select Your Symbole");
        SelectYourSymbolleTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        XImg.setFitHeight(150.0);
        XImg.setFitWidth(161.0);
        XImg.setLayoutX(67.0);
        XImg.setLayoutY(101.0);
        XImg.setPickOnBounds(true);
        XImg.setPreserveRatio(true);
        XImg.setImage(new Image(getClass().getResource("/resources/images/xImage.png").toExternalForm()));
        setXImgAction();
        
        OImg.setFitHeight(150.0);
        OImg.setFitWidth(150.0);
        OImg.setLayoutX(270.0);
        OImg.setLayoutY(101.0);
        OImg.setPickOnBounds(true);
        OImg.setPreserveRatio(true);
        OImg.setImage(new Image(getClass().getResource("/resources/images/oImage.png").toExternalForm()));

        pane.getChildren().add(SelectYourSymbolleTxt);
        pane.getChildren().add(XImg);
        pane.getChildren().add(OImg);
        getChildren().add(pane);

    }
    
    public void setXImgAction() {
        XImg.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                GameFxmlBase gameScreen = new GameFxmlBase(stage, level, "x");
        
                Scene scene = new Scene(gameScreen);
                stage.setScene(scene);
                stage.show();
                
            }
            
            
        });
    }
}
