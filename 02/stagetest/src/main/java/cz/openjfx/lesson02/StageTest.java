package cz.openjfx.lesson02;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StageTest extends Application {
    public void start(final Stage primaryStage) throws Exception {
        Button fullscreenBtn = new Button("Fullscreen");
        fullscreenBtn.setOnAction(ev -> primaryStage.setFullScreen(!primaryStage.isFullScreen()));

        ChoiceBox<StageStyle> stageStyleChoice = new ChoiceBox<>(FXCollections.observableArrayList(StageStyle.values()));
        stageStyleChoice.getSelectionModel().select(0);

        Button newWindowBtn = new Button("New Window");
        newWindowBtn.setOnAction(ev -> showNewStage(stageStyleChoice, primaryStage));

        Scene scene = new Scene(new VBox(10,
                                         fullscreenBtn,
                                         new HBox(10, stageStyleChoice, newWindowBtn)));
        primaryStage.setTitle("Stage Test");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showNewStage(ChoiceBox<StageStyle> stageStyleChoice, Stage primaryStage) {
        Stage stage = new Stage(stageStyleChoice.getValue());
        stage.initOwner(primaryStage);
        String text = "New " + stageStyleChoice.getValue() + " window";
        stage.setScene(new Scene(new Label(text)));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(text);
        stage.setHeight(200);
        stage.setWidth(400);
        stage.show();
    }
}
