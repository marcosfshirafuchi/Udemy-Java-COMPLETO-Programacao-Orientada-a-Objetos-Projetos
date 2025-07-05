package application;

import services.PrintServiceObject;
import services.PrintServiceString;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintServiceObject ps = new PrintServiceObject();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        ps.addValue("Maria");

        for(int i = 0; i < n; i++){
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = (Integer) ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
