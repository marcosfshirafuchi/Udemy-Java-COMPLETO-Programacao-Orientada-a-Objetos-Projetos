package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");

        System.out.println(list.size());


        for (String x: list){
            System.out.println(x);
        }

        System.out.println("-----------------------");
        //Remove pelo nome
        //list.remove("Anna");

        //Remove pelo indice da lista
        //list.remove(1);

        //Remove da lista os nomes de começa com M
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x: list){
            System.out.println(x);
        }

        System.out.println("-----------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-----------------------");
        // Primeiro converto list para stream
        List<String> result = list.stream()
                //Fazer o filtro lambada que eu quero os elementos que começa com a letra A
                .filter(x -> x.charAt(0) == 'A')
                //Depois voltar para lista
                .collect(Collectors.toList());

        for (String x: result){
            System.out.println(x);
        }

        System.out.println("-----------------------");
        // Primeiro converto list para stream
        String name = list.stream()
                //Fazer o filtro lambada que eu quero os elementos que começa com a letra J
                .filter(x -> x.charAt(0) == 'J')
                //Procura o primeiro elemento que começa com J na lista e se não encontra recebe null
                .findFirst().orElse(null);
        System.out.println(name);

    }
}
