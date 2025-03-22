import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (b == 0){
                System.out.println("divisao impossivel");
            }else{
                double total = (double) a / b;
                System.out.printf("%.1f%n",total);
            }
        }
        scanner.close();
    }
}
