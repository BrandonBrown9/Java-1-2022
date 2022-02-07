import java.text.NumberFormat;
import java.math.RoundingMode;
import java.math.BigDecimal;
import java.util.Scanner;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            double miles = sc.nextDouble();
            
            System.out.print("Enter gallons of gas used: ");
            double gallons = sc.nextDouble();
            
            double mpg = miles/gallons;
                // Use the Math class for rounding" (2 DECIMAL PLACES)
                    // allows the 2 decimal places after the whole number
                        double roundOff = Math.round(mpg * 100.0) / 100.0;
                        System.out.println("Round - Miles per gallon is " + roundOff + ".");
                        System.out.println(); 

                // Use the NumberFormat class for rounding (3 DECIMAL PLACES)
                    // allows the 3 decimal places after the whole number
                        NumberFormat number = NumberFormat.getNumberInstance();
                        number.setMaximumFractionDigits(3);
                        System.out.println("Format - Miles per gallon is " + number.format(mpg) + ".");
                        System.out.println();
                    // converts the 3 decimal places back to 2
                    // this step is confusing and need feedback
                        double rounding = Math.round(mpg * 100) / 100;
                        System.out.println("Convert from 3 to 2 decimal - Miles per gallon is " + rounding + ".");
                        System.out.println();

                // Use the BigDecimal class for rounding and division
                    // rounding method with BigDecimal and division
                        double newMpg = new BigDecimal(mpg).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        System.out.println("Big Decimal - Miles per gallon is " + newMpg + ".");
                
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }    
}
