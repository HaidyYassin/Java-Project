package ServerJavaFiles;

import ServerJavaFiles.ServerFxmlBase;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author dell
 */
public class TicTacToServer extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      Parent root = new  ServerFxmlBase();
      Scene scene = new Scene (root);
      primaryStage.setScene(scene);
      primaryStage.show();
    }

   public Scene setPieChart(){
       ObservableList<PieChart.Data>pieData=FXCollections.observableArrayList(
       new PieChart.Data("Online", 40),new PieChart.Data("Offline", 60) 
       );
       PieChart pChart=new PieChart(pieData);
       Group root=new Group(pChart);
       Scene scene = new Scene (root,600,400);
       return scene;
       
   }
    public static void main(String[] args) {
        launch(args);
    }
    
}
