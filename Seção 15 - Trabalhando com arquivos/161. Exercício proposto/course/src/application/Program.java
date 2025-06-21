package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    /**
     * <h1> Udemy Java COMPLETO Programação Orientada a Objetos Projetos:<br>
     * Seção 15 - Tratamento de exceções</h1><br>
     * <b>161. Exercício de fixação<br><br></b>
     * Exercício de fixação<br><br>
     * Fazer um programa para ler o caminho de um arquivo .csv<br>
     * contendo os dados de itens vendidos. Cada item possui um<br>
     * nome, preço unitário e quantidade, separados por vírgula. Você<br>
     * deve gerar um novo arquivo chamado "summary.csv", localizado<br>
     * em uma subpasta chamada "out" a partir da pasta original do<br>
     * arquivo de origem, contendo apenas o nome e o valor total para<br>
     * aquele item (preço unitário multiplicado pela quantidade),<br>
     * conforme exemplo.<br><br>
     * Example:<br><br>
     * Source file:<br>
     *TV LED,1290.99,1<br>
     * Video Game Chair,350.50,3<br>
     * Iphone X,900.00,2<br>
     * Samsung Galaxy 9,850.00,2<br><br>
     * Output file (out/summary.csv):<br>
     * TV LED,1290.99<br>
     * Video Game Chair,1051.50<br>
     * Iphone X,1800.00<br>
     * Samsung Galaxy 9,1700.00<br>
     * <br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 20/06/2025
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();
        System.out.println();
        String line = null;
        File path = new File(strPath);
        List<Product> productList = new ArrayList<>();
        Product product = new Product();
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            line = br.readLine();
            System.out.println("Source file ("+path.getPath()+"):");
            while(line != null){
                String[] frutas =line.split(",");
                product = new Product(frutas[0] , Double.parseDouble(frutas[1]), Integer.parseInt(frutas[2]));
                System.out.println(line);
                productList.add(product);
                line = br.readLine();
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
        String outPath = "C:\\temp\\out\\summary.csv";
        System.out.println("Output file (out/summary.csv):");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))) {
            for (Product product1 : productList) {
                System.out.println(product1.getName() + ", "+ String.format("%.2f",product1.calculate()));
                bw.write(product1.getName() + ", " + String.format("%.2f",product1.calculate()));
                bw.newLine();
            }
            System.out.println();
            System.out.println("c:/out/sumary.csv - CREATED");
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
