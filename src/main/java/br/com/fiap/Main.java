package br.com.fiap;

import br.com.fiap.model.Contato;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setName("Pedro Teles");
        contato.setEmail("Pedro.teles@igcp.com.br");
        contato.setBirthDay(LocalDate.of(2001, 1, 10));

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("microservicos_spring");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(contato);
        em.getTransaction().commit();
        em.close();
    }
}