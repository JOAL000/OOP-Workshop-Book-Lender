package se.lexicon.model;


import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    private String id;
    private final String title;
    private final String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available=true;
        setID();
    }

    public Book(String title, String author, Person borrower) {
        this.title = title;
        this.author = author;
        this.borrower = borrower;
        this.available=true;
        setID();
    }

    private void setID (){
        this.id= UUID.randomUUID().toString();
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }

    public String getBookInformation() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }
}