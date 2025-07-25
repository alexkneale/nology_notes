package org.example.qa_notes.OOPIntro.Practice.Book;

public class Book {
    // fields
    private String author;
    private String title;
    private String genre;
    private int numPages;

    //constructor
    public Book(String author, String title, String genre, int numPages) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }

    // we only have getters, no setters
    // so we have STATIC class
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public int getNumPages() {
        return numPages;
    }

    public void printBookDetails() {
        System.out.println(getTitle());
        System.out.println("by " + getAuthor());
        System.out.println("has "+ getNumPages() + " pages and its genre is " + getGenre());

    }

}
