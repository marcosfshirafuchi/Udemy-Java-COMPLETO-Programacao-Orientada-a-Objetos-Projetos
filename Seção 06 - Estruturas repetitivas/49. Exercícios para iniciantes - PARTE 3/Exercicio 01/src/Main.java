import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int senha = scanner.nextInt();
        while (senha != 2002){
            if (senha != 2002){
                System.out.println("Senha Invalida");
            }
            senha = scanner.nextInt();
        }
        System.out.println("Acesso Permitido");
        scanner.close();
    }
}