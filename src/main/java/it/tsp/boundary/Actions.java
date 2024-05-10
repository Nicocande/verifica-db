package it.tsp.boundary;

import java.math.BigDecimal;
import java.util.Objects;

import it.tsp.control.Store;
import it.tsp.entity.Book;

public class Actions {

     public static Book registration(int bookID, String bname, String edition, int price) {

     
            Store.beginTran();

            Book newbook = new Book(bookID, bname, edition, price)

            Book saved = Store.saveAccount(newbook);

        }

    }


}
