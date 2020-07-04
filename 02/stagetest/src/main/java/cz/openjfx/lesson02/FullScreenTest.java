package cz.openjfx.lesson02;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FullScreenTest extends Application {
    public void start(final Stage primaryStage) throws Exception {
        Button fullscreenBtn = new Button("Fullscreen");
        fullscreenBtn.setOnAction(ev -> {
            primaryStage.setFullScreen(!primaryStage.isFullScreen());
        });

        Scene scene = new Scene(new Group(fullscreenBtn));
        scene.setFill(Color.PINK);
        primaryStage.setTitle("Stage Test");
        primaryStage.setScene(scene);
        primaryStage.setHeight(200.0);
        primaryStage.setWidth(200.0);
        primaryStage.show();
    }
}
