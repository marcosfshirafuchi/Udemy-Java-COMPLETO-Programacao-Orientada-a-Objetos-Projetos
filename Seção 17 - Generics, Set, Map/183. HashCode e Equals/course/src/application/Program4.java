package application;

import entities.Client;

public class Program4 {
    public static void main(String[] args) {
        Client c1 = new Client("Maria","maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = new String("Test");
        String s2 = new String("Test");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        //Compara conteúdo od objetos
        System.out.println(c1.equals(c2));
        //Compara referências dos objetos
        System.out.println(c1 == c2);
        System.out.println(s1 == s2);

    }
}
