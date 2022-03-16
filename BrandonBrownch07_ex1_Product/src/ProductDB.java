// Brandon Brown 3/13/22
public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
        Product product = new Product("", "", 0);

        // fill the Product object with data
        //product.setCode(productCode);
        if (productCode.equalsIgnoreCase("java")) {
            // product.setDescription("Murach's Java Programming");
            // product.setPrice(57.50);
            product = new Product(productCode, "Murach's Java Programming", 57.50);
        } else if (productCode.equalsIgnoreCase("jsp")) {
            // product.setDescription("Murach's Java Servlets and JSP");
            // product.setPrice(57.50);
            product = new Product(productCode, "Murach's Java Servlets and JSP", 57.50);
        } else if (productCode.equalsIgnoreCase("mysql")) {
            // product.setDescription("Murach's MySQL");
            // product.setPrice(54.50);
            product = new Product(productCode, "Murach's MySQL", 54.50);
        } else if (productCode.equalsIgnoreCase("coding")) { // step 3 - incliude another product
            // product.setDescription("Team Treehouse");
            // product.setPrice(200);
            product = new Product(productCode, "Team Treehouse", 200);
        } else {
            product.setDescription("Unknown");
        }
        return product;
    }
}