package com.educandoweb.applicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.educandoweb.dominio.Pessoa;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 1);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        System.out.println("pronto");
        em.close();
        emf.close();
    }
}
