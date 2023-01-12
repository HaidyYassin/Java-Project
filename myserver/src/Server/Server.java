package Server;

import Server.javaFiles.ServerFxmlBase;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class Server extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("ServerFxml.fxml"));
        Parent root = new ServerFxmlBase();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
   
    public static void main(String[] args) {
        launch(args);
        
        
    }
    
}
