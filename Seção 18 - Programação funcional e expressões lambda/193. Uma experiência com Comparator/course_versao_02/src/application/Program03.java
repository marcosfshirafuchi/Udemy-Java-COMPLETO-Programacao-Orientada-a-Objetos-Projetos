package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program03 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        //3ª forma: Comparator objeto de expressão lambda com chaves
        Comparator<Product> comp = (p1, p2 ) ->{
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        list.sort(comp);
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
