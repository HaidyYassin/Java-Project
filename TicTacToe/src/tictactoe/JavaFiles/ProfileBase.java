package tictactoe.JavaFiles ;

import java.awt.Desktop;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Cursor;
import javafx.scene.Scene;
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

public  class ProfileBase extends AnchorPane {

    protected final Pane pane;
    protected final Button Logout_Btn;
    protected final Button History_Btn;
    protected final Line line;
    protected final Text text;
    protected final Text text0;
    protected final ImageView Prof_img;
    protected final TextField Prof_User_Name;
    protected final TextField Prof_score;
    protected final Blend blend;
    Stage stage;
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
        blend = new Blend();

        setId("UserPane");
        setPrefHeight(500.0);
        setPrefWidth(800.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        pane.setId("PaneX");
        pane.setLayoutX(206.0);
        pane.setLayoutY(51.0);
        pane.setOpacity(0.76);
        pane.setPrefHeight(423.0);
        pane.setPrefWidth(417.0);
        pane.setStyle("-fx-background-radius: 15; -fx-border-radius: 22; -fx-background-color: #000E0F;");
        pane.getStylesheets().add("/resources/cssFiles/CSS.css");

        Logout_Btn.setId("LogoutBtn");
        Logout_Btn.setLayoutX(120.0);
        Logout_Btn.setLayoutY(361.0);
        Logout_Btn.setMnemonicParsing(false);
        Logout_Btn.setPrefHeight(44.0);
        Logout_Btn.setPrefWidth(201.0);
        Logout_Btn.setStyle("-fx-background-radius: 22; -fx-font-size: 18;");
        Logout_Btn.getStylesheets().add("/resources/cssFiles/CSS.css");
        Logout_Btn.setText("Logout");
        setLogoutBtnAction();
        Logout_Btn.setTextFill(javafx.scene.paint.Color.WHITE);

        History_Btn.setId("LogoutBtn");
        History_Btn.setLayoutX(120.0);
        History_Btn.setLayoutY(297.0);
        History_Btn.setMnemonicParsing(false);
        History_Btn.setPrefHeight(44.0);
        History_Btn.setPrefWidth(201.0);
        History_Btn.setStyle("-fx-background-radius: 22; -fx-text-fill: #6E3071; -fx-background-color: white; -fx-font-size: 18;");
        History_Btn.getStylesheets().add("/resources/cssFiles/CSS.css");
        History_Btn.setText("History");
        History_Btn.setOnAction( (event) -> {
            
            RecordedHistoryTable recordedHistoryTable = new RecordedHistoryTable(stage);

                Scene scene = new Scene(recordedHistoryTable);
                stage.setScene(scene);
                stage.show();
            
        });

        line.setEndX(172.0);
        line.setLayoutX(212.0);
        line.setLayoutY(266.0);
        line.setStartX(-179.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#61306f"));

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(125.0);
        text.setLayoutY(177.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("User name :");

        text0.setDisable(true);
        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setLayoutX(129.0);
        text0.setLayoutY(228.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Score :");

        Prof_img.setFitHeight(104.0);
        Prof_img.setFitWidth(95.0);
        Prof_img.setLayoutX(151.0);
        Prof_img.setLayoutY(14.0);
        Prof_img.setPickOnBounds(true);
        Prof_img.setPreserveRatio(true);
        Prof_img.setImage(new Image(getClass().getResource("/resources/images/player2.png").toExternalForm()));

        Prof_User_Name.setAccessibleRole(javafx.scene.AccessibleRole.THUMB);
        Prof_User_Name.setAlignment(javafx.geometry.Pos.CENTER);
        Prof_User_Name.setId("ProfileTxt");
        Prof_User_Name.setLayoutX(120.0);
        Prof_User_Name.setLayoutY(155.0);
        Prof_User_Name.setPrefHeight(31.0);
        Prof_User_Name.setPrefWidth(201.0);
        Prof_User_Name.setStyle("-fx-background-color: #000000; -fx-background-radius: 15;");
        Prof_User_Name.getStylesheets().add("/resources/cssFiles/CSS.css");
        Prof_User_Name.setCursor(Cursor.DEFAULT);

        Prof_score.setAlignment(javafx.geometry.Pos.CENTER);
        Prof_score.setId("ProfileTxt");
        Prof_score.setLayoutX(120.0);
        Prof_score.setLayoutY(207.0);
        Prof_score.setPrefHeight(31.0);
        Prof_score.setPrefWidth(201.0);
        Prof_score.setStyle("-fx-background-color: #000000; -fx-background-radius: 15;");
        Prof_score.getStylesheets().add("/resources/cssFiles/CSS.css");

        pane.setEffect(blend);

        pane.getChildren().add(Logout_Btn);
        pane.getChildren().add(History_Btn);
        pane.getChildren().add(line);
        pane.getChildren().add(text);
        pane.getChildren().add(text0);
        pane.getChildren().add(Prof_img);
        pane.getChildren().add(Prof_User_Name);
        pane.getChildren().add(Prof_score);
        getChildren().add(pane);

    }
   
    public void setLogoutBtnAction() {

        Logout_Btn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SignInBase signInScreen = new SignInBase(stage);

                Scene scene = new Scene(signInScreen);
                stage.setScene(scene);
                stage.show();
            }
        });

    }
    
    
}
