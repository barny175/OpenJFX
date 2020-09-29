package cz.barny.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author Martin Barnas (martin.barnas@avast.com)
 * @since 20/09/2020.
 */
public class AnchorPaneApp extends Application {
    @Override
    public void start(Stage stage) {
        AnchorPane root = new AnchorPane();

        Label label = new Label("Anchored to left");
        root.getChildren().add(label);
        AnchorPane.setLeftAnchor(label, 10.0);

        Button rightAnchor = new Button("Anchored to right and bottom");
        root.getChildren().add(rightAnchor);
        AnchorPane.setRightAnchor(rightAnchor, 20.0);
        AnchorPane.setBottomAnchor(rightAnchor, 50.0);

        TextField tf = new TextField("Anchored to left and right");
        root.getChildren().add(tf);
        AnchorPane.setLeftAnchor(tf, 20.0);
        AnchorPane.setTopAnchor(tf, 40.0);
        AnchorPane.setRightAnchor(tf, 20.0);

        stage.setScene(new Scene(root));
        stage.setHeight(200);
        stage.setWidth(320);
        stage.show();
    }
}
