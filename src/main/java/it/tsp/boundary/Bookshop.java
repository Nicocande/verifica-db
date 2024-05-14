package it.tsp.boundary;

import java.util.Optional;
import it.tsp.control.Store;
import it.tsp.entity.Book;

public class Bookshop {

    public static Optional<Book> searchBooks(int bookID) {
        return Store.findBookbyID(bookID);
    }

    public Book bookRegistration(String nameBook, int edition, int price) {
        try {
            Store.beginTran();
            Book book = new Book(nameBook, edition, price);
            Store.saveBook(book);
            Store.commitTran();
            return book;

        } catch (Exception e) {
            Store.rollTran();
        }
        return null;
    }

    public static void addBook(String nameBook, int edition,int price) {
        Store.beginTran();
        Book book= new Book(nameBook, edition, price);
        Store.saveBook(book);
        Store.commitTran();
        Store.rollTran();

    }

    public static void removeBook(String nameBook,int edition, int price) {
        Store.beginTran();
        Book book = new Book(nameBook, edition, price);
        Store.removeBook(book);
        Store.commitTran();
        Store.rollTran();

    }
    public static void updateBooksTable(){


    }
}
