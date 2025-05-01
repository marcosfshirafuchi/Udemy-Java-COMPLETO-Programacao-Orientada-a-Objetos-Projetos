import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rent[] rent = new Rent[10];
        String name, email;
        int room;
        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.printf("Reny #%d:\n", i + 1);
            System.out.print("Name: ");
            name = scanner.nextLine();
            System.out.print("Email: ");
            email = scanner.nextLine();
            System.out.print("Room: ");
            room = scanner.nextInt();
            rent[room] = new Rent(name, email);
            System.out.println();
        }
        System.out.println("Busy rooms:");
        for (int i = 0; i < rent.length; i++) {
            if(rent[i] != null){
                System.out.printf("%d: %s, %s\n",i,rent[i].getName(), rent[i].getEmail());
            }
        }
        scanner.close();
    }
}
