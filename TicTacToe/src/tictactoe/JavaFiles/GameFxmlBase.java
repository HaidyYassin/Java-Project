package tictactoe.JavaFiles;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameFxmlBase extends AnchorPane {

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
    Stage stage;
    String symbole;
    String level;
    int stepCounter;
    boolean isYourTurn;
    Button[] btnArr = new Button[9];

    public GameFxmlBase(Stage stage, String level, String symbole) {
        this.stage=stage;
        this.level = level;
        this.symbole = symbole;
        stepCounter = 0;
        isYourTurn = true;
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
        pane.setLayoutY(419.0);
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
        text2.setLayoutX(30.0);
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

        pane1.setId("gameBox");
        pane1.setLayoutX(376.0);
        pane1.setLayoutY(136.0);
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
        line1.setLayoutY(321.0);
        line1.setStartX(289.0);
        line1.setStartY(-321.0);

        line2.setEndX(289.0);
        line2.setEndY(141.0);
        line2.setLayoutX(-119.0);
        line2.setLayoutY(321.0);
        line2.setStartX(289.0);
        line2.setStartY(-321.0);

        btn1.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn1.setLayoutX(4.0);
        btn1.setLayoutY(1.0);
        btn1.setMnemonicParsing(false);
        btn1.setPrefHeight(156.0);
        btn1.setPrefWidth(164.0);
        btn1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn1.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn2.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn2.setLayoutX(168.0);
        btn2.setLayoutY(1.0);
        btn2.setMnemonicParsing(false);
        btn2.setPrefHeight(156.0);
        btn2.setPrefWidth(200.0);

        btn3.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn3.setLayoutX(372.0);
        btn3.setLayoutY(1.0);
        btn3.setMnemonicParsing(false);
        btn3.setPrefHeight(156.0);
        btn3.setPrefWidth(172.0);

        btn4.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn4.setLayoutX(4.0);
        btn4.setLayoutY(158.0);
        btn4.setMnemonicParsing(false);
        btn4.setPrefHeight(156.0);
        btn4.setPrefWidth(164.0);
        btn4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn4.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn5.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn5.setLayoutX(174.0);
        btn5.setLayoutY(163.0);
        btn5.setMnemonicParsing(false);
        btn5.setPrefHeight(156.0);
        btn5.setPrefWidth(192.0);
        btn5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn5.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn6.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn6.setLayoutX(375.0);
        btn6.setLayoutY(158.0);
        btn6.setMnemonicParsing(false);
        btn6.setPrefHeight(156.0);
        btn6.setPrefWidth(172.0);

        btn7.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn7.setLayoutX(4.0);
        btn7.setLayoutY(319.0);
        btn7.setMnemonicParsing(false);
        btn7.setPrefHeight(141.0);
        btn7.setPrefWidth(164.0);
        btn7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn7.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn8.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn8.setLayoutX(172.0);
        btn8.setLayoutY(317.0);
        btn8.setMnemonicParsing(false);
        btn8.setPrefHeight(141.0);
        btn8.setPrefWidth(200.0);
        btn8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn8.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

        btn9.setBlendMode(javafx.scene.effect.BlendMode.DARKEN);
        btn9.setLayoutX(375.0);
        btn9.setLayoutY(319.0);
        btn9.setMnemonicParsing(false);
        btn9.setPrefHeight(141.0);
        btn9.setPrefWidth(172.0);
        btn9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn9.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));

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
        pane1.getChildren().add(btn1);
        pane1.getChildren().add(btn2);
        pane1.getChildren().add(btn3);
        pane1.getChildren().add(btn4);
        pane1.getChildren().add(btn5);
        pane1.getChildren().add(btn6);
        pane1.getChildren().add(btn7);
        pane1.getChildren().add(btn8);
        pane1.getChildren().add(btn9);
        getChildren().add(pane1);
        
        
        btnArr[0] = btn1;
        btnArr[1] = btn2;
        btnArr[2] = btn3;
        btnArr[3] = btn4;
        btnArr[4] = btn5;
        btnArr[5] = btn6;
        btnArr[6] = btn7;
        btnArr[7] = btn8;
        btnArr[8] = btn9;

        //handleGame();
    }
    
    public void handleGame()
    {
        
            if(isYourTurn)
                yourTurn();
            else
                computerTurn();
        
    }
    
    public void yourTurn()
    {
        btnDisable(false);
        
        btn1.setOnAction((e) -> {
            btn1.setGraphic(drawXIcon());
            isYourTurn = false;
        });
        btn3.setOnAction((e) -> {
            btn3.setGraphic(drawXIcon());
            isYourTurn = false;
        });
        btn9.setOnAction((e) -> {
            btn9.setGraphic(drawXIcon());
            isYourTurn = false;
        });     
    }
    
    public void computerTurn()
    {
        btnDisable(true);
        if(level.equals("easy"))
        {
            int min = 0;
            int max = 8;
            int rand = (int)(Math.random()*(max - min + 1) + min);
            
            while(!isEnd() && btnArr[rand].getGraphic() != null)
            {
                rand = (int)(Math.random()*(max - min + 1) + min);
            }
            /*if(btnArr[rand].getGraphic() == null)
            {
                btnArr[rand].setGraphic(drawOIcon());
            }
            stepCounter ++;*/
            
            
            isYourTurn = true;
        }
    }
    
    public void btnDisable(boolean disable)
    {
        if(disable == true)
        {
            for(int i = 0; i < 9; i++)
            {
                 btnArr[i].setDisable(disable);
            }
        }
        
        else
        {
            for(int i = 0; i < 9; i++)
            {
                if(btnArr[i].getGraphic() == null)
                    btnArr[i].setDisable(disable);
                else
                    btnArr[i].setDisable(true);
            }
        }
    }
    
    private ImageView drawOIcon(){
        ImageView vimgO;
        vimgO = new ImageView(getClass().getResource("/resources/images/oImage.png").toExternalForm());
        vimgO.setFitWidth(140);
        vimgO.setFitHeight(130);
        vimgO.setBlendMode(javafx.scene.effect.BlendMode.MULTIPLY);
        return vimgO;
    
    };
    private ImageView drawXIcon(){
        Image imgX ;
        ImageView vimgX;
        imgX = new Image("/resources/images/xImage.png");
        vimgX = new ImageView(imgX);
        vimgX.pickOnBoundsProperty();
        vimgX.preserveRatioProperty();
        vimgX.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        vimgX.setFitWidth(140);
        vimgX.setFitHeight(130);
        
        return vimgX;
    
    };
    
    public boolean isEnd()
    {
        if(stepCounter < 8)
            return false;
        return true;
    }
}
