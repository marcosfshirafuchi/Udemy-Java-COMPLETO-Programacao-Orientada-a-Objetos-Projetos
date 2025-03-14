import java.util.Locale;
import java.util.Scanner;

public class Main {
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
            calculoDe8Porcento = (salario - 2000.00) * 0.08;
            valorAPagar = calculoDe8Porcento;

        } else if (salario >= 3000.01 && salario <= 4500.00) {
            salario -= 2000.00;
            restode18Porcento = salario - 1000.00;
            calculoDe8Porcento = (salario - restode18Porcento) * 0.08;
            calculoDe18Porcento = restode18Porcento * 0.18;
            valorAPagar = calculoDe8Porcento + calculoDe18Porcento;
        }else{
            calculoDe28Porcento = (salario - 4500) * 0.28;
            restode28Porcento = salario - 4500;
            calculoDe18Porcento = ((salario - 3000) - restode28Porcento) * 0.18;
            restode18Porcento = salario - 3000 - restode28Porcento;
            calculoDe8Porcento = (salario - 2000 - restode18Porcento - restode28Porcento) * 0.08;
            valorAPagar = calculoDe8Porcento + calculoDe18Porcento + calculoDe28Porcento;
        }
        System.out.printf("R$ %.2f%n",valorAPagar);
        scanner.close();
    }
}