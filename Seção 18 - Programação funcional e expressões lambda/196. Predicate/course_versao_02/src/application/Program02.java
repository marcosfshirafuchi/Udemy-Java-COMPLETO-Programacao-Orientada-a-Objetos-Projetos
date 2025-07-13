package application;

import entities.Product;
import uil.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program02 {
    /**
     * <h1> Udemy Java COMPLETO Programação Orientada a Objetos Projetos:<br><br>
     * Seção 18 - Programação funcional e expressões lambda</h1><br><br>
     * <b>196. Predicate<br><br></b>
     * Problema exemplo<br><br>
     * Fazer um programa que, a partir de uma lista de produtos, remova da
     * lista somente aqueles cujo preço mínimo seja 100.<br><br>
     * List<Product> list = new ArrayList<>();<br><br>
     * list.add(new Product("Tv", 900.00));<br>
     * list.add(new Product("Mouse", 50.00));<br>
     * list.add(new Product("Tablet", 350.50));<br>
     * list.add(new Product("HD Case", 80.90));<br>
     * <br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 13/07/2025
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //2ª forma: Reference method com método estático
        list.removeIf(Product::staticProductPredicate);

        for (Product p : list){
            System.out.println(p);
        }
    }
}
