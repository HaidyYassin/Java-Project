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
    protected final ImageView BackArrow;
    Stage stage;
    String level;
    String symbol;
    boolean isrecord;

    public XOScreenBase(Stage stage, String level,boolean isrecord) {
        this.stage=stage;
        this.level = level;
        this.isrecord=isrecord;
        pane = new Pane();
        SelectYourSymbolleTxt = new Text();
        XImg = new ImageView();
        OImg = new ImageView();
        BackArrow = new ImageView();

        setId("APane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(768.0);
        setPrefWidth(1366.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        pane.setId("XOpane");
        pane.setLayoutX(233.0);
        pane.setLayoutY(34.0);
        pane.setPrefHeight(700.0);
        pane.setPrefWidth(900.0);
        pane.setStyle("-fx-background-radius: 12;");
        pane.getStylesheets().add("/resources/cssFiles/CSS.css");

        SelectYourSymbolleTxt.setFill(javafx.scene.paint.Color.WHITE);
        SelectYourSymbolleTxt.setLayoutX(193.0);
        SelectYourSymbolleTxt.setLayoutY(85.0);
        SelectYourSymbolleTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        SelectYourSymbolleTxt.setStrokeWidth(0.0);
        SelectYourSymbolleTxt.setStyle("-fx-font-size: 55;");
        SelectYourSymbolleTxt.setText("Select Your Symbol");
        SelectYourSymbolleTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        XImg.setFitHeight(300.0);
        XImg.setFitWidth(460.0);
        XImg.setLayoutX(0.0);
        XImg.setLayoutY(270.0);
        XImg.setPickOnBounds(true);
        XImg.setPreserveRatio(true);
        XImg.setImage(new Image(getClass().getResource("/resources/images/xImage.png").toExternalForm()));
        setXImgAction();
        
        OImg.setFitHeight(300.0);
        OImg.setFitWidth(460.0);
        OImg.setLayoutX(440.0);
        OImg.setLayoutY(270.0);
        OImg.setPickOnBounds(true);
        OImg.setPreserveRatio(true);
        OImg.setImage(new Image(getClass().getResource("/resources/images/oImage.png").toExternalForm()));
        setOImgAction();
        
        BackArrow.setFitHeight(50.0);
        BackArrow.setFitWidth(50.0);
        BackArrow.setLayoutX(63.0);
        BackArrow.setLayoutY(41.0);
        BackArrow.setPickOnBounds(true);
        BackArrow.setPreserveRatio(true);
        BackArrow.setImage(new Image(getClass().getResource("/resources/images/backArrow.png").toExternalForm()));
        BackArrow.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                HomeScreenBase homeScreen = new HomeScreenBase(stage);

                Scene scene = new Scene(homeScreen);
                stage.setScene(scene);
                stage.show();
            }
        });

        pane.getChildren().add(SelectYourSymbolleTxt);
        pane.getChildren().add(XImg);
        pane.getChildren().add(OImg);
        pane.getChildren().add(BackArrow);
        getChildren().add(pane);

    }
    
    public void setXImgAction() {
        XImg.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                symbol = "x";
                GameFxmlBase gameScreen = new GameFxmlBase(stage, level, isrecord, symbol);
                if(level == "local")
                {
                    gameScreen.text2.setText("You");
                    gameScreen.text0.setText(HomeScreenBase.name);
                    gameScreen.text0.setLayoutX(19.0);
                }
                else
                {
                    gameScreen.imageView1.setImage(new Image(getClass().getResource("/resources/images/xImage.png").toExternalForm()));
                    gameScreen.imageView2.setImage(new Image(getClass().getResource("/resources/images/oImage.png").toExternalForm()));
                }
                
                Scene scene = new Scene(gameScreen);
                stage.setScene(scene);
                stage.show();

            }

            
        });
    }
    
    public void setOImgAction() {
        OImg.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                symbol = "o";
                GameFxmlBase gameScreen = new GameFxmlBase(stage, level,isrecord, symbol);
                if(level == "local")
                {
                    gameScreen.text0.setText("You");
                    gameScreen.text2.setText(HomeScreenBase.name);
                    gameScreen.text2.setLayoutX(19.0);
                }
                else
                {
                    gameScreen.imageView2.setImage(new Image(getClass().getResource("/resources/images/xImage.png").toExternalForm()));
                    gameScreen.imageView1.setImage(new Image(getClass().getResource("/resources/images/oImage.png").toExternalForm()));

                }
                
                Scene scene = new Scene(gameScreen);
                stage.setScene(scene);
                stage.show();
                
            }
            
            
        });
    }
}