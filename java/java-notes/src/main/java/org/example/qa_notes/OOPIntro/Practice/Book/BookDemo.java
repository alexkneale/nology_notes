package org.example.qa_notes.OOPIntro.Practice.Book;

public class BookDemo {
    public static void main(String[] args) {
        Book gameOfThrones = new Book("George Martin", "Game of Thrones", "Fantasy", 864);

        Book mathBook = new Book("James Stewart", "Calculus", "Math", 200);

        Book javaBook = new Book("Joel Murach", "Java Programming", "Java", 900);

        gameOfThrones.printBookDetails();
        mathBook.printBookDetails();
        javaBook.printBookDetails();


    }


}
