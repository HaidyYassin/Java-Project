package Server.FXMLFiles;

import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class ServerFxmlBase16 extends AnchorPane {

    protected final AnchorPane anchorPane;
    protected final Pane paneLabel;
    protected final Label onlinePlayer;
    protected final ScrollPane scrollPane;
    protected final Pane paneLabel1;
    protected final Label label;
    protected final Label serverIp_txt;
    protected final Pane ServerPane;
    protected final PieChart pieChart;
    protected final Text onlineCountId;
    protected final Text text;
    protected final Text offlineNumberLabel;
    protected final Text offlineCountId1;
    protected final Button button;

    public ServerFxmlBase16() {

        anchorPane = new AnchorPane();
        paneLabel = new Pane();
        onlinePlayer = new Label();
        scrollPane = new ScrollPane();
        paneLabel1 = new Pane();
        label = new Label();
        serverIp_txt = new Label();
        ServerPane = new Pane();
        pieChart = new PieChart();
        onlineCountId = new Text();
        text = new Text();
        offlineNumberLabel = new Text();
        offlineCountId1 = new Text();
        button = new Button();

        setId("ServerPane");
        setPrefHeight(620.0);
        setPrefWidth(1050.0);
        getStylesheets().add("/Server/FXMLFiles/../../resources/css/CSS.css");

        AnchorPane.setBottomAnchor(anchorPane, 0.0);
        AnchorPane.setLeftAnchor(anchorPane, 0.0);
        AnchorPane.setTopAnchor(anchorPane, 0.0);
        anchorPane.setOpacity(0.87);
        anchorPane.setPrefHeight(500.0);
        anchorPane.setPrefWidth(260.0);
        anchorPane.setStyle("-fx-background-color: #003060;");

        paneLabel.setLayoutX(2.0);
        paneLabel.setLayoutY(94.0);
        paneLabel.setPrefHeight(61.0);
        paneLabel.setPrefWidth(301.0);
        paneLabel.setStyle("-fx-background-color: #ECC216; -fx-background-radius: 5;");

        onlinePlayer.setLayoutX(52.0);
        onlinePlayer.setLayoutY(13.0);
        onlinePlayer.setText("Online player ");
        onlinePlayer.setTextFill(javafx.scene.paint.Color.WHITE);
        onlinePlayer.setFont(new Font("System Bold", 24.0));

        scrollPane.setBlendMode(javafx.scene.effect.BlendMode.MULTIPLY);
        scrollPane.setLayoutY(168.0);
        scrollPane.setOpacity(0.64);
        scrollPane.setPrefHeight(451.0);
        scrollPane.setPrefWidth(303.0);
        scrollPane.setStyle("-fx-background-color: #003060; -fx-border-color: #393351;");
        scrollPane.getStylesheets().add("/Server/FXMLFiles/../../../../../mm/Java-Project/Java-Project/TicTacToe/src/resources/cssFiles/CSS.css");

        paneLabel1.setLayoutX(2.0);
        paneLabel1.setLayoutY(14.0);
        paneLabel1.setPrefHeight(61.0);
        paneLabel1.setPrefWidth(301.0);
        paneLabel1.setStyle("-fx-background-color: #ECC216; -fx-background-radius: 5;");

        label.setLayoutX(14.0);
        label.setLayoutY(13.0);
        label.setText("Server ip : ");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font("System Bold", 24.0));

        serverIp_txt.setLayoutX(134.0);
        serverIp_txt.setLayoutY(15.0);
        serverIp_txt.setPrefHeight(35.0);
        serverIp_txt.setPrefWidth(157.0);
        serverIp_txt.setText("192.168.245.1");
        serverIp_txt.setTextFill(javafx.scene.paint.Color.valueOf("#010301"));
        serverIp_txt.setFont(new Font("System Bold Italic", 22.0));

        ServerPane.setId("paneX");
        ServerPane.setLayoutX(334.0);
        ServerPane.setLayoutY(74.0);
        ServerPane.setOpacity(0.86);
        ServerPane.setPrefHeight(470.0);
        ServerPane.setPrefWidth(680.0);
        ServerPane.setStyle("-fx-background-radius: 20;");
        ServerPane.getStylesheets().add("/Server/FXMLFiles/../../../../../mm/Java-Project/Java-Project/TicTacToe/src/resources/cssFiles/CSS.css");

        pieChart.setLayoutX(61.0);
        pieChart.setLayoutY(23.0);
        pieChart.setPrefHeight(379.0);
        pieChart.setPrefWidth(558.0);
        pieChart.setStyle("-fx-background-radius: 15; -fx-border-radius: 15; -fx-background-color: white;");

        onlineCountId.setFill(javafx.scene.paint.Color.valueOf("#fffefe"));
        onlineCountId.setLayoutX(379.0);
        onlineCountId.setLayoutY(423.0);
        onlineCountId.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        onlineCountId.setStrokeWidth(0.0);
        onlineCountId.setStyle("-fx-text-alignment: center;");
        onlineCountId.setWrappingWidth(117.99999140202999);

        text.setFill(javafx.scene.paint.Color.valueOf("#ffe100"));
        text.setLayoutX(148.0);
        text.setLayoutY(424.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setStyle("-fx-font-size: 18;");
        text.setText("Number of online users:");

        offlineNumberLabel.setFill(javafx.scene.paint.Color.valueOf("#ffe100"));
        offlineNumberLabel.setLayoutX(148.0);
        offlineNumberLabel.setLayoutY(451.0);
        offlineNumberLabel.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        offlineNumberLabel.setStrokeWidth(0.0);
        offlineNumberLabel.setStyle("-fx-font-size: 18;");
        offlineNumberLabel.setText("Number of offline users:");

        offlineCountId1.setFill(javafx.scene.paint.Color.valueOf("#fffefe"));
        offlineCountId1.setLayoutX(379.0);
        offlineCountId1.setLayoutY(449.0);
        offlineCountId1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        offlineCountId1.setStrokeWidth(0.0);
        offlineCountId1.setStyle("-fx-text-alignment: center;");
        offlineCountId1.setWrappingWidth(117.99999140202999);

        button.setLayoutX(615.0);
        button.setLayoutY(548.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(50.0);
        button.setPrefWidth(118.0);
        button.setStyle("-fx-background-color: #362875; -fx-text-fill: white; -fx-font-size: 19; -fx-font-family: Britannic Bold; -fx-background-radius: 14;");
        button.setText("ON");

        paneLabel.getChildren().add(onlinePlayer);
        anchorPane.getChildren().add(paneLabel);
        anchorPane.getChildren().add(scrollPane);
        paneLabel1.getChildren().add(label);
        paneLabel1.getChildren().add(serverIp_txt);
        anchorPane.getChildren().add(paneLabel1);
        getChildren().add(anchorPane);
        ServerPane.getChildren().add(pieChart);
        ServerPane.getChildren().add(onlineCountId);
        ServerPane.getChildren().add(text);
        ServerPane.getChildren().add(offlineNumberLabel);
        ServerPane.getChildren().add(offlineCountId1);
        getChildren().add(ServerPane);
        getChildren().add(button);

    }
}
