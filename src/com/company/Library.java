package com.company;

public class Library {

    private Book[] books = new Book[5];
    private int numberOfNullIndexes;


    public void printNumberOfBooks(){

        numberOfNullIndexes = 0;

        for (Book book: books) {
            if(book == null){
               numberOfNullIndexes ++;
            }
        }

        System.out.println("You have " + (books.length - numberOfNullIndexes) + " books in your library.");

        printBooksDetails();

    }

    public void printBooksDetails(){
        for(Book book: books){
            if(book != null){
                System.out.println("<-- " + book.getTitle() + " by " + book.getAuthor() + " -->");
            }
        }
    }

    public void addBookToBookShelf(Book newBook){

        int counter = 0;

        for (Book book : books) {

            if(book == null){
                books[counter] = newBook;
                break;
            } else if (counter == 3){
                books[counter + 1] = newBook;
                System.out.println("YOUR LIBRARY IS NOW FULL. You must remove a book before adding another");
                break;
            }

            counter++;
        }
    }

}
