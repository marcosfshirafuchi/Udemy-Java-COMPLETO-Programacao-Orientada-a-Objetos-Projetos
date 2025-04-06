package Versao02.application;

import Versao02.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double c = cal.circumference(radius);
        double v = cal.volume(radius);
        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI value: %.2f%n",cal.PI);
        sc.close();
    }


}