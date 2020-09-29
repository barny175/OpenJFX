package cz.barny.openjfx;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

/**
 * @author Martin Barnas (martin.barnas@avast.com)
 * @since 20/09/2020.
 */
public class FlowPaneApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane(Orientation.HORIZONTAL);
        root.setHgap(10);
        root.setVgap(5);
        root.getChildren().add(new Label("Hello"));
        root.getChildren().add(new Button("Click me"));
        root.getChildren().add(new TextField());
        root.setPrefWidth(430);
        root.setPrefHeight(Region.USE_COMPUTED_SIZE);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
