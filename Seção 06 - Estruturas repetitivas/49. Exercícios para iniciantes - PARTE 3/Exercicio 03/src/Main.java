import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        int contAlcool = 0;
        int contGasolina = 0;
        int contDiesel = 0;
        while (opcao!= 4){
            if (opcao == 1){
                contAlcool++;
            } else if (opcao == 2) {
                contGasolina++;
            } else if (opcao == 3) {
                contDiesel++;
            }
            opcao = scanner.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + contAlcool);
        System.out.println("Gasolina: " + contGasolina);
        System.out.println("Diesel: " + contDiesel);
        scanner.close();
    }
}