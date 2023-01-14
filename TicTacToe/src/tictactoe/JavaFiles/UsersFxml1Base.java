package tictactoe.JavaFiles;

import Models.PlayerData;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.StringTokenizer;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UsersFxml1Base extends AnchorPane{
    
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
    String name,email;
    String url;
    List<UsersList> viewlist;
    StringTokenizer token;
    PlayerData player;
   // ConnectWithServer conn;
     ArrayList<PlayerData> onlinePlayers;
    ObservableList<UsersList> list;
   
    public UsersFxml1Base(Stage stage){
        System.out.println("listttttt");
       th=new Thread();
       onlinePlayers=new ArrayList<>();
         
        this.name=name;
        this.url=url;
        this.email=email;
        this.stage = stage;
        viewlist= new ArrayList<>();
        ServerPane = new Pane();
        text = new Text();
        BackArrow = new ImageView();
        usesListView = new ListView<UsersList>();
        list= FXCollections.observableList(viewlist);
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
        ConnectWithServer.ps.println("playerlist");
        th = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                         onlinePlayers.clear();
                    do{
                        try{
                            String data = ConnectWithServer.dis.readLine();
                            if(data.equals("NoMorePlayer")){
                                break;
                            }
                            switch(data){
                                
                                case "close":
                                    Close();
                                    System.out.println("System closed");
                                default :
                                    System.out.println("default: "+data);
                                    readData(data);
                            }
                        } catch (IOException ex) {
                            Close();
                            System.out.println("Lost connection");
                        }
                    }while(true);
                    listOnlinePlayers();
                    try{
                           th.sleep(300);
                        }catch(InterruptedException ex){
                            th.stop();
                        }
                    
                }                   
            }
        });
        th.start();
          
    
    }
    void listOnlinePlayers(){
    
    usesListView.getItems().removeAll();
            list.clear();
             for(int i=0;i<onlinePlayers.size();i++){
               // viewlist.add(new UsersList(stage,playex.getEmail(),playex.getName(),"/resources/images/hendi-removebg-preview.png"));
                System.out.println(onlinePlayers.get(i).getName());
                usesListView.getItems().add(new UsersList(stage,onlinePlayers.get(i).getEmail(),onlinePlayers.get(i).getName(),"/resources/images/hendi-removebg-preview.png"));
                list = FXCollections.observableList(viewlist);
                usesListView.setItems(list);
                onlinePlayers.clear();
    }
    }
    
    
    void readData(String data){
              System.out.println("Data: "+data);
            token = new StringTokenizer(data, "###");
             player= new PlayerData();
            player.setName(token.nextToken());
            player.setEmail(token.nextToken());
            player.setIsOnline(Boolean.parseBoolean(token.nextToken()));
            //player.setIs(Boolean.parseBoolean(token.nextToken()));
            player.setScore(Integer.parseInt(token.nextToken()));
            System.out.println("The email is"+player.getEmail());
            if(!ConnectWithServer.currentPlayerData.get("email").equals(player.getEmail())){
            System.out.println("Add list");
            onlinePlayers.add(player);
        }
    
    }
    
    private void Close(){
        System.out.println("Server Colsed");
                            
        Platform.runLater(() -> {
        ButtonType yes = new ButtonType("Yes"); 
        Alert a = new Alert(Alert.AlertType.NONE); 
        a.setTitle("Alert Issue");
        a.getDialogPane().getButtonTypes().add(yes);
        a.setHeaderText("Sorry,internet issue ,please try later");

         //a.setContentText(s);
        DialogPane dialogPane = a.getDialogPane();
        dialogPane.getStylesheets().add(
        getClass().getResource("/css/fullpackstyling.css").toExternalForm());
        dialogPane.getStyleClass().add("infoDialog");

        a.showAndWait();    
        });
        th.stop();
    }


}
        
       
  



 