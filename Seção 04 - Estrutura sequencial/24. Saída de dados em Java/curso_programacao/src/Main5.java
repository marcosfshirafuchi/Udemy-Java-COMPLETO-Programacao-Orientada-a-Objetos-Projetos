import java.util.Locale;

public class Main5 {
    public static void main(String[] args) {;
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n",x);
        System.out.println("RESULTADO = " + x + " METROS");
    }
}
