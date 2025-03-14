import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();
        double valorTotal = 0.0;
        switch (codigo){
            case 1:
                valorTotal = quantidade * 4.00;
                break;
            case 2:
                valorTotal = quantidade * 4.50;
                break;
            case 3:
                valorTotal = quantidade * 5.00;
                break;
            case 4:
                valorTotal = quantidade * 2.00;
                break;
            case 5:
                valorTotal = quantidade * 1.50;
                break;
            default:
                System.out.println("Código inválido!");
                break;
        }
        System.out.printf("Total: R$ %.2f%n",valorTotal);
        scanner.close();
    }
}