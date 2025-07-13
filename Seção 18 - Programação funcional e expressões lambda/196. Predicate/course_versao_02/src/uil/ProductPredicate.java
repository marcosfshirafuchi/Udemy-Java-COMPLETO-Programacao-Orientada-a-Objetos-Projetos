package uil;

import entities.Product;

import java.util.function.Predicate;

//1ª forma: Implementação da interface
public class ProductPredicate  implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
