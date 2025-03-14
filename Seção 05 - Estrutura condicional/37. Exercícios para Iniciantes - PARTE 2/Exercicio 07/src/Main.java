import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double X = scanner.nextDouble();
        double Y = scanner.nextDouble();
        if (X == 0.0 && Y == 0.0){
            System.out.println("Origem");
        } else if (X == 0.0) {
            System.out.println("Eixo Y");
        } else if (Y == 0.0) {
            System.out.println("Eixo X");
        } else if (X > 0.0 && Y > 0.0) {
            System.out.println("Q1");
        } else if (X < 0.0 && Y > 0.0) {
            System.out.println("Q2");
        } else if (X < 0.0 && Y < 0.0) {
            System.out.println("Q3");
        }else{
            System.out.println("Q4");
        }

        scanner.close();

    }
}