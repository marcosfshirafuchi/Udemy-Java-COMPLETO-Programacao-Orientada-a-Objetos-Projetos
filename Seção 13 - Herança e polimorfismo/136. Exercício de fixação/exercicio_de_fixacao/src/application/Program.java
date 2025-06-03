package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.printf("Product #%d data:\n", i + 1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char tipo = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String nome = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            if (tipo == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = scanner.nextDouble();
                scanner.nextLine();
                products.add(new ImportedProduct(nome,price,customsFee));

            } else if (tipo == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dataIntroduzida = scanner.nextLine();
                Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataIntroduzida);
                products.add(new UsedProduct(nome,price,data));
            }
            else if (tipo == 'c'){
                products.add(new Product(nome,price));
            }
        }

        System.out.println();

        for (Product p : products){
            System.out.println(p.priceTag());
        }
        scanner.close();
    }
}
