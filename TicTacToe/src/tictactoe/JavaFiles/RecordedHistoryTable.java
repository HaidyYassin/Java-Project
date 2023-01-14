package tictactoe.JavaFiles;

import Models.HistoryTableModel;
import Models.RecordsMatchesList;
import static Models.RecordsMatchesList.tableData;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RecordedHistoryTable extends AnchorPane {

    protected final VBox vBox;
    protected final Button deleteAll_btn;
    protected final Text text;
    protected final Button deleteSelected_btn;
    protected final TableView table_view;
    protected final TableColumn colNumId;
    protected final TableColumn colDateId;
    protected final TableColumn colScoreId;
    protected final TableColumn colStatusId;
    protected final TableColumn colContenderId;
    protected final TableColumn colSelectId;
    protected final ImageView BackArrow;

    public RecordedHistoryTable(Stage stage) throws IOException {

        vBox = new VBox();
        deleteAll_btn = new Button();
        text = new Text();
        deleteSelected_btn = new Button();
        table_view = new TableView();
        colNumId = new TableColumn();
        colDateId = new TableColumn();
        colScoreId = new TableColumn();
        colStatusId = new TableColumn();
        colContenderId = new TableColumn();
        colSelectId = new TableColumn();
        BackArrow = new ImageView();
        tableData.clear();
        
        setId("APane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(768.0);
        setPrefWidth(1366.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        colDateId.setCellValueFactory(
                new PropertyValueFactory<>("Date")
        );
        colNumId.setCellValueFactory(
                new PropertyValueFactory<>("GameNumber")
        );
        colScoreId.setCellValueFactory(
                new PropertyValueFactory<>("GameScore")
        );
        colStatusId.setCellValueFactory(
                new PropertyValueFactory<>("GameStatus")
        );
        colContenderId.setCellValueFactory(
                new PropertyValueFactory<>("GameContender")
        );
        colSelectId.setCellValueFactory(
                new PropertyValueFactory<>("CheckBox")
        );
        
        File folder = new File("..\\TicTacToe\\recordedFiles\\local");
        File[] listOfFiles = folder.listFiles();

    for (File file : listOfFiles) {
     if (file.isFile()&&!Files.readAllLines(file.toPath()).get(3).equals(" ")) {
         System.out.println(Files.readAllLines(file.toPath()).get(3));
        tableData.add(new HistoryTableModel(file));
    }
     
    }
    

        table_view.setItems(RecordsMatchesList.tableData);
        vBox.setLayoutX(75.0);
        vBox.setLayoutY(243.0);

        deleteAll_btn.setCache(true);
        deleteAll_btn.setId("but_ClearAll");
        deleteAll_btn.setLayoutX(431.0);
        deleteAll_btn.setLayoutY(673.0);
        deleteAll_btn.setMnemonicParsing(false);
        deleteAll_btn.setPrefHeight(59.0);
        deleteAll_btn.setPrefWidth(210.0);
        deleteAll_btn.getStylesheets().add("/resources/cssFiles/CSS.css");
        deleteAll_btn.setText("Delete All");
        deleteAll_btn.setStyle("-fx-background-color: white; -fx-text-fill: #fb06ff; -fx-background-radius: 22;");
        deleteAll_btn.setOnAction((event) -> {
            Sound.clicksound();
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Delete all recorded matches");
            alert.setHeaderText("Are you Really want to delete all recorded matches?");
            ButtonType buttonTypeDelete = new ButtonType("Delete",ButtonData.YES);
            ButtonType buttonTypeNo = new ButtonType("No",ButtonData.NO);
            ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
            alert.getButtonTypes().setAll(buttonTypeDelete, buttonTypeNo, buttonTypeCancel);
            Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == buttonTypeDelete){
                    for(HistoryTableModel data:RecordsMatchesList.tableData){
                            data.RemoveFile();
                    }         
                     table_view.getItems().clear();
                } else if (result.get() == buttonTypeCancel) {
                    alert.close();
                } else  {
                    alert.close();
                }

        });
        
        BackArrow.setFitHeight(50.0);
        BackArrow.setFitWidth(50.0);
        BackArrow.setLayoutX(363.0);
        BackArrow.setLayoutY(181.0);
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

        text.setFill(javafx.scene.paint.Color.valueOf("#fb06ff"));
        text.setLayoutX(431.0);
        text.setLayoutY(228.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Recorded Matches");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setFont(new Font("System Bold", 54.0));

        deleteSelected_btn.setCache(true);
        deleteSelected_btn.setId("but_ClearAll");
        deleteSelected_btn.setLayoutX(690.0);
        deleteSelected_btn.setLayoutY(673.0);
        deleteSelected_btn.setMnemonicParsing(false);
        deleteSelected_btn.setPrefHeight(59.0);
        deleteSelected_btn.setPrefWidth(210.0);
        deleteSelected_btn.getStylesheets().add("/resources/cssFiles/CSS.css");
        deleteSelected_btn.setText("Delete Selected");
        deleteSelected_btn.setStyle("-fx-background-color: white; -fx-text-fill: #fb06ff; -fx-background-radius: 22;");
        
        deleteSelected_btn.setOnAction((event) -> {
            Sound.clicksound();
           ObservableList<HistoryTableModel> selectedDataToRemoveList =FXCollections.observableArrayList();
           for(HistoryTableModel data:RecordsMatchesList.tableData){
            
                if(data.getCheckBox().isSelected()){
                    selectedDataToRemoveList.add(data);
                    
                }
            }
           if(selectedDataToRemoveList.size()!=0)
           {
                Alert alert = new Alert(AlertType.WARNING);
                 alert.setTitle("Delete selected recorded matches");
                 alert.setHeaderText("Are you Really want to delete selected recorded matches?");
                 ButtonType buttonTypeDelete = new ButtonType("Delete",ButtonData.YES);
                 ButtonType buttonTypeNo = new ButtonType("No",ButtonData.NO);
                 ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
                 alert.getButtonTypes().setAll(buttonTypeDelete, buttonTypeNo, buttonTypeCancel);
                 Optional<ButtonType> result = alert.showAndWait();
                     if (result.get() == buttonTypeDelete){
                           for(HistoryTableModel i:selectedDataToRemoveList)
                               i.RemoveFile();
                           RecordsMatchesList.tableData.removeAll(selectedDataToRemoveList);
                     } else if (result.get() == buttonTypeCancel) {
                         alert.close();
                     } else  {
                         alert.close();
                     }
           
           }
           
            
           
        });

        table_view.setId("table_view");
        table_view.setLayoutX(91.0);
        table_view.setLayoutY(251.0);
        table_view.setOpacity(0.85);
        table_view.setPrefHeight(351.67);
        table_view.setPrefWidth(1180.46);
        table_view.getStylesheets().add("/resources/cssFiles/CSS.css");
        table_view.setOnMouseClicked(
                (event) -> {
                    if (event.getClickCount() > 1) {
                        if (table_view.getSelectionModel().getSelectedItem() != null) {
                            
                            HistoryTableModel selectedPerson = (HistoryTableModel) table_view.getSelectionModel().getSelectedItem();
                            String gc = selectedPerson.getGameContender();
                            String gs = selectedPerson.getGameStatus();
                            String recordSteps=selectedPerson.getGameSteps();
                            RecordedMatchScreenBase rmsb = new RecordedMatchScreenBase(gs, gc,recordSteps,stage);
                            Scene scene = new Scene(rmsb);
                            stage.setScene(scene);
                            stage.show();
                        }
                    }
                }
        );
            
                    
        colDateId.setId("colDateId");
        colDateId.setPrefWidth(226.15);
        colDateId.setResizable(false);
        colDateId.setText("Date");
        
        colNumId.setId("colNumId");
        colNumId.setPrefWidth(160.15);
        colNumId.setResizable(true);
        colNumId.setText("Number");
      

        colScoreId.setId("colScoreId");
        colScoreId.setPrefWidth(150.15);
        colScoreId.setResizable(false);
        colScoreId.setText("Score");

        colStatusId.setId("colStatusId");
        colStatusId.setPrefWidth(150.15);
        colStatusId.setResizable(false);
        colStatusId.setText("Status");

        colContenderId.setId("colContenderId");
        colContenderId.setMaxWidth(320.0);
        colContenderId.setMinWidth(230.0);
        colContenderId.setPrefWidth(276.12);
        colContenderId.setResizable(false);
        colContenderId.setText("Contender");

        colSelectId.setId("colSelectId");
        colSelectId.setMaxWidth(250.0);
        colSelectId.setMinWidth(200.0);
        colSelectId.setPrefWidth(226.15);
        colSelectId.setResizable(false);
        colSelectId.setText("Select");

        getChildren().add(vBox);
        getChildren().add(deleteAll_btn);
        getChildren().add(text);
        getChildren().add(deleteSelected_btn);
        getChildren().add(BackArrow);
       
        table_view.getColumns().add(colNumId);
        table_view.getColumns().add(colDateId);
        table_view.getColumns().add(colScoreId);
        table_view.getColumns().add(colStatusId);
        table_view.getColumns().add(colContenderId);
        table_view.getColumns().add(colSelectId);
        getChildren().add(table_view);

    }
}
