package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    /**
     * <h1> Udemy Java COMPLETO Programação Orientada a Objetos Projetos:<br><br>
     * Seção 17 - Generics, Set, Map</h1><br>
     * <b>187. Exercício resolvido (Set)<br><br></b>
     * Problema exemplo<br><br>
     * Um site de internet registra um log de acessos dos usuários. Um
     * registro de log consiste no nome de usuário (apenas uma palavra) e o
     * instante em que o usuário acessou o site no padrão ISO 8601,
     * separados por espaço, conforme exemplo. Fazer um programa que leia
     * o log de acessos a partir de um arquivo, e daí informe quantos usuários
     * distintos acessaram o site.<br>
     * Example<br><br>
     * input file:<br>
     * amanda 2018-08-26T20:45:08Z<br>
     * alex86 2018-08-26T21:49:37Z<br>
     * bobbrown 2018-08-27T03:19:13Z<br>
     * amanda 2018-08-27T08:11:00Z<br>
     * jeniffer3 2018-08-27T09:19:24Z<br>
     * alex86 2018-08-27T22:39:52Z<br>
     * amanda 2018-08-28T07:42:19Z<br><br>
     * Execution:<br>
     * Enter file full path: c:\temp\in.txt<br>
     * Total users: 4<br>
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
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();

            //Le a primeira linha do arquivo
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, moment));

                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();



    }
}
