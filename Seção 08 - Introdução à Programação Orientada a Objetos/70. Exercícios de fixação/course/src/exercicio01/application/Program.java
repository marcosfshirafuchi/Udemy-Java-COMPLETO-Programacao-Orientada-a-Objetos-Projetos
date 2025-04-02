package exercicio01.application;

import exercicio01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

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
