package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int number = scanner.nextInt();
        System.out.println("Enter account holder: ");
        String name = scanner.nextLine();
        System.out.println("Is there na initial deposit (y/n)? ");
        char opc = scanner.next().charAt(0);
        System.out.println("Enter initial deposit value: ");
        System.out.println();
        System.out.println("Account data: ");
        System.out.println("Account 8532, Holder: Alex Green, Balance: $");
        System.out.println("Enter a deposit value:");
        System.out.println("Updated account data:");
        System.out.println(" Account 8532, Holder: Alex Green, Balance: $ 700.00");
        System.out.println();
        System.out.println("Enter a withdraw value:");
        System.out.println("Updated account data:");
        System.out.println("Account 8532, Holder: Alex Green, Balance: $");
        scanner.close();
    }
}
