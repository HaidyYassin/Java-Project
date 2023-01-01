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
import javafx.scene.input.MouseEvent;

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
    protected final ImageView BackArrow;
    
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
        BackArrow = new ImageView();
        signUpBtn = new Button();

        setId("APane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(768.0);
        setPrefWidth(1366.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        pane.setId("signinPane");
        pane.setLayoutX(333.0);
        pane.setLayoutY(34.0);
        pane.setPrefHeight(700.0);
        pane.setPrefWidth(700.0);
        pane.setStyle("-fx-background-radius: 10;");
        pane.getStylesheets().add("/resources/cssFiles/CSS.css");

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setId("signintxt");
        text.setLayoutX(268.0);
        text.setLayoutY(105.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setStyle("-fx-font-family: Britannic Bold;");
        text.setText("Sign Up");
        text.setWrappingWidth(339.6630859375);

        nameTFSignUp.setId("emailTF");
        nameTFSignUp.setLayoutX(79.0);
        nameTFSignUp.setLayoutY(163.0);
        nameTFSignUp.setPrefHeight(65.0);
        nameTFSignUp.setPrefWidth(543.0);
        nameTFSignUp.setPromptText("Name");
        nameTFSignUp.setStyle("-fx-background-radius: 22; -fx-text-fill: #FFFFFF;");
        nameTFSignUp.getStylesheets().add("/resources/cssFiles/CSS.css");
        nameTFSignUp.setPadding(new Insets(0.0, 0.0, 0.0, 85.0));
        

        mailTFSignUp.setId("emailTF");
        mailTFSignUp.setLayoutX(79.0);
        mailTFSignUp.setLayoutY(261.0);
        mailTFSignUp.setPrefHeight(65.0);
        mailTFSignUp.setPrefWidth(543.0);
        mailTFSignUp.setPromptText("E-mail");
        mailTFSignUp.setStyle("-fx-background-radius: 22; -fx-text-fill: #FFFFFF;");
        mailTFSignUp.getStylesheets().add("/resources/cssFiles/CSS.css");
        mailTFSignUp.setPadding(new Insets(0.0, 0.0, 0.0, 85.0));

        passTFSignUp.setId("emailTF");
        passTFSignUp.setLayoutX(79.0);
        passTFSignUp.setLayoutY(359.0);
        passTFSignUp.setPrefHeight(65.0);
        passTFSignUp.setPrefWidth(543.0);
        passTFSignUp.setPromptText("Password");
        passTFSignUp.setStyle("-fx-background-radius: 22; -fx-text-fill: #FFFFFF;");
        passTFSignUp.getStylesheets().add("/resources/cssFiles/CSS.css");
        passTFSignUp.setPadding(new Insets(0.0, 0.0, 0.0, 85.0));

        confirmPassTFSignUp.setId("emailTF");
        confirmPassTFSignUp.setLayoutX(79.0);
        confirmPassTFSignUp.setLayoutY(457.0);
        confirmPassTFSignUp.setPrefHeight(65.0);
        confirmPassTFSignUp.setPrefWidth(543.0);
        confirmPassTFSignUp.setPromptText("Confirm Password");
        confirmPassTFSignUp.setStyle("-fx-background-radius: 22; -fx-text-fill: #FFFFFF;");
        confirmPassTFSignUp.getStylesheets().add("/resources/cssFiles/CSS.css");
        confirmPassTFSignUp.setPadding(new Insets(0.0, 0.0, 0.0, 85.0));

        imageView.setFitHeight(59.0);
        imageView.setFitWidth(59.0);
        imageView.setLayoutX(95.0);
        imageView.setLayoutY(166.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/name_icon.png").toExternalForm()));

        imageView0.setFitHeight(50.0);
        imageView0.setFitWidth(50.0);
        imageView0.setLayoutX(100.0);
        imageView0.setLayoutY(269.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/resources/images/mail_icon.png").toExternalForm()));

        imageView1.setFitHeight(57.0);
        imageView1.setFitWidth(62.0);
        imageView1.setLayoutX(97.0);
        imageView1.setLayoutY(363.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/resources/images/Pass_icon.png").toExternalForm()));

        imageView2.setFitHeight(57.0);
        imageView2.setFitWidth(62.0);
        imageView2.setLayoutX(97.0);
        imageView2.setLayoutY(461.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("/resources/images/confirm_pass_icon.png").toExternalForm()));
        
        BackArrow.setFitHeight(50.0);
        BackArrow.setFitWidth(50.0);
        BackArrow.setLayoutX(42.0);
        BackArrow.setLayoutY(43.0);
        BackArrow.setPickOnBounds(true);
        BackArrow.setPreserveRatio(true);
        BackArrow.setImage(new Image(getClass().getResource("/resources/images/backArrow.png").toExternalForm()));
        BackArrow.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                SignInBase signInScreen = new SignInBase(stage);

                Scene scene = new Scene(signInScreen);
                stage.setScene(scene);
                stage.show();
            }
        });

        signUpBtn.setId("logInBtn");
        signUpBtn.setLayoutX(104.0);
        signUpBtn.setLayoutY(573.0);
        signUpBtn.setMnemonicParsing(false);
        signUpBtn.setPrefHeight(65.0);
        signUpBtn.setPrefWidth(493.0);
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
        pane.getChildren().add(BackArrow);
        getChildren().add(pane);

    }
}
