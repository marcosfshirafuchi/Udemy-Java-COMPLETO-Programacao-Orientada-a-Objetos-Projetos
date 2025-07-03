package application;

import entities.Employee;

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
     * Faça um programa para ler um arquivo contendo funcionários (nome e salário) no
     * formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar
     * o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".<br><br>
     * Maria Brown,4300.00<br>
     * Alex Green,3100.00<br>
     * Bob Grey,3100.00<br>
     * Anna White,3500.00<br>
     * Alex Black,2450.00<br>
     * Eduardo Rose,4390.00<br>
     * Willian Red,2900.00<br>
     * Marta Blue,6100.00<br>
     * Alex Brown,5000.00<br><br>
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
        List<Employee> list = new ArrayList();
        String path = "C:\\temp\\in3.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String employeeCsv = br.readLine();
            while(employeeCsv != null){
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for(Employee emp : list){
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
