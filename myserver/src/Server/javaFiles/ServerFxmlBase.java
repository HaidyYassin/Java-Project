package Server.javaFiles;

import java.awt.event.MouseEvent;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ServerFxmlBase extends AnchorPane {

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
    private Thread OnlinePlayerListThread;
    HandelServer server;
    public static boolean isServerOpen =false;
    boolean isPlayerListThread=false;
    int numberOfOnlinePLayer;
    int numberOfOfflinePLayer;
    Scene scene;
    Stage stage;
    public ServerFxmlBase() {
        
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
        
        this.scene=scene;
        server = HandelServer.getServer();
        numberOfOnlinePLayer=0;
        OnlinePlayerListThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true && isServerOpen){
                     Platform.runLater(()->{
                      
                         OnlinePlayerList();
                         setPieChart();
                       
                     });
                   try{
                     Thread.sleep(2000);  

                   }catch(InterruptedException ex){
                     emptyList();
                   }
                }
            }
        });   
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
        ServerPane.getStylesheets().add("/resources/cssFiles/CSS.css");

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
        ServerPane.getChildren().add(offlineCountId1);
        ServerPane.getChildren().add(offlineNumberLabel);
        ServerPane.getChildren().add(text);
        getChildren().add(ServerPane);
        getChildren().add(button);
         

           
        button.setOnAction((event) -> {
            isServerOpen = !isServerOpen;
        if(isServerOpen){
           
            try {
                System.out.println("Server is running...");
                server.StartConnection();
                button.setText("OFF");
                // server.StartConnection();
                  serverIp_txt.setText(Inet4Address.getLocalHost().getHostAddress());
                  System.out.println("Number of offline users: "+server.databaseInstance.getOnlinePlayersCount());
                if(Platform.isFxApplicationThread()){
                    if(!isPlayerListThread){
                         System.out.println("!!Platform.isFxApplicationThread(");
                      OnlinePlayerListThread.start();
                     
                    }else{
                         System.out.println("Platform.isFxApplicationThread(");
                        OnlinePlayerListThread.resume();
                    }
                }
                //setPieChart();
                 
            }catch(SQLException e){
                System.out.println("Connection Issues, Try again later");
               
            }   catch (UnknownHostException ex) {
                    ex.printStackTrace();
                    System.out.println("Connection Issues Unknown host, Try again later");
                    isServerOpen = !isServerOpen;
                }
        }else{ 
            try {

                System.out.println("Server is Closed...");
                button.setText("On");
                serverIp_txt.setText(" ");
                OnlinePlayerListThread.suspend();
                isPlayerListThread = true;
                
            }

            finally{
              server.closeConnection();
                 emptyList();
            }
        }
            
            
        });
        
        //setPieChart();

    }
    private synchronized void OnlinePlayerList(){
        
        System.out.println("HEllo from Online List");
        server.databaseInstance.updateResultSet();
        scrollPane.setContent(null);
        try {
            Button button;
            VBox vbox = new VBox();
            HBox hbox;
            numberOfOnlinePLayer = 0;
            numberOfOfflinePLayer = 0;
            
            while(server.databaseInstance.getResultSet().next()){
                
                if(server.databaseInstance.getResultSet().getString("ISACTIVE").equals(true+"")){
                   
                    
                    ImageView view,view2;
                      
                    view = new ImageView(new Image(this.getClass().getResourceAsStream("/resources/images/player1.png")));
                    view.setFitHeight(30);
                    view.setPreserveRatio(true);

                    view2 = new ImageView(new Image(this.getClass().getResourceAsStream("/resources/images/onlineImg.png")));
                    numberOfOnlinePLayer++;
                   
                    view2.setFitHeight(20);
                    view2.setPreserveRatio(true);

                    button = new Button(""+server.databaseInstance.getResultSet().getString("userName"),view);
                    button.setAlignment(Pos.BOTTOM_LEFT);

                    hbox = new HBox(button,view2);
                    HBox.setMargin(view2, new Insets(10,0,0,5)); 
                  
                    vbox.getChildren().add(hbox);

                    scrollPane.setContent(vbox);
                    System.out.println("HEllo from Online List");
                    
                    
                }
                else if (server.databaseInstance.getResultSet().getString("ISACTIVE").equals(false+"")){
                    numberOfOfflinePLayer++;
                }
            } 
            server.databaseInstance.getResultSet().beforeFirst();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error from Online List");
        }

    }
    
    private void emptyList(){
        scrollPane.setContent(null);
    }
   
    public void setPieChart() {
        
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Online", numberOfOnlinePLayer),
                new PieChart.Data("Offline", numberOfOfflinePLayer));
        //chart = new PieChart(pieChartData);
        pieChart.setData(pieChartData);
        pieChart.setTitle("Status");
        onlineCountId.setText(String.valueOf(numberOfOnlinePLayer));
        offlineCountId1.setText(String.valueOf(numberOfOfflinePLayer));
         Label caption = new Label("");
        caption.setTextFill(Color.DARKORANGE);
        caption.setStyle("-fx-font: 24 arial;");

        for ( PieChart.Data data : pieChart.getData()) {
            data.getNode().addEventHandler(EventType.ROOT, new EventHandler<Event>() {

                @Override
                public void handle(Event e) {
                    caption.setText(String.valueOf(data.getPieValue()) + "%");
                }
  
            });

            //((Group) scene.getRoot()).getChildren().add(chart);
            //stage.setScene(scene);
        //stage.show();
       
    }
    
  
    }
}
