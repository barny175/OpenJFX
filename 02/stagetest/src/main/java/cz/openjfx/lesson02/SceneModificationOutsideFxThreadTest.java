package cz.openjfx.lesson02;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SceneModificationOutsideFxThreadTest extends Application {
    public void start(final Stage primaryStage) throws Exception {

        Button button = new Button("Start thread");
        HBox box = new HBox(button);
        Scene scene = new Scene(box, 540, 200, Color.RED);
        button.setOnAction(ev -> startThread(box));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void startThread(HBox box) {
        new Thread(() -> {
            box.getChildren().add(new Label("added in thread"));
        }).start();
    }
}
