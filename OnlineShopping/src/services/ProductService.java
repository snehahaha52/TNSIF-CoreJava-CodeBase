package services;

import entities.Product;
import java.util.*;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) { products.add(p); }
    public void removeProduct(int id) { products.removeIf(p -> p.getProductId() == id); }
    public List<Product> getAllProducts() { return products; }
	public void addProduct(int productId, String name, double price, int stockQuantity) {
		// TODO Auto-generated method stub
		
	}
	public void viewProducts() {
		// TODO Auto-generated method stub
		
	}
}
