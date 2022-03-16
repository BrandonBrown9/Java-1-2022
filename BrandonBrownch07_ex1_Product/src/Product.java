// Brandon Brown 3/13/22
import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;

    // public Product() {
    //     code = "";
    //     description = "";
    //     price = 0;
    // }

    /* 
    Step 5 - Add a new Contructor that defines 3 parameters 
    and users them to set the values of the 3 instance variables
    */

    public Product(String newCode, String newDescription, double newPrice) {
        code = newCode;
        description = newDescription;
        price = newPrice;
    }

    public void setCode(String newCode) {
        this.code = newCode;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    /* 
    Step 8
    In the Product class, add a method named getPriceNumberFormat that returns
    the price with number formatting (not currency formatting). This method
    should return the number with 2 decimal places but no currency symbol.
    */

    public String getPriceNumberFormat() {
        NumberFormat price = NumberFormat.getInstance();
        price.setGroupingUsed(true);
        price.setMaximumFractionDigits(2);
        price.setMinimumFractionDigits(2);
        return price.format(price);
    }
}