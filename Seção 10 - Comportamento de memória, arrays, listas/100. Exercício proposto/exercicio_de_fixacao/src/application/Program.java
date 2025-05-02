package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // PART 1 - READING DATA:
        System.out.print("How many employees will be registered? ");
        int n = scanner.nextInt();
        List<Employee> employeeList = new ArrayList<>();
        int id;
        double salary = 0.0;
        Employee employee = new Employee();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Emplyoee #%d:\n", i);
            System.out.print("Id: ");
            id = scanner.nextInt();
            while (hasId(employeeList, id)) {
                System.out.print("Id already taken. Try again: ");
                id = scanner.nextInt();
            }
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            salary = scanner.nextDouble();
            employee = new Employee(id, name, salary);
            employeeList.add(employee);
            System.out.println();
        }

        // PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
        System.out.print("Enter the employee id that will have salary increase : ");
        int idDesejado = scanner.nextInt();

        // Primeiro converto result para stream
        Employee result = employeeList.stream()
                //Fazer o filtro lambda que eu estou buscando o id da lista e senão encontrar recebo null
                .filter(x -> x.getId() == idDesejado).findFirst().orElse(null);
        if (result == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            //Aumento o salario do id encontrado do Employee
            result.increaseSalary(percentage);
        }

        // PART 3 - LISTING EMPLOYEES:
        System.out.println();
        System.out.println("List of employees:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
        scanner.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
