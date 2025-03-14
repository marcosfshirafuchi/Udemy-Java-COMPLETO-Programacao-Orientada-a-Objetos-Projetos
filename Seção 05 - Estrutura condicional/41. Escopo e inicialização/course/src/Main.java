public class Main {
    public static void main(String[] args) {
        double price = 400.00;
        double discount = 0;
        if(price < 200.00){
            discount = price * 0.1;
        }
        else{
            discount = 0;
        }
        System.out.println(price);

    }
}