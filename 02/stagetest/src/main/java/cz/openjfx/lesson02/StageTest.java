package cz.openjfx.lesson02;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StageTest extends Application {
    public void start(final Stage primaryStage) throws Exception {
        ChoiceBox<StageStyle> stageStyleChoice = new ChoiceBox<>(FXCollections.observableArrayList(StageStyle.values()));
        stageStyleChoice.getSelectionModel().select(0);

        ChoiceBox<Modality> modalityChoice = new ChoiceBox<>(FXCollections.observableArrayList(Modality.values()));
        modalityChoice.getSelectionModel().select(0);

        Button newWindowBtn = new Button("New Window");
        newWindowBtn.setOnAction(ev -> showNewStage(stageStyleChoice, primaryStage, modalityChoice.getValue()));

        Scene scene = new Scene(new VBox(10,
                                         new HBox(2, stageStyleChoice, modalityChoice, newWindowBtn)));
        primaryStage.setTitle("Stage Test");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showNewStage(ChoiceBox<StageStyle> stageStyleChoice, Stage primaryStage, Modality modality) {
        Stage stage = new Stage(stageStyleChoice.getValue());
        stage.initOwner(primaryStage);
        String text = stageStyleChoice.getValue() + " window";
        Scene scene = new Scene(new Label(text));
        scene.setFill(Color.ALICEBLUE);
        stage.setScene(scene);
        stage.initModality(modality);
        stage.setTitle(text);
        stage.setHeight(200);
        stage.setWidth(400);
        stage.show();
    }
}
