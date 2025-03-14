import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        if (numero1 < numero2) {
            int aux = numero2;
            numero2 = numero1;
            numero1 = aux;
        }
        if (numero1 % numero2 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        scanner.close();
    }
}