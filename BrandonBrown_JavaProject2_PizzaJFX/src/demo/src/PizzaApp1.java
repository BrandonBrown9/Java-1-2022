// Brandon Brown 4/25/2022

package demo.src;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.application.Application;




public class PizzaApplication extends Application {

    // Step 1 - GridPane, Scene, TextFields, Labels, and Buttons
    public void start(Stage primaryStage) { 
    GridPane grid = new GridPane();

    // Grid Styles

    // Grid TextFields

    // Grid Labels

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