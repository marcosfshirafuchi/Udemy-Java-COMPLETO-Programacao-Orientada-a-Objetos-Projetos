package exercicio01.application;

import exercicio01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

/**
 * <h1> Curso mais didático e completo de Java e OO, UML, JDBC, JavaFX, Spring Boot, JPA, Hibernate, MySQL, MongoDB e muito mais</h1>
 * <br>https://www.udemy.com/course/java-curso-completo/ <br><br>
 * Prof. Dr. Nelio Alves<br><br>
 * Seção 8: Introdução à Programação Orientada a Objetos <br><br>
 * 70. Exercícios de fixação<br><br>
 * Exercício 1<br><br>
 *  Fazer um programa para ler os valores da largura e altura
 * de um retângulo. Em seguida, mostrar na tela o valor de
 * sua área, perímetro e diagonal. Usar uma classe como
 * mostrado no projeto ao lado.<br><br>
 * Exemplo: <br><br>
 * Enter rectangle width and height:<br>
 *  3.00<br>
 *  4.00<br>
 *  AREA = 12.00<br>
 *  PERIMETER = 14.00<br>
 *  DIAGONAL = 5.00<br>
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
        System.out.println("Enter rectangle width and height: ");
        Rectangle rectangle = new Rectangle();
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.println("AREA = " + String.format("%.2f", rectangle.area()));
        System.out.println("PERIMETER = " + String.format("%.2f", rectangle.perimeter()));
        System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.diagonal()));

        scanner.close();
    }
}
