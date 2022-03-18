// Brandon Brown
// 3/18/22
public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java")
                || productCode.equalsIgnoreCase("jsp")
                || productCode.equalsIgnoreCase("mysql")) {
            Book b = new Book();
            if (productCode.equalsIgnoreCase("java")) {
                b.setCode(productCode);
                b.setDescription("Murach's Java Programming");
                b.setPrice(57.50);
                b.setAuthor("Joel Murach");
            } else if (productCode.equalsIgnoreCase("jsp")) {
                b.setCode(productCode);
                b.setDescription("Murach's Java Servlets and JSP");
                b.setPrice(57.50);
                b.setAuthor("Mike Urban");
            } else if (productCode.equalsIgnoreCase("mysql")) {
                b.setCode(productCode);
                b.setDescription("Murach's MySQL");
                b.setPrice(54.50);
                b.setAuthor("Joel Murach");
            }
            p = b; // set Product object equal to the Book object
        } else if (productCode.equalsIgnoreCase("netbeans")) {
            Software s = new Software();
            s.setCode("netbeans");
            s.setDescription("NetBeans");
            s.setPrice(0.00);
            s.setVersion("8.2");
            p = s; // set Product object equal to the Software object
        // Step 3 - Create Album object 
        } else if (productCode.equalsIgnoreCase("ITCOTD")) {
            Album a = new Album(); // for each product, a new Album object has to be created unlike the book object
            a.setCode(productCode);
            a.setDescription("In the Court of the Dragon");
            a.setPrice(19.99);
            a.setArtist("Trivium");
            p = a; // set Product object equal to the Album object
        } else if (productCode.equalsIgnoreCase("Sirius")) {
            Album a = new Album();
            a.setCode(productCode);
            a.setDescription("From Mars to Sirus");
            a.setPrice(9.99);
            a.setArtist("Gojira");
            p = a; // set Product object equal to the Album object
        } else if (productCode.equalsIgnoreCase("Ibaraki")){
            Album a = new Album();
            a.setCode(productCode);
            a.setDescription("Rashomon");
            a.setPrice(19.99);
            a.setArtist("Ibaraki");
            p = a; // set Product object equal to the Album object
        }
        return p;
    }
}
