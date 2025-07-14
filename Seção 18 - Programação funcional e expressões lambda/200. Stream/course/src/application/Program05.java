package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program05 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4, 5, 10, 7);

        //Operações intermediárias: map
        //O map aplica uma função(x -> x * 10) a cada elemento da stream
        Stream<Integer> st1 = list.stream().map( x -> x * 10);

        //Operações terminais: toArray
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));


        Stream<Long> st4 =
                //primeiro elemento da stream
                Stream.iterate(new Long[]{0L, 1L},
                        //primeiro elemento anterior na posição 1 e segundo elemento é soma dos dois elementos anteriores
                        p -> new Long[]{p[1], p[0]+p[1]})
                        //O map vai pegar o p na posição zero
                        .map(p -> p[0]);

        System.out.println(Arrays.toString(st4.limit(20).toArray()));

    }
}
