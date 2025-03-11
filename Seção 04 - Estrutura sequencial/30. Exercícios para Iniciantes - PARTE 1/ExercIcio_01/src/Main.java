import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int soma = a + b;
        System.out.println("SOMA = " + soma);
        scanner.nextLine();
    }
}