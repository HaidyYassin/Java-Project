/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.JavaFiles;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static javafx.scene.input.KeyCode.I;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import static javax.swing.text.html.HTML.Tag.I;

/**
 *
 * @author Dell
 */
public class UsersList extends HBox{
 
  String name;
  String statusUrl;
  String imgUrl;
  Button inviteBtn;
  HBox listItem;
  VBox vBox;
  ImageView image;
  ImageView image1;
  Stage stage;
  String email;
   private Alert alert;
   public UsersList(Stage stage,String email,String name,String imagUrl){
      super();
      this.name=name;
      this.stage=stage;
      this.email=email;
      this.getChildren().addAll(setHBoxItems(settvBoxItems(name),imagUrl));
  }

  public VBox settvBoxItems(String name ){
      
      HBox vHbox=new HBox();
      vBox=new VBox();
      vBox.setPrefHeight(63.0);
      vBox.setPrefWidth(567.0);
      Text txt1 = new Text();
      Text txt2 = new Text();
      image1= new ImageView();
      
      txt1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
      txt1.setStrokeWidth(0.0);
      txt1.setStyle("-fx-font-size: 24;");
      txt1.setText(name);
      txt1.setWrappingWidth(185.8544921875);
      VBox.setMargin(txt1, new Insets(15.0, 0.0, 0.0, 0.0));
      
        vHbox.setPrefHeight(23.0);
        vHbox.setPrefWidth(592.0);
         
        image1.setFitHeight(19.0);
        image1.setFitWidth(19.0);
        image1.setPickOnBounds(true);
        image1.setPreserveRatio(true);
        image1.setImage(new Image(getClass().getResource("/resources/images/onlineImg.png").toExternalForm()));
        HBox.setMargin(image1, new Insets(0.0, 2.0, 0.0, 0.0));

        txt2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt2.setStrokeWidth(0.0);
        txt2.setStyle("-fx-font-size: 18;");
        txt2.setText("Online");
        
        vHbox.getChildren().addAll(image1);
        vHbox.getChildren().addAll(txt2);
        vBox.getChildren().add(txt1);
        vBox.getChildren().add(vHbox);
        return vBox;

    }

    public HBox setHBoxItems(VBox v,String imagUrl) {
        listItem = new HBox();
        image=new ImageView();
        inviteBtn=new Button();
        listItem.setLayoutX(65.0);
        listItem.setLayoutY(240.0);
        listItem.setPrefHeight(63.0);
        listItem.setPrefWidth(760.0);
        
        image.setFitHeight(94.0);
        image.setFitWidth(88.0);
        image.setPickOnBounds(true);
        image.setPreserveRatio(true);
        image.setImage(new Image(getClass().getResource("/resources/images/girl.png").toExternalForm()));
        HBox.setMargin(image, new Insets(12.0, 20.0, 0.0, 0.0));
        HBox.setMargin(v, new Insets(0.0, 0.0, 0.0, 10.0));
        
        inviteBtn.setMnemonicParsing(false);
        inviteBtn.setPrefHeight(27.0);
        inviteBtn.setPrefWidth(75.0);
        inviteBtn.setStyle("-fx-background-color: #4D0DA5;");
        inviteBtn.setText("Invite");
        HBox.setMargin(inviteBtn, new Insets(30.0, 0.0, 0.0, 0.0));
       
        inviteBtn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                System.out.println(name);
                ConnectWithServer.ps.println("request###"+email+"###"+ConnectWithServer.dataFromServer.get("email")+"###"+ConnectWithServer.dataFromServer.get("name")+"###"+0);
                ButtonType Yes = new ButtonType("Ok"); // can use an Alert, Dialog, or PopupWindow as needed...
                                alert = new Alert(Alert.AlertType.NONE);
                                alert.setTitle("Send Request to play");
                                alert.setHeaderText("Please Wait ");
                                alert.getDialogPane().getButtonTypes().addAll(Yes);
                               
                                DialogPane dialogPane = alert.getDialogPane();
                                dialogPane.getStylesheets().add(
                                getClass().getResource("/css/fullpackstyling.css").toExternalForm());
                                dialogPane.getStyleClass().add("infoDialog");
                                PauseTransition delay = new PauseTransition(Duration.seconds(10));
                                delay.setOnFinished(e -> alert.hide());
                                alert.show();
                                 delay.play();
//                     OnlineGame onlineGame = new OnlineGame(stage,email,name,imgUrl);
//        
//                Scene scene = new Scene(onlineGame);
//                stage.setScene(scene);
//                stage.show();
             }
            
        });

      
        listItem .getChildren().add(image);
        listItem .getChildren().add(v);
        listItem.getChildren().add(inviteBtn);
        
        return listItem;

    }
    
    
    
    
}
