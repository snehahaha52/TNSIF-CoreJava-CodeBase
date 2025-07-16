package entities;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Product, Integer> items;

    public ShoppingCart() {
        this.items = new HashMap<>();  // ✅ initialized
    }

    public void addProduct(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Shopping Cart:\n");
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            sb.append("  ").append(entry.getKey().toString())
              .append(", Quantity: ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}