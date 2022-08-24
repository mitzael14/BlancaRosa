package BlancaRosaApp;

import java.util.Queue;

// created by: Alexis Mitzael Padilla
// This is an app for the Cafetaria La Blanca Rosa 

import java.util.Scanner;

import BlancaRosa.BRProduct;
import BlancaRosa.entrees;
import BlancaRosa.DB.entreeItemsdb;


public class CafetariaApp {

    public static int quantity;

    public static void main(String args[]) {
        //display Welcome Message
        System.out.println("Welcome to La Cafetaria Blanca Rosa");
        System.out.println();

         // Main Course Meal
         System.out.println("--------------------Menu--------------------------");
         System.out.println("-------Drinks-------- |  ------Food/Desserts------");
         System.out.println("1) Regular Coffee     | 7) 3 Chocolate Chip Cookies");
         System.out.println("2) Decaf Coffee       | 8) Concha");
         System.out.println("3) Vanilla Coffee     | 9) Creppa");
         System.out.println("4) Mocha Coffee       | 10) Pizza Rolls");
         System.out.println("5) Oreo Frappe        | 11) Boneless Wings");
         System.out.println("6) Cookie doug frappe | 12) Bone In Wings");
         System.out.println("---------------------------------------------------"); 

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("How can be help you out today?");
            System.out.println();

            // First Item to order
            System.out.print("What would you like to order First?  ");
            String productCode = sc.nextLine();

            //Quanity of first Item
            System.out.print("Enter Quanity: ");
            int quantity = Integer.parseInt(sc.nextLine());

            addMenuItem(productCode, quantity);
    
            // Customer ording a second item
            System.out.print("What else would you like to order?   ");
            productCode = sc.nextLine();

            // Quantity of second item
            System.out.print("Enter quantity: ");
            quantity = Integer.parseInt(sc.nextLine());
            
            addMenuItem(productCode, quantity);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
        System.out.println("Hope you enjoyed your order! Come Again :) ");
    }


    public static void addMenuItem(String productCode, int quantity) {
        // get the Product object
        entrees product = entreeItemsdb.getProduct(productCode);

        // create the LineItem object
        BRProduct LineItem = new BRProduct(product, quantity);

        // display the output
        String message = "\nLINE ITEM\n" +
            "Code:        " + product.getCode() + "\n" +
            "Description: " + product.getDescription() + "\n" +
            "Price:       " + product.getPriceFormatted() + "\n" +
            "Quantity:    " + LineItem.getQuantity() + "\n" +
            "Total:       " + LineItem.getTotalFormatted() + "\n";
        System.out.println(message);
    }
}
