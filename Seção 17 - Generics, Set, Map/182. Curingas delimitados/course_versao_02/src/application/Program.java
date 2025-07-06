package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    /**
     * <h1> Udemy Java COMPLETO Programação Orientada a Objetos Projetos:<br><br>
     * Seção 17 - Generics, Set, Map</h1><br><br>
     * <b>182. Curingas delimitados<br><br></b>
     * Princípio get/put - covariância<br><br>
     * List<Integer> intList = new ArrayList<Integer>();<br>
     * intList.add(10);<br>
     * intList.add(5);<br><br>
     * List<? extends Number> list = intList;<br><br>
     * Number x = list.get(0);<br><br>
     * list.add(20); // erro de compilacao<br><br>
     * get - OK<br>
     * put - ERROR<br>
     * <br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 06/07/2025
     */
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);
        List<? extends Number> list = intList;
        Number x = list.get(0);
        list.add(20); // erro de compilacao
    }
}
