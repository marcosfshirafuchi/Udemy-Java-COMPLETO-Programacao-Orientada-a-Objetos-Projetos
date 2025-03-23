import entities.Product2;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Product2> list = new ArrayList<>();

        list.add(new Product2("TV", 900.00));
        list.add(new Product2("Notebook", 1200.00));
        list.add(new Product2("Tablet", 450.00));

        //Comparator objeto de classe separada
        list.sort(new MyComparator());


        for (Product2 p : list) {
            System.out.println(p);
        }

    }
}
