package exercicio02.entities;

public class Student {
    public String nome;
    public double note1;
    public double note2;
    public double note3;

    public double finalGrade(){
        return note1 + note2 + note3;
    }
    public void result(){
        double grade = finalGrade();
        System.out.println(String.format("FINAL GRADE = %.2f", grade));
        if (grade >= 60.0){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60.0 - grade);
        }
    }

}
