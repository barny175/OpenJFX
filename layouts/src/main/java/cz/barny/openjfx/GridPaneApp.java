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
public class GridPaneApp extends Application {

    @Override
    public void start(Stage stage) {

        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(20);
        pane.add( label("GridPane"), 0, 0);
        pane.add(label("Layout"), 0, 1);
        pane.add(label("puts"), 1, 0);
        pane.add(label("everything"), 1, 1);
        pane.add(label("into"), 2, 0);
        pane.add(label("grid"), 2, 1);
        var scene = new Scene(pane);
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
