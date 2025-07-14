package application;

import entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    /**
     * <h1> Udemy Java COMPLETO Programação Orientada a Objetos Projetos:<br><br>
     * Seção 18 - Programação funcional e expressões lambda</h1><br><br>
     * <b>199. Criando funções que recebem funções como parâmetro<br><br></b>
     * Problema exemplo<br><br>
     * Fazer um programa que, a partir de uma lista de produtos, calcule a
     * soma dos preços somente dos produtos cujo nome começa com "T".<br><br>
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

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f",sum));
    }
}
