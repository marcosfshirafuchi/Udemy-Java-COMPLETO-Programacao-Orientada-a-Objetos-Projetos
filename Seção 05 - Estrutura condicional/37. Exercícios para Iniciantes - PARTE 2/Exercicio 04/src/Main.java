import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempoInicial = scanner.nextInt();
        int tempoFinal = scanner.nextInt();
        int duracao;
        if (tempoInicial == tempoFinal){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else if (tempoInicial < tempoFinal){
            duracao = tempoFinal - tempoInicial;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)" );
        }else{
            duracao = 24 - tempoInicial + tempoFinal;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)" );
        }
        scanner.close();
    }
}