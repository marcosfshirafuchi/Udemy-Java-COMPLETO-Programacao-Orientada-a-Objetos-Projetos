package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

    /**
     * <h1> Udemy Java COMPLETO Programação Orientada a Objetos Projetos:<br><br>
     * Seção 17 - Generics, Set, Map</h1><br><br>
     * <b>182. Curingas delimitados<br><br></b>
     * Princípio get/put - contravariância<br><br>
     * List<Object> myObjs = new ArrayList<Object>();<br><br>
     * myObjs.add("Maria");<br>
     * myObjs.add("Alex");<br>
     * List<? super Number> myNums = myObjs;<br><br>
     * myNums.add(10);<br>
     * myNums.add(3.14);<br>
     * Number x = myNums.get(0); // erro de compilacao<br><br>
     * get - ERROR<br>
     * put - OK<br>
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
        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");
        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);
        Number x = myNums.get(0); // erro de compilacao
    }
}
