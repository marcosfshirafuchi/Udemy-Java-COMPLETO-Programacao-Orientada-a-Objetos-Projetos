import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        Integer[][] mat = new Integer[m][n];
        for (int i = 0; i < m; i++ ){
            for (int j = 0; j < n;j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        int number = scanner.nextInt();

        for (int i = 0; i < m; i++ ){
            for (int j = 0; j < n;j++){
                if (mat[i][j] == number){
                    System.out.println("Position " + i+","+j+":");
                    if((j -1) >=0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if ((j+1) < n){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if ((i-1) >= 0){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if ((i+1) < m){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }

            }
        }
        scanner.close();
    }
}
