//Brandon Brown 3/27/22
import java.text.NumberFormat;

// STEP 5 - Implement the and Displayable interfaces
public class Product implements Displayable {

    private String code;
    private String description;
    private double price;

    // Returns the description of the product
    //public  String getDisplayText() { 
    // STEP 11 - 12
    public String toString() {
        return description;
    }

    public Product() {
        this.code = "";
        this.description = "";
        this.price = 0;
    }

    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
}