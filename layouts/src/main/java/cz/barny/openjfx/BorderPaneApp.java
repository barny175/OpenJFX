package cz.barny.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @author Martin Barnas (martin.barnas@avast.com)
 * @since 19/09/2020.
 */
public class BorderPaneApp extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane pane = new BorderPane();
        pane.setTop(new MenuBar(new Menu("File"), new Menu("Edit")));
        pane.setCenter(new TextArea("This is text area."));
        pane.setBottom(new Label("This is status bar."));
        Label right = new Label("Right pane");
        right.setRotate(90);
        pane.setRight(right);
        Label left = new Label("Left pane");
        left.setRotate(270);
        pane.setLeft(left);
        stage.setScene(new Scene(pane, 500, 300));
        stage.show();
    }
}
