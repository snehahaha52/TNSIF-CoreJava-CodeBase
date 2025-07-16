package entities;

public class ProductQuantityPair {
    private Product product;
    private int quantity;

    public ProductQuantityPair(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return product.getName() + " x " + quantity;
    }
}