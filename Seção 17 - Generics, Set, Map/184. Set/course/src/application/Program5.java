package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program5 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");set.removeIf(x -> x.length() >= 3);
        for (String p : set) {
            System.out.println(p);
        }
    }
}
