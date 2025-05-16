package application;

import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;
import model.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scanner.next());
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next());
        Client client = new Client(name,email,birthDate);
        Order order = new Order(new Date(), status, client);
        System.out.print("How many items to this order? ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            Product product = new Product(productName, productPrice);
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);

        }
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);
        scanner.close();
    }
}
