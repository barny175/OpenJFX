package cz.barny.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author Martin Barnas (martin.barnas@avast.com)
 * @since 19/09/2020.
 */
public class HBoxApp extends Application {

    @Override
    public void start(Stage stage) {

        var scene = new Scene(new HBox(10, label("HBox"), label("Layout"), label("puts"), label("everything"), label("horizontally")));
        stage.setScene(scene);
        stage.show();
    }

    private Label label(String text) {
        Label label = new Label(text);
        label.setBorder(new Border(new BorderStroke(Color.ORANGE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderStroke.MEDIUM)));
        return label;
    }

    public static void main(String[] args) {
        launch();
    }
}
