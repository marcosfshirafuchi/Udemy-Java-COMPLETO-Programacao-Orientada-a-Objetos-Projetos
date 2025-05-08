package aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /**
     * <h1> Java e Orientação a Objetos <br>
     * Prof. Dr. Nelio Alves  <br>
     * Exercícios de fixação sobre vetores</h1><br>
     * <b>Problema "aprovados"    Problema "aprovados" Problema "aprovados" <br></b>
     *
     * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
     * no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
     * os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
     * igual a 6.0 (seis).<br><br>
     *
     * Exemplo:<br>
     * Quantos alunos serao digitados? 4<br>
     * Digite nome, primeira e segunda nota do 1o aluno:<br>
     * Joao Silva<br>
     * 7.0<br>
     * 8.5<br>
     * Digite nome, primeira e segunda nota do 2o aluno:<br>
     * Maria Teixeira<br>
     * 9.2<br>
     * 6.5<br>
     * Digite nome, primeira e segunda nota do 3o aluno:<br>
     * Carlos Carvalho<br>
     * 5.0<br>
     * 6.0<br>
     * Digite nome, primeira e segunda nota do 4o aluno:<br>
     * Teresa Pires<br>
     * 5.5<br>
     * 6.5<br>
     * Alunos aprovados:<br>
     * Joao Silva<br>
     * Maria Teixeira<br>
     * Teresa Pires <br>
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
        System.out.print("Quantos alunos serao digitados? ");
        int n = scanner.nextInt();
        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        double[] media = new double[n];
        for (int i = 0; i < n;i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n",i+1);
            scanner.nextLine();
            nome[i] = scanner.nextLine();
            nota1[i] = scanner.nextDouble();
            nota2[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n;i++){
            media[i] = (nota1[i] + nota2[i]) / 2;
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n;i++){
            if (media[i]>=6.0){
                System.out.printf("%s\n",nome[i]);
            }
        }

        scanner.close();
    }
}
