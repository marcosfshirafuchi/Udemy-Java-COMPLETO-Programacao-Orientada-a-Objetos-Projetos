import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fatorial = 1;
        if (n == 0 || n == 1) {
            System.out.println(fatorial);
        } else {
            for (int i = 1; i <= n; i++) {
                fatorial = fatorial * i;
            }
            System.out.println(fatorial);
        }
        scanner.close();
    }
}
