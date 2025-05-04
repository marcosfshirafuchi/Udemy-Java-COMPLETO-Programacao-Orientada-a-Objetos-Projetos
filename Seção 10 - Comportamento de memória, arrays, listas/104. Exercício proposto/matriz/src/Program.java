import java.util.Scanner;

public class Program {
    /**
     * <h1> Java e Orientação a Objetos <br>
     * Prof. Dr. Nelio Alves  <br>
     *  Exercício de fixação - Matriz</h1><br>
     *
     *  Fazer um programa para ler dois números inteiros M e N,e depois ler
     *  uma matriz de M linhas por N colunas contendo números inteiros,
     *  podendo haver repetições. Em seguida, ler um número inteiro X que
     *  pertence à matriz. Para cada ocorrência de X, mostrar os valores à
     *  esquerda, acima, à direita e abaixo de X, quando houver, conforme
     *  exemplo.<br><br>
     *   Example<br><br>
     *  3 4<br>
     *  10 8 15 12<br>
     *  21 11 23 8<br>
     *  14 5 13 19<br>
     *  8<br>
     *  Position 0,1:<br>
     *  Left: 10<br>
     *  Right: 15<br>
     *  Down: 11<br>
     *  Position 1,3:<br>
     *  Left: 23<br>
     *  Up: 12<br>
     *  Down: 19<br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 03/05/2025
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        Integer[][] mat = new Integer[m][n];
        for (int posicaoDaLinha = 0; posicaoDaLinha < m; posicaoDaLinha++ ){
            for (int posicaoDaColuna = 0; posicaoDaColuna < n;posicaoDaColuna++){
                mat[posicaoDaLinha][posicaoDaColuna] = scanner.nextInt();
            }
        }
        int number = scanner.nextInt();

        for (int posicaoDaLinha = 0; posicaoDaLinha < m; posicaoDaLinha++ ){
            for (int posicaoDaColuna = 0; posicaoDaColuna < n;posicaoDaColuna++){
                if (mat[posicaoDaLinha][posicaoDaColuna] == number){
                    System.out.println("Position " + posicaoDaLinha+","+posicaoDaColuna+":");
                    if((posicaoDaColuna -1) >=0){
                        System.out.println("Left: " + mat[posicaoDaLinha][posicaoDaColuna-1]);
                    }
                    if ((posicaoDaColuna+1) < n){
                        System.out.println("Right: " + mat[posicaoDaLinha][posicaoDaColuna+1]);
                    }
                    if ((posicaoDaLinha-1) >= 0){
                        System.out.println("Up: " + mat[posicaoDaLinha-1][posicaoDaColuna]);
                    }
                    if ((posicaoDaLinha+1) < m){
                        System.out.println("Down: " + mat[posicaoDaLinha+1][posicaoDaColuna]);
                    }
                }

            }
        }
        scanner.close();
    }
}
