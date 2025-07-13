package util;

import entities.Product;

import java.util.function.Function;

//Function<Entrada de dados, resposta>
public class UpperCaseName implements Function<Product,String> {
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
