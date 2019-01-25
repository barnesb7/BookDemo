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

        String updateTitleOption = "1";
        String updateAuthorOption = "2";
        String updateNumberOfPagesOption = "3";
        boolean continueToUpdate = true;

        userInput.nextLine(); //clearing buffer

        String bookToUpdateByTitle = messagePrompter.updatePromptForSearch();

        do {
            String bookPropertyToUpdate = messagePrompter.updateWhichPropertyPrompt();

            if (bookPropertyToUpdate.equals(updateTitleOption)) {

                    System.out.println("What is the new title?");
                    String newTitle = userInput.nextLine();

                    boolean updateSuccessful = library.updateTitle(bookToUpdateByTitle, newTitle );

                    if(updateSuccessful){
                        bookToUpdateByTitle = newTitle;
                    }

            } else if (bookPropertyToUpdate.equals(updateAuthorOption)) {
                    userInput.nextLine(); // clear buffer

                    System.out.println("What is the new authors name?");
                    String newAuthorName = userInput.nextLine();

                    library.updateAuthor(bookToUpdateByTitle, newAuthorName );

            } else if (bookPropertyToUpdate.equals(updateNumberOfPagesOption)) {
                    userInput.nextLine();  // clear buffer

                System.out.println("What is the new page number?");
                int updatedNumberOfPages = userInput.nextInt();

                library.updateNumberOfPages(bookToUpdateByTitle, updatedNumberOfPages);
            }

            System.out.println("Would you like to make another update? [1] Yes  [2] No");
            int userWantsMoreUpdates = userInput.nextInt();

            if(userWantsMoreUpdates == 2){
                continueToUpdate = false;
            }

            }while(continueToUpdate);

    } else if (userChoice == 5){
        userInput.nextLine();  //clearing buffer

        messagePrompter.deleteBookPrompt();
        String bookToDeleteByTitle = userInput.nextLine();

        library.deleteBook(bookToDeleteByTitle);

    } else if (userChoice == 6){
        continueProgram = false;
    } else {
        messagePrompter.invalidInputPrompt();
    }

    }while(continueProgram);

    }
}
