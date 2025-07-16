package entities;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private String address;
    private ShoppingCart shoppingCart;
    private List<Order> orders;

    public Customer(int userId, String username, String email, String address) {
        super(userId, username, email);
        this.address = address;
        this.shoppingCart = new ShoppingCart();  // ✅ initialized
        this.orders = new ArrayList<>();         // ✅ initialized
    }

    public String getAddress() {
        return address;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return super.toString() + ", Address: " + address;
    }

	public Object getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
}