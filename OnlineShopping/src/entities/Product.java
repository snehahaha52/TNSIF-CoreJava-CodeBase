package entities;

public class Product {
    private int productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", name=" + name + 
               ", price=" + price + ", stockQuantity=" + stockQuantity + "]";
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getProductId() {
		// TODO Auto-generated method stub
		return 0;
	}

    // Getters & Setters
}
