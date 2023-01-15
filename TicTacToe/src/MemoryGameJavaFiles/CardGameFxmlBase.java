package MemoryGameJavaFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.stage.Window;
import tictactoe.JavaFiles.MusicPlayer;
import tictactoe.JavaFiles.Sound;
import tictactoe.JavaFiles.gamesScreenBase;

public class CardGameFxmlBase extends AnchorPane {

    protected final ImageView BackArrow;
    protected final Button newGame_btn;
    protected final Button exit_btn;
    protected final Pane pane;
    protected final Line hL1;
    protected final Line hL2;
    protected final Line vL2;
    protected final Line vL1;
    protected final Line vL21;
    protected final ImageView img1;
    protected final ImageView img2;
    protected final ImageView img3;
    protected final ImageView img4;
    protected final ImageView img5;
    protected final ImageView img6;
    protected final ImageView img7;
    protected final ImageView img8;
    protected final ImageView img9;
    protected final ImageView img10;
    protected final ImageView img11;
    protected final ImageView img12;
    protected final ImageView pic1;
    protected final ImageView pic6;
    protected final ImageView pic3;
    protected final ImageView pic2;
    protected final ImageView pic4;
    protected final ImageView pic11;
    protected final ImageView pic8;
    protected final ImageView pic12;
    protected final ImageView pic5;
    protected final ImageView pic10;
    protected final ImageView pic9;
    protected final ImageView pic7;
    protected final Blend blend;

    private Board board = new Board();
    private Cell firstCard;
    private Cell secondCard;
    
    MediaPlayer player;
    MediaView mediaView;

    public CardGameFxmlBase(Stage stage) {
        
        firstCard = null;
        secondCard = null;
        
        BackArrow = new ImageView();
        newGame_btn = new Button();
        exit_btn = new Button();
        pane = new Pane();
        hL1 = new Line();
        hL2 = new Line();
        vL2 = new Line();
        vL1 = new Line();
        vL21 = new Line();
        img1 = new ImageView();
        img2 = new ImageView();
        img3 = new ImageView();
        img4 = new ImageView();
        img5 = new ImageView();
        img6 = new ImageView();
        img7 = new ImageView();
        img8 = new ImageView();
        img9 = new ImageView();
        img10 = new ImageView();
        img11 = new ImageView();
        img12 = new ImageView();
        pic1 = new ImageView();
        pic6 = new ImageView();
        pic3 = new ImageView();
        pic2 = new ImageView();
        pic4 = new ImageView();
        pic11 = new ImageView();
        pic8 = new ImageView();
        pic12 = new ImageView();
        pic5 = new ImageView();
        pic10 = new ImageView();
        pic9 = new ImageView();
        pic7 = new ImageView();
        blend = new Blend();
        player = new MediaPlayer(new Media(getClass().getResource("video/winnerVedio.mp4").toExternalForm()));
        mediaView = new MediaView(player);

        setId("APane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(768.0);
        setPrefWidth(1366.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        BackArrow.setFitHeight(50.0);
        BackArrow.setFitWidth(50.0);
        BackArrow.setLayoutX(178.0);
        BackArrow.setLayoutY(50.0);
        BackArrow.setPickOnBounds(true);
        BackArrow.setPreserveRatio(true);
        BackArrow.setImage(new Image(getClass().getResource("/resources/images/backArrow.png").toExternalForm()));
        BackArrow.setOnMouseClicked(event -> {
            Sound.clicksound();
            Scene scene = new Scene(new gamesScreenBase(stage));
            stage.setScene(scene);
            stage.show();
        });

        ImageView[][] imgs = {{img1, img2, img3, img4},
        {img5, img6, img7, img8},
        {img9, img10, img11, img12}};
        
        
        newGame_btn.setCache(true);
        newGame_btn.setId("but_ClearAll");
        newGame_btn.setLayoutX(354.0);
        newGame_btn.setLayoutY(648.0);
        newGame_btn.setMnemonicParsing(false);
        newGame_btn.setPrefHeight(59.0);
        newGame_btn.setPrefWidth(210.0);
        newGame_btn.setStyle("-fx-background-color: #ECC216; -fx-text-fill: white; -fx-background-radius: 22; -fx-font-size: 24;");
        newGame_btn.getStylesheets().add("/resources/cssFiles/CSS.css");
        newGame_btn.setText("New Game");
        newGame_btn.setTextFill(javafx.scene.paint.Color.valueOf("#efefef"));
        newGame_btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Sound.clicksound();

                flip(imgs);

            }
        });

