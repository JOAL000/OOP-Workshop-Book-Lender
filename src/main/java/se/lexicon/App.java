package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Initialize Person instance
        Person person = new Person("John", "Doe");

        // Display initial state
        System.out.println("Initial state:");
        System.out.println(book1.getBookInformation());
        System.out.println(book2.getBookInformation());
        System.out.println(person.getPersonInformation());

        // Simulate borrowing a book
        System.out.println("\nSimulating borrowing a book:");
        person.loanBook(book1);
        System.out.println(book1.getBookInformation());
        System.out.println(person.getPersonInformation());

        // Simulate returning a book
        System.out.println("\nSimulating returning a book:");
        person.returnBook(book1);
        System.out.println(book1.getBookInformation());
        System.out.println(person.getPersonInformation());

    }

}
