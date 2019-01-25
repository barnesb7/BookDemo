package com.company;

import java.util.Scanner;

// update a books information

public class BookDemo {

    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    MessagePrompter messagePrompter = new MessagePrompter();
    Library library = new Library();

    boolean continueProgram = true;
    int userChoice;

    do{
    messagePrompter.showMenu();
    userChoice = userInput.nextInt();

    if(userChoice == 1){
        library.printNumberOfBooks();
    }else if (userChoice == 2){

        messagePrompter.askForTitle();
        userInput.nextLine();
        String title = userInput.nextLine();

        messagePrompter.askForAuthor();
        String author = userInput.nextLine();

        messagePrompter.askForNumberOfPages();
        int numberOfPages = userInput.nextInt();


        Book newBook = new Book(title, author, numberOfPages);
        library.addBookToBookShelf(newBook);

    } else if (userChoice == 3){
        userInput.nextLine(); //clearing buffer

        messagePrompter.askForTitle();
        String bookToSearchFor = userInput.nextLine();

        library.searchForBookByTitle(bookToSearchFor);

    } else if (userChoice == 4){

    } else if (userChoice == 5){

    } else if (userChoice == 6){
        userInput.nextLine();  //clearing buffer

        messagePrompter.deleteBookPrompt();
        String bookToDeleteByTitle = userInput.nextLine();

        library.deleteBook(bookToDeleteByTitle);

    } else if (userChoice == 7){
        continueProgram = false;
    } else {
        messagePrompter.invalidInputPrompt();
    }

    }while(continueProgram);

    }
}
