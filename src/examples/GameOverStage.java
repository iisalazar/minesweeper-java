package examples;


import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class GameOverStage {
    private StackPane pane;
    private Scene scene;
    private GraphicsContext gc;
    private Canvas canvas;

    GameOverStage(){
        this.pane = new StackPane();
        this.scene = new Scene(pane, GameStage.WINDOW_WIDTH,GameStage.WINDOW_HEIGHT);
        this.canvas = new Canvas(GameStage.WINDOW_WIDTH, GameStage.WINDOW_HEIGHT);
        this.gc = canvas.getGraphicsContext2D();
        this.setProperties();

    }

    private void setProperties(){
        this.gc.setFill(Color.WHITE);										//set font color of text
        this.gc.fillRect(0,0,GameStage.WINDOW_WIDTH,GameStage.WINDOW_HEIGHT);
        Font theFont = Font.font("Times New Roman",FontWeight.BOLD,30);//set font type, style and size
        this.gc.setFont(theFont);

        this.gc.setFill(Color.RED);										//set font color of text
        this.gc.fillText("Game Over!", GameStage.WINDOW_WIDTH*0.3, GameStage.WINDOW_HEIGHT*0.3);						//add a hello world to location x=60,y=50

        Button exitbtn = new Button("Exit Game");
        this.addEventHandler(exitbtn);


        pane.getChildren().add(this.canvas);
        pane.getChildren().add(exitbtn);
    }

    private void addEventHandler(Button btn) {
        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {

            public void handle(MouseEvent arg0) {
                System.exit(0);
            }
        });

    }

    Scene getScene(){
        return this.scene;
    }
}
