import entities.Product2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Product2> list = new ArrayList<>();

        list.add(new Product2("TV", 900.00));
        list.add(new Product2("Notebook", 1200.00));
        list.add(new Product2("Tablet", 450.00));


        //Expressão Lambda
        //Comparator objeto de expressão lambda com chaves
        Comparator<Product2> comp =(p1, p2) ->{
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        list.sort(comp);

        for (Product2 p : list) {
            System.out.println(p);
        }

    }
}
