import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
// import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MPGApplication extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Step 4- Create grid with labels and text fields.
        GridPane grid = new GridPane();
        grid.add(new Label("Miles:"), 0,1);
        grid.add(new Label("Gallons:"), 0,2);
        grid.add(new Label("MPG:"), 0,3);

        TextField miles = new TextField();
        grid.add(miles, 1, 1);
        TextField gallons = new TextField();
        grid.add(gallons, 1, 2);
        TextField mpg = new TextField();
        mpg.setEditable(false); // This field is set to read only.
        grid.add(mpg, 1, 3);

        // Step 6 - Styles for columns
        


        Button btn = new Button();
        btn.setText("Calculate");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Calculate");
            }
        });
        
        grid.getChildren().add(btn);
        
        Scene scene = new Scene(grid, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    } // End of MPGApplication

    public static void main(String[] args) {
        launch(args);
    }
    
}
