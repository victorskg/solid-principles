package main.java.com.github.victorskg.dependency_inversion_principle;

public class ShippingProduct {
    public String product;
    public int quantity;
    public String customerName;
    public String customerAddress;

    public ShippingProduct(String product, int quantity, String customerName, String customerAddress) {
        this.product = product;
        this.quantity = quantity;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }
}
