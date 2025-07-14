package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4, 5, 10, 7);

        //Operações intermediárias: map
        //O map aplica uma função(x -> x * 10) a cada elemento da stream
        Stream<Integer> st1 = list.stream().map( x -> x * 10);

        //Operações terminais: toArray
        System.out.println(Arrays.toString(st1.toArray()));
    }
}
