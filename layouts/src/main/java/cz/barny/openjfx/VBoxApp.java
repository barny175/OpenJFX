package cz.barny.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class VBoxApp extends Application {

    @Override
    public void start(Stage stage) {

        Label label1 = new Label("VBox");
        TextField textField = new TextField("Layout");
        Label label2 = new Label("puts");
        Button button = new Button("everything");
        TextArea textArea = new TextArea("vertically");
        Label label3 = new Label("...");

        VBox vBox = new VBox(10, label1, textField, label2, button, textArea, label3);

        stage.setScene(new Scene(vBox));
        stage.setWidth(200);
        stage.setHeight(300);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}