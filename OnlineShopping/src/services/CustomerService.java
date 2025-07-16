package services;

import entities.*;
import java.util.*;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();
    private int orderCounter = 1;

    public void addCustomer(Customer c) { customers.add(c); }
    public List<Customer> getAllCustomers() { return customers; }

    public void placeOrder(Scanner scanner, int customerId, ProductService productService, OrderService orderService) {
        Customer customer = customers.stream()
            .filter(c -> c.userId == customerId)
            .findFirst().orElse(null);
        if (customer == null) {
            System.out.println("Customer not found!");
            return;
        }

        ShoppingCart cart = customer.getShoppingCart();
        while (true) {
            System.out.print("Enter Product ID to add to order (or -1 to complete): ");
            int productId = scanner.nextInt();
            if (productId == -1) break;

            System.out.print("Enter quantity: ");
            int qty = scanner.nextInt();

            Product p = productService.getAllProducts().stream()
                .filter(prod -> prod.getProductId() == productId)
                .findFirst().orElse(null);
            if (p != null) {
                cart.addProduct(p, qty);
            } else {
                System.out.println("Product not found!");
            }
        }

        Order order = new Order(orderCounter++, customer);
        order.getProducts().putAll(cart.getItems());
        customer.getOrders().add(order);
        orderService.addOrder(order);
        System.out.println("Order placed successfully!");
    }
    public void viewOrdersForCustomer(int customerId) {
        for (Customer c : customers) {
            if (c.userId == customerId) {
                if (c.getOrders().isEmpty()) {
                    System.out.println("No orders yet.");
                } else {
                    for (Order o : c.getOrders()) {
                        System.out.println(o);
                    }
                }
            }
        }
    }
	public void viewCustomerOrders(int customerId) {
		// TODO Auto-generated method stub
		
	}
	public static void placeOrder(int customerId, Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
	public void viewCustomers() {
		// TODO Auto-generated method stub
		
	}
	public void createCustomer(int customerId, String username, String email, String address) {
		// TODO Auto-generated method stub
		
	}
}