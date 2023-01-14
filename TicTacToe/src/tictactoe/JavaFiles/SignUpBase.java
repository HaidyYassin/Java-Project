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
import javafx.application.Platform;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;

public  class SignUpBase extends Pane {
    
    
    StringTokenizer token;
    private Thread thread;
    String userName;
    String email;
    String password ;
    String Cpassword ;
    boolean isvalid=false;
    Socket socket;
    DataInputStream dis;
    PrintStream ps;
    
    PlayerData playerData = new PlayerData();

    protected final Pane pane;
    protected final Text text;
    protected final TextField nameTFSignUp;
    protected final TextField mailTFSignUp;
    protected final PasswordField passTFSignUp;
    protected final PasswordField confirmPassTFSignUp;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final Button signUpBtn;
    protected final ImageView BackArrow;
    
    public SignUpBase(Stage stage) {

        
        pane = new Pane();
        text = new Text();
        nameTFSignUp = new TextField();
        mailTFSignUp = new TextField();
        passTFSignUp = new PasswordField();
        confirmPassTFSignUp = new PasswordField();
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
                Sound.clicksound();
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
                Sound.clicksound();
                if(checkdata()){
                    try {
                        socket = new Socket(InetAddress.getLocalHost(),5005);
                         dis = new DataInputStream(socket.getInputStream());
                         ps = new PrintStream(socket.getOutputStream());
                         ps.println("SignUp###"+userName+"###"+email+"###"+password);
                    } catch (IOException ex) {
                            ex.printStackTrace();
                    }
                    thread =   new Thread(){
                    String state,playerData;
                    HashMap<String, String> hash = new HashMap<>(); 
                    @Override
                    public void run(){
                        try {
                            
                            state = dis.readLine();
                            token = new StringTokenizer(state,"###");
                            String receivedState = token.nextToken();
                            
                            System.out.println(receivedState);
                            
                            switch(receivedState){
                                case "Registered Successfully":
                                     playerData = dis.readLine();
                                     token = new StringTokenizer(playerData,"###");
                                     hash.put("name", token.nextToken());
                                     hash.put("email",token.nextToken());
                                     hash.put("score", "0");
                                        
                                     Platform.runLater(()->{
                                         signup(stage);
                                       thread.stop();
                                       });
                                     
                                    this.stop();
                                    break;
                                    
                                case "already signed-up":
                                    Platform.runLater(()->{
                                       Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                        alert.setHeaderText("This Email is " +receivedState);
                                        alert.showAndWait();
                                        
                                    });                                
                                    break;
                            }
                            
                        }catch (IOException ex) {
                            Platform.runLater(() -> {
                                try {
                                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                    alert.setHeaderText("There is issue in connection game page will be closed");
                                    alert.showAndWait(); 
                                  
                                    this.stop();
                                    socket.close();
                                    dis.close();
                                    ps.close();
                                } catch (IOException ex1) {
                                    ex1.printStackTrace();
                                }
                            });
                        }
                    }
                };
             thread.start();
                }
            
           }});
               

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
    
    private void signup(Stage stage){
        UsersFxml1Base userScreen = new UsersFxml1Base(stage);
        Scene scene = new Scene(userScreen);
        stage.setScene(scene);
        stage.show();
    }
    
    private boolean checkdata(){
                userName = nameTFSignUp.getText().trim();
                email = mailTFSignUp.getText().trim();
                password = passTFSignUp.getText().trim();
                Cpassword=confirmPassTFSignUp.getText().trim();
                
                if (userName.equals("") ||  email.equals("") || password.equals("")||Cpassword.equals("")){
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText("Incomplete Data !!");
                        alert.showAndWait();     
               }else{
               
                    if(Pattern.matches("^[a-zA-Z][a-zA-Z0-9_]{3,29}$",userName)){        
                      if(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",email)){
                           if(Pattern.matches("[a-zA-Z0-9]{8,20}$",password)){
                             if(Cpassword.equals(password) ){
                                 return true;
                         }else{
                                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                 alert.setHeaderText("Password didn't match!!");
                                 alert.showAndWait();
                               }
                               
                     }else{
                             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                             alert.setHeaderText("choose strong pass!");
                             alert.showAndWait();
                         }      
                     }else{
                             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                             alert.setHeaderText("Invalid mail!");
                             alert.showAndWait();
                         }  
                     }else{
                             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                             alert.setHeaderText("Invalid Name!");
                             alert.showAndWait();
                    }      
                }
      return false;
    }
    
    
}