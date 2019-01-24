package com.company;

public class Library {

    private Book[] books = new Book[5];

    public int numberOfBooksInLibrary(){
        return books.length;
    }

    public void printNumberOfBooks(){
        System.out.println("Your library has " + books.length + " books!");
    }


    public void addBookToBookShelf(Book newBook){

        int counter = 0;

        for (Book book : books) {

            if(book == null){
                books[counter]= newBook;
            } else if (counter == 3){
                books[counter + 1] = newBook;
                System.out.println("Your library is now full. You must remove a book before adding another");
            }

            counter++;
        }
    }

}
