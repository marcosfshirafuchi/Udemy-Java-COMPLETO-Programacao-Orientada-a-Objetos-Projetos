import entities.Product2;

import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        List<Product2> list = new ArrayList<>();

        list.add(new Product2("TV", 900.00));
        list.add(new Product2("Notebook", 1200.00));
        list.add(new Product2("Tablet", 450.00));

        //Expressão Lambda
        //Comparator expressão lambda "direto no argumento"
        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        for (Product2 p : list) {
            System.out.println(p);
        }

    }
}
