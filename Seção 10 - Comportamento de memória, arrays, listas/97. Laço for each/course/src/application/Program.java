package application;

public class Program {
    public static void main(String[] args) {
        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        //Laço for normal
        for (int i = 0; i < vect.length;i++){
            System.out.println(vect[i]);
        }

        System.out.println("---------------------------------------");
        
        //Laço for each
        //Tipo: String, nome dos elementos: obj e coleção: vect
        for (String obj: vect){
            System.out.println(obj);
        }
    }
}
