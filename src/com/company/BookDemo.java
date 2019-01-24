package com.company;

import java.util.Scanner;

// constructor with paramaters using user input
// delete a book
// searched for saved book
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

      Book newBook = new Book();

        messagePrompter.askForTitle();
        newBook.setTitle(userInput.next());

        messagePrompter.askForAuthor();
        newBook.setAuthor(userInput.next());

        messagePrompter.askForNumberOfPages();
        newBook.setNumberOfPages(userInput.nextInt());

        library.addBookToBookShelf(newBook);

    }else if (userChoice == 3){
        continueProgram = false;
    } else {
        messagePrompter.invalidInputPrompt();
    }




    }while(continueProgram);

    }
}
