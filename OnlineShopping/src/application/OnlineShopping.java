package application;

import java.util.*;

public class OnlineShopping {

    private static final ProductService productService = new ProductService();
    private static final CustomerService customerService = new CustomerService();
    private static final OrderService orderService = new OrderService();
    private static final AdminService adminService = new AdminService();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\n--- Main Menu ---");
                System.out.println("1. Admin Menu");
                System.out.println("2. Customer Menu");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                choice = getInt(scanner);

                switch (choice) {
                    case 1 -> adminMenu(scanner);
                    case 2 -> customerMenu(scanner);
                    case 3 -> System.out.println("Good‑bye!");
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 3);
        }
    }

    private static void adminMenu(Scanner sc) {
        int c;
        do {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Products");
            System.out.println("4. Create Admin");
            System.out.println("5. View Admins");
            System.out.println("6. Update Order Status");
            System.out.println("7. View Orders");
            System.out.println("8. Return");
            System.out.print("Choose an option: ");
            c = getInt(sc);

            switch (c) {
                case 1 -> addProduct(sc);
                case 2 -> removeProduct(sc);
                case 3 -> productService.viewProducts();
                case 4 -> createAdmin(sc);
                case 5 -> adminService.viewAdmins();
                case 6 -> updateOrderStatus(sc);
                case 7 -> orderService.viewAllOrders();
                case 8 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (c != 8);
    }

    private static void customerMenu(Scanner sc) {
        int c;
        do {
            System.out.println("\n--- Customer Menu ---");
            System.out.println("1. Create Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Place Order");
            System.out.println("4. View Orders by Customer");
            System.out.println("5. View Products");
            System.out.println("6. Return");
            System.out.print("Choose an option: ");
            c = getInt(sc);

            switch (c) {
                case 1 -> createCustomer(sc);
                case 2 -> customerService.viewCustomers();
                case 3 -> placeOrder(sc);
                case 4 -> viewCustomerOrders(sc);
                case 5 -> productService.viewProducts();
                case 6 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (c != 6);
    }

    private static void addProduct(Scanner sc) {
        System.out.print("ID: ");
        int id = getInt(sc);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = getDouble(sc);
        System.out.print("Stock Qty: ");
        int stock = getInt(sc);

        productService.addProduct(id, name, price, stock);
        System.out.println("✅ Product added.");
    }

    private static void removeProduct(Scanner sc) {
        System.out.print("Product ID to remove: ");
        productService.removeProduct(getInt(sc));
    }

    private static void createAdmin(Scanner sc) {
        System.out.print("Admin ID: ");
        int id = getInt(sc);
        System.out.print("Username: ");
        String user = sc.nextLine();

        String email;
        while (true) {
            System.out.print("Email: ");
            email = sc.nextLine();
            if (isValidEmail(email)) break;
            else System.out.println("❌ Invalid email! Try again.");
        }

        adminService.createAdmin(id, user, email);
        System.out.println("✅ Admin created.");
    }

    private static void updateOrderStatus(Scanner sc) {
        System.out.print("Order ID: ");
        int id = getInt(sc);
        System.out.print("New status (Completed/Delivered/Cancelled): ");
        String status = sc.nextLine();

        orderService.updateOrderStatus(id, status);
    }

    private static void createCustomer(Scanner sc) {
        System.out.print("Customer ID: ");
        int id = getInt(sc);
        System.out.print("Username: ");
        String user = sc.nextLine();

        String email;
        while (true) {
            System.out.print("Email: ");
            email = sc.nextLine();
            if (isValidEmail(email)) break;
            else System.out.println("❌ Invalid email! Try again.");
        }

        System.out.print("Address: ");
        String addr = sc.nextLine();

        customerService.createCustomer(id, user, email, addr);
        System.out.println("✅ Customer created.");
    }

    private static void placeOrder(Scanner sc) {
        System.out.print("Customer ID: ");
        int custId = getInt(sc);
        Customer cust = customerService.find(custId);
        if (cust == null) {
            System.out.println("❌ Customer not found!");
            return;
        }

        Order order = new Order(orderService.nextOrderId(), cust);
        productService.viewProducts();

        System.out.print("Product ID to buy: ");
        Product p = productService.find(getInt(sc));
        if (p == null) {
            System.out.println("❌ Product not found!");
            return;
        }

        System.out.print("Quantity: ");
        int qty = getInt(sc);

        if (qty <= 0) {
            System.out.println("❌ Quantity must be greater than zero.");
            return;
        }

        if (qty <= p.getStockQty()) {
            order.addLine(p, qty);
            p.setStockQty(p.getStockQty() - qty);
            orderService.addOrder(order);
            System.out.printf("✅ Order placed: %d x %s. Order ID: %d%n",
                    qty, p.getName(), order.getId());
        } else {
            System.out.println("❌ Not enough stock available.");
        }
    }

    private static void viewCustomerOrders(Scanner sc) {
        System.out.print("Customer ID: ");
        int id = getInt(sc);
        orderService.viewOrdersByCustomer(id);
    }

    private static int getInt(Scanner sc) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid integer: ");
            }
        }
    }

    private static double getDouble(Scanner sc) {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid number: ");
            }
        }
    }

    private static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".") && !email.contains(" ");
    }
}

