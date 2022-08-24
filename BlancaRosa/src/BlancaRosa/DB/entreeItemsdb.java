package BlancaRosa.DB;

import BlancaRosa.entrees;

public class entreeItemsdb {

    public static entrees getProduct(String productCode) {
    // In a more realistic application, this code would
    // get the data for the product from a database
     // For now, this code just uses if/else statements
     // to return the correct product data

     // create the Product object
     entrees product = new entrees();

        product.setCode(productCode);
        if (productCode.equalsIgnoreCase("1")) {
            product.setDescription("Regular Coffee");
            product.setPrice(2.50);
        } else if (productCode.equalsIgnoreCase("2")) {
            product.setDescription("Decaf Coffee");
            product.setPrice(2.50);
        } else if (productCode.equalsIgnoreCase("3")) {
            product.setDescription("Vanilla Coffee");
            product.setPrice(3.50);
        } else if (productCode.equalsIgnoreCase("4")) {
            product.setDescription("Mocha Coffee");
            product.setPrice(3.50);
        } else if (productCode.equalsIgnoreCase("5")) {
            product.setDescription("Oreo Frappa");
            product.setPrice(4.50);
        } else if (productCode.equalsIgnoreCase("6")) {
            product.setDescription("Cookie Doug Frappa");
            product.setPrice(4.50);
        } else if (productCode.equalsIgnoreCase("7")) {
            product.setDescription(" 3 Choclate Chip Cookies");
            product.setPrice(1.00);
        } else if (productCode.equalsIgnoreCase("8")) {
            product.setDescription("Concha any Favor ");
            product.setPrice(1.50);
        } else if (productCode.equalsIgnoreCase("9")) {
            product.setDescription("Creppa");
            product.setPrice(3.50);
        } else if (productCode.equalsIgnoreCase("10")) {
            product.setDescription("Pizza Rolls");
            product.setPrice(3.50);
        } else if (productCode.equalsIgnoreCase("11")) {
            product.setDescription("6 Boneless Wings");
            product.setPrice(5.50);
        } else if (productCode.equalsIgnoreCase("12")) {
            product.setDescription("6 Bone-in Wings");
            product.setPrice(5.50);
        }else {
            product.setDescription("Unknown");
        }
        return product;
    }

} 