        exit_btn.setCache(true);
        exit_btn.setId("but_ClearAll");
        exit_btn.setLayoutX(810.0);
        exit_btn.setLayoutY(648.0);
        exit_btn.setMnemonicParsing(false);
        exit_btn.setPrefHeight(59.0);
        exit_btn.setPrefWidth(210.0);
        exit_btn.setStyle("-fx-background-color: #4D0DA5; -fx-text-fill: white; -fx-background-radius: 22; -fx-font-size: 24;");
        exit_btn.getStylesheets().add("/resources/cssFiles/CSS.css");
        exit_btn.setText("Exit");
        exit_btn.setTextFill(javafx.scene.paint.Color.valueOf("#efefef"));
        exit_btn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Sound.clicksound();
                Scene scene = new Scene(new gamesScreenBase(stage));
                stage.setScene(scene);
                stage.show();
            }
        });

        pane.setId("gameBox");
        pane.setLayoutX(282.0);
        pane.setLayoutY(134.0);
        pane.setPrefHeight(462.0);
        pane.setPrefWidth(805.0);
        pane.getStylesheets().add("/resources/cssFiles/CSS.css");

        hL1.setEndX(552.0);
        hL1.setLayoutX(257.0);
        hL1.setLayoutY(156.0);
        hL1.setStartX(-257.0);
        hL1.setStartY(-1.0);

        hL2.setEndX(547.0);
        hL2.setEndY(-7.0);
        hL2.setLayoutX(258.0);
        hL2.setLayoutY(318.0);
        hL2.setStartX(-258.0);
        hL2.setStartY(-7.0);

        vL2.setEndX(325.0);
        vL2.setEndY(140.0);
        vL2.setLayoutX(82.0);
        vL2.setLayoutY(321.0);
        vL2.setStartX(325.0);
        vL2.setStartY(-321.0);

        vL1.setEndX(323.0);
        vL1.setEndY(140.0);
        vL1.setLayoutX(-119.0);
        vL1.setLayoutY(321.0);
        vL1.setStartX(323.0);
        vL1.setStartY(-320.0);

        vL21.setEndX(327.0);
        vL21.setEndY(136.0);
        vL21.setLayoutX(282.0);
        vL21.setLayoutY(323.0);
        vL21.setStartX(327.0);
        vL21.setStartY(-323.0);

        img1.setFitHeight(150.0);
        img1.setFitWidth(200.0);
        img1.setLayoutX(30.0);
        img1.setLayoutY(6.0);
        img1.setPickOnBounds(true);
        img1.setPreserveRatio(true);
        
        img2.setFitHeight(150.0);
        img2.setFitWidth(200.0);
        img2.setLayoutX(230.0);
        img2.setLayoutY(6.0);
        img2.setPickOnBounds(true);
        img2.setPreserveRatio(true);
        
        img3.setFitHeight(150.0);
        img3.setFitWidth(200.0);
        img3.setLayoutX(435.0);
        img3.setLayoutY(6.0);
        img3.setPickOnBounds(true);
        img3.setPreserveRatio(true);
        
        img4.setFitHeight(150.0);
        img4.setFitWidth(200.0);
        img4.setLayoutX(634.0);
        img4.setLayoutY(6.0);
        img4.setPickOnBounds(true);
        img4.setPreserveRatio(true);
        
        img5.setFitHeight(150.0);
        img5.setFitWidth(200.0);
        img5.setLayoutX(30.0);
        img5.setLayoutY(156.0);
        img5.setPickOnBounds(true);
        img5.setPreserveRatio(true);
        
        img6.setFitHeight(150.0);
        img6.setFitWidth(200.0);
        img6.setLayoutX(230.0);
        img6.setLayoutY(155.0);
        img6.setPickOnBounds(true);
        img6.setPreserveRatio(true);
        
        img7.setFitHeight(150.0);
        img7.setFitWidth(200.0);
        img7.setLayoutX(435.0);
        img7.setLayoutY(156.0);
        img7.setPickOnBounds(true);
        img7.setPreserveRatio(true);
       
        img8.setFitHeight(150.0);
        img8.setFitWidth(200.0);
        img8.setLayoutX(634.0);
        img8.setLayoutY(155.0);
        img8.setPickOnBounds(true);
        img8.setPreserveRatio(true);
        
        img9.setFitHeight(150.0);
        img9.setFitWidth(200.0);
        img9.setLayoutX(30.0);
        img9.setLayoutY(311.0);
        img9.setPickOnBounds(true);
        img9.setPreserveRatio(true);
        
        img10.setFitHeight(150.0);
        img10.setFitWidth(200.0);
        img10.setLayoutX(230.0);
        img10.setLayoutY(311.0);
        img10.setPickOnBounds(true);
        img10.setPreserveRatio(true);
        
        img11.setFitHeight(150.0);
        img11.setFitWidth(200.0);
        img11.setLayoutX(435.0);
        img11.setLayoutY(311.0);
        img11.setPickOnBounds(true);
        img11.setPreserveRatio(true);
        
        img12.setFitHeight(150.0);
        img12.setFitWidth(200.0);
        img12.setLayoutX(634.0);
        img12.setLayoutY(311.0);
        img12.setPickOnBounds(true);
        img12.setPreserveRatio(true);
       
        setEffect(blend);
        setOpaqueInsets(new Insets(0.0));

        
        
        pane.getChildren().add(img1);
        pane.getChildren().add(img2);
        pane.getChildren().add(img3);
        pane.getChildren().add(img4);
        pane.getChildren().add(img5);
        pane.getChildren().add(img6);
        pane.getChildren().add(img7);
        pane.getChildren().add(img8);
        pane.getChildren().add(img9);
        pane.getChildren().add(img10);
        pane.getChildren().add(img11);
        pane.getChildren().add(img12);
        getChildren().add(BackArrow);
        getChildren().add(newGame_btn);
        getChildren().add(exit_btn);
        pane.getChildren().add(hL1);
        pane.getChildren().add(hL2);
        pane.getChildren().add(vL2);
        pane.getChildren().add(vL1);
        pane.getChildren().add(vL21);
        getChildren().add(pane);

        

        initialize(imgs);
    }
    
    private void initialize(ImageView[][] imgs) {
        board.populateMatrix();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                imgs[i][j].setImage(new Image(getClass().getResource("/resources/images/mark.png").toExternalForm()));
                imgs[i][j].setUserData(i + "," + j);
                imgs[i][j].setOnMouseClicked(event
                        -> {
                    cardListner(event);
                });
            }
        }
    }

    private void cardListner(MouseEvent event) {
        Sound.clicksound();
        Node sourceComponent = (Node) event.getSource();
        String rowAndCol = (String) sourceComponent.getUserData();

        int rowSelected = Integer.parseInt(rowAndCol.split(",")[0]);
        int colSelected = Integer.parseInt(rowAndCol.split(",")[1]);

        String image = board.board[rowSelected][colSelected].value;
        ((ImageView) sourceComponent).setImage(new Image(getClass().getResource("/resources/images/" + image + ".png").toExternalForm()));
        checkEquality(rowSelected,colSelected);

    }
    
    private int counter=1;
    private void checkEquality(int rowSelected, int colSelected) {
        if(firstCard == null){
            firstCard = board.board[rowSelected][colSelected];
        }else if(secondCard ==null){
            secondCard = board.board[rowSelected][colSelected];
        }else {
            if(firstCard.value.equals(secondCard.value)){
                //matching pair
                board.board[firstCard.row][firstCard.col].wasGuessed = true;
                board.board[secondCard.row][secondCard.col].wasGuessed = true;
                counter++;
                System.out.println(counter);
                
            } else {
                int indexFirstCardInList = (firstCard.row * 4) + firstCard.col;
                ((ImageView)pane.getChildren().get(indexFirstCardInList)).setImage(new Image(getClass().getResource("/resources/images/mark.png").toExternalForm()));

                int indexSecondCardInList = (secondCard.row * 4) + secondCard.col;
                ((ImageView)pane.getChildren().get(indexSecondCardInList)).setImage(new Image(getClass().getResource("/resources/images/mark.png").toExternalForm()));
            }

            firstCard= board.board[rowSelected][colSelected];
            secondCard = null;

        }
        if(counter == 6)
           ViewVedio(); 
       
    }
    
    
     private void flip(ImageView[][] imgs){
       initialize(imgs);
       counter =1;
    }
   
     
     public void ViewVedio() {
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle("You are The Winner");

        Label label = new Label("Yaaaaay!!!");
        VBox content = new VBox(10, label, mediaView);
        content.setAlignment(Pos.CENTER);
        alert.getDialogPane().setContent(content);

        alert.setOnShowing(e -> player.play());
        Window window = alert.getDialogPane().getScene().getWindow();
        window.setOnCloseRequest(e
                -> {
            player.stop();
            
            alert.hide();
        });
        alert.showAndWait();
    }
    
}
