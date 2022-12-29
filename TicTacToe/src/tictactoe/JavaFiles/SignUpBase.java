package tictactoe.JavaFiles;

import Models.PlayerData;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.regex.Pattern;

public  class SignUpBase extends Pane {

    protected final Pane pane;
    protected final Text text;
    protected final TextField nameTFSignUp;
    protected final TextField mailTFSignUp;
    protected final TextField passTFSignUp;
    protected final TextField confirmPassTFSignUp;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final Button signUpBtn;
    
     PlayerData playerData = new PlayerData();

    public SignUpBase(Stage stage) {

        pane = new Pane();
        text = new Text();
        nameTFSignUp = new TextField();
        mailTFSignUp = new TextField();
        passTFSignUp = new TextField();
        confirmPassTFSignUp = new TextField();
        imageView = new ImageView();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        signUpBtn = new Button();

        setId("backGrd");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        pane.setId("signinPane");
        pane.setLayoutX(169.0);
        pane.setLayoutY(61.0);
        pane.setPrefHeight(279.0);
        pane.setPrefWidth(263.0);
        pane.setStyle("-fx-background-radius: 10;");
        pane.getStylesheets().add("/resources/cssFiles/CSS.css");

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setId("signintxt");
        text.setLayoutX(86.0);
        text.setLayoutY(50.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Sign Up");

        nameTFSignUp.setId("emailTF");
        nameTFSignUp.setLayoutX(44.0);
        nameTFSignUp.setLayoutY(87.0);
        nameTFSignUp.setPrefHeight(23.0);
        nameTFSignUp.setPrefWidth(170.0);
        nameTFSignUp.setPromptText("Name");
        nameTFSignUp.setStyle("-fx-background-radius: 22;");
        nameTFSignUp.getStylesheets().add("/resources/cssFiles/CSS.css");
        nameTFSignUp.setPadding(new Insets(0.0, 0.0, 0.0, 25.0));
        

        mailTFSignUp.setId("emailTF");
        mailTFSignUp.setLayoutX(43.0);
        mailTFSignUp.setLayoutY(117.0);
        mailTFSignUp.setPrefHeight(23.0);
        mailTFSignUp.setPrefWidth(170.0);
        mailTFSignUp.setPromptText("E-mail");
        mailTFSignUp.setStyle("-fx-background-radius: 22;");
        mailTFSignUp.getStylesheets().add("/resources/cssFiles/CSS.css");
        mailTFSignUp.setPadding(new Insets(0.0, 0.0, 0.0, 25.0));

        passTFSignUp.setId("emailTF");
        passTFSignUp.setLayoutX(44.0);
        passTFSignUp.setLayoutY(149.0);
        passTFSignUp.setPrefHeight(23.0);
        passTFSignUp.setPrefWidth(170.0);
        passTFSignUp.setPromptText("Password");
        passTFSignUp.setStyle("-fx-background-radius: 22;");
        passTFSignUp.getStylesheets().add("/resources/cssFiles/CSS.css");
        passTFSignUp.setPadding(new Insets(0.0, 0.0, 0.0, 25.0));

        confirmPassTFSignUp.setId("emailTF");
        confirmPassTFSignUp.setLayoutX(44.0);
        confirmPassTFSignUp.setLayoutY(186.0);
        confirmPassTFSignUp.setPrefHeight(23.0);
        confirmPassTFSignUp.setPrefWidth(170.0);
        confirmPassTFSignUp.setPromptText("Confirm Password");
        confirmPassTFSignUp.setStyle("-fx-background-radius: 22;");
        confirmPassTFSignUp.getStylesheets().add("/resources/cssFiles/CSS.css");
        confirmPassTFSignUp.setPadding(new Insets(0.0, 0.0, 0.0, 25.0));

        imageView.setFitHeight(16.0);
        imageView.setFitWidth(20.0);
        imageView.setLayoutX(48.0);
        imageView.setLayoutY(120.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/mail_icon.png").toExternalForm()));

        imageView0.setFitHeight(16.0);
        imageView0.setFitWidth(16.0);
        imageView0.setLayoutX(50.0);
        imageView0.setLayoutY(89.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/resources/images/name_icon.png").toExternalForm()));

        imageView1.setFitHeight(23.0);
        imageView1.setFitWidth(23.0);
        imageView1.setLayoutX(45.0);
        imageView1.setLayoutY(148.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/resources/images/Pass_icon.png").toExternalForm()));

        imageView2.setFitHeight(16.0);
        imageView2.setFitWidth(16.0);
        imageView2.setLayoutX(50.0);
        imageView2.setLayoutY(190.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("/resources/images/confirm_pass_icon.png").toExternalForm()));

        signUpBtn.setLayoutX(72.0);
        signUpBtn.setLayoutY(225.0);
        signUpBtn.setMnemonicParsing(false);
        signUpBtn.setPrefHeight(23.0);
        signUpBtn.setPrefWidth(112.0);
        signUpBtn.setStyle("-fx-background-color: white; -fx-text-fill: #6E3071; -fx-background-radius: 22;");
        signUpBtn.setText("Sign Up");
        signUpBtn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                if (nameTFSignUp.getText().equals("") ||  
                    mailTFSignUp.getText().equals("") || passTFSignUp.getText().equals("")||
                    confirmPassTFSignUp.getText().equals("") ){
                     
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText("Incomplete Data !!");
                        alert.showAndWait();     
               }else{
                 //check name validation   
                    if(Pattern.matches("^[a-zA-Z][a-zA-Z0-9_]{7,29}$", nameTFSignUp.getText())){
                             playerData.setName(nameTFSignUp.getText());
                     }else{
                             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                             alert.setHeaderText("Invalid Name!");
                             alert.showAndWait();
                         }
                     //chec mail pattern    
                     if(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", 
                             mailTFSignUp.getText())){
                             playerData.setEmail(mailTFSignUp.getText());
                     }else{
                             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                             alert.setHeaderText("Invalid mail!");
                             alert.showAndWait();
                         }
//                     if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",
//                             passTFSignUp.getText())){
//                             playerData.setPass(passTFSignUp.getText());
//                     }else{
//                             Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                             alert.setHeaderText("choose strong pass!");
//                             alert.showAndWait();
//                         }
                         playerData.setPass(passTFSignUp.getText());
                     if(confirmPassTFSignUp.getText() == passTFSignUp.getText()){
                             //second screen 
                     }else{
                             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                             alert.setHeaderText("wrong pass!");
                             alert.showAndWait();
                         }
                }
            
           }});
               
        signUpBtn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {         
                HomeScreenBase homeScreen = new HomeScreenBase(stage);
        
                Scene scene = new Scene(homeScreen);
                stage.setScene(scene);
                stage.show();
            }
        });

        pane.getChildren().add(text);
        pane.getChildren().add(nameTFSignUp);
        pane.getChildren().add(mailTFSignUp);
        pane.getChildren().add(passTFSignUp);
        pane.getChildren().add(confirmPassTFSignUp);
        pane.getChildren().add(imageView);
        pane.getChildren().add(imageView0);
        pane.getChildren().add(imageView1);
        pane.getChildren().add(imageView2);
        pane.getChildren().add(signUpBtn);
        getChildren().add(pane);

    }
}
