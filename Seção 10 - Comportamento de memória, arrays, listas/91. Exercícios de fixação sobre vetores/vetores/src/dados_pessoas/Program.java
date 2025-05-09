package dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /**
     * <h1> Java e Orientação a Objetos <br>
     * Prof. Dr. Nelio Alves  <br>
     * Exercícios de fixação sobre vetores</h1><br>
     * <b>Problema "dados_pessoas" <br></b>
     *
     * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
     * que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
     * de homens. <br><br>
     * Exemplo: <br>
     * Quantas pessoas serao digitadas? 5 <br>
     * Altura da 1a pessoa: 1.70 <br>
     * Genero da 1a pessoa: F <br>
     * Altura da 2a pessoa: 1.83   <br>
     * Genero da 2a pessoa: M <br>
     * Altura da 3a pessoa: 1.54   <br>
     * Genero da 3a pessoa: M <br>
     * Altura da 4a pessoa: 1.61  <br>
     * Genero da 4a pessoa: F <br>
     * Altura da 5a pessoa: 1.75  <br>
     * Genero da 5a pessoa: F <br>
     * Menor altura = 1.54 <br>
     * Maior altura = 1.83 <br>
     * Media das alturas das mulheres = 1.69 <br>
     * Numero de homens = 2 <br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 08/05/2025
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();
        double[] altura = new double[n];
        char[] genero = new char[n];

        double somaAlturaMulheres = 0.0;
        int contMulheres = 0;
        int contHomens = 0;
        for (int i = 0; i < n;i++){
            System.out.printf("Altura da %da pessoa: ",i+1);
            altura[i] = scanner.nextDouble();
            System.out.printf("Genero da %da pessoa: ",i+1);
            genero[i] = scanner.next().charAt(0);

        }
        double maiorAltura = altura[0];
        double menorAltura = altura[0];
        for (int i = 1; i < n;i++){
            if (altura[i]<menorAltura){
                menorAltura = altura[i];
            }
            if (altura[i]> maiorAltura){
                maiorAltura = altura[i];
            }
            if (genero[i]=='F'){
                somaAlturaMulheres += altura[i];
                contMulheres++;
            }else{
                contHomens++;
            }

        }
        double media = somaAlturaMulheres / contMulheres;
        System.out.println("Menor altura = " + String.format("%.2f",menorAltura));
        System.out.println("Maior altura = " + String.format("%.2f",maiorAltura));
        System.out.println("Media das alturas das mulheres = "+ String.format("%.2f",media));
        System.out.println("Numero de homens = " + contHomens);
        scanner.close();
    }
}
