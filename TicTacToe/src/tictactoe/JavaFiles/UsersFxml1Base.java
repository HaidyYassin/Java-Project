package tictactoe.JavaFiles;

import java.io.DataInput;
import java.io.DataInputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UsersFxml1Base extends AnchorPane implements Runnable{

    protected final Pane ServerPane;
    protected final Text text;
    protected final ImageView BackArrow;
    protected final ListView usesListView;
    protected final HBox hBox;
    protected final ImageView imageView;
    protected final VBox vBox;
    protected final Text text0;
    protected final HBox hBox0;
    protected final ImageView imageView0;
    protected final Text text1;
    protected final Button button;
    protected final DropShadow dropShadow;
    protected final HBox hBox1;
    protected final ImageView imageView1;
    protected final VBox vBox0;
    protected final Text text2;
    protected final HBox hBox2;
    protected final ImageView imageView2;
    protected final Text text3;
    protected final Button button0;
    protected final DropShadow dropShadow0;
    protected final HBox hBox3;
    protected final ImageView imageView3;
    protected final VBox vBox1;
    protected final Text text4;
    protected final HBox hBox4;
    protected final ImageView imageView4;
    protected final Text text5;
    protected final Button button1;
    protected final DropShadow dropShadow1;
    Stage stage;
    Thread th ;
    DataInputStream dis;

    public UsersFxml1Base(Stage stage) {

        this.stage = stage;
        th = new Thread(this);
        dis= SignInBase.dis;
        ServerPane = new Pane();
        text = new Text();
        BackArrow = new ImageView();
        usesListView = new ListView();
        hBox = new HBox();
        imageView = new ImageView();
        vBox = new VBox();
        text0 = new Text();
        hBox0 = new HBox();
        imageView0 = new ImageView();
        text1 = new Text();
        button = new Button();
        dropShadow = new DropShadow();
        hBox1 = new HBox();
        imageView1 = new ImageView();
        vBox0 = new VBox();
        text2 = new Text();
        hBox2 = new HBox();
        imageView2 = new ImageView();
        text3 = new Text();
        button0 = new Button();
        dropShadow0 = new DropShadow();
        hBox3 = new HBox();
        imageView3 = new ImageView();
        vBox1 = new VBox();
        text4 = new Text();
        hBox4 = new HBox();
        imageView4 = new ImageView();
        text5 = new Text();
        button1 = new Button();
        dropShadow1 = new DropShadow();

        setId("APane");
        setPrefHeight(768.0);
        setPrefWidth(1366.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        ServerPane.setId("XOpane");
        ServerPane.setLayoutX(233.0);
        ServerPane.setLayoutY(34.0);
        ServerPane.setPrefHeight(700.0);
        ServerPane.setPrefWidth(900.0);
        ServerPane.setStyle("-fx-background-radius: 20;");
        ServerPane.getStylesheets().add("/resources/cssFiles/CSS.css");

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setId("signintxt");
        text.setLayoutX(289.0);
        text.setLayoutY(116.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setStyle("-fx-font-family: Britannic Bold;");
        text.setText("Online Users");
        text.setWrappingWidth(339.6630859375);

        BackArrow.setFitHeight(50.0);
        BackArrow.setFitWidth(50.0);
        BackArrow.setLayoutX(59.0);
        BackArrow.setLayoutY(43.0);
        BackArrow.setPickOnBounds(true);
        BackArrow.setPreserveRatio(true);
        BackArrow.setImage(new Image(getClass().getResource("/resources/images/backArrow.png").toExternalForm()));
        BackArrow.setOnMouseClicked(event -> 
            {    
                HomeScreenBase homeScreen = new HomeScreenBase(stage);
        
                Scene scene = new Scene(homeScreen);
                stage.setScene(scene);
                stage.show();
            }
        );

        usesListView.setLayoutX(43.0);
        usesListView.setLayoutY(209.0);
        usesListView.setPrefHeight(426.0);
        usesListView.setPrefWidth(815.0);
        usesListView.setStyle("-fx-background-radius: 20;");

        hBox.setLayoutX(65.0);
        hBox.setLayoutY(240.0);
        hBox.setPrefHeight(63.0);
        hBox.setPrefWidth(760.0);

        imageView.setFitHeight(94.0);
        imageView.setFitWidth(88.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/girl.png").toExternalForm()));
        HBox.setMargin(imageView, new Insets(0.0, 20.0, 0.0, 0.0));

        vBox.setPrefHeight(63.0);
        vBox.setPrefWidth(567.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setStyle("-fx-font-size: 24;");
        text0.setText("Manal Hamada");
        text0.setWrappingWidth(185.8544921875);
        VBox.setMargin(text0, new Insets(15.0, 0.0, 0.0, 0.0));

        hBox0.setPrefHeight(100.0);
        hBox0.setPrefWidth(200.0);

        imageView0.setFitHeight(19.0);
        imageView0.setFitWidth(19.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/resources/images/onlineImg.png").toExternalForm()));
        HBox.setMargin(imageView0, new Insets(0.0, 5.0, 0.0, 0.0));

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setStyle("-fx-font-size: 18;");
        text1.setText("Online");

        button.setMnemonicParsing(false);
        button.setPrefHeight(27.0);
        button.setPrefWidth(75.0);
        button.setStyle("-fx-background-color: #4D0DA5;");
        button.setText("Invite");
        HBox.setMargin(button, new Insets(30.0, 0.0, 0.0, 0.0));

        button.setEffect(dropShadow);

        hBox1.setLayoutX(65.0);
        hBox1.setLayoutY(328.0);
        hBox1.setPrefHeight(94.0);
        hBox1.setPrefWidth(760.0);

        imageView1.setFitHeight(94.0);
        imageView1.setFitWidth(88.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/resources/images/player2.png").toExternalForm()));
        HBox.setMargin(imageView1, new Insets(0.0, 20.0, 0.0, 0.0));

        vBox0.setPrefHeight(94.0);
        vBox0.setPrefWidth(567.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setStyle("-fx-font-size: 24;");
        text2.setText("Yossif Elbtat");
        text2.setWrappingWidth(185.8544921875);
        VBox.setMargin(text2, new Insets(15.0, 0.0, 0.0, 0.0));

        hBox2.setPrefHeight(23.0);
        hBox2.setPrefWidth(592.0);

        imageView2.setFitHeight(19.0);
        imageView2.setFitWidth(19.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("/resources/images/onlineImg.png").toExternalForm()));
        HBox.setMargin(imageView2, new Insets(0.0, 5.0, 0.0, 0.0));

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setStyle("-fx-font-size: 18;");
        text3.setText("Online");

        button0.setMnemonicParsing(false);
        button0.setPrefHeight(27.0);
        button0.setPrefWidth(75.0);
        button0.setStyle("-fx-background-color: #4D0DA5;");
        button0.setText("Invite");
        HBox.setMargin(button0, new Insets(30.0, 0.0, 0.0, 0.0));

        button0.setEffect(dropShadow0);

        hBox3.setLayoutX(56.0);
        hBox3.setLayoutY(435.0);
        hBox3.setPrefHeight(94.0);
        hBox3.setPrefWidth(760.0);

        imageView3.setFitHeight(94.0);
        imageView3.setFitWidth(88.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("/resources/images/hendi-removebg-preview.png").toExternalForm()));
        HBox.setMargin(imageView3, new Insets(0.0, 20.0, 0.0, 0.0));

        vBox1.setPrefHeight(94.0);
        vBox1.setPrefWidth(567.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setStyle("-fx-font-size: 24;");
        text4.setText("Yossif Elbtat");
        text4.setWrappingWidth(185.8544921875);
        VBox.setMargin(text4, new Insets(15.0, 0.0, 0.0, 0.0));

        hBox4.setPrefHeight(11.0);
        hBox4.setPrefWidth(518.0);

        imageView4.setFitHeight(19.0);
        imageView4.setFitWidth(19.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setImage(new Image(getClass().getResource("/resources/images/onlineImg.png").toExternalForm()));
        HBox.setMargin(imageView4, new Insets(0.0, 5.0, 0.0, 0.0));

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setStyle("-fx-font-size: 18;");
        text5.setText("Online");

        button1.setMnemonicParsing(false);
        button1.setPrefHeight(27.0);
        button1.setPrefWidth(78.0);
        button1.setStyle("-fx-background-color: #4D0DA5;");
        button1.setText("Invite");
        HBox.setMargin(button1, new Insets(30.0, 0.0, 0.0, 5.0));

        button1.setEffect(dropShadow1);

        ServerPane.getChildren().add(text);
        ServerPane.getChildren().add(BackArrow);
        ServerPane.getChildren().add(usesListView);
        hBox.getChildren().add(imageView);
        vBox.getChildren().add(text0);
        hBox0.getChildren().add(imageView0);
        hBox0.getChildren().add(text1);
        vBox.getChildren().add(hBox0);
        hBox.getChildren().add(vBox);
        hBox.getChildren().add(button);
        ServerPane.getChildren().add(hBox);
        hBox1.getChildren().add(imageView1);
        vBox0.getChildren().add(text2);
        hBox2.getChildren().add(imageView2);
        hBox2.getChildren().add(text3);
        vBox0.getChildren().add(hBox2);
        hBox1.getChildren().add(vBox0);
        hBox1.getChildren().add(button0);
        ServerPane.getChildren().add(hBox1);
        hBox3.getChildren().add(imageView3);
        vBox1.getChildren().add(text4);
        hBox4.getChildren().add(imageView4);
        hBox4.getChildren().add(text5);
        vBox1.getChildren().add(hBox4);
        hBox3.getChildren().add(vBox1);
        hBox3.getChildren().add(button1);
        ServerPane.getChildren().add(hBox3);
        getChildren().add(ServerPane);
        th.start();

    }
    public void setList() {
        while (true) {

        }
    }

    @Override
    public void run() {
        while (true) {
            

        } 
        
    }
}
    

