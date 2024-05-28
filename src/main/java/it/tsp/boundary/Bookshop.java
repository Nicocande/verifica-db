package it.tsp.boundary;

import java.util.Optional;
import it.tsp.control.Store;
import it.tsp.entity.Book;

public class Bookshop {


    public static Optional<Book> searchBooks(int bookID) {
        return Store.findBookbyID(bookID);
    }

    public static Book addBook(String nameBook, int edition, int price) {

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

    public static void removeBook(String nameBook, int edition, int price) {

        try {
            Store.beginTran();
            Book book = new Book(nameBook, edition, price);
            Store.removeBook(book);
            Store.commitTran();

        } catch (Exception e) {
            Store.rollTran();
        }

    }

    public static void updateBookTable(String namerBook, int edition, int price) {
        try {
            Store.beginTran();
            Book b = new Book(namerBook, edition, price);
            Store.updateRowTable(b);
            Store.commitTran();

        } catch (Exception e) {
            Store.rollTran();

        }

    }

    public static void deleteBookTable(String nameBook, int edition, int price) {

        try {
            Store.beginTran();
            Book b = new Book(nameBook, edition, price);
            Store.deleteRowTable(b);
            Store.commitTran();

        } catch (Exception e) {
            Store.rollTran();

        }

    }

}


