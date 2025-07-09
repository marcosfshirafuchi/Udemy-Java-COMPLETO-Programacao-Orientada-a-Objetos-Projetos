package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    /**
     * <h1> Udemy Java COMPLETO Programação Orientada a Objetos Projetos:<br><br>
     * Seção 17 - Generics, Set, Map</h1><br>
     * <b>188. Exercício de fixação (Set)<br><br></b>
     * Em um portal de cursos online, cada usuário possui um código único, representado por
     * um número inteiro.
     * Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
     * matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
     * é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
     * alunos repetidos em mais de um curso.
     * O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
     * Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
     * quantidade total e alunos dele, conforme exemplo.<br><br>
     * Example:<br><br>
     * How many students for course A? 3<br>
     * 21<br>
     * 35<br>
     * 22<br>
     * How many students for course B? 2<br>
     * 21<br>
     * 50<br>
     * How many students for course C? 3<br>
     * 42<br>
     * 35<br>
     * 13<br>
     * Total students: 6<br>
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
        Set<Integer> set = new HashSet<>();
        System.out.print("How many students for course A? ");
        int courseA = scanner.nextInt();
        for (int i = 0; i < courseA; i++){
            set.add(scanner.nextInt());
        }
        System.out.print("How many students for course B? ");
        int courseB = scanner.nextInt();
        for (int i = 0; i < courseB; i++){
            set.add(scanner.nextInt());
        }
        System.out.print("How many students for course C? ");
        int courseC = scanner.nextInt();
        for (int i = 0; i < courseC; i++){
            set.add(scanner.nextInt());
        }
        System.out.println("Total students: " + set.size());
        scanner.close();
    }
}
