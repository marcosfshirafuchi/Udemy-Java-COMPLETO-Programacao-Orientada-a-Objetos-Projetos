package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa2 {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        //Busca o registro da classe Pessoa com id = 2 do banco de dados
        Pessoa p = em.find(Pessoa.class, 2);

        System.out.println(p);

        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
