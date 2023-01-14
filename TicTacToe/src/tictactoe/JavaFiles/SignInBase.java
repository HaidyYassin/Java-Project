package tictactoe.JavaFiles;

import Models.PlayerData;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.StringTokenizer;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class SignInBase extends Pane {

    StringTokenizer token;
    private Thread thread;
    String email;
    String password ;
    boolean isvalid=false;
    Socket socket;
    DataInputStream dis;
    PrintStream ps;
    
    
    
    protected final Pane pane;
    protected final Text text;
    protected final TextField emailTFSignIn;
    protected final PasswordField passTFSignIn;
    protected final Button signInBtn;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final Text text0;
    protected final Text SignUpText;
    protected final ImageView BackArrow;
    
    public static PlayerData player;
    public static boolean SignedIn;

    public SignInBase(Stage stage) {

        pane = new Pane();
        text = new Text();
        player = new PlayerData();
        emailTFSignIn = new TextField();
        passTFSignIn = new PasswordField();
        signInBtn = new Button();
        imageView = new ImageView();
        imageView0 = new ImageView();
        text0 = new Text();
        SignUpText = new Text();
        BackArrow = new ImageView();
        SignedIn = false;

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
        text.setLayoutX(86.0);
        text.setLayoutY(50.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Sign Up");
        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setId("signintxt");
        text.setLayoutX(268.0);
        text.setLayoutY(105.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setStyle("-fx-font-family: Britannic Bold;");
        text.setText("Sign In");
        text.setWrappingWidth(339.6630859375);

        emailTFSignIn.setId("emailTF");
        emailTFSignIn.setLayoutX(79.0);
        emailTFSignIn.setLayoutY(210.0);
        emailTFSignIn.setPrefHeight(65.0);
        emailTFSignIn.setPrefWidth(543.0);
        emailTFSignIn.setPromptText("E-mail");
        emailTFSignIn.setStyle("-fx-background-radius: 22; -fx-text-fill: #FFFFFF;");
        emailTFSignIn.getStylesheets().add("/resources/cssFiles/CSS.css");
        emailTFSignIn.setPadding(new Insets(0.0, 0.0, 0.0, 85.0));

        passTFSignIn.setId("emailTF");
        passTFSignIn.setLayoutX(79.0);
        passTFSignIn.setLayoutY(325.0);
        passTFSignIn.setPrefHeight(65.0);
        passTFSignIn.setPrefWidth(543.0);
        passTFSignIn.setPromptText("Password");
        passTFSignIn.setStyle("-fx-background-radius: 22; -fx-text-fill: #FFFFFF;");
        passTFSignIn.getStylesheets().add("/resources/cssFiles/CSS.css");
        passTFSignIn.setPadding(new Insets(0.0, 0.0, 0.0, 85.0));
        //passTFSignIn.setSkin();
        
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
                HomeScreenBase homeScreen = new HomeScreenBase(stage);

                Scene scene = new Scene(homeScreen);
                stage.setScene(scene);
                stage.show();
            }
        });

        signInBtn.setId("logInBtn");
        signInBtn.setLayoutX(104.0);
        signInBtn.setLayoutY(484.0);
        signInBtn.setMnemonicParsing(false);
        signInBtn.setPrefHeight(65.0);
        signInBtn.setPrefWidth(493.0);
        signInBtn.setStyle("-fx-background-color: white; -fx-text-fill: #6E3071; -fx-background-radius: 22;");
        signInBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        signInBtn.setText("Sign in");
        signInBtn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {   
                 Sound.clicksound();
                 email = emailTFSignIn.getText().trim();
                 password = passTFSignIn.getText().trim();
               if(email.equals("") || password.equals("")){
                   Alert alert = new Alert(Alert.AlertType.INFORMATION);
                   alert.setHeaderText("Incomplete Data !!");
                   alert.showAndWait();    
               }else{
                         try {
                        socket = new Socket(InetAddress.getLocalHost(),5005);
                         dis = new DataInputStream(socket.getInputStream());
                         ps = new PrintStream(socket.getOutputStream());
                         ps.println("SignIn###"+email+"###"+password);
                    } catch (IOException ex) {
                            ex.printStackTrace();
                    }
                    thread =   new Thread(){
                    String state,playerData;
                    @Override
                    public void run(){
                        try {
                            
                            state = dis.readLine();
                            token = new StringTokenizer(state,"###");
                            String receivedState = token.nextToken();
                            System.out.println("sign in page "+receivedState);
        
                            switch(receivedState){
                                case "Logged in successfully":
                                    playerData = dis.readLine();
                                    System.out.println("player data "+playerData);
                            
                                    StringTokenizer token2 = new StringTokenizer(playerData,"###");
                                    player.setName(token2.nextToken());
                                    player.setEmail(token2.nextToken());
                                    player.setScore(Integer.parseInt(token2.nextToken()));
//                                     System.out.println(player.getPass());
//                                     System.out.println( player.getEmail())   ;
//                                     System.out.println(player.getScore());
                                     Platform.runLater(()->{
                                         SignedIn = true;
                                         signIn(stage);
                                         thread.stop();
                                      
                                      });
                                    break;
                                case "This Email is alreay sign-in":
                                    System.out.println("already sign in before run later");
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                            alert.setHeaderText("This Email is " +receivedState);
                                            alert.showAndWait();
                                        }
                                    });
//                                    Platform.runLater(()->{
//                                       txtAlret.setText(receivedState);
//                                      });                                
                                    break;
                                case "Email is incorrect":
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                            alert.setHeaderText(receivedState);
                                            alert.showAndWait();
                                        }
                                    });
//                                    Platform.runLater(()->{
//                                       txtAlret.setText(receivedState);
//                                      });                                
                                    break;
                                case "Password is incorrect":
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                          Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                            alert.setHeaderText(receivedState);
                                            alert.showAndWait();
                                        }
                                    });
