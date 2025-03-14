import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco= 34.5;
        double desconto;
        if(preco< 20.0) {
            desconto = preco * 0.1;
        }
        else{
            desconto = preco * 0.05;
        }
        sc.close();
    }
}