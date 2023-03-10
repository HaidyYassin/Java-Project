package tictactoe.JavaFiles;

import Models.PlayerData;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;
import static tictactoe.JavaFiles.SignInBase.SignedIn;

public class HomeScreenBase extends AnchorPane {

    protected final Pane pane;
    protected final Button SMBtn;
    protected final ImageView singleModeImg;
    protected final Button MMBtn;
    protected final ImageView multiModeImg;
    protected final ImageView musicImg;
    protected final ImageView mutedMusicImg;
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
    protected final Pane player2Namepanal;
    protected final Button okBtn;
    protected final ImageView BackArrow;
    protected final ImageView BackArrowGames;
    protected final Text text;
    protected final Text text0;
    protected final TextField nameFieldtxt;
    protected final ImageView mutedSoundImg;
    protected final ImageView videoIcon;
    Stage stage;
    static String name;
    PlayerData player;

    public HomeScreenBase(Stage stage) {

        this.stage = stage;
        pane = new Pane();
        SMBtn = new Button();
        singleModeImg = new ImageView();
        MMBtn = new Button();
        multiModeImg = new ImageView();
        musicImg = new ImageView();
        mutedMusicImg = new ImageView();
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
        player2Namepanal = new Pane();
        okBtn = new Button();
        BackArrow = new ImageView();
        BackArrowGames = new ImageView();
        text = new Text();
        text0 = new Text();
        nameFieldtxt = new TextField();
        mutedSoundImg = new ImageView();
        videoIcon = new ImageView();

        setId("APane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
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

        SMBtn.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);
        SMBtn.setId("SMBtn");
        SMBtn.setLayoutX(43.0);
        SMBtn.setLayoutY(425.0);
        SMBtn.setMnemonicParsing(false);
        SMBtn.setPrefHeight(170.0);
        SMBtn.setPrefWidth(343.0);
        SMBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        SMBtn.setText("Single Mode");
        SMBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        SMBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));
        SMBtn.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                Sound.clicksound();
                MMpanal.setVisible(false);
                SMpanal.setVisible(true);
            }});

        singleModeImg.setFitHeight(304.0);
        singleModeImg.setFitWidth(304.0);
        singleModeImg.setId("singleModeImg");
        singleModeImg.setLayoutX(63.0);
        singleModeImg.setLayoutY(198.0);
        singleModeImg.setPickOnBounds(true);
        singleModeImg.setPreserveRatio(true);
        singleModeImg.setImage(new Image(getClass().getResource("/resources/images/singleMode.png").toExternalForm()));
        singleModeImg.setOnMouseClicked(event
                ->{
            Sound.clicksound();
            MMpanal.setVisible(false);
            SMpanal.setVisible(true);
        });

        MMBtn.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);
        MMBtn.setId("MMBtn");
        MMBtn.setLayoutX(515.0);
        MMBtn.setLayoutY(425.0);
        MMBtn.setMnemonicParsing(false);
        MMBtn.setPrefHeight(170.0);
        MMBtn.setPrefWidth(343.0);
        MMBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        MMBtn.setText("Multi Mode");
        MMBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        MMBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));
        MMBtn.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                Sound.clicksound();
                SMpanal.setVisible(false);
                MMpanal.setVisible(true);          
            }});

        multiModeImg.setFitHeight(304.0);
        multiModeImg.setFitWidth(304.0);
        multiModeImg.setId("multiModeImg");
        multiModeImg.setLayoutX(535.0);
        multiModeImg.setLayoutY(198.0);
        multiModeImg.setPickOnBounds(true);
        multiModeImg.setPreserveRatio(true);
        multiModeImg.setImage(new Image(getClass().getResource("/resources/images/multiMode.png").toExternalForm()));
        multiModeImg.setOnMouseClicked(event
                ->{
            Sound.clicksound();
            SMpanal.setVisible(false);
            MMpanal.setVisible(true);
        });

        musicImg.setFitHeight(50.0);
        musicImg.setFitWidth(50.0);
        musicImg.setId("musicImg");
        musicImg.setLayoutX(671.0);
        musicImg.setLayoutY(45.0);
        musicImg.setPickOnBounds(true);
        musicImg.setPreserveRatio(true);
        musicImg.setImage(new Image(getClass().getResource("/resources/images/music.png").toExternalForm()));
        musicImg.setOnMouseClicked(event
                ->{
            Sound.clicksound();
            musicImg.setVisible(false);
            mutedMusicImg.setVisible(true);
            MusicPlayer.PauseMusic();
        });
        
        
        mutedMusicImg.setFitHeight(50.0);
        mutedMusicImg.setFitWidth(50.0);
        mutedMusicImg.setId("musicImg");
        mutedMusicImg.setLayoutX(671.0);
        mutedMusicImg.setLayoutY(45.0);
        mutedMusicImg.setPickOnBounds(true);
        mutedMusicImg.setPreserveRatio(true);
        mutedMusicImg.setVisible(false);
        if(MusicPlayer.streaming)
             mutedMusicImg.setVisible(false);
        else
            mutedMusicImg.setVisible(true);
        mutedMusicImg.setImage(new Image(getClass().getResource("/resources/images/musicMuted.png").toExternalForm()));
        mutedMusicImg.setOnMouseClicked(event
                ->{
            Sound.clicksound();
            musicImg.setVisible(true);
            mutedMusicImg.setVisible(false);
            MusicPlayer.ResumeMusic();
        });

        soundImg.setFitHeight(50.0);
        soundImg.setFitWidth(50.0);
        soundImg.setId("soundImg");
        soundImg.setLayoutX(733.0);
        soundImg.setLayoutY(45.0);
        soundImg.setPickOnBounds(true);
        soundImg.setPreserveRatio(true);
        soundImg.setImage(new Image(getClass().getResource("/resources/images/sound.png").toExternalForm()));
        soundImg.setOnMouseClicked(event
                ->{
            Sound.clicksound();
            soundImg.setVisible(false);
            mutedSoundImg.setVisible(true);
            
        });

        profileImg.setFitHeight(66.0);
        profileImg.setFitWidth(66.0);
        profileImg.setId("profileImg");
        profileImg.setLayoutX(792.0);
        profileImg.setLayoutY(37.0);
        profileImg.setPickOnBounds(true);
        profileImg.setPreserveRatio(true);
        profileImg.setImage(new Image(getClass().getResource("/resources/images/player1.png").toExternalForm()));
        profileImg.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Sound.clicksound();
                if(!SignInBase.SignedIn){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Sign In please to view your profile");
                    alert.showAndWait();
                }
                else
                {
                    ProfileBase profileScreen = new ProfileBase(stage);
                    Scene scene = new Scene(profileScreen);
                    stage.setScene(scene);
                    stage.show();
                }
            }
        });

        SMpanal.setId("SMpanal");
        SMpanal.setLayoutX(151.0);
        SMpanal.setLayoutY(185.0);
        SMpanal.setPrefHeight(440.0);
        SMpanal.setPrefWidth(598.0);
        SMpanal.setStyle("-fx-background-radius: 12;");
        SMpanal.getStylesheets().add("/resources/cssFiles/CSS.css");
        SMpanal.setVisible(false);

        easyBtn.setAlignment(javafx.geometry.Pos.CENTER);
        easyBtn.setId("SMBtn");
        easyBtn.setLayoutX(141.0);
        easyBtn.setLayoutY(40.0);
        easyBtn.setMnemonicParsing(false);
        easyBtn.setPrefHeight(100.0);
        easyBtn.setPrefWidth(333.0);
        easyBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        easyBtn.setText("Easy");
        easyBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        easyBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));
        easyBtn.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                Sound.clicksound();
                 navigetToNextScreen("easy");
            
            }});

        mediumBtn.setAlignment(javafx.geometry.Pos.CENTER);
        mediumBtn.setId("SMBtn");
        mediumBtn.setLayoutX(141.0);
        mediumBtn.setLayoutY(180.0);
        mediumBtn.setMnemonicParsing(false);
        mediumBtn.setPrefHeight(100.0);
        mediumBtn.setPrefWidth(333.0);
        mediumBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        mediumBtn.setText("Medium");
        mediumBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        mediumBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));
        mediumBtn.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                Sound.clicksound();
                 navigetToNextScreen("medium");
            
            }});

        hardBtn.setAlignment(javafx.geometry.Pos.CENTER);
        hardBtn.setId("SMBtn");
        hardBtn.setLayoutX(141.0);
        hardBtn.setLayoutY(320.0);
        hardBtn.setMnemonicParsing(false);
        hardBtn.setPrefHeight(100.0);
        hardBtn.setPrefWidth(333.0);
        hardBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        hardBtn.setText("Hard");
        hardBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        hardBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));
        hardBtn.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                Sound.clicksound();
                 navigetToNextScreen("hard");
            
            }});

        SMpanalBackArrow.setFitHeight(50.0);
        SMpanalBackArrow.setFitWidth(50.0);
        SMpanalBackArrow.setLayoutX(14.0);
        SMpanalBackArrow.setLayoutY(12.0);
        SMpanalBackArrow.setPickOnBounds(true);
        SMpanalBackArrow.setPreserveRatio(true);
        SMpanalBackArrow.setImage(new Image(getClass().getResource("/resources/images/backArrow.png").toExternalForm()));
        SMpanalBackArrow.setOnMouseClicked(event -> { 
            Sound.clicksound();
            SMpanal.setVisible(false);});

        MMpanal.setId("MMpanal");
        MMpanal.setLayoutX(151.0);
        MMpanal.setLayoutY(185.0);
        MMpanal.setPrefHeight(440.0);
        MMpanal.setPrefWidth(598.0);
        MMpanal.setStyle("-fx-background-radius: 12;");
        MMpanal.getStylesheets().add("/resources/cssFiles/CSS.css");
        MMpanal.setVisible(false);

        localBtn.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);
        localBtn.setId("localBtn");
        localBtn.setLayoutX(39.0);
        localBtn.setLayoutY(190.0);
        localBtn.setMnemonicParsing(false);
        localBtn.setPrefHeight(183.0);
        localBtn.setPrefWidth(258.0);
        localBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        localBtn.setText("Local");
        localBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));
        localBtn.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                Sound.clicksound();
                player2Namepanal.setVisible(true);
                 //navigetToNextScreen("local");
            
            }});

        onlineBtn.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);
        onlineBtn.setId("onlineBtn");
        onlineBtn.setLayoutX(318.0);
        onlineBtn.setLayoutY(190.0);
        onlineBtn.setMnemonicParsing(false);
        onlineBtn.setPrefHeight(183.0);
        onlineBtn.setPrefWidth(258.0);
        onlineBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        onlineBtn.setText("Online");
        onlineBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));
        onlineBtn.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                Sound.clicksound();
                
                if(SignInBase.SignedIn){
                    UsersFxml1Base userScreen = new UsersFxml1Base(stage);
                    Scene scene = new Scene(userScreen);
                    stage.setScene(scene);
                    stage.show();
                }else{
                    Scene scene = new Scene(new SignInBase(stage));
                    stage.setScene(scene);
                    stage.show();
                }
                 
            
            }});

        localImg.setFitHeight(230.0);
        localImg.setFitWidth(230.0);
        localImg.setLayoutX(53.0);
        localImg.setLayoutY(75.0);
        localImg.setPickOnBounds(true);
        localImg.setPreserveRatio(true);
        localImg.setImage(new Image(getClass().getResource("/resources/images/local.png").toExternalForm()));
        localImg.setOnMouseClicked(event
                ->{
            Sound.clicksound();
            player2Namepanal.setVisible(true);
            //navigetToNextScreen("local");
        });

        onlineImg.setFitHeight(200.0);
        onlineImg.setFitWidth(200.0);
        onlineImg.setLayoutX(347.0);
        onlineImg.setLayoutY(75.0);
        onlineImg.setPickOnBounds(true);
        onlineImg.setPreserveRatio(true);
        onlineImg.setImage(new Image(getClass().getResource("/resources/images/online.png").toExternalForm()));
        onlineImg.setOnMouseClicked(event -> { 
            Sound.clicksound();
            Scene scene = new Scene(new SignInBase(stage));
            stage.setScene(scene);
            stage.show();
            
        });

        MMpanalBackArrow.setFitHeight(50.0);
        MMpanalBackArrow.setFitWidth(50.0);
        MMpanalBackArrow.setLayoutX(14.0);
        MMpanalBackArrow.setLayoutY(12.0);
        MMpanalBackArrow.setPickOnBounds(true);
        MMpanalBackArrow.setPreserveRatio(true);
        MMpanalBackArrow.setImage(new Image(getClass().getResource("/resources/images/backArrow.png").toExternalForm()));
        MMpanalBackArrow.setOnMouseClicked(event -> {
            Sound.clicksound();
            MMpanal.setVisible(false);});

        player2Namepanal.setId("MMpanal");
        player2Namepanal.setLayoutX(116.0);
        player2Namepanal.setLayoutY(75.0);
        player2Namepanal.setPrefHeight(259.0);
        player2Namepanal.setPrefWidth(404.0);
        player2Namepanal.setStyle("-fx-background-radius: 12;");
        player2Namepanal.getStylesheets().add("/resources/cssFiles/CSS.css");
        player2Namepanal.setVisible(false);

        okBtn.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);
        okBtn.setId("onlineBtn");
        okBtn.setLayoutX(154.0);
        okBtn.setLayoutY(173.0);
        okBtn.setMnemonicParsing(false);
        okBtn.setPrefHeight(65.0);
        okBtn.setPrefWidth(96.0);
        okBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        okBtn.setText("Ok");
        okBtn.setTextFill(javafx.scene.paint.Color.valueOf("#6e3071"));
        okBtn.setOnMouseClicked(event
                ->{
            Sound.clicksound();
            player2Namepanal.setVisible(false);
            name = nameFieldtxt.getText();
            navigetToNextScreen("local");
        });

        BackArrow.setFitHeight(50.0);
        BackArrow.setFitWidth(50.0);
        BackArrow.setLayoutX(14.0);
        BackArrow.setLayoutY(12.0);
        BackArrow.setPickOnBounds(true);
        BackArrow.setPreserveRatio(true);
        BackArrow.setImage(new Image(getClass().getResource("/resources/images/backArrow.png").toExternalForm()));
        BackArrow.setOnMouseClicked(event -> { 
            Sound.clicksound();
            player2Namepanal.setVisible(false);});

        BackArrowGames.setFitHeight(50.0);
        BackArrowGames.setFitWidth(50.0);
        BackArrowGames.setLayoutX(43.0);
        BackArrowGames.setLayoutY(42.0);
        BackArrowGames.setPickOnBounds(true);
        BackArrowGames.setPreserveRatio(true);
        BackArrowGames.setImage(new Image(getClass().getResource("/resources/images/backArrow.png").toExternalForm()));
        BackArrowGames.setOnMouseClicked(event -> { 
            Sound.clicksound();
            Scene scene = new Scene(new gamesScreenBase(stage));
            stage.setScene(scene);
            stage.show();
        });

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setId("signintxt");
        text.setLayoutX(93.0);
        text.setLayoutY(47.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setStyle("-fx-font-family: Britannic Bold; -fx-font-size: 26;");
        text.setText("Enter Player's 2 Name");
        text.setWrappingWidth(325.6630859375);

        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setId("signintxt");
        text0.setLayoutX(22.0);
        text0.setLayoutY(123.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setStyle("-fx-font-family: Britannic Bold; -fx-font-size: 20;");
        text0.setText("Player's 2 Name");
        text0.setWrappingWidth(157.6630859375);

        nameFieldtxt.setId("emailTF");
        nameFieldtxt.setLayoutX(194.0);
        nameFieldtxt.setLayoutY(91.0);
        nameFieldtxt.setPrefHeight(50.0);
        nameFieldtxt.setPrefWidth(200.0);
        nameFieldtxt.setStyle("-fx-background-radius: 22; -fx-text-fill: white;");
        nameFieldtxt.getStylesheets().add("/resources/cssFiles/CSS.css");
        nameFieldtxt.setPadding(new Insets(0.0, 0.0, 0.0, 85.0));

        mutedSoundImg.setFitHeight(50.0);
        mutedSoundImg.setFitWidth(50.0);
        mutedSoundImg.setLayoutX(733.0);
        mutedSoundImg.setLayoutY(45.0);
        mutedSoundImg.setPickOnBounds(true);
        mutedSoundImg.setPreserveRatio(true);
        mutedSoundImg.setImage(new Image(getClass().getResource("/resources/images/soundMuted.png").toExternalForm()));
        mutedSoundImg.setVisible(false);
        mutedSoundImg.setOnMouseClicked(event
                ->{
            Sound.clicksound();
            soundImg.setVisible(true);
            mutedSoundImg.setVisible(false);
            
        });
        
        videoIcon.setFitHeight(50.0);
        videoIcon.setFitWidth(50.0);
        videoIcon.setLayoutX(603.0);
        videoIcon.setLayoutY(43.0);
        videoIcon.setPickOnBounds(true);
        videoIcon.setPreserveRatio(true);
        videoIcon.setImage(new Image(getClass().getResource("/resources/images/video_icon.png").toExternalForm()));
        setVideoIconAction();

        pane.getChildren().add(SMBtn);
        pane.getChildren().add(singleModeImg);
        pane.getChildren().add(MMBtn);
        pane.getChildren().add(multiModeImg);
        pane.getChildren().add(musicImg);
        pane.getChildren().add(mutedMusicImg);
        pane.getChildren().add(soundImg);
        pane.getChildren().add(profileImg);
        pane.getChildren().add(videoIcon);
        pane.getChildren().add(BackArrowGames);
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
        pane.getChildren().add(mutedSoundImg);
        player2Namepanal.getChildren().add(okBtn);
        player2Namepanal.getChildren().add(BackArrow);
        player2Namepanal.getChildren().add(text);
        player2Namepanal.getChildren().add(text0);
        player2Namepanal.getChildren().add(nameFieldtxt);
        MMpanal.getChildren().add(player2Namepanal);
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

    boolean isrecord;

    
    private void navigetToNextScreen(String level){
        Scene scene;
        ButtonType Yes = new ButtonType("Yes");
        ButtonType No = new ButtonType("NO", ButtonBar.ButtonData.CANCEL_CLOSE);
        Alert a = new Alert(Alert.AlertType.NONE);
        a.setTitle("Alert ASk");
        a.getDialogPane().getButtonTypes().addAll(Yes, No);
        a.setHeaderText("Do you want to record this game?");
        DialogPane dialogPane = a.getDialogPane();
        dialogPane.getStylesheets().add(
        getClass().getResource("/resources/cssFiles/CSS.css").toExternalForm());
        dialogPane.getStyleClass().add("infoDialog");
        a.showAndWait();
                
        if (a.getResult() == Yes) {

            isrecord = true;
            System.out.println("alertYes");
        } else if (a.getResult() == No) {
            isrecord = false;
            System.out.println("alertNo");

        }

        if (level == "medium" || level == "hard") {
            GameFxmlBase gameScreen = new GameFxmlBase(stage, level, isrecord, "x");
            scene = new Scene(gameScreen);
            gameScreen.text2.setLayoutX(17.0);

        } 
        else {
            XOScreenBase xoScreen = new XOScreenBase(stage, level, isrecord);
            scene = new Scene(xoScreen);

        }
        stage.setScene(scene);
        stage.show();
    }
    
    public void setVideoIconAction(){
        videoIcon.setOnMouseClicked(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            try {
                RecordedHistoryTable history  = new RecordedHistoryTable(stage);
                Scene scene = new Scene(history);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(HomeScreenBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });
        
    }
}
