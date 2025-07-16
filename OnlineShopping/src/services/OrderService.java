package services;

import entities.Order;
import java.util.*;

public class OrderService {
    private static List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) { orders.add(order); }

    public void updateOrderStatus(int orderId, String status) {
        for (Order o : orders) {
            if (o.getOrderId() == orderId) {
                o.setStatus(status);
                System.out.println("Order status updated.");
                return;
            }
        }
        System.out.println("Order not found.");
    }

    public static void viewAllOrders() {
        for (Order o : orders) {
            System.out.println(o);
        }
        
    }
}