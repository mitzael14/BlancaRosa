package BlancaRosa;

import java.text.NumberFormat;

import BlancaRosa.entrees;

public class BRProduct {

    private entrees product;
    private int quantity;

    public BRProduct() {
        this.product = null;
        this.quantity = 0;
    }

    public BRProduct(entrees product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void setProduct(entrees product) {
        this.product = product;
    }

    public entrees getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        double total = quantity * product.getPrice();
        return total;
    }
    
    public String getTotalFormatted() {
        double total = this.getTotal();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String totalFormatted = currency.format(total);        
        return totalFormatted;
    }
}