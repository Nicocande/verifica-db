package it.tsp.control;

import java.util.Optional;

import it.tsp.entity.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Store {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory(Store.JPA_PU);
    private static EntityManager em = null;

    public static final String JPA_PU = "bookschool";

    static {
        System.out.println("create entity manager");
        em = emf.createEntityManager();
    }

    public static Book saveBook(Book b) {
        if (em.getTransaction().isActive()) {
            return em.merge(b);
        }
        em.getTransaction().begin();
        Book saved = em.merge(b);
        em.getTransaction().commit();
        return saved;

    }

    public static Optional<Book> findBookbyID(int bookID) {

        Book result = em.find(Book.class, bookID);

        return result == null ? Optional.empty() : Optional.of(result);

    }

    public static void removeBookbyID(int bookID) {
        Book b = em.find(Book.class, bookID);
        if (em.getTransaction().isActive()) {
            em.remove(b);
            return;
        }
        em.getTransaction().begin();
        em.remove(b);
        em.getTransaction().commit();
        System.out.println(b);

    }

    public static void removeBook(Book b) {

        if (em.getTransaction().isActive()) {
            em.remove(b);
            return;
        }
        em.getTransaction().begin();
        em.remove(b);
        em.getTransaction().commit();
        System.out.println(b);
    }

    public static void beginTran() {
        if (em.getTransaction().isActive()) {
            em.getTransaction();
        }
        em.getTransaction().begin();
    }

    public static void commitTran() {
        if (!em.getTransaction().isActive()) {
            throw new StoreException(" connection is alrrady close");
        }
        em.getTransaction().commit();
        ;
    }

    public static void rollTran() {
        if (!em.getTransaction().isActive()) {
            return;
        }
        em.getTransaction().rollback();
    }

}