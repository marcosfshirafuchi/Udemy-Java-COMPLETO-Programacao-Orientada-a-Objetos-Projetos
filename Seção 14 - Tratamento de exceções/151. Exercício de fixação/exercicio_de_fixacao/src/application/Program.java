package application;

import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    /**
     * <h1> Udemy Java COMPLETO Programação Orientada a Objetos Projetos:<br>
     * Seção 14 - Tratamento de exceções</h1><br>
     * <b>151. Exercício de fixação<br><br></b>
     * Exercício de fixação<br><br>Fazer um programa para ler os dados de uma conta bancária e depois realizar um
     * saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
     * ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
     * saque da conta. Implemente a conta bancária conforme projeto abaixo:
     * <br><br>
     * _________________________________<br>
     * Account<br>
     * _________________________________<br>
     * - number: Integer<br>
     * - holder: String<br>
     * - balance: Double<br>
     * - withdrawLimit: Double<br>
     * _________________________________<br>
     * + deposit(amount: Double): void<br>
     * + withdraw(amount: Double): void<br>
     * _________________________________<br><br>
     *<b> Examples</b><br><br>
     * Enter account data<br>
     * Number: 8021<br>
     * Holder: Bob Brown<br>
     * Initial balance: 500.00<br>
     * Withdraw limit: 300.00<br><br>
     * Enter amount for withdraw: 100.00<br>
     * New balance: 400.00<br><br>
     * Enter account data<br>
     * Number: 8021<br>
     * Holder: Bob Brown<br>
     * Initial balance: 500.00<br>
     * Withdraw limit: 300.00<br><br>
     * Enter amount for withdraw: 400.00<br>
     * Withdraw error: The amount exceeds withdraw limit<br><br>
     * <b>Examples</b><br><br>
     * Enter account data<br>
     * Number: 8021<br>
     * Holder: Bob Brown<br>
     * Initial balance: 500.00<br>
     * Withdraw limit: 300.00<br><br>
     * Enter amount for withdraw: 800.00<br>
     * Withdraw error: The amount exceeds withdraw limit<br><br>
     * Enter account data<br>
     * Number: 8021<br>
     * Holder: Bob Brown<br>
     * Initial balance: 200.00<br>
     * Withdraw limit: 300.00<br><br>
     * Enter amount for withdraw: 250.00<br>
     * Withdraw error: Not enough balance<br>
     * <br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 13/06/2025
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter account data");
            int number = readInt(scanner, "Number: ");
            System.out.print("Holder: ");
            scanner.nextLine();
            String holder = scanner.nextLine();
            double initialBalance = readDouble(scanner, "Initial balance: ");
            double withdrawLimit = readDouble(scanner, "Withdraw limit: ");
            Account account= new Account(number,holder,initialBalance,withdrawLimit);
            System.out.println();
            double withdraw = readDouble(scanner,"Enter amount for withdraw: ");
            account.withdraw(withdraw);
            System.out.println(account);
        }catch (IllegalArgumentException e) {
            System.out.println("Input error: " + e.getMessage());
        }
        catch (BusinessException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        scanner.close();
    }

    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer number.");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.next();
            if (input.contains(",")) {
                System.out.println("Invalid input. Use '.' instead of ',' for decimal numbers.");
                continue;
            }
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number using '.' for decimals.");
            }
        }
    }
}
