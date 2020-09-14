package cz.openjfx.lesson02.preloader;

import javafx.application.Application;
import javafx.application.Preloader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Martin Barnas (martin.barnas@avast.com)
 * @since 13/09/2020.
 */
public class PreloaderTest extends Application {
    @Override
    public void init() throws Exception {
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1_000);
            notifyPreloader(new Preloader.ProgressNotification(i));
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new HBox(new Label("Hello world")));
        primaryStage.setScene(scene);
        primaryStage.setWidth(100);
        primaryStage.setHeight(100);
        primaryStage.show();
    }
}
