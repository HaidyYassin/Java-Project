package tictactoe.JavaFiles;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HomeScreenBase extends AnchorPane {

    protected final Pane pane;
    protected final Button SMBtn;
    protected final ImageView singleModeImg;
    protected final Button MMBtn;
    protected final ImageView multiModeImg;
    protected final ImageView musicImg;
    protected final ImageView settingImg;
    protected final ImageView soundImg;
    protected final ImageView profileImg;
    protected final Pane SMpanal;
    protected final Button easyBtn;
    protected final Button mediumBtn;
    protected final Button hardBtn;
    protected final ImageView SMpanalBackArrow;
    protected final Pane MMpanal;
    protected final Button localBtn;
    protected final Button onlineBtn;
    protected final ImageView localImg;
    protected final ImageView onlineImg;
    protected final ImageView MMpanalBackArrow;
    Stage stage;
    public HomeScreenBase(Stage stage) {
        this.stage=stage;
        pane = new Pane();
        SMBtn = new Button();
        singleModeImg = new ImageView();
        MMBtn = new Button();
        multiModeImg = new ImageView();
        musicImg = new ImageView();
        settingImg = new ImageView();
        soundImg = new ImageView();
        profileImg = new ImageView();
        SMpanal = new Pane();
        easyBtn = new Button();
        mediumBtn = new Button();
        hardBtn = new Button();
        SMpanalBackArrow = new ImageView();
        MMpanal = new Pane();
        localBtn = new Button();
        onlineBtn = new Button();
        localImg = new ImageView();
        onlineImg = new ImageView();
        MMpanalBackArrow = new ImageView();

        setId("backGrd");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        pane.setId("panal");
        pane.setLayoutX(54.0);
        pane.setLayoutY(41.0);
        pane.setPrefHeight(318.0);
        pane.setPrefWidth(493.0);
        pane.setStyle("-fx-background-radius: 12;");
        pane.getStylesheets().add("/resources/cssFiles/CSS.css");

        SMBtn.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);
        SMBtn.setId("SMBtn");
        SMBtn.setLayoutX(37.0);
        SMBtn.setLayoutY(168.0);
        SMBtn.setMnemonicParsing(false);
        SMBtn.setPrefHeight(117.0);
        SMBtn.setPrefWidth(190.0);
        SMBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        SMBtn.setText("Single Mode");
        SMBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        SMBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));
        SMBtn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {         
                MMpanal.setVisible(false);
                SMpanal.setVisible(true);
            }
        });

        singleModeImg.setFitHeight(150.0);
        singleModeImg.setFitWidth(200.0);
        singleModeImg.setId("singleModeImg");
        singleModeImg.setLayoutX(57.0);
        singleModeImg.setLayoutY(84.0);
        singleModeImg.setPickOnBounds(true);
        singleModeImg.setPreserveRatio(true);
        singleModeImg.setImage(new Image(getClass().getResource("/resources/images/singleMode.png").toExternalForm()));
        singleModeImg.setOnMouseClicked(event -> SMpanal.setVisible(true));

        MMBtn.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);
        MMBtn.setId("MMBtn");
        MMBtn.setLayoutX(270.0);
        MMBtn.setLayoutY(168.0);
        MMBtn.setMnemonicParsing(false);
        MMBtn.setPrefHeight(117.0);
        MMBtn.setPrefWidth(190.0);
        MMBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        MMBtn.setText("Multi Mode");
        MMBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        MMBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));
        MMBtn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {    
                SMpanal.setVisible(false);
                MMpanal.setVisible(true);
            }
        });

        multiModeImg.setFitHeight(159.0);
        multiModeImg.setFitWidth(159.0);
        multiModeImg.setId("multiModeImg");
        multiModeImg.setLayoutX(286.0);
        multiModeImg.setLayoutY(72.0);
        multiModeImg.setPickOnBounds(true);
        multiModeImg.setPreserveRatio(true);
        multiModeImg.setImage(new Image(getClass().getResource("/resources/images/multiMode.png").toExternalForm()));
        multiModeImg.setOnMouseClicked(event -> MMpanal.setVisible(true));

        musicImg.setFitHeight(27.0);
        musicImg.setFitWidth(27.0);
        musicImg.setId("musicImg");
        musicImg.setLayoutX(323.0);
        musicImg.setLayoutY(18.0);
        musicImg.setPickOnBounds(true);
        musicImg.setPreserveRatio(true);
        musicImg.setImage(new Image(getClass().getResource("/resources/images/music.png").toExternalForm()));

        settingImg.setFitHeight(27.0);
        settingImg.setFitWidth(27.0);
        settingImg.setId("settingImg");
        settingImg.setLayoutX(407.0);
        settingImg.setLayoutY(18.0);
        settingImg.setPickOnBounds(true);
        settingImg.setPreserveRatio(true);
        settingImg.setImage(new Image(getClass().getResource("/resources/images/settings.png").toExternalForm()));

        soundImg.setFitHeight(27.0);
        soundImg.setFitWidth(27.0);
        soundImg.setId("soundImg");
        soundImg.setLayoutX(365.0);
        soundImg.setLayoutY(18.0);
        soundImg.setPickOnBounds(true);
        soundImg.setPreserveRatio(true);
        setProfileIconAction();
        soundImg.setImage(new Image(getClass().getResource("/resources/images/sound.png").toExternalForm()));

        profileImg.setFitHeight(35.0);
        profileImg.setFitWidth(41.0);
        profileImg.setId("profileImg");
        profileImg.setLayoutX(443.0);
        profileImg.setLayoutY(14.0);
        profileImg.setPickOnBounds(true);
        profileImg.setPreserveRatio(true);
        profileImg.setImage(new Image(getClass().getResource("/resources/images/player1.png").toExternalForm()));

        SMpanal.setId("SMpanal");
        SMpanal.setLayoutX(71.0);
        SMpanal.setLayoutY(72.0);
        SMpanal.setPrefHeight(225.0);
        SMpanal.setPrefWidth(352.0);
        SMpanal.setStyle("-fx-background-radius: 12;");
        SMpanal.getStylesheets().add("/resources/cssFiles/CSS.css");
        SMpanal.setVisible(false);

        easyBtn.setAlignment(javafx.geometry.Pos.CENTER);
        easyBtn.setId("SMBtn");
        easyBtn.setLayoutX(112.0);
        easyBtn.setLayoutY(25.0);
        easyBtn.setMnemonicParsing(false);
        easyBtn.setPrefHeight(48.0);
        easyBtn.setPrefWidth(128.0);
        easyBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        easyBtn.setText("Easy");
        easyBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        easyBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));
        easyBtn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {         
                XOScreenBase xoScreen = new XOScreenBase(stage);
        
                Scene scene = new Scene(xoScreen);
                stage.setScene(scene);
                stage.show();
            }
        });

        mediumBtn.setAlignment(javafx.geometry.Pos.CENTER);
        mediumBtn.setId("SMBtn");
        mediumBtn.setLayoutX(112.0);
        mediumBtn.setLayoutY(90.0);
        mediumBtn.setMnemonicParsing(false);
        mediumBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        mediumBtn.setText("Medium");
        mediumBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        mediumBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));
        mediumBtn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {         
                XOScreenBase xoScreen = new XOScreenBase(stage);
        
                Scene scene = new Scene(xoScreen);
                stage.setScene(scene);
                stage.show();
            }
        });

        hardBtn.setAlignment(javafx.geometry.Pos.CENTER);
        hardBtn.setId("SMBtn");
        hardBtn.setLayoutX(112.0);
        hardBtn.setLayoutY(154.0);
        hardBtn.setMnemonicParsing(false);
        hardBtn.setPrefHeight(48.0);
        hardBtn.setPrefWidth(128.0);
        hardBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        hardBtn.setText("Hard");
        hardBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        hardBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));
        hardBtn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {         
                XOScreenBase xoScreen = new XOScreenBase(stage);
        
                Scene scene = new Scene(xoScreen);
                stage.setScene(scene);
                stage.show();
            }
        });

        SMpanalBackArrow.setFitHeight(27.0);
        SMpanalBackArrow.setFitWidth(27.0);
        SMpanalBackArrow.setLayoutX(14.0);
        SMpanalBackArrow.setLayoutY(12.0);
        SMpanalBackArrow.setPickOnBounds(true);
        SMpanalBackArrow.setPreserveRatio(true);
        SMpanalBackArrow.setImage(new Image(getClass().getResource("/resources/images/backArrow.png").toExternalForm()));
        SMpanalBackArrow.setOnMouseClicked(event -> SMpanal.setVisible(false));

        MMpanal.setId("MMpanal");
        MMpanal.setLayoutX(71.0);
        MMpanal.setLayoutY(72.0);
        MMpanal.setPrefHeight(225.0);
        MMpanal.setPrefWidth(352.0);
        MMpanal.setStyle("-fx-background-radius: 12;");
        MMpanal.getStylesheets().add("/resources/cssFiles/CSS.css");
        MMpanal.setVisible(false);

        localBtn.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);
        localBtn.setId("localBtn");
        localBtn.setLayoutX(26.0);
        localBtn.setLayoutY(81.0);
        localBtn.setMnemonicParsing(false);
        localBtn.setPrefHeight(117.0);
        localBtn.setPrefWidth(137.0);
        localBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        localBtn.setText("Local");
        localBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));

        onlineBtn.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);
        onlineBtn.setId("onlineBtn");
        onlineBtn.setLayoutX(188.0);
        onlineBtn.setLayoutY(81.0);
        onlineBtn.setMnemonicParsing(false);
        onlineBtn.setPrefHeight(117.0);
        onlineBtn.setPrefWidth(137.0);
        onlineBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        onlineBtn.setText("Online");
        onlineBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));

        localImg.setFitHeight(117.0);
        localImg.setFitWidth(114.0);
        localImg.setLayoutX(36.0);
        localImg.setLayoutY(35.0);
        localImg.setPickOnBounds(true);
        localImg.setPreserveRatio(true);
        localImg.setImage(new Image(getClass().getResource("/resources/images/local.png").toExternalForm()));

        onlineImg.setFitHeight(117.0);
        onlineImg.setFitWidth(114.0);
        onlineImg.setLayoutX(200.0);
        onlineImg.setLayoutY(35.0);
        onlineImg.setPickOnBounds(true);
        onlineImg.setPreserveRatio(true);
        onlineImg.setImage(new Image(getClass().getResource("/resources/images/online.png").toExternalForm()));

        MMpanalBackArrow.setFitHeight(27.0);
        MMpanalBackArrow.setFitWidth(27.0);
        MMpanalBackArrow.setPickOnBounds(true);
        MMpanalBackArrow.setPreserveRatio(true);
        MMpanalBackArrow.setImage(new Image(getClass().getResource("/resources/images/backArrow.png").toExternalForm()));
        MMpanalBackArrow.setOnMouseClicked(event -> MMpanal.setVisible(false));

        pane.getChildren().add(SMBtn);
        pane.getChildren().add(singleModeImg);
        pane.getChildren().add(MMBtn);
        pane.getChildren().add(multiModeImg);
        pane.getChildren().add(musicImg);
        pane.getChildren().add(settingImg);
        pane.getChildren().add(soundImg);
        pane.getChildren().add(profileImg);
        SMpanal.getChildren().add(easyBtn);
        SMpanal.getChildren().add(mediumBtn);
        SMpanal.getChildren().add(hardBtn);
        SMpanal.getChildren().add(SMpanalBackArrow);
        pane.getChildren().add(SMpanal);
        MMpanal.getChildren().add(localBtn);
        MMpanal.getChildren().add(onlineBtn);
        MMpanal.getChildren().add(localImg);
        MMpanal.getChildren().add(onlineImg);
        MMpanal.getChildren().add(MMpanalBackArrow);
        pane.getChildren().add(MMpanal);
        getChildren().add(pane);

    }
    public void setProfileIconAction() {
        profileImg.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ProfileBase gameScreen = new ProfileBase(stage);

                Scene scene = new Scene(gameScreen);
                stage.setScene(scene);
                stage.show();

            }
        });

    }
}
