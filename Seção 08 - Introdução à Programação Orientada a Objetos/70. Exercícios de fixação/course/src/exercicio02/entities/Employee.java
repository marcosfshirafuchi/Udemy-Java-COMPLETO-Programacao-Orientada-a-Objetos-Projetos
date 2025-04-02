package exercicio02.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        double salary = netSalary() + (grossSalary * 0.10);
        System.out.printf("Updated data: %s, $ %.2f%n", name, salary);
    }
}
