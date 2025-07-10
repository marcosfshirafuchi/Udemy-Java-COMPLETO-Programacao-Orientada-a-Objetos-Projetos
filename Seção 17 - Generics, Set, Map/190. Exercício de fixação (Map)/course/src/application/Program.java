package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    /**
     * <h1> Udemy Java COMPLETO Programação Orientada a Objetos Projetos:<br><br>
     * Seção 17 - Generics, Set, Map</h1><br>
     * <b>190. Exercício de fixação (Map)<br><br></b>
     * Na contagem de votos de uma eleição, são gerados vários registros
     * de votação contendo o nome do candidato e a quantidade de votos
     * (formato .csv) que ele obteve em uma urna de votação. Você deve
     * fazer um programa para ler os registros de votação a partir de um
     * arquivo, e daí gerar um relatório consolidado com os totais de cada
     * candidato.<br><br>
     * Input file example:<br>
     * Alex Blue,15
     * Maria Green,22
     * Bob Brown,21
     * Alex Blue,30
     * Bob Brown,15
     * Maria Green,27
     * Maria Green,22
     * Bob Brown,25
     * Alex Blue,31
     * Execution:
     * Enter file full path: c:\temp\in.txt
     * Alex Blue: 76
     * Maria Green: 71
     * Bob Brown: 61
     * <br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 09/07/2025
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();


        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Map<String,Integer> candidatesByVotes = new HashMap<>();
            //Le a primeira linha do arquivo
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                Integer vote = Integer.parseInt(fields[1]);

                if (candidatesByVotes.containsValue(name)){
                    int votesPlus = candidatesByVotes.get(name);
                    candidatesByVotes.put(name,vote + votesPlus);
                }else{
                    candidatesByVotes.put(name,vote);
                }


                line = br.readLine();
            }

            for (String key : candidatesByVotes.keySet()){
                System.out.println(key + ": " + candidatesByVotes.get(key));
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
