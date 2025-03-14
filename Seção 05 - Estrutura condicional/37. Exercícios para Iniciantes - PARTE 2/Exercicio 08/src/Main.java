import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final double valorDaIsencao = 2000.00;
    private static final double valorMaximode8Porcento = 1000.00;
    private static final double valorMaximode16Porcento = 1500.00;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        double valorAPagar = 0.0;
        double restode28Porcento = 0.0;
        double restode18Porcento = 0.0;
        double calculoDe8Porcento = 0.0;
        double calculoDe18Porcento = 0.0;
        double calculoDe28Porcento = 0.0;
        if (salario >= 0.00 && salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario >= 2000.01 && salario <= 3000.00) {
            calculoDe8Porcento = (salario - valorDaIsencao) * 0.08;
            valorAPagar = calculoDe8Porcento;
            System.out.printf("R$ %.2f%n",valorAPagar);

        } else if (salario >= 3000.01 && salario <= 4500.00) {
            salario -= valorDaIsencao;
            restode18Porcento = salario - valorMaximode8Porcento;
            calculoDe8Porcento = (salario - restode18Porcento) * 0.08;
            calculoDe18Porcento = restode18Porcento * 0.18;
            valorAPagar = calculoDe8Porcento + calculoDe18Porcento;
            System.out.printf("R$ %.2f%n",valorAPagar);
        }else{
            calculoDe28Porcento = (salario - valorDaIsencao - valorMaximode8Porcento - valorMaximode16Porcento) * 0.28;
            restode28Porcento = salario - valorDaIsencao - valorMaximode8Porcento - valorMaximode16Porcento;
            calculoDe18Porcento = ((salario - valorDaIsencao - valorMaximode8Porcento) - restode28Porcento) * 0.18;
            restode18Porcento = salario - valorDaIsencao - valorMaximode8Porcento - restode28Porcento;
            calculoDe8Porcento = (salario - valorDaIsencao - restode18Porcento - restode28Porcento) * 0.08;
            valorAPagar = calculoDe8Porcento + calculoDe18Porcento + calculoDe28Porcento;
            System.out.printf("R$ %.2f%n",valorAPagar);
        }
        scanner.close();
    }
}