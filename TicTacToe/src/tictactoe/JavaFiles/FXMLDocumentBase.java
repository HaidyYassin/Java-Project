package tictactoe.JavaFiles;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class FXMLDocumentBase extends Pane {

    protected final Pane pane;
    protected final Text text;
    protected final TextField emailTFSignIn;
    protected final TextField passTFSignIn;
    protected final Button signInBtn;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final Text text0;
    protected final Text SignUpText;

    public FXMLDocumentBase(Stage stage) {

        pane = new Pane();
        text = new Text();
        emailTFSignIn = new TextField();
        passTFSignIn = new TextField();
        signInBtn = new Button();
        imageView = new ImageView();
        imageView0 = new ImageView();
        text0 = new Text();
        SignUpText = new Text();

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
        text.setStyle("-fx-font-family: Britannic Bold;");
        text.setText("Sign In");
        text.setWrappingWidth(90.6630859375);

        emailTFSignIn.setId("emailTF");
        emailTFSignIn.setLayoutX(42.0);
        emailTFSignIn.setLayoutY(90.0);
        emailTFSignIn.setPrefHeight(23.0);
        emailTFSignIn.setPrefWidth(178.0);
        emailTFSignIn.setPromptText("E-mail");
        emailTFSignIn.setStyle("-fx-background-radius: 22;");
        emailTFSignIn.getStylesheets().add("/resources/cssFiles/CSS.css");
        emailTFSignIn.setPadding(new Insets(0.0, 0.0, 0.0, 25.0));

        passTFSignIn.setId("emailTF");
        passTFSignIn.setLayoutX(43.0);
        passTFSignIn.setLayoutY(128.0);
        passTFSignIn.setPrefHeight(23.0);
        passTFSignIn.setPrefWidth(178.0);
        passTFSignIn.setPromptText("Password");
        passTFSignIn.setStyle("-fx-background-radius: 22;");
        passTFSignIn.getStylesheets().add("/resources/cssFiles/CSS.css");
        passTFSignIn.setPadding(new Insets(0.0, 0.0, 0.0, 25.0));

        signInBtn.setId("logInBtn");
        signInBtn.setLayoutX(66.0);
        signInBtn.setLayoutY(180.0);
        signInBtn.setMnemonicParsing(false);
        signInBtn.setPrefHeight(23.0);
        signInBtn.setPrefWidth(131.0);
        signInBtn.setStyle("-fx-background-color: white; -fx-text-fill: #6E3071; -fx-background-radius: 22;");
        signInBtn.getStylesheets().add("/resources/cssFiles/CSS.css");
        signInBtn.setText("Sign in");
        
        
       

        imageView.setFitHeight(16.0);
        imageView.setFitWidth(19.0);
        imageView.setLayoutX(48.0);
        imageView.setLayoutY(94.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/mail_icon.png").toExternalForm()));

        imageView0.setFitHeight(23.0);
        imageView0.setFitWidth(19.0);
        imageView0.setLayoutX(46.0);
        imageView0.setLayoutY(130.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/resources/images/Pass_icon.png").toExternalForm()));

        text0.setFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        text0.setId("donthave");
        text0.setLayoutX(65.0);
        text0.setLayoutY(225.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Don't have account?");
        text0.setWrappingWidth(105.2890625);

        SignUpText.setFill(javafx.scene.paint.Color.valueOf("#1bdaf1"));
        SignUpText.setId("signuptxt");
        SignUpText.setLayoutX(154.0);
        SignUpText.setLayoutY(226.0);
        SignUpText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        SignUpText.setStrokeWidth(0.0);
        SignUpText.setStyle("-fx-text-fill: #1BDAF1; -fx-font-family: Britannic Bold;");
        SignUpText.setText("Sign Up");
        SignUpText.setOnMouseClicked(new EventHandler<MouseEvent>(){
            public void handle(MouseEvent event) {
               // Stage stage = new Stage();
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
        getChildren().add(pane);

    }
}
