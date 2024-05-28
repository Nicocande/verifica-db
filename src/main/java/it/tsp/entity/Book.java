package it.tsp.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name = "t_books")


public class Book {
    @Column(name = "bname")
    private String bname;
    @Column(name = "edition")
    private int edition;
    @Column(name = "price")
    private int price;

    public Book() {

    }

    public Book(String bname, int edition, int price) {
        this.bname = bname;
        this.edition = edition;
        this.price = price;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
