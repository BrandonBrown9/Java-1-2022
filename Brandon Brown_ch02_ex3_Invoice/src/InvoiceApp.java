import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line
        
        // initialize the number of invoices, average amout of invoices, and the average of discount percentages applied
        int invoices = 0;
        double avg = 0;
        double avgDiscounts = 0;
        
        

        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);
        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            //increase amount of invoices
            invoices += 1;

            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // calculate the discount amount and total
            // calculate the average discount applied
            double discountPercent;
            if (subtotal >= 500) {
                discountPercent = .25;
                avgDiscounts = discountPercent + avgDiscounts;
             } else if (subtotal >= 200) {
                discountPercent = .2;
                avgDiscounts = discountPercent + avgDiscounts;
            } else if (subtotal >= 100) {
                discountPercent = .1;
                avgDiscounts = discountPercent + avgDiscounts;
            } else {
                discountPercent = 0.0;
            }
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;
            avg = total / invoices;

            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";            
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
                choice = sc.next();
                System.out.println();

                if (!(choice.equalsIgnoreCase("y"))) {
                    System.out.println("The total number of invoices is " + invoices);
                    System.out.println();
                    System.out.println("The average invoice is " + avg);
                    System.out.println();
                    System.out.println("The average discount is " + avgDiscounts + "%");
                    System.out.println();
            } 
        }
    }
}
