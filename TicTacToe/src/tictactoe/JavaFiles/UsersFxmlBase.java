package tictactoe.JavaFiles;

import javafx.geometry.Insets;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UsersFxmlBase extends AnchorPane {

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
    protected final HBox hBox1;
    protected final ImageView imageView1;
    protected final VBox vBox0;
    protected final Text text2;
    protected final HBox hBox2;
    protected final ImageView imageView2;
    protected final Text text3;
    Stage stage;

    public UsersFxmlBase(Stage stage) {

        this.stage = stage;
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
        hBox1 = new HBox();
        imageView1 = new ImageView();
        vBox0 = new VBox();
        text2 = new Text();
        hBox2 = new HBox();
        imageView2 = new ImageView();
        text3 = new Text();

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

        usesListView.setLayoutX(43.0);
        usesListView.setLayoutY(209.0);
        usesListView.setPrefHeight(426.0);
        usesListView.setPrefWidth(815.0);
        usesListView.setStyle("-fx-background-radius: 20;");

        hBox.setLayoutX(76.0);
        hBox.setLayoutY(240.0);
        hBox.setPrefHeight(58.0);
        hBox.setPrefWidth(749.0);

        imageView.setFitHeight(94.0);
        imageView.setFitWidth(88.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/girl.png").toExternalForm()));
        HBox.setMargin(imageView, new Insets(0.0, 20.0, 0.0, 0.0));

        vBox.setPrefHeight(59.0);
        vBox.setPrefWidth(596.0);

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

        hBox1.setLayoutX(76.0);
        hBox1.setLayoutY(328.0);
        hBox1.setPrefHeight(69.0);
        hBox1.setPrefWidth(749.0);

        imageView1.setFitHeight(94.0);
        imageView1.setFitWidth(88.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/resources/images/player2.png").toExternalForm()));
        HBox.setMargin(imageView1, new Insets(0.0, 20.0, 0.0, 0.0));

        vBox0.setPrefHeight(1.0);
        vBox0.setPrefWidth(546.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setStyle("-fx-font-size: 24;");
        text2.setText("Yossif Elbtat");
        text2.setWrappingWidth(185.8544921875);
        VBox.setMargin(text2, new Insets(15.0, 0.0, 0.0, 0.0));

        hBox2.setPrefHeight(23.0);
        hBox2.setPrefWidth(596.0);

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

        ServerPane.getChildren().add(text);
        ServerPane.getChildren().add(BackArrow);
        ServerPane.getChildren().add(usesListView);
        hBox.getChildren().add(imageView);
        vBox.getChildren().add(text0);
        hBox0.getChildren().add(imageView0);
        hBox0.getChildren().add(text1);
        vBox.getChildren().add(hBox0);
        hBox.getChildren().add(vBox);
        ServerPane.getChildren().add(hBox);
        hBox1.getChildren().add(imageView1);
        vBox0.getChildren().add(text2);
        hBox2.getChildren().add(imageView2);
        hBox2.getChildren().add(text3);
        vBox0.getChildren().add(hBox2);
        hBox1.getChildren().add(vBox0);
        ServerPane.getChildren().add(hBox1);
        getChildren().add(ServerPane);

    }
}
