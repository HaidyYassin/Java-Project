package tictactoe.JavaFiles;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class RecordedMatchScreenBase extends AnchorPane implements Runnable{

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
    protected final Pane pane1;
    protected final Line line;
    protected final Line line0;
    protected final Line line1;
    protected final Line line2;
    protected final Button gameBoardCell3Id_btn;
    protected final Button gameBoardCell2Id_btn;
    protected final Button gameBoardCell4Id_btn;
    protected final Button gameBoardCell7Id_btn;
    protected final Button gameBoardCell5Id_btn;
    protected final Button gameBoardCell8Id_btn;
    protected final Button gameBoardCell9Id_btn;
    protected final Button gameBoardCell6Id_btn;
    protected final Button gameBoardCell1Id_btn;
    protected final Text RecordedGameState_txv;
    protected final HBox hBox;
    protected final Text RecoededMovementId_txv;
    protected final Blend blend2;
  
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
        pane1 = new Pane();
        line = new Line();
        line0 = new Line();
        line1 = new Line();
        line2 = new Line();
        gameBoardCell3Id_btn = new Button();
        gameBoardCell2Id_btn = new Button();
        gameBoardCell4Id_btn = new Button();
        gameBoardCell7Id_btn = new Button();
        gameBoardCell5Id_btn = new Button();
        gameBoardCell8Id_btn = new Button();
        gameBoardCell9Id_btn = new Button();
        gameBoardCell6Id_btn = new Button();
        gameBoardCell1Id_btn = new Button();
        RecordedGameState_txv = new Text();
        hBox = new HBox();
        RecoededMovementId_txv = new Text();
        blend2 = new Blend();

        setId("APane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(768.0);
        setPrefWidth(1366.0);
        getStylesheets().add("/resources/cssFiles/CSS.css");

        imageView.setFitHeight(156.0);
        imageView.setFitWidth(160.0);
        imageView.setId("player1");
        imageView.setLayoutX(1140.0);
        imageView.setLayoutY(266.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/resources/images/player1.png").toExternalForm()));

        imageView.setEffect(blend);

        imageView0.setFitHeight(131.0);
        imageView0.setFitWidth(101.0);
        imageView0.setId("player2");
        imageView0.setLayoutX(69.0);
        imageView0.setLayoutY(288.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/resources/images/player2.png").toExternalForm()));

        pane.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        pane.setId("paneX");
        pane.setLayoutX(1156.0);
        pane.setLayoutY(413.0);
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
        pane0.setLayoutX(69.0);
        pane0.setLayoutY(419.0);
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
        text2.setText(gameContender);
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
        
        pane1.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        //pane1.setStyle("-fx-focus-color:transparent;");
        //pane1.setOpacity(0.10);
        pane1.setId("gameBox");
        pane1.setLayoutX(410.0);
        pane1.setLayoutY(127.0);
        pane1.setPrefHeight(462.0);
        pane1.setPrefWidth(548.0);
        pane1.getStylesheets().add("/resources/cssFiles/CSS.css");

        line.setEndX(291.0);
        line.setLayoutX(257.0);
        line.setLayoutY(156.0);
        line.setStartX(-257.0);

        line0.setEndX(291.0);
        line0.setLayoutX(258.0);
        line0.setLayoutY(318.0);
        line0.setStartX(-257.0);

        line1.setEndX(289.0);
        line1.setEndY(141.0);
        line1.setLayoutX(82.0);
        line1.setLayoutY(320.0);
        line1.setStartX(289.0);
        line1.setStartY(-321.0);

        line2.setEndX(289.0);
        line2.setEndY(141.0);
        line2.setLayoutX(-119.0);
        line2.setLayoutY(321.0);
        line2.setStartX(289.0);
        line2.setStartY(-321.0);

        gameBoardCell3Id_btn.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        gameBoardCell3Id_btn.setStyle("-fx-background-color:#4D0DA5;");
        gameBoardCell3Id_btn.setCache(true);
        gameBoardCell3Id_btn.setDisable(true);
        gameBoardCell3Id_btn.setId("gameBoardCell3Id_btn");
        gameBoardCell3Id_btn.setLayoutX(372.0);
        gameBoardCell3Id_btn.setLayoutY(1.0);
        gameBoardCell3Id_btn.setMnemonicParsing(false);
        gameBoardCell3Id_btn.setPrefHeight(156.0);
        gameBoardCell3Id_btn.setPrefWidth(172.0);
        ImageView vimgX;
        Image imgg = new Image("/resources/images/xImage.png");
        vimgX = new ImageView(imgg);
        vimgX.setLayoutX(372.0);
        vimgX.setLayoutY(1.0);
        vimgX.setFitWidth(140);
        vimgX.setFitHeight(130);
        
        gameBoardCell2Id_btn.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        gameBoardCell2Id_btn.setStyle("-fx-background-color:#4D0DA5;");
        gameBoardCell2Id_btn.setCache(true);
        gameBoardCell2Id_btn.setDisable(true);
        gameBoardCell2Id_btn.setId("gameBoardCell2Id_btn");
        gameBoardCell2Id_btn.setLayoutX(170.0);
        gameBoardCell2Id_btn.setLayoutY(6.0);
        gameBoardCell2Id_btn.setMnemonicParsing(false);
        gameBoardCell2Id_btn.setPrefHeight(135.0);
        gameBoardCell2Id_btn.setPrefWidth(190.0);
        gameBoardCell2Id_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
       // gameBoardCell2Id_btn.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        gameBoardCell4Id_btn.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        gameBoardCell4Id_btn.setStyle("-fx-background-color:#4D0DA5;");
        gameBoardCell4Id_btn.setCache(true);
        gameBoardCell4Id_btn.setDisable(true);
        gameBoardCell4Id_btn.setId("gameBoardCell4Id_btn");
        gameBoardCell4Id_btn.setLayoutX(4.0);
        gameBoardCell4Id_btn.setLayoutY(158.0);
        gameBoardCell4Id_btn.setMnemonicParsing(false);
        gameBoardCell4Id_btn.setPrefHeight(156.0);
        gameBoardCell4Id_btn.setPrefWidth(164.0);
        gameBoardCell4Id_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameBoardCell4Id_btn.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        gameBoardCell7Id_btn.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        gameBoardCell7Id_btn.setStyle("-fx-background-color:#4D0DA5;");
        gameBoardCell7Id_btn.setCache(true);
        gameBoardCell7Id_btn.setDisable(true);
        gameBoardCell7Id_btn.setId("gameBoardCell7Id_btn");
        gameBoardCell7Id_btn.setLayoutX(4.0);
        gameBoardCell7Id_btn.setLayoutY(319.0);
        gameBoardCell7Id_btn.setMnemonicParsing(false);
        gameBoardCell7Id_btn.setPrefHeight(141.0);
        gameBoardCell7Id_btn.setPrefWidth(155.0);
        gameBoardCell7Id_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameBoardCell7Id_btn.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

       // gameBoardCell5Id_btn.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        gameBoardCell5Id_btn.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        gameBoardCell5Id_btn.setStyle("-fx-background-color:#4D0DA5;");
        gameBoardCell5Id_btn.setCache(true);
        gameBoardCell5Id_btn.setDisable(true);
        gameBoardCell5Id_btn.setId("gameBoardCell5Id_btn");
        gameBoardCell5Id_btn.setLayoutX(174.0);
        gameBoardCell5Id_btn.setLayoutY(163.0);
        gameBoardCell5Id_btn.setMnemonicParsing(false);
        gameBoardCell5Id_btn.setPrefHeight(145.0);
        gameBoardCell5Id_btn.setPrefWidth(190.0);
        gameBoardCell5Id_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameBoardCell5Id_btn.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        
        gameBoardCell8Id_btn.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        gameBoardCell8Id_btn.setStyle("-fx-background-color:#4D0DA5;");
        gameBoardCell8Id_btn.setCache(true);
        gameBoardCell8Id_btn.setDisable(true);
        gameBoardCell8Id_btn.setId("gameBoardCell8Id_btn");
        gameBoardCell8Id_btn.setLayoutX(172.0);
        gameBoardCell8Id_btn.setLayoutY(317.0);
        gameBoardCell8Id_btn.setMnemonicParsing(false);
        gameBoardCell8Id_btn.setPrefHeight(141.0);
        gameBoardCell8Id_btn.setPrefWidth(200.0);
        gameBoardCell8Id_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameBoardCell8Id_btn.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        
        gameBoardCell9Id_btn.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        gameBoardCell9Id_btn.setStyle("-fx-background-color:#4D0DA5;");
        gameBoardCell9Id_btn.setCache(true);
        gameBoardCell9Id_btn.setDisable(true);
        gameBoardCell9Id_btn.setId("gameBoardCell9Id_btn");
        gameBoardCell9Id_btn.setLayoutX(375.0);
        gameBoardCell9Id_btn.setLayoutY(319.0);
        gameBoardCell9Id_btn.setMnemonicParsing(false);
        gameBoardCell9Id_btn.setPrefHeight(141.0);
        gameBoardCell9Id_btn.setPrefWidth(172.0);
        gameBoardCell9Id_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameBoardCell9Id_btn.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        
        gameBoardCell6Id_btn.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        gameBoardCell6Id_btn.setStyle("-fx-background-color:#4D0DA5;");
        gameBoardCell6Id_btn.setCache(true);
        gameBoardCell6Id_btn.setDisable(true);
        gameBoardCell6Id_btn.setId("gameBoardCell6Id_btn");
        gameBoardCell6Id_btn.setLayoutX(375.0);
        gameBoardCell6Id_btn.setLayoutY(158.0);
        gameBoardCell6Id_btn.setMnemonicParsing(false);
        gameBoardCell6Id_btn.setPrefHeight(156.0);
        gameBoardCell6Id_btn.setPrefWidth(172.0);
        
        gameBoardCell1Id_btn.setBlendMode(javafx.scene.effect.BlendMode.SRC_OVER);
        gameBoardCell1Id_btn.setStyle("-fx-background-color:#4D0DA5;");
       // gameBoardCell1Id_btn.setStyle("-fx-focus-color:transparent;");
        gameBoardCell1Id_btn.setCache(true);
        gameBoardCell1Id_btn.setDisable(true);
        gameBoardCell1Id_btn.setId("gameBoardCell1Id_btn");
        gameBoardCell1Id_btn.setLayoutX(4.0);
        gameBoardCell1Id_btn.setLayoutY(1.0);
        gameBoardCell1Id_btn.setMnemonicParsing(false);
        gameBoardCell1Id_btn.setPrefHeight(145.0);
        gameBoardCell1Id_btn.setPrefWidth(155.0);
        gameBoardCell1Id_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameBoardCell1Id_btn.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        
        RecordedGameState_txv.setLayoutX(588.0);
        RecordedGameState_txv.setLayoutY(90.0);
        RecordedGameState_txv.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        RecordedGameState_txv.setStrokeWidth(0.0);
        RecordedGameState_txv.setText("You "+gameState);
        if(gameState=="Win")
        RecordedGameState_txv.setFill(javafx.scene.paint.Color.valueOf("#07ee41fa"));
        else if(gameState=="Draw")
        {
            RecordedGameState_txv.setFill(javafx.scene.paint.Color.valueOf("#1565C0"));
            RecordedGameState_txv.setText(gameState);
        }
        
        else
        RecordedGameState_txv.setFill(javafx.scene.paint.Color.valueOf("#D32F2F"));    
        RecordedGameState_txv.setFont(new Font("Curlz MT", 62.0));

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
        pane1.getChildren().add(line);
        pane1.getChildren().add(line0);
        pane1.getChildren().add(line1);
        pane1.getChildren().add(line2);
        pane1.getChildren().add(gameBoardCell3Id_btn);
        pane1.getChildren().add(gameBoardCell2Id_btn);
        pane1.getChildren().add(gameBoardCell4Id_btn);
        pane1.getChildren().add(gameBoardCell7Id_btn);
        pane1.getChildren().add(gameBoardCell5Id_btn);
        pane1.getChildren().add(gameBoardCell8Id_btn);
        pane1.getChildren().add(gameBoardCell9Id_btn);
        pane1.getChildren().add(gameBoardCell6Id_btn);
        pane1.getChildren().add(gameBoardCell1Id_btn);
        
        
        getChildren().add(pane1);
        
        getChildren().add(RecordedGameState_txv);
        hBox.getChildren().add(RecoededMovementId_txv);
        getChildren().add(hBox);
        
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
        vimgX.pickOnBoundsProperty();
        vimgX.preserveRatioProperty();
        vimgX.setFitWidth(140);
        vimgX.setFitHeight(130);
        
        return vimgX;
    
    };
    private ImageView drawOIcon(){
         ImageView vimgO;
        vimgO = new ImageView(getClass().getResource("/resources/images/oImage.png").toExternalForm());
        vimgO.setFitWidth(140);
        vimgO.setFitHeight(130);
        vimgO.pickOnBoundsProperty();
        vimgO.preserveRatioProperty();
        return vimgO;
    
    };
    private void clearRecordedMatchCells(){
       Platform.runLater(()-> {
                    gameBoardCell1Id_btn.setGraphic(null);
                    gameBoardCell2Id_btn.setGraphic(null);
                    gameBoardCell3Id_btn.setGraphic(null);
                    gameBoardCell4Id_btn.setGraphic(null);
                    gameBoardCell5Id_btn.setGraphic(null);
                    gameBoardCell6Id_btn.setGraphic(null);
                    gameBoardCell7Id_btn.setGraphic(null);
                    gameBoardCell8Id_btn.setGraphic(null);
                    gameBoardCell9Id_btn.setGraphic(null);
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
                     gameBoardCell1Id_btn.setGraphic(drawXIcon());
                 } );
                      
                    break;
                    case '2':
                        Platform.runLater(()-> {
                     gameBoardCell2Id_btn.setGraphic(drawXIcon());
                 } );
                    break;
                    case '3':
                        Platform.runLater(()-> {
                     gameBoardCell3Id_btn.setGraphic(drawXIcon());
                 } );
                    break;
                    case '4':
                        Platform.runLater(()-> {
                     gameBoardCell4Id_btn.setGraphic(drawXIcon());
                 } );
                    break;
                    case '5':
                        Platform.runLater(()-> {
                     gameBoardCell5Id_btn.setGraphic(drawXIcon());
                 } );
                    break;
                    case '6':
                        Platform.runLater(()-> {
                     gameBoardCell6Id_btn.setGraphic(drawXIcon());
                 } );
                    break;
                    case '7':
                        Platform.runLater(()-> {
                     gameBoardCell7Id_btn.setGraphic(drawXIcon());
                 } );
                    break;
                    case '8':
                        Platform.runLater(()-> {
                     gameBoardCell8Id_btn.setGraphic(drawXIcon());
                 } );
                    break;
                    case '9':
                        Platform.runLater(()-> {
                     gameBoardCell9Id_btn.setGraphic(drawXIcon());
                 } );
                    break;
               
               
               
               }
           }else{
           
               
               switch(split[i].charAt(split[i].length()-1))
               {
                   case '1':
                       Platform.runLater(()-> {
                     gameBoardCell1Id_btn.setGraphic(drawOIcon());
                 } );
                      
                    break;
                    case '2':
                        Platform.runLater(()-> {
                     gameBoardCell2Id_btn.setGraphic(drawOIcon());
                 } );
                    break;
                    case '3':
                        Platform.runLater(()-> {
                     gameBoardCell3Id_btn.setGraphic(drawOIcon());
                 } );
                    break;
                    case '4':
                        Platform.runLater(()-> {
                     gameBoardCell4Id_btn.setGraphic(drawOIcon());
                 } );
                    break;
                    case '5':
                        Platform.runLater(()-> {
                     gameBoardCell5Id_btn.setGraphic(drawOIcon());
                 } );
                    break;
                    case '6':
                        Platform.runLater(()-> {
                     gameBoardCell6Id_btn.setGraphic(drawOIcon());
                 } );
                    break;
                    case '7':
                        Platform.runLater(()-> {
                     gameBoardCell7Id_btn.setGraphic(drawOIcon());
                 } );
                    break;
                    case '8':
                        Platform.runLater(()-> {
                     gameBoardCell8Id_btn.setGraphic(drawOIcon());
                 } );
                    break;
                    case '9':
                        Platform.runLater(()-> {
                     gameBoardCell9Id_btn.setGraphic(drawOIcon());
                 } );
                    break;
               
               
               
               }
           
           }
        }
        
        
        
    
    
}
