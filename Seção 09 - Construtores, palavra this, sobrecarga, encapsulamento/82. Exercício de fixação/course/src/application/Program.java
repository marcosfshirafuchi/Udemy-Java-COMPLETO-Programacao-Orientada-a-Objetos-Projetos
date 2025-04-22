package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter account holder: ");
        String name = scanner.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char opc = scanner.next().charAt(0);
        double balance = 0.0;
        if(opc == 'y'){
            System.out.print("Enter initial deposit value: ");
            balance = scanner.nextDouble();
        }
        Account account = new Account(number,name,balance);
        System.out.println();
        System.out.println("Account data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n",account.getNumber(),account.getHolder(),account.getBalance());
        System.out.print("Enter a deposit value: ");
        double deposit = scanner.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n",account.getNumber(),account.getHolder(),account.getBalance());
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = scanner.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n",account.getNumber(),account.getHolder(),account.getBalance());
        scanner.close();
    }
}
