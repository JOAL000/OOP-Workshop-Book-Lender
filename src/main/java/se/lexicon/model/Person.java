package se.lexicon.model;

import java.util.ArrayList;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Book> books = new ArrayList<>();

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id=getNextId();
    }

    private int getNextId() {
        return ++sequencer;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void loanBook(Book book){
        if (book.isAvailable()){
            books.add(book);
            book.setAvailable(false);
            book.setBorrower(this);
        }

    }

    public void returnBook(Book book){
        if (books.remove(book)){
            book.setAvailable(true);
            book.setBorrower(null);
        }

    }

    public String getPersonInformation() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}