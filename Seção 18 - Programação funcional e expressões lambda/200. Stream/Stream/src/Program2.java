import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList( 3, 4, 5, 10, 7);

        //Map aplica uma função a cada elemento do stream
        //Criar uma stream a partir de uma coleção
        Stream<Integer> st1 = list.stream().map(x-> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        //CRiação de uma stream a partir do Stream.of
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        //Função de interação
        Stream<Integer> st3 = Stream.iterate(0, x -> x +2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        Stream<Long> st4 = Stream.iterate(new Long[]{ 0L, 1L}, p -> new Long[]{p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(20).toArray()));
    }
}