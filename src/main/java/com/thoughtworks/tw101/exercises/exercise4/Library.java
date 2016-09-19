package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;



    //Print books containing a partial book name method
    public void printBooksContaining(String partialBookTitle) {
        for(int i=0; i < books.length; i++){
            if(books[i].contains(partialBookTitle)){
                printStream.print(books[i]);
                printStream.println();
            }
        }
    }

    //Constructor
    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }
}
