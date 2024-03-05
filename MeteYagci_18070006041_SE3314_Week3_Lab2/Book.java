/**
 * @author  MeteYagci
 * @version 1.0.0
 * @since 27.02.2024
 */
package org.example;


public class Book {
    public String title;
    public String author;
    public String ISBN;
    public boolean isAvailable;
    /**
     *
     *  Constructor of title,author and ISBN
     * @param title     Book Title
     * @param author    Book Author
     * @param ISBN      ISBN of the book
     */
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    /**
     *
     * @param title set titles
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @param author set authors
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     *
     * @param ISBN  set ISBN
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Gets the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * Gets and @return the author of the book .
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the ISBN of the book.
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Checks if the book is available or not
     * @return If book is available returns true , else return false
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability of the books
     * @param available  if the book is available its true otherwise its false.
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }


}



