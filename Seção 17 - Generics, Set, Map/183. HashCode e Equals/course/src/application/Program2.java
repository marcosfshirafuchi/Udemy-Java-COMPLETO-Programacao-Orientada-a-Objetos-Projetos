package application;

public class Program2 {

    /**
     * <h1> Udemy Java COMPLETO Programação Orientada a Objetos Projetos:<br><br>
     * Seção 17 - Generics, Set, Map</h1><br><br>
     * <b>183. HashCode e Equals<br><br></b>
     * HashCode<br><br>
     * Método que retorna um número inteiro representando um código gerado
     * a partir das informações do objeto<br><br>
     * String a = "Maria";<br>
     * String b = "Alex";<br><br>
     * System.out.println(a.hashCode());<br>
     * System.out.println(b.hashCode());<br>
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
        String a = "Maria";
        String b = "Alex";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
