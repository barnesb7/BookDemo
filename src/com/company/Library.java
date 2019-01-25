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

    public void deleteBook(String bookTitle){
        int indexCounter = 0;
        boolean bookFound = false;

        for (Book book: books) {
            if(book != null && book.getTitle().equals(bookTitle)){
                books[indexCounter] = null;
                bookFound = true;
            }
            indexCounter++;
        }

        if(bookFound){
            System.out.println("The book " + bookTitle + " was found and deleted from your library.");
        } else {
            System.out.println("Sorry, the book " + bookTitle + " was not found in your Library and therefore could not be deleted.");
        }

    }

    public void searchForBookByTitle(String bookTitle){

        boolean bookFound = false;
        String foundAuthor = "Anonymous";
        int foundBookNumberOfPages = 0;

        for (Book book: books) {
            if(book != null && book.getTitle().equals(bookTitle)){

                foundAuthor = book.getAuthor();
                foundBookNumberOfPages = book.getNumberOfPages();
                bookFound = true;
            }
        }

        if(bookFound){
            System.out.println("The book " + bookTitle + " was found in your library. It is by " + foundAuthor + " and has " + foundBookNumberOfPages + " pages. \n");
        } else {
            System.out.println("Sorry, the book " + bookTitle + " was not found in your Library. \n");
        }
    }

    public boolean updateTitle(String currentTitle, String newTitle){

        boolean bookfound = false;

        for (Book book: books) {
            if (book != null && book.getTitle().equals(currentTitle)) {

                book.setTitle(newTitle);
                bookfound = true;
            }
        }
           if(bookfound){
               System.out.println("The book title has been successfully updated. \n");
           } else {
               System.out.println("Sorry, the book " + currentTitle + " was not found in your Library. \n");
           }

        return bookfound;
    }

    public void updateAuthor(String bookTitle, String authorNewName){
        boolean bookfound = false;

        for (Book book: books) {
            if(book != null && book.getTitle().equals(bookTitle)){

                book.setAuthor(authorNewName);
                bookfound = true;
            }
        }

        if(bookfound){
            System.out.println("The book author has been successfully updated. \n");
        } else {
            System.out.println("Sorry, the book " + bookTitle + " was not found in your Library. \n");
        }
    }

    public void updateNumberOfPages(String bookTitle, int updatedNumberOfPages){
        boolean bookfound = false;

        for (Book book: books) {
            if(book != null && book.getTitle().equals(bookTitle)){

                book.setNumberOfPages(updatedNumberOfPages);
                bookfound = true;
            }
        }


        if(bookfound){
            System.out.println("The book's number of pages has been successfully updated. \n");
        } else {
            System.out.println("Sorry, the book " + bookTitle + " was not found in your Library. \n");
        }
    }


}
