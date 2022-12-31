package tictactoe.JavaFiles ;

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

public  class UsersFxmlBase extends AnchorPane {

    protected final Pane ServerPane;
    protected final ListView usesListView;
    protected final HBox Hbox_item;
    protected final ImageView userImg;
    protected final VBox vBoxItem;
    protected final Text userName;
    protected final ImageView useStatus;
    protected final HBox hBox;
    protected final ImageView imageView;
    protected final VBox vBox;
    protected final Text text;
    protected final ImageView imageView0;
    protected final Text text0;

    public UsersFxmlBase(Stage stage) {

        ServerPane = new Pane();
        usesListView = new ListView();
        Hbox_item = new HBox();
        userImg = new ImageView();
        vBoxItem = new VBox();
        userName = new Text();
        useStatus = new ImageView();
        hBox = new HBox();
        imageView = new ImageView();
        vBox = new VBox();
        text = new Text();
        imageView0 = new ImageView();
        text0 = new Text();

        setId("UserPane");
        setPrefHeight(500.0);
        setPrefWidth(800.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        ServerPane.setId("XOpane");
        ServerPane.setLayoutX(59.0);
        ServerPane.setLayoutY(56.0);
        ServerPane.setPrefHeight(362.0);
        ServerPane.setPrefWidth(680.0);
        ServerPane.setStyle("-fx-background-radius: 20;");
        ServerPane.getStylesheets().add("/resources/cssFiles/CSS.css");

        usesListView.setLayoutX(50.0);
        usesListView.setLayoutY(66.0);
        usesListView.setPrefHeight(267.0);
        usesListView.setPrefWidth(581.0);
        usesListView.setStyle("-fx-background-radius: 20;");

        Hbox_item.setLayoutX(63.0);
        Hbox_item.setLayoutY(76.0);
        Hbox_item.setPrefHeight(57.0);
        Hbox_item.setPrefWidth(554.0);

        userImg.setFitHeight(53.0);
        userImg.setFitWidth(74.0);
        userImg.setPickOnBounds(true);
        userImg.setPreserveRatio(true);
        userImg.setImage(new Image(getClass().getResource("/resources/images/girl.png").toExternalForm()));
        HBox.setMargin(userImg, new Insets(0.0, 20.0, 0.0, 0.0));

        vBoxItem.setPrefHeight(53.0);
        vBoxItem.setPrefWidth(130.0);

        userName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        userName.setStrokeWidth(0.0);
        userName.setText("Manal Hamada ");
        userName.setWrappingWidth(118.17236328125);

        useStatus.setFitHeight(21.0);
        useStatus.setFitWidth(16.0);
        useStatus.setPickOnBounds(true);
        useStatus.setPreserveRatio(true);
        VBox.setMargin(useStatus, new Insets(10.0, 0.0, 0.0, 0.0));
        useStatus.setImage(new Image(getClass().getResource("/resources/images/green_Icon.png").toExternalForm()));
        HBox.setMargin(vBoxItem, new Insets(5.0, 0.0, 0.0, 0.0));

        hBox.setLayoutX(60.0);
        hBox.setLayoutY(133.0);
        hBox.setPrefHeight(80.0);
        hBox.setPrefWidth(561.0);

        imageView.setFitHeight(80.0);
        imageView.setFitWidth(72.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/player2.png").toExternalForm()));
        HBox.setMargin(imageView, new Insets(0.0, 20.0, 0.0, 0.0));

        vBox.setPrefHeight(53.0);
        vBox.setPrefWidth(130.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Youssef ");
        text.setWrappingWidth(118.17236328125);
        VBox.setMargin(text, new Insets(0.0));

        imageView0.setFitHeight(21.0);
        imageView0.setFitWidth(16.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        VBox.setMargin(imageView0, new Insets(10.0, 0.0, 0.0, 0.0));
        imageView0.setImage(new Image(getClass().getResource("/resources/images/red_icon.jpg").toExternalForm()));
        HBox.setMargin(vBox, new Insets(5.0, 0.0, 0.0, 0.0));

        text0.setFill(javafx.scene.paint.Color.valueOf("#fffafa"));
        text0.setLayoutX(247.0);
        text0.setLayoutY(42.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setStyle("-fx-font-size: 24; -fx-font-style: Bold;");
        text0.setText("Online users ");
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text0.setWrappingWidth(153.17236328125);

        ServerPane.getChildren().add(usesListView);
        Hbox_item.getChildren().add(userImg);
        vBoxItem.getChildren().add(userName);
        vBoxItem.getChildren().add(useStatus);
        Hbox_item.getChildren().add(vBoxItem);
        ServerPane.getChildren().add(Hbox_item);
        hBox.getChildren().add(imageView);
        vBox.getChildren().add(text);
        vBox.getChildren().add(imageView0);
        hBox.getChildren().add(vBox);
        ServerPane.getChildren().add(hBox);
        ServerPane.getChildren().add(text0);
        getChildren().add(ServerPane);

    }
}
