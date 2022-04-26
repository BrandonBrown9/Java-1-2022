// Brandon Brown 4/25/2022

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.text.NumberFormat;

public class PizzaApplication extends Application {
    public static TextField bbPizzaSize;
    public static TextField bbQty;
    public TextField bbPrice;

    // Step 1 - GridPane, Scene, TextFields, Labels, and Buttons
    @Override
    public void start(Stage primaryStage) { 
    GridPane grid = new GridPane();

    // Grid Buttons
    Button bbCalculate = new Button("Calculate");
    bbCalculate.setOnAction(event -> bbCalculateButtonClicked());
    Button bbExit = new Button("Exit");
    bbExit.setOnAction(event -> bbExitButtonClicked());
    
    // Grid Styles
    grid.setPadding(new Insets(25, 25, 25, 20));
    grid.setHgap(10);
    grid.setVgap(10);

    HBox buttonBox = new HBox(10);
    buttonBox.getChildren().add(bbCalculate);
    buttonBox.getChildren().add(bbExit);
    buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
    grid.add(buttonBox, 0, 4, 3, 1);

    // Grid TextFields
    TextField bbPizzaSize = new TextField();
    grid.add(bbPizzaSize, 2,1);
    TextField bbQty = new TextField();
    grid.add(bbQty, 2,2);
    TextField bbPrice = new TextField();
    bbPrice.setEditable(false);
    bbPrice.setAlignment(Pos.BOTTOM_LEFT);
    grid.add(bbPrice, 0,4);

    // Grid Labels
    grid.add(new Label("Pizza Size"), 0,1);
    grid.add(new Label("Qty"), 0,2);
    grid.add(new Label("Price"),0,3);

    // Instantiate Scene
    Scene scene = new Scene(grid, 450, 200);
    primaryStage.setTitle("Brandon's Pizza");
    primaryStage.setScene(scene);
    primaryStage.show();
    }

    // Calculate button method
    private void bbCalculateButtonClicked() {
        String[] bbPSizes = {
            "personal", "medium", "large", "extra large"
        };
    
        double[] bbPPrices = {
            4.29, 8.49, 10.49, 15.49 
        };
    
        String bbSizeInput = bbPizzaSize.getText();
        String bbQtyInput = bbQty.getText();
        double bbQtyValue = Double.parseDouble(bbQtyInput);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Validation for fields (Pages 555 ,557, 561)
    
        if ( bbSizeInput.equalsIgnoreCase(bbPSizes[0])) {
            double bbFinalPrice = bbQtyValue * bbPPrices[0];
            nf.format(bbFinalPrice);
            bbPrice.setText(Double.toString(bbFinalPrice));
    
        } else if (bbSizeInput.equalsIgnoreCase(bbPSizes[1])) {
            double bbFinalPrice = bbQtyValue * bbPPrices[1];
            nf.format(bbFinalPrice);
            bbPrice.setText(Double.toString(bbFinalPrice));
    
        } else if (bbSizeInput.equalsIgnoreCase(bbPSizes[2])) {
            double bbFinalPrice = bbQtyValue * bbPPrices[2];
            nf.format(bbFinalPrice);
            bbPrice.setText(Double.toString(bbFinalPrice));
    
        } else if (bbSizeInput.equalsIgnoreCase(bbPSizes[3])) {
            double bbFinalPrice = bbQtyValue * bbPPrices[3];
            nf.format(bbFinalPrice);
            bbPrice.setText(Double.toString(bbFinalPrice));
        }  
    }

    // Exit button method
    private void bbExitButtonClicked() {
        System.exit(0);
    }

    // Main Method
    public static void main(String[] args) { 
        launch(args);
    }
}