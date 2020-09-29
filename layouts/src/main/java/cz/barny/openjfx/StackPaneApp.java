package cz.barny.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * @author Martin Barnas (martin.barnas@avast.com)
 * @since 20/09/2020.
 */
public class StackPaneApp extends Application {
    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        Rectangle rectangle = new Rectangle(0, 0, 100, 100);
        rectangle.setFill(Color.ORANGE);
        root.getChildren().add(rectangle);
        root.getChildren().add(new Label("hello"));
        stage.setScene(new Scene(root));
        stage.show();
    }
}
