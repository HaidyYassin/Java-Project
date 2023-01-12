package tictactoe.JavaFiles;

import Models.PlayerData;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import static java.util.Objects.hash;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.Blend;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import tictactoe.JavaFiles.HomeScreenBase;
import tictactoe.JavaFiles.RecordedHistoryTable;
import tictactoe.JavaFiles.SignInBase;

public class ProfileBase extends AnchorPane {

    protected final Pane pane;
    protected final Button Logout_Btn;
    protected final Button History_Btn;
    protected final Line line;
    protected final Text text;
    protected final Text text0;
    protected final ImageView Prof_img;
    protected final TextField Prof_User_Name;
    protected final TextField Prof_score;
    protected final ImageView BackArrow;
    protected final Blend blend;
    Stage stage;
    StringTokenizer token;
    private Thread thread;
    String Name;

    public ProfileBase(Stage stage) {

        this.stage=stage;
        pane = new Pane();
        Logout_Btn = new Button();
        History_Btn = new Button();
        line = new Line();
        text = new Text();
        text0 = new Text();
        Prof_img = new ImageView();
        Prof_User_Name = new TextField();
        Prof_score = new TextField();
        BackArrow = new ImageView();
        blend = new Blend();

        setId("APane");
        setPrefHeight(768.0);
        setPrefWidth(1366.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        pane.setId("PaneX");
        pane.setLayoutX(333.0);
        pane.setLayoutY(34.0);
        pane.setOpacity(0.76);
        pane.setPrefHeight(700.0);
        pane.setPrefWidth(700.0);
        pane.setStyle("-fx-background-radius: 15; -fx-border-radius: 22; -fx-background-color: #000E0F;");
        pane.getStylesheets().add("/resources/cssFiles/CSS.css");

        Logout_Btn.setId("LogoutBtn");
        Logout_Btn.setLayoutX(115.0);
        Logout_Btn.setLayoutY(607.0);
        Logout_Btn.setMnemonicParsing(false);
        Logout_Btn.setPrefHeight(65.0);
        Logout_Btn.setPrefWidth(493.0);
        Logout_Btn.setStyle("-fx-background-radius: 22; -fx-font-size: 24;");
        Logout_Btn.getStylesheets().add("/resources/cssFiles/CSS.css");
        Logout_Btn.setText("Logout");
        Logout_Btn.setTextFill(javafx.scene.paint.Color.WHITE);
        setLogoutBtnAction();

        History_Btn.setId("LogoutBtn");
        History_Btn.setLayoutX(115.0);
        History_Btn.setLayoutY(526.0);
        History_Btn.setMnemonicParsing(false);
        History_Btn.setPrefHeight(65.0);
        History_Btn.setPrefWidth(493.0);
        History_Btn.setStyle("-fx-background-radius: 22; -fx-text-fill: #6E3071; -fx-background-color: white; -fx-font-size: 24;");
        History_Btn.getStylesheets().add("/resources/cssFiles/CSS.css");
        History_Btn.setText("History");
        History_Btn.setOnAction( (event) -> {
            
            try {
                RecordedHistoryTable recordedHistoryTable = new RecordedHistoryTable(stage);
                
                Scene scene = new Scene(recordedHistoryTable);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(ProfileBase.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });

        line.setEndX(307.0);
        line.setLayoutX(358.0);
        line.setLayoutY(472.0);
        line.setStartX(-323.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#61306f"));

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(35.0);
        text.setLayoutY(324.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setStyle("-fx-font-size: 25;");
        text.setText("User name :");

        text0.setDisable(true);
        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setLayoutX(35.0);
        text0.setLayoutY(413.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setStyle("-fx-font-size: 25;");
        text0.setText("Score :");

        Prof_img.setFitHeight(176.0);
        Prof_img.setFitWidth(176.0);
        Prof_img.setLayoutX(270.0);
        Prof_img.setLayoutY(65.0);
        Prof_img.setPickOnBounds(true);
        Prof_img.setPreserveRatio(true);
        Prof_img.setImage(new Image(getClass().getResource("/resources/images/player2.png").toExternalForm()));

        Prof_User_Name.setAccessibleRole(javafx.scene.AccessibleRole.THUMB);
        Prof_User_Name.setAlignment(javafx.geometry.Pos.CENTER);
        Prof_User_Name.setId("ProfileTxt");
        Prof_User_Name.setLayoutX(184.0);
        Prof_User_Name.setLayoutY(282.0);
        Prof_User_Name.setPrefHeight(65.0);
        Prof_User_Name.setPrefWidth(493.0);
        Prof_User_Name.setStyle("-fx-background-color: #000000; -fx-background-radius: 15;");
        Prof_User_Name.getStylesheets().add("/resources/cssFiles/CSS.css");
        Prof_User_Name.setCursor(Cursor.DEFAULT);
       
        if(HasEmail()){
           Prof_User_Name.setText(Name);
           Prof_User_Name.setEditable(false);
        }else{
           Prof_User_Name.setText("Player");
            Prof_User_Name.setEditable(false);
        }

        Prof_score.setAlignment(javafx.geometry.Pos.CENTER);
        Prof_score.setId("ProfileTxt");
        Prof_score.setLayoutX(184.0);
        Prof_score.setLayoutY(375.0);
        Prof_score.setPrefHeight(65.0);
        Prof_score.setPrefWidth(493.0);
        Prof_score.setDisable(true);
        Prof_score.setStyle("-fx-background-color: #000000; -fx-background-radius: 15;");
        Prof_score.getStylesheets().add("/resources/cssFiles/CSS.css");

        BackArrow.setFitHeight(50.0);
        BackArrow.setFitWidth(50.0);
        BackArrow.setLayoutX(35.0);
        BackArrow.setLayoutY(40.0);
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

        pane.setEffect(blend);

        pane.getChildren().add(Logout_Btn);
        pane.getChildren().add(History_Btn);
        pane.getChildren().add(line);
        pane.getChildren().add(text);
        pane.getChildren().add(text0);
        pane.getChildren().add(Prof_img);
        pane.getChildren().add(Prof_User_Name);
        pane.getChildren().add(Prof_score);
        pane.getChildren().add(BackArrow);
        getChildren().add(pane);

    }
    
    public void setLogoutBtnAction() {

        Logout_Btn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                backToSignIn();
                SignInBase signInScreen = new SignInBase(stage);
                Scene scene = new Scene(signInScreen);
                stage.setScene(scene);
                stage.show();
            }
        });

    }
    
    public void backToSignIn(){
        System.out.println("backToSignIn: called");
        if(ConnectWithServer.dataFromServer.get("email")!= null){
            System.out.println("Send to server to logout");
            ConnectWithServer.ps.println("logout###"+ConnectWithServer.dataFromServer.get("email"));
            thread.stop();
            try {
                ConnectWithServer.socket.close();
                ConnectWithServer.dis.close();
                ConnectWithServer.ps.close();
            } catch (IOException ex) {
                ex.printStackTrace(); 
            }   
        }
    }

    private boolean HasEmail() {
       if(ConnectWithServer.dataFromServer.get("email")!= null)
       {Name= ConnectWithServer.dataFromServer.get("userName");
            return true;}
       return false;
    }
}

