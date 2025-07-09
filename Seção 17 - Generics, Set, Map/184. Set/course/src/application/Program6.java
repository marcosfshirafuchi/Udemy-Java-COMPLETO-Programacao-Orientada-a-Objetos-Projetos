package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program6 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");set.removeIf(x -> x.charAt(0) == 'T');
        for (String p : set) {
            System.out.println(p);
        }
    }
}
