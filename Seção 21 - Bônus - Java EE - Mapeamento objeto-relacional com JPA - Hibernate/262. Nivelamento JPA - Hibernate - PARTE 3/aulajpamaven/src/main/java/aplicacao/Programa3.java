package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa3 {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        //Busca o registro da classe Pessoa com id = 2 do banco de dados
        Pessoa p = em.find(Pessoa.class, 2);

        //Iniciar a transação com o banco de dados
        em.getTransaction().begin();
        //remove um registro no banco de dados
        em.remove(p);
        //Comita a transação no banco de dados
        em.getTransaction().commit();


        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
