package entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //2ª forma: Reference method com método estático
    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }

    //3ª forma: Reference method com método não estático
    public void nonStaticPriceUpdate(){
       price = price * 1.1;
    }

    @Override
    public String toString(){
        return name + ", " + String.format("%.2f", price);
    }
}
