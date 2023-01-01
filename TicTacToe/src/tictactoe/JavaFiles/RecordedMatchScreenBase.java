package tictactoe.JavaFiles;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import tictactoe.JavaFiles.RecordedMatchScreenBase;

public class RecordedMatchScreenBase extends AnchorPane implements Runnable{

    protected final ImageView imageView;
    protected final Blend blend;
    protected final ImageView imageView0;
    protected final Pane pane;
    protected final Blend blend0;
    protected final Text text;
    protected final ImageView imageView1;
    protected final Text text0;
    protected final Pane pane0;
    protected final Blend blend1;
    protected final Text text1;
    protected final Text text2;
    protected final ImageView imageView2;
    protected final Label label;
    protected final Text text3;
    protected final HBox hBox;
    protected final Text RecoededMovementId_txv;
    protected final Pane pane1;
    protected final Line line;
    protected final Line line0;
    protected final Line line1;
    protected final Line line2;
    protected final Button btn1;
    protected final Button btn2;
    protected final Button btn3;
    protected final Button btn4;
    protected final Button btn5;
    protected final Button btn6;
    protected final Button btn7;
    protected final Button btn8;
    protected final Button btn9;
    protected final Blend blend2;
    protected final ImageView BackArrow;
    
    String s;
    String [] split;
    Thread th ;

    
    
   
    
 
    public RecordedMatchScreenBase(String gameState,String gameContender,String recordedFile,Stage stage) {
    
         //imgO = new Image("/resorces/ooo.png");
        imageView = new ImageView();
        blend = new Blend();
        imageView0 = new ImageView();
        pane = new Pane();
        blend0 = new Blend();
        text = new Text();
        imageView1 = new ImageView();
        text0 = new Text();
        pane0 = new Pane();
        blend1 = new Blend();
        text1 = new Text();
        text2 = new Text();
        imageView2 = new ImageView();
        label = new Label();
        text3 = new Text();
        hBox = new HBox();
        RecoededMovementId_txv = new Text();
        pane1 = new Pane();
        line = new Line();
        line0 = new Line();
        line1 = new Line();
        line2 = new Line();
        btn1 = new Button();
        btn2 = new Button();
        btn3 = new Button();
        btn4 = new Button();
        btn5 = new Button();
        btn6 = new Button();
        btn7 = new Button();
        btn8 = new Button();
        btn9 = new Button();
        blend2 = new Blend();
        BackArrow = new ImageView();

        setId("APane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(768.0);
        setPrefWidth(1366.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        imageView.setFitHeight(150.0);
        imageView.setFitWidth(150.0);
        imageView.setId("player1");
        imageView.setLayoutX(1081.0);
        imageView.setLayoutY(190.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/player1.png").toExternalForm()));

        imageView.setEffect(blend);
        
        BackArrow.setFitHeight(50.0);
        BackArrow.setFitWidth(50.0);
        BackArrow.setLayoutX(443.0);
        BackArrow.setLayoutY(44.0);
        BackArrow.setPickOnBounds(true);
        BackArrow.setPreserveRatio(true);
        BackArrow.setImage(new Image(getClass().getResource("/resources/images/backArrow.png").toExternalForm()));
        BackArrow.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                RecordedHistoryTable RecTableScreen = new RecordedHistoryTable(stage);

                Scene scene = new Scene(RecTableScreen);
                stage.setScene(scene);
                stage.show();
                th.stop();
            }
        });

        imageView0.setFitHeight(130.0);
        imageView0.setFitWidth(100.0);
        imageView0.setId("player2");
        imageView0.setLayoutX(143.0);
        imageView0.setLayoutY(210.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/resources/images/player2.png").toExternalForm()));

        pane.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        pane.setCache(true);
        pane.setId("paneX");
        pane.setLayoutX(1094.0);
        pane.setLayoutY(360.0);
        pane.setOpacity(0.85);
        pane.setPrefHeight(146.99999999999997);
        pane.setPrefWidth(123.02623191958844);
        pane.setStyle("-fx-background-radius: 7;");
        pane.getStylesheets().add("/resources/cssFiles/CSS.css");
        
        blend0.setMode(javafx.scene.effect.BlendMode.MULTIPLY);
        pane.setEffect(blend0);

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(19.0);
        text.setLayoutY(36.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Player1");
        text.setFont(new Font("Arial Bold", 24.0));

        imageView1.setFitHeight(67.0);
        imageView1.setFitWidth(110.0);
        imageView1.setLayoutX(7.0);
        imageView1.setLayoutY(74.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/resources/images/xImage.png").toExternalForm()));

        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setLayoutX(47.0);
        text0.setLayoutY(64.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("You");
        text0.setFont(new Font("Britannic Bold", 18.0));

        pane0.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        pane0.setCache(true);
        pane0.setId("paneX");
        pane0.setLayoutX(132.0);
        pane0.setLayoutY(360.0);
        pane0.setOpacity(0.85);
        pane0.setPrefHeight(146.99999999999997);
        pane0.setPrefWidth(123.02623191958844);
        pane0.setStyle("-fx-background-radius: 7;");
        pane0.getStylesheets().add("/resources/cssFiles/CSS.css");

        pane0.setEffect(blend1);

        text1.setBlendMode(javafx.scene.effect.BlendMode.SCREEN);
        text1.setFill(javafx.scene.paint.Color.WHITE);
        text1.setLayoutX(18.0);
        text1.setLayoutY(29.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Player2");
        text1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1.setWrappingWidth(88.0);
        text1.setFont(new Font("Arial Bold", 24.0));

        text2.setFill(javafx.scene.paint.Color.WHITE);
        text2.setLayoutX(40.0);
        text2.setLayoutY(59.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Omar");
        text2.setFont(new Font("Britannic Bold", 18.0));

        imageView2.setFitHeight(62.0);
        imageView2.setFitWidth(117.0);
        imageView2.setLayoutX(7.0);
        imageView2.setLayoutY(74.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("/resources/images/oImage.png").toExternalForm()));

        label.setLayoutX(413.0);
        label.setLayoutY(441.0);
        label.setPrefHeight(44.0);
        label.setPrefWidth(110.0);
        
        //pane1.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        //pane1.setStyle("-fx-focus-color:transparent;");
        //pane1.setOpacity(0.10);
        pane1.setId("gameBox");
        pane1.setLayoutX(410.0);
        pane1.setLayoutY(127.0);
        pane1.setPrefHeight(462.0);
        pane1.setPrefWidth(548.0);
        pane1.getStylesheets().add("/resources/cssFiles/CSS.css");

        

       btn3.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
       btn3.setStyle("-fx-background-color:#4D0DA5;");
       //btn3.setCache(true);
      // btn3.setDisable(true);
       btn3.setId("gameBoardCell3Id_btn");
       btn3.setLayoutX(409.0);
       btn3.setLayoutY(1.0);
       btn3.setMnemonicParsing(false);
       btn3.setPrefHeight(156.0);
       btn3.setPrefWidth(172.0);
        
        
       btn2.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
       btn2.setStyle("-fx-background-color:#4D0DA5;");
      // btn2.setCache(true);
      // btn2.setDisable(true);
       btn2.setId("gameBoardCell2Id_btn");
       btn2.setLayoutX(205.0);
        btn2.setLayoutY(4.0);
       btn2.setMnemonicParsing(false);
       btn2.setPrefHeight(135.0);
       btn2.setPrefWidth(190.0);
       btn2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
       //btn2.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

       btn4.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
       btn4.setStyle("-fx-background-color:#4D0DA5;");
      // btn4.setCache(true);
      // btn4.setDisable(true);
       btn4.setId("gameBoardCell4Id_btn");
        btn4.setLayoutX(4.0);
        btn4.setLayoutY(158.0);
       btn4.setMnemonicParsing(false);
       btn4.setPrefHeight(156.0);
       btn4.setPrefWidth(164.0);
       btn4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
       btn4.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

       btn7.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
       btn7.setStyle("-fx-background-color:#4D0DA5;");
       //btn7.setCache(true);
       //btn7.setDisable(true);
       btn7.setId("gameBoardCell7Id_btn");
       btn7.setLayoutX(4.0);
       btn7.setLayoutY(312.0);
       btn7.setMnemonicParsing(false);
       btn7.setPrefHeight(141.0);
       btn7.setPrefWidth(155.0);
       //btn7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
      // btn7.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

       //btn5.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
       btn5.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
       btn5.setStyle("-fx-background-color:#4D0DA5;");
       //btn5.setCache(true);
       //btn5.setDisable(true);
       btn5.setId("gameBoardCell5Id_btn");
       btn5.setLayoutX(205.0);
       btn5.setLayoutY(158.0);
       btn5.setMnemonicParsing(false);
       btn5.setPrefHeight(145.0);
       btn5.setPrefWidth(190.0);
       //btn5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
       //btn5.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        
       btn8.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
       btn8.setStyle("-fx-background-color:#4D0DA5;");
       //btn8.setCache(true);
       //btn8.setDisable(true);
       btn8.setId("gameBoardCell8Id_btn");
       btn8.setLayoutX(210.0);
       btn8.setLayoutY(317.0);
       btn8.setMnemonicParsing(false);
       btn8.setLayoutX(205.0);
        btn8.setLayoutY(312.0);
       btn8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
       btn8.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        
       btn9.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
       btn9.setStyle("-fx-background-color:#4D0DA5;");
       //btn9.setCache(true);
       //btn9.setDisable(true);
       btn9.setId("gameBoardCell9Id_btn");
       btn9.setLayoutX(409.0);
        btn9.setLayoutY(312.0);
       btn9.setMnemonicParsing(false);
       btn9.setPrefHeight(141.0);
       btn9.setPrefWidth(172.0);
       btn9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
       btn9.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        
       btn6.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
       btn6.setStyle("-fx-background-color:#4D0DA5;");
       //btn6.setCache(true);
      // btn6.setDisable(true);
       btn6.setId("gameBoardCell6Id_btn");
       btn6.setLayoutX(410.0);
       btn6.setLayoutY(155.0);
       btn6.setMnemonicParsing(false);
       btn6.setPrefHeight(156.0);
       btn6.setPrefWidth(172.0);
        
       btn1.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
       btn1.setStyle("-fx-background-color:#4D0DA5;");
       btn1.setMnemonicParsing(false);
       //btn1.setStyle("-fx-focus-color:transparent;");
       //btn1.setCache(true);
      // btn1.setDisable(true);
       btn1.setId("gameBoardCell1Id_btn");
       btn1.setLayoutX(4.0);
       btn1.setLayoutY(1.0);
       btn1.setMnemonicParsing(false);
       btn1.setPrefHeight(145.0);
       btn1.setPrefWidth(155.0);
       btn1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
       btn1.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));



        text3.setLayoutX(588.0);
        text3.setLayoutY(90.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("You "+gameState);
        text3.setFont(new Font("Britannic Bold", 62.0));
        if(gameState=="Win")
            text3.setFill(javafx.scene.paint.Color.valueOf("#07ee41fa"));
        else if(gameState=="Draw")
        {
            text3.setFill(javafx.scene.paint.Color.valueOf("#FFEE58"));
            text3.setText(gameState);
        }

        else
            text3.setFill(javafx.scene.paint.Color.valueOf("#D32F2F"));    

        hBox.setAlignment(javafx.geometry.Pos.CENTER);
        hBox.setId("RecordedMovementBox");
        hBox.setLayoutX(271.0);
        hBox.setLayoutY(656.0);
        hBox.setMaxWidth(Double.MAX_VALUE);
        hBox.setOpacity(0.84);
        hBox.setPrefHeight(44.0);
        hBox.setStyle("-fx-background-radius: 7;");
        hBox.getStylesheets().add("/resources/cssFiles/CSS.css");

        RecoededMovementId_txv.setFill(javafx.scene.paint.Color.WHITE);
        RecoededMovementId_txv.setId("RecoededMovementId_txv");
        RecoededMovementId_txv.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        RecoededMovementId_txv.setStrokeWidth(0.0);
         RecoededMovementId_txv.setText(recordedFile);
        //RecoededMovementId_txv.setText("1.You: X5 , 2.Omar: O2 , 3.You: X9 , 4.Omar: O1 , 5.You: X3 , 6.Omar: O7 , 7.You: X6 ");
        RecoededMovementId_txv.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        RecoededMovementId_txv.setWrappingWidth(913.6875);
        RecoededMovementId_txv.setFont(new Font("System Bold", 20.0));

        pane1.setId("gameBox");
        pane1.setLayoutX(376.0);
        pane1.setLayoutY(134.0);
        pane1.setPrefHeight(461.0);
        pane1.setPrefWidth(610.0);
        pane1.getStylesheets().add("/resources/cssFiles/CSS.css");

        line.setEndX(352.0);
        line.setEndY(-1.0);
        line.setLayoutX(257.0);
        line.setLayoutY(156.0);
        line.setStartX(-257.0);
        line.setStartY(-1.0);

        line0.setEndX(352.0);
        line0.setEndY(-7.0);
        line0.setLayoutX(258.0);
        line0.setLayoutY(318.0);
        line0.setStartX(-258.0);
        line0.setStartY(-7.0);

        line1.setEndX(325.0);
        line1.setEndY(140.0);
        line1.setLayoutX(82.0);
        line1.setLayoutY(321.0);
        line1.setStartX(325.0);
        line1.setStartY(-321.0);

        line2.setEndX(323.0);
        line2.setEndY(140.0);
        line2.setLayoutX(-119.0);
        line2.setLayoutY(321.0);
        line2.setStartX(323.0);
        line2.setStartY(-320.0);

        

        setEffect(blend2);
        setOpaqueInsets(new Insets(0.0));

        getChildren().add(imageView);
        getChildren().add(imageView0);
        pane.getChildren().add(text);
        pane.getChildren().add(imageView1);
        pane.getChildren().add(text0);
        getChildren().add(pane);
        pane0.getChildren().add(text1);
        pane0.getChildren().add(text2);
        pane0.getChildren().add(imageView2);
        getChildren().add(pane0);
        getChildren().add(label);
        getChildren().add(text3);
        getChildren().add(BackArrow);
        hBox.getChildren().add(RecoededMovementId_txv);
        getChildren().add(hBox);
        
        pane1.getChildren().add(btn1);
        pane1.getChildren().add(btn2);
        pane1.getChildren().add(btn3);
        pane1.getChildren().add(btn4);
        pane1.getChildren().add(btn5);
        pane1.getChildren().add(btn6);
        pane1.getChildren().add(btn7);
        pane1.getChildren().add(btn8);
        pane1.getChildren().add(btn9);
        pane1.getChildren().add(line);
        pane1.getChildren().add(line0);
        pane1.getChildren().add(line1);
        pane1.getChildren().add(line2);
        getChildren().add(pane1);
        
        s=RecoededMovementId_txv.getText().replaceAll("\\s", "");
         split=s.split(",");
        
        th= new Thread(this);
        th.start();
        stage.setOnCloseRequest((event) -> {
           closeThread();
        });

    }
    
    public  void closeThread() {

        try {

            th.stop();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }
    
       
    
    @Override
    public void run(){
         int i=0;
        while(true){
            
            
            if(i==split.length)
            {
                try {
                    
                    clearRecordedMatchCells();
                    Thread.sleep(500);
                    i=0;
                } catch (InterruptedException ex) {
                    Logger.getLogger(RecordedMatchScreenBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                
            else{
                
            try {
                drawRecordedMatch(i);
                Thread.sleep(750);
                i++;
                
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                //Logger.getLogger(RecordedMatchScreenController.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
                
            
        }
    }
    private ImageView drawXIcon(){
        Image imgX ;
        ImageView vimgX;
        imgX = new Image("/resources/images/xImage.png");
        vimgX = new ImageView(imgX);
        //vimgX.pickOnBoundsProperty();
       // vimgX.preserveRatioProperty();
        vimgX.setFitWidth(140);
        vimgX.setFitHeight(130);
        
        return vimgX;
    
    };
    private ImageView drawOIcon(){
         ImageView vimgO;
        vimgO = new ImageView(getClass().getResource("/resources/images/oImage.png").toExternalForm());
        vimgO.setFitWidth(140);
        vimgO.setFitHeight(130);
       // vimgO.pickOnBoundsProperty();
        //vimgO.preserveRatioProperty();
        return vimgO;
    
    };
    private void clearRecordedMatchCells(){
       Platform.runLater(()-> {
                    btn1.setGraphic(null);
                    btn2.setGraphic(null);
                    btn3.setGraphic(null);
                    btn4.setGraphic(null);
                    btn5.setGraphic(null);
                    btn6.setGraphic(null);
                    btn7.setGraphic(null);
                    btn8.setGraphic(null);
                    btn9.setGraphic(null);
                 } );
       
    
    }
    public void drawRecordedMatch(int i){
        
        //System.out.println("From Draw "+ RecoededMovementId_txv.getText());
       // String s=" 1.You: X5 , 2.Omar: O2 , 3.You: X9 , 4.Omar: O1 , 5.You: X3 , 6.Omar: O7 , 7.You: X6 ";
        
            System.out.println(s);
           
           if(split[i].charAt(split[i].length()-2)=='X')
           {
               switch(split[i].charAt(split[i].length()-1))
               {
                   case '1':
                       Platform.runLater(()-> {
                     btn1.setGraphic(drawXIcon());
                 } );
                      
                    break;
                    case '2':
                        Platform.runLater(()-> {
                     btn2.setGraphic(drawXIcon());
                 } );
                    break;
                    case '3':
                        Platform.runLater(()-> {
                     btn3.setGraphic(drawXIcon());
                 } );
                    break;
                    case '4':
                        Platform.runLater(()-> {
                     btn4.setGraphic(drawXIcon());
                 } );
                    break;
                    case '5':
                        Platform.runLater(()-> {
                     btn5.setGraphic(drawXIcon());
                 } );
                    break;
                    case '6':
                        Platform.runLater(()-> {
                     btn6.setGraphic(drawXIcon());
                 } );
                    break;
                    case '7':
                        Platform.runLater(()-> {
                     btn7.setGraphic(drawXIcon());
                 } );
                    break;
                    case '8':
                        Platform.runLater(()-> {
                     btn8.setGraphic(drawXIcon());
                 } );
                    break;
                    case '9':
                        Platform.runLater(()-> {
                     btn9.setGraphic(drawXIcon());
                 } );
                    break;
               
               
               
               }
           }else{
           
               
               switch(split[i].charAt(split[i].length()-1))
               {
                   case '1':
                       Platform.runLater(()-> {
                     btn1.setGraphic(drawOIcon());
                 } );
                      
                    break;
                    case '2':
                        Platform.runLater(()-> {
                     btn2.setGraphic(drawOIcon());
                 } );
                    break;
                    case '3':
                        Platform.runLater(()-> {
                     btn3.setGraphic(drawOIcon());
                 } );
                    break;
                    case '4':
                        Platform.runLater(()-> {
                     btn4.setGraphic(drawOIcon());
                 } );
                    break;
                    case '5':
                        Platform.runLater(()-> {
                     btn5.setGraphic(drawOIcon());
                 } );
                    break;
                    case '6':
                        Platform.runLater(()-> {
                     btn6.setGraphic(drawOIcon());
                 } );
                    break;
                    case '7':
                        Platform.runLater(()-> {
                     btn7.setGraphic(drawOIcon());
                 } );
                    break;
                    case '8':
                        Platform.runLater(()-> {
                     btn8.setGraphic(drawOIcon());
                 } );
                    break;
                    case '9':
                        Platform.runLater(()-> {
                     btn9.setGraphic(drawOIcon());
                 } );
                    break;
               
               
               
               }
           
           }
        }
}
