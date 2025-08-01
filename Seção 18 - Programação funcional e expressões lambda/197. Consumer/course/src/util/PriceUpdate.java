package util;

import entities.Product;

import java.util.function.Consumer;

//1ª forma: Implementação da interface
public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
