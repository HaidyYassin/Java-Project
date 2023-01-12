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
import Models.UsersList;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
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
    protected final ListView <UsersList>usesListView;
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
        ServerPane = new Pane();
        text = new Text();
        BackArrow = new ImageView();
        usesListView = new ListView<UsersList>();
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
      
        
        
        ServerPane.getChildren().add(usesListView);
        ServerPane.getChildren().add(hBox3);
        getChildren().add(ServerPane);
        getChildren().add(BackArrow);
        getChildren().add(text);
        th.start();
        addToList();
        

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

    public void addToList() {
        List<UsersList> viewlist = new ArrayList<>();
        viewlist.add(new UsersList("Manal Hamada", "/resources/images/girl.png"));
        viewlist.add(new UsersList("Youssef El_Batat", "/resources/images/hendi-removebg-preview.png"));
        //usesListView.getItems().addAll(list);
        ObservableList<UsersList> list = FXCollections.observableList(viewlist);
        usesListView.setItems(list);
        
    }
}
    

