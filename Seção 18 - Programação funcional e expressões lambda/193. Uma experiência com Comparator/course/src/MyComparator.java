import entities.Product2;

import java.util.Comparator;

public class MyComparator implements Comparator<Product2> {
    @Override
    public int compare(Product2 p1, Product2 p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
