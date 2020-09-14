package cz.openjfx.lesson02.preloader;

import javafx.application.Preloader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Martin Barnas (martin.barnas@avast.com)
 * @since 13/09/2020.
 */
public class LoadingDialog extends Preloader {

    private Stage primaryStage;
    private Label loadingLabel;

    @Override
    public void handleStateChangeNotification(StateChangeNotification info) {
        if (info.getType() == StateChangeNotification.Type.BEFORE_START) {
            loadingLabel.setText("Application loaded");
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                // nothing to do
            }
            primaryStage.hide();
        }
    }

    @Override
    public void handleApplicationNotification(PreloaderNotification info) {
        if (info instanceof ProgressNotification) {
            ProgressNotification progressInfo = (ProgressNotification) info;
            loadingLabel.setText("Loading... " + progressInfo.getProgress() * 10);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        loadingLabel = new Label("Loading ");
        Scene scene = new Scene(new HBox(10, loadingLabel));
        primaryStage.setScene(scene);
        primaryStage.setWidth(100);
        primaryStage.setHeight(100);
        this.primaryStage = primaryStage;
        this.primaryStage.show();
    }
}
