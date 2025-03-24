package aplication;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Expressão lambda declarada
        Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> names = list.stream().map(func).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}