//Brandon Brown 3/27/22
public class DisplayableTestApp {

    public static void main(String args[]) {
        System.out.println("\nWelcome to the Displayable Test application\n");

        // STEP 7 & 8 - Modiufy the variable that stores the Employee objectto be displayable type.
        // Pass the code to the display method
        Employee employee = new Employee(DepartmentConstants.EDITORIAL, "Smith", "John");
        display(employee);
    
        // STEP 10 - Display the Product. Pass the code to the display method
        Product product = new Product("java", "Murach's Java Programming", 57.50);
        display(product);
        
        System.out.println();        
    }

    private static void display(Displayable e) {
        System.out.println(e.toString()); 
    }
}