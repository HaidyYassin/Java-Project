package ServerJavaFiles;



import Data_Base.Db_Connect;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public  class ServerFxmlBase extends AnchorPane {

    protected final Pane ServerPane;
    protected final Text text;
    protected final PieChart pieChart;
    protected final ToggleButton toggleButton;
    Db_Connect db;

    public ServerFxmlBase() {
        db=new Db_Connect();
        ServerPane = new Pane();
        text = new Text();
        pieChart = new PieChart();
        toggleButton = new ToggleButton();

        setId("UserPane");
        setPrefHeight(500.0);
        setPrefWidth(800.0);
        getStylesheets().add("/tictactoserver/../Css/CSS.css");

        ServerPane.setLayoutX(60.0);
        ServerPane.setLayoutY(68.0);
        ServerPane.setPrefHeight(333.0);
        ServerPane.setPrefWidth(680.0);
        ServerPane.setStyle("-fx-background-radius: 20; -fx-background-color: #010114;");

        text.setLayoutX(68.0);
        text.setLayoutY(72.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Manal Hamada ");
        text.setWrappingWidth(118.17236328125);

        pieChart.setLayoutX(-1.0);
        pieChart.setLayoutY(-2.0);
        pieChart.setPrefHeight(340.0);
        pieChart.setPrefWidth(680.0);
        pieChart.setStyle("-fx-background-color: white; -fx-background-radius: 18;");
        pieChart.setTitle("Status");
        setPieChart();

        toggleButton.setLayoutX(363.0);
        toggleButton.setLayoutY(415.0);
        toggleButton.setMnemonicParsing(false);
        toggleButton.setPrefHeight(43.0);
        toggleButton.setPrefWidth(109.0);
        toggleButton.setStyle("-fx-background-color: #362875; -fx-text-fill: white; -fx-font-size: 18; -fx-font-family: Britannic Bold; -fx-background-radius: 15;");
        toggleButton.setText("Start");
        setToggleAction();

        ServerPane.getChildren().add(text);
        ServerPane.getChildren().add(pieChart);
        getChildren().add(ServerPane);
        getChildren().add(toggleButton);

    }
      public void setPieChart(){
       ObservableList<PieChart.Data>pieData=FXCollections.observableArrayList(
       new PieChart.Data("Online", 40),new PieChart.Data("Offline", 60) 
       );
       pieChart.setData(pieData);
  
   }
      public void setToggleAction(){
          toggleButton.addEventHandler(EventType.ROOT, new EventHandler<Event>(){
              @Override
              public void handle(Event event) {
                  if (toggleButton.isSelected()){
                      db.setConnection();
                      toggleButton.setText("Stop");
                  }
                  else{
                      toggleButton.setText("Start");
                      db.stopConnection();
                  }
              }
              
          });
          
      }
}
