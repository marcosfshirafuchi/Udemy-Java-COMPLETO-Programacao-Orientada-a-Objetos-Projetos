import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double pi = 3.14159;
        double areaDoTriangulo = (A * C)/2;
        double areaDoCirculo = pi * Math.pow(C,2.0);
        double areaDoTrapezio = ((A + B) * C)/2;
        double areaDoQuadrado = Math.pow(B,2.0);
        double areaDoRetangulo = A * B;
        System.out.printf("TRIANGULO: %.3f%n",areaDoTriangulo);
        System.out.printf("CIRCULO: %.3f\n",areaDoCirculo);
        System.out.printf("TRAPEZIO: %.3f\n",areaDoTrapezio);
        System.out.printf("QUADRADO: %.3f%n",areaDoQuadrado);
        System.out.printf("RETANGULO: %.3f%n",areaDoRetangulo);
        scanner.close();
    }
}