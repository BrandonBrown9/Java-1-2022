//BrandonBrown 4/15/22

import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (!choice.equalsIgnoreCase("n")) {
            // get the input from the user
            System.out.print("Enter customer type (t/r/c): ");
            String customerType = sc.next();
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // get the discount percent
            double discountPercent = 0.0;
            
            //-------------- SWITCH STATEMENT -------------- //
             
            // switch(customerType) {
            //
            //     // ------ STEP 4 ------//
            //     // customers with less than $500 subtotal should get a 40% discount
            //     // customers with a subtotal of $500 or more should get a %50 discount
            //     case "t":
            //     case "T":
            //         if (subtotal < 500) {
            //             discountPercent = .4;
            //         } else if (subtotal >= 500) {
            //             discountPercent = .5;
            //         }
            //         break;
            //
            //     // ------ STEP 2 ------//
            //     // customers with less than $100 subtotal should not get a discount
            //     // customers with a subtotal of $100 or more and less than $250 should get a %10 discount
            //     // customers with a subtotal of $250 or more but less than $500 should get a .25 discount
            //     // customers with a subtotal of $500 or more should get a 30% discount     
            //     case "r":
            //     case "R":
            //         if (subtotal < 100) {
            //             discountPercent = 0.0;
            //         } else if (subtotal >= 100 && subtotal < 250) {
            //             discountPercent = .1;
            //         } else if (subtotal >= 250 && subtotal < 500) {
            //             discountPercent = .25;
            //         } else if (subtotal >= 500) {
            //             discountPercent = .3;
            //         }
            //         break;
            //
            //         // ------ STEP 3 ------//
            //         // customers with less than $250 subtotal should get a 20% discount
            //         // customers with a subtotal of $250 or more should get a %30 discount
            //         // customers should have an automatic discount of 20%
            //     case "c":
            //     case "C":
            //         if (subtotal < 250) {
            //             discountPercent = .2;
            //         } else if (subtotal >= 250) {
            //             discountPercent = .2;
            //         }
            //         break;
            //
            //     // ------ STEP 5 ------//
            //     // the default case takes any input outside of "r","R", "c", "C", "t", "T" and applies a 0% discount
            //     default:
            //         discountPercent = 0.0;
            //         break;
            // }
            //-------------- END SWITCH STATEMENT -------------- //

            //-------------- If/Else STATEMENTS -------------- //
            //
            // ------ STEPS 6 and 7 ------//
            if (customerType.equalsIgnoreCase("t")) {
                if (subtotal < 500) {
                    discountPercent = .4;
                    } else if (subtotal >= 500) {
                        discountPercent = .5;
                }
            } else if (!(customerType.equalsIgnoreCase("t"))) { 
                discountPercent = 0.0;
            }

             if (customerType.equalsIgnoreCase("r")) {
                if (subtotal < 100) {
                    discountPercent = 0.0;
                } else if (subtotal >= 100 && subtotal < 250) {
                    discountPercent = .1;
                } else if (subtotal >= 250 && subtotal < 500) {
                    discountPercent = .25;
                } else if (subtotal >= 500) {
                    discountPercent = .3;
                }
             } else if (!(customerType.equalsIgnoreCase("r"))) { 
                discountPercent = 0.0;
            }

             if (customerType.equalsIgnoreCase("c")) {
                if (subtotal < 250) {
                    discountPercent = .2;
                    } else if (subtotal >= 250) {
                        discountPercent = .2;
                }
             } else if (!(customerType.equalsIgnoreCase("c"))) { 
                 discountPercent = 0.0;
             }
            //-------------- END If/Else STATEMENTS -------------- //


            // calculate the discount amount and round to 2 decimals
            double discountAmount = subtotal * discountPercent;
            discountAmount = Math.ceil(discountAmount * 100) / 100;

            // calculate the total
            double total = subtotal - discountAmount;

            // format and display the results
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            System.out.println(
                "Discount percent: " + percent.format(discountPercent) + "\n"
              + "Discount amount:  " + currency.format(discountAmount) + "\n"
              + "Total:            " + currency.format(total) + "\n");
              
              // Prints message to console if user is not type C, R, or T
              if (!(customerType.equalsIgnoreCase("c")) 
              || (customerType.equalsIgnoreCase("r")) 
              || (customerType.equalsIgnoreCase("c"))) { 
                System.out.println("Sorry, no discounts are applied." + "\n");
              }

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
}