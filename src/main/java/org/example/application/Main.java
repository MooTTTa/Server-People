package org.example.application;

import org.example.pessoas.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com", "0000000000", "31/01/2000");
        Pessoa p2 = new Pessoa(null, "Varlos da Silva", "carlos@gmail.com", "0000000000", "31/01/2000");
        Pessoa p3 = new Pessoa(null, "Barlos da Silva", "carlos@gmail.com", "0000000000", "31/01/2000");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        //inserir na tabela
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);

        //buscar na tabela
//        Pessoa p = em.find(Pessoa.class, 2);
//        System.out.println(p);

        //remover na tabela
//        Pessoa p = em.find(Pessoa.class, 3);
//        em.remove(p);

        em.getTransaction().commit();
        emf.close();
        em.close();

        System.out.println("OK");
    }
}