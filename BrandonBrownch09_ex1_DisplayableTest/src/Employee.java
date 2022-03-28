//Brandon Brown 3/27/22
// STEP 6 - Implement the DepartmentConstants & Displayable interfaces
// and uses the DepartmentConstants constants
public class Employee extends Product implements DepartmentConstants, Displayable {

    private int department;
    private String firstName;
    private String lastName;

    // public String getDisplayText() {
    // STEP 11 - 12
    public String toString() {
        // Some code the uses the constants in the DepartmentConstants interface 
        // Include the department name, and the employee's name in the string it returns
        String dept = "Unknown";
        if (department == ADMIN) {
            dept = "Administration";
        } else if (department == EDITORIAL) { 
            dept = "Editorial";
        } else if (department == MARKETING) { 
            dept = "Marketing";
        }
    return firstName + " " + lastName + " (" + dept + ")";
    }
    

    public Employee(int department, String lastName, String firstName) {
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
    }
}