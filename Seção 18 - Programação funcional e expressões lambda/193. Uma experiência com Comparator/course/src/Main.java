import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    //Comparator objeto de classe separada
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        Collections.sort(list);

        for(Product p : list){
            System.out.println(p);
        }

    }
}