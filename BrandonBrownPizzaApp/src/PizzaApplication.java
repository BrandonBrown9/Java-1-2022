// Brandon Brown 4/25/2022

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.application.Application;


public class PizzaApplication extends Application {

    // Step 1 - GridPane, Scene, TextFields, Labels, and Buttons
    public void start(Stage primaryStage) { 
    GridPane grid = new GridPane();

    // Grid Styles

    // Grid TextFields
    TextField bbPizzaSize = new TextField();
    grid.add(bbPizzaSize, 2,1);
    TextField bbQty = new TextField();
    grid.add(bbQty, 2,2);
    TextField bbPrice = new TextField();
    grid.add(bbPrice, 1,4);

    // Grid Labels
    grid.add(new Label("Pizza Size"), 0,1);
    grid.add(new Label("Qty"), 0,2);
    grid.add(new Label("Price"),0,3);

    // Grid Buttons

    // Instantiate Scene
    Scene scene = new Scene(grid, 300, 250);
    primaryStage.setTitle("Brandon's Pizza");
    primaryStage.setScene(scene);
    primaryStage.show();
    }

    // Main Method
    public static void main(String[] args) { 
        launch(args);
    }
}