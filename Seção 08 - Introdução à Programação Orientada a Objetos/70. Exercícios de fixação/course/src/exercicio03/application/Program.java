package exercicio03.application;

import exercicio02.entities.Student;

import java.util.Locale;
import java.util.Scanner;

/**
 * <h1> Curso mais didático e completo de Java e OO, UML, JDBC, JavaFX, Spring Boot, JPA, Hibernate, MySQL, MongoDB e muito mais</h1>
 * <br>https://www.udemy.com/course/java-curso-completo/ <br><br>
 * Prof. Dr. Nelio Alves<br><br>
 * Seção 8: Introdução à Programação Orientada a Objetos <br><br>
 * 70. Exercícios de fixação<br><br>
 * Exercício 3<br><br>
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
 * ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
 * para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Studentpara
 * resolver este problema.<br><br>
 * Exemplo:<br><br>
 * Entrada:<br><br>
 *  Alex Green<br>
 *  27.00<br>
 *  31.00<br>
 *  32.00<br>
 *  Saída:<br><br>
 *  FINAL GRADE = 90.00<br>
 *  PASS<br> <br>
 * Exemplo: <br><br>
 * Entrada:<br><br>
 *  Alex Green<br>
 *  17.00<br>
 *  20.00<br>
 *  15.00<br>
 *  Saída:<br><br>
 *  FINAL GRADE = 52.00<br>
 *  FAILED<br>
 *  MISSING 8.00 POINTS<br>
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @authors
 * Marcos Ferreira Shirafuchi<br>
 * @version 1.0
 * @since 01/04/2025
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.nome = scanner.nextLine();
        student.note1 = scanner.nextDouble();
        student.note2 = scanner.nextDouble();
        student.note3 = scanner.nextDouble();
        student.result();
        scanner.close();

    }
}
