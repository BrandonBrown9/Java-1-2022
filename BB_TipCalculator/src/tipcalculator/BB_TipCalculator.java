// Step 1 : Brandon Brown Start Date - 2/21/22

package tipcalculator;

import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class BB_TipCalculator {

    /*
        Step 2 : Code Block 18 - 33
        Print the title of the application
        Create a scanner object called bbSC
        Declare a choice variable called bbChoice
        Call all methods necessary
    */
    public static void main(String[] args) {
        System.out.println("Tip Calculator\n");
        Scanner bbSC = new Scanner(System.in);
        String bbChoice = "y";

        // Step 3 : Code Block 16 - 22
        while (bbChoice.equalsIgnoreCase("y")) {
            // get user Input
            double bbMealCost = bbValidateMealCost(bbSC, 
                "Enter the cost of the meal: ");
            System.out.println();

            
            // ALL method calls here
            // caclculateTipPercentage(bbMealCost);
            printFormattedResults(tipPercentage, bbFinalMealCost, bbMealCost);
            bbAskToContinue(bbSC);
        }
    }
    
    // ALL methods here

    // Step 5 : Code Block 
        /*
        Step 5 : Code Block 53 - 67
        Get the user input
        Validate and return user input
    */
    public static double bbValidateMealCost(Scanner bbSC, String prompt) {
        double d = 0;
        boolean bbIsValid = false;
        while (bbIsValid == false) {
            System.out.println(prompt);
            if (bbSC.hasNextDouble()) {
                d = bbSC.nextDouble();
                bbIsValid = true;
            } else {
                System.out.println("Error! Invalid number. Please try again.");
            }
            bbSC.nextLine(); 
        }
        return d;
    }
    
    /*
    Calculation tool
    Initializes the tip
    */
    public static double caclculateTipPercentage(double bbMealCost) {
        double tipPercentage = .15;
        int counter = 3;
        for (int i = 0; i < counter; i++) {
            tipPercentage += .5;
            bbFinalMealCost = (tipPercentage * bbMealCost) + bbMealCost;
        }
        return bbFinalMealCost;
        return tipPercentage;
        return bbMealCost;
    }


    public static void printFormattedResults(double tipPercentage, double bbFinalMealCost, double bbMealCost) {
        caclculateTipPercentage(tipPercentage, bbFinalMealCost, bbMealCost);
        NumberFormat bbCurrency = NumberFormat.getCurrencyInstance();
        NumberFormat bbPercentage = NMumberFormat.getPercentInstance();
        bbPercentage.setMinimumFractionDigits(1);

        // format the result as a string
        String results
        = "Cost of the meal:  " + bbMealCost + "\n"
        + bbPercentage.format(tipPercentage) + "\n"
        + "Tip amount:   " + bbCurrency.format(bbMealCost) + "\n"
        + "Total amount: " + bbCurency.format(bbFinalMealCost);
        
        System.out.println(results);
    }


    /*
    Step 4 : Code Block 41 - 45
    Create a method that asks the user to Continue called bbAskToContinue
    */
    public static void bbAskToContinue(Scanner bbSC) {
        System.out.println("Continue? (y/n): ");
        bbChoice = sc.next();
        System.out.println();
    }
}
