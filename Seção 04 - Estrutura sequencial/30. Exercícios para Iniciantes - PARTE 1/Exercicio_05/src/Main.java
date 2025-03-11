import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int codigo1 = scanner.nextInt();
        int numeroDePecas1 = scanner.nextInt();
        double valorUnitarioDeCadaPeca1 = scanner.nextDouble();
        int codigo2 = scanner.nextInt();
        int numeroDePecas2 = scanner.nextInt();
        double valorUnitarioDeCadaPeca2 = scanner.nextDouble();

        double valorTotal = numeroDePecas1 * valorUnitarioDeCadaPeca1 + numeroDePecas2 * valorUnitarioDeCadaPeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorTotal);

        scanner.close();
    }
}