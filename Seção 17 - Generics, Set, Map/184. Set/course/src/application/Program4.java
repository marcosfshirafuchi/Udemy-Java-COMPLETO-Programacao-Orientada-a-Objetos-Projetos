package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program4 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");
        set.remove("Tablet");
        for (String p : set) {
            System.out.println(p);
        }
    }
}
