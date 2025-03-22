import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int contIn =0;
        int contOut = 0;
        for (int i = 0; i < N; i++){
            int x = scanner.nextInt();
            if (x>=10 && x <=20){
                contIn++;
            }else{
                contOut++;
            }
        }
        System.out.println(contIn + " in");
        System.out.println(contOut + " out");
        scanner.close();
    }
}
