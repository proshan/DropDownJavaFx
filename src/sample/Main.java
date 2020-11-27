package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage window = primaryStage;
        window.setTitle("DropDown");

        Button button = new Button("Click me");


        ChoiceBox<String> choiceBox = new ChoiceBox<>(); //created empty drop-down
        //need to call getItems() before we add items.

        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Banana");
        choiceBox.getItems().add("Mango");
        choiceBox.getItems().addAll("Bacon", "Meatballs");

        //if we want to have some value already selected
        choiceBox.setValue("Apples");


        VBox layout = new VBox(10);
        layout.getChildren().addAll(choiceBox, button);
        layout.setPadding(new Insets(20, 20, 20, 20));

        Scene scene = new Scene(layout, 250, 250);

        window.setScene(scene);

        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