// ------------------------------------------------------------------
// Models and Services (All in one file for simplicity)
// ------------------------------------------------------------------
class Product {
    private final int id;
    private String name;
    private double price;
    private int stockQty;

    Product(int id, String n, double p, int s) {
        this.id = id;
        this.name = n;
        this.price = p;
        this.stockQty = s;
    }

    int getId() { return id; }
    String getName() { return name; }
    double getPrice() { return price; }
    int getStockQty() { return stockQty; }
    void setStockQty(int q) { stockQty = q; }

    @Override
    public String toString() {
        return "[%d] %s  ₹%.2f  (Stock: %d)".formatted(id, name, price, stockQty);
    }
}

class Customer {
    private final int id;
    private final String username, email, address;

    Customer(int id, String u, String e, String a) {
        this.id = id;
        this.username = u;
        this.email = e;
        this.address = a;
    }

    int getId() { return id; }

    @Override
    public String toString() {
        return "[%d] %s | %s | %s".formatted(id, username, email, address);
    }
}

class OrderLine {
    private final Product product;
    private final int qty;

    OrderLine(Product p, int q) {
        product = p;
        qty = q;
    }

    @Override
    public String toString() {
        return "%dx %s".formatted(qty, product.getName());
    }
}

class Order {
    private final int id;
    private final Customer customer;
    private final List<OrderLine> lines = new ArrayList<>();
    private String status = "Pending";

    Order(int id, Customer c) {
        this.id = id;
        this.customer = c;
    }

    int getId() { return id; }

    void setStatus(String s) { status = s; }

    void addLine(Product p, int q) { lines.add(new OrderLine(p, q)); }

    @Override
    public String toString() {
        return "Order %d by %s  [%s]  -> %s".formatted(id, customer.getId(), status, lines);
    }
}

class Admin {
    private final int id;
    private final String user, email;

    Admin(int i, String u, String e) {
        id = i;
        user = u;
        email = e;
    }

    @Override
    public String toString() {
        return "[%d] %s | %s".formatted(id, user, email);
    }
}

// ------------------------------------------------------------------
// Services
// ------------------------------------------------------------------
class ProductService {
    private final List<Product> products = new ArrayList<>();

    void addProduct(int id, String n, double p, int s) {
        products.add(new Product(id, n, p, s));
    }

    void removeProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    void viewProducts() {
        if (products.isEmpty()) System.out.println("No products.");
        else products.forEach(System.out::println);
    }

    Product find(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}

class CustomerService {
    private final List<Customer> customers = new ArrayList<>();

    void createCustomer(int id, String u, String e, String a) {
        customers.add(new Customer(id, u, e, a));
    }

    void viewCustomers() {
        if (customers.isEmpty()) System.out.println("No customers.");
        else customers.forEach(System.out::println);
    }

    Customer find(int id) {
        return customers.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }
}

class OrderService {
    private final List<Order> orders = new ArrayList<>();
    private int nextOrderId = 1;

    int nextOrderId() {
        return nextOrderId++;
    }

    void addOrder(Order o) {
        orders.add(o);
    }

    void updateOrderStatus(int id, String s) {
        orders.stream().filter(o -> o.getId() == id).findFirst()
                .ifPresentOrElse(o -> {
                    o.setStatus(s);
                    System.out.println("✅ Status updated.");
                }, () -> System.out.println("❌ Order not found!"));
    }

    void viewAllOrders() {
        if (orders.isEmpty()) System.out.println("No orders.");
        else orders.forEach(System.out::println);
    }

    void viewOrdersByCustomer(int cid) {
        var list = orders.stream().filter(o -> o.toString().contains("by " + cid)).toList();
        if (list.isEmpty()) System.out.println("No orders for that customer.");
        else list.forEach(System.out::println);
    }
}

class AdminService {
    private final List<Admin> admins = new ArrayList<>();

    void createAdmin(int id, String u, String e) {
        admins.add(new Admin(id, u, e));
    }

    void viewAdmins() {
        if (admins.isEmpty()) System.out.println("No admins.");
        else admins.forEach(System.out::println);
    }
}
