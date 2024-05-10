package it.tsp.entity;

public class Book {
    private int bookID;
    private String bname;
    private String edition;
    private int price;



    public Book(int bookID, String bname, String edition, int price) {
        this.bookID = bookID;
        this.bname = bname;
        this.edition = edition;
        this.price = price;
    }



    public Book() {
    }



    public String getBname() {
        return bname;
    }



    public void setBname(String bname) {
        this.bname = bname;
    }



    public String getEdition() {
        return edition;
    }



    public void setEdition(String edition) {
        this.edition = edition;
    }



    public int getPrice() {
        return price;
    }



    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Book [bookID=" + bookID + ", bname=" + bname + ", edition=" + edition + ", price=" + price + "]";
    }

    


    


    

}
