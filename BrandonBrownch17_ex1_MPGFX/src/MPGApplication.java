import java.text.NumberFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MPGApplication extends Application {
    public TextField miles;
    public TextField gallons;

    @Override
    public void start(Stage primaryStage) {
        
        // Step 4 - Create grid with labels and text fields.
        // Step 6 - Give grid 25px from the sides. Center the grid. Give 10px between the rows.
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setPadding(new Insets(0, 25, 0, 25));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(new Label("Miles:"), 0,1);
        grid.add(new Label("Gallons:"), 0,2);
        grid.add(new Label("MPG:"), 0,3);

        // Initialize the Text Fields
        TextField miles = new TextField();
        grid.add(miles, 1, 1);
        TextField gallons = new TextField();
        grid.add(gallons, 1, 2);
        TextField mpg = new TextField();
        mpg.setEditable(false); // This field is set to read only.
        grid.add(mpg, 1, 3);

        // Button functionality and properties    
        Button btn = new Button();
        grid.add(btn, 1, 4); // Give the button a fixed position AFTER the labels and fields
        btn.setText("Calculate");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // get the data from the Fields
                String milesInput = miles.getText();
                double milesValue = Double.parseDouble(milesInput);
                String gallonsInput = gallons.getText();
                double gallonsValue = Double.parseDouble(gallonsInput);
        
                // calculate the MPG
                double mpgResult = milesValue / gallonsValue;
                NumberFormat nf= NumberFormat.getInstance();
                nf.setMaximumFractionDigits(2);
                nf.format(mpgResult);
                mpg.setText(Double.toString(mpgResult));
            }
        });

        // Instantiate the scence    
        Scene scene = new Scene(grid, 300, 250);
        primaryStage.setTitle("Miles Per Gallon Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();        
    } // End of MPGApplication

    public static void main(String[] args) {
        launch(args);
    }   
}
