package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null,"Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null,"Joaquim Torres", "joaquim@gmail.com");
        Pessoa p3 = new Pessoa(null,"Ana Maria", "ana@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        //Iniciar a transação com o banco de dados
        em.getTransaction().begin();

        //Insere dados no banco de dados
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);

        //Confirmar as alterações que a pessoa fez
        em.getTransaction().commit();

        System.out.println("Pronto!");

    }
}
