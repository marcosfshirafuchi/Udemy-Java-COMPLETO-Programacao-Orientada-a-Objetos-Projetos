package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        //Operações terminais: toArray
        System.out.println(Arrays.toString(st1.toArray()));

        //0 é elemento neutro para o calculo da soma
        int sum = list.stream().reduce(0, (x,y) -> x + y);
        System.out.println("SUM = " + sum);

        List<Integer> newList = list.stream()
                //filtra a lista e cria um novo stream
                .filter(x -> x % 2 == 0)
                //o map vai transformar cada elemento do novo stream
                .map(x -> x * 10)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray()));
    }
}