//                                     Platform.runLater(()->{
//                                       txtAlret.setText(receivedState);
//                                      });                                 
                                    break;
                                case "Connection issue, please try again later":
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                            alert.setHeaderText(receivedState);
                                            alert.showAndWait();
                                        }
                                    });
//                                     Platform.runLater(()->{
//                                       txtAlret.setText(receivedState);
//                                      }); 
                                    break;
                                default :
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                            alert.setHeaderText("Please Enter valid Credentials");
                                            alert.showAndWait();
                                        }
                                    });
                            }

                        } catch (IOException ex) {
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
                            System.out.println("111111111");
                        }
                    }
                };   
              thread.start();   
               }
                   
            }
        });
        
        imageView.setFitHeight(50.0);
        imageView.setFitWidth(50.0);
        imageView.setLayoutX(100.0);
        imageView.setLayoutY(220.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/mail_icon.png").toExternalForm()));

        imageView0.setFitHeight(57.0);
        imageView0.setFitWidth(62.0);
        imageView0.setLayoutX(97.0);
        imageView0.setLayoutY(329.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/resources/images/Pass_icon.png").toExternalForm()));

        text0.setFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        text0.setId("donthave");
        text0.setLayoutX(146.0);
        text0.setLayoutY(603.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Don't have account?");
        text0.setWrappingWidth(329.2890625);

        SignUpText.setFill(javafx.scene.paint.Color.valueOf("#1bdaf1"));
        SignUpText.setId("signuptxt");
        SignUpText.setLayoutX(414.0);
        SignUpText.setLayoutY(602.0);
        SignUpText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        SignUpText.setStrokeWidth(0.0);
        SignUpText.setStyle("-fx-text-fill: #1BDAF1; -fx-font-family: Britannic Bold;");
        SignUpText.setText("Sign Up");
        SignUpText.setOnMouseClicked(new EventHandler<MouseEvent>(){
            public void handle(MouseEvent event) {
                Sound.clicksound();
                SignUpBase signUp = new SignUpBase(stage);
                Scene scene = new Scene(signUp);
                stage.setScene(scene);
                stage.show();
            }

            
        });

        pane.getChildren().add(text);
        pane.getChildren().add(emailTFSignIn);
        pane.getChildren().add(passTFSignIn);
        pane.getChildren().add(signInBtn);
        pane.getChildren().add(imageView);
        pane.getChildren().add(imageView0);
        pane.getChildren().add(text0);
        pane.getChildren().add(SignUpText);
        pane.getChildren().add(BackArrow);
        getChildren().add(pane);

    }
    
    
     private void signIn(Stage stage){
            UsersFxml1Base userScreen = new UsersFxml1Base(stage);
            Scene scene = new Scene(userScreen);
            stage.setScene(scene);
            stage.show();
            System.out.println("Emial " + player.getEmail());
            ProfileBase profile = new ProfileBase(stage);
    }
}