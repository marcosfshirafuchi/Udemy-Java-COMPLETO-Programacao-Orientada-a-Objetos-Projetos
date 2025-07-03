package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    /**
     * <h1> Udemy Java COMPLETO Programação Orientada a Objetos Projetos:<br>
     * Seção 16 - Interface</h1><br>
     * <b>175. Interface Comparable<br><br></b>
     * Problema motivador<br><br>
     * Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por
     * linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostra-los
     * ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode".<br><br>
     * Maria Brown<br>
     * Alex Green<br>
     * Bob Grey<br>
     * Anna White<br>
     * Alex Black<br>
     * Eduardo Rose<br>
     * Willian Red<br>
     * Marta Blue<br>
     * Alex Brown<br>
     * <br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 02/07/2025
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        String path = "C:\\temp\\in2.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String name = br.readLine();
            while(name != null){
                list.add(name);
                name = br.readLine();
            }
            Collections.sort(list);
            for(String s : list){
                System.out.println(s);
            }

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
