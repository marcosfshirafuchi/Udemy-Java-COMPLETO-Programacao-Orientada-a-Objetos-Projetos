import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int numeroDoFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double valorDaHoraTrabalhada = scanner.nextDouble();
        double salario = horasTrabalhadas * valorDaHoraTrabalhada;
        System.out.println("NUMBER = " + numeroDoFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        scanner.close();
    }
}