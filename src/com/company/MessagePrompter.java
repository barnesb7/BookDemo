package com.company;

import java.util.Scanner;

public class MessagePrompter {

    private Scanner scanner2 = new Scanner(System.in);
    private String welcomePrompt = "Wud up? You know about books?";
    private String seeNumberOfBooksOption = "[1] See how many books I have";
    private String addBookOption = "[2] Add a book to my library";
    private String searchForBookOption = "[3] Search for a saved book";
    private String updateBookOption = "[4] Update a books information";
    private String deleteBookOption = "[5] Delete a book";
    private String exitPrompt = "[6] Exit";
    private final String NEWLINE = "\n";

    public void showMenu(){
        System.out.println(welcomePrompt + NEWLINE + seeNumberOfBooksOption + NEWLINE + addBookOption + NEWLINE  + searchForBookOption + NEWLINE + updateBookOption + NEWLINE + deleteBookOption + NEWLINE  + exitPrompt); }

    public void invalidInputPrompt() {
        System.out.println("Please input only the digits [1], [2], or [3]");
    }

    public void askForTitle(){
        System.out.println("What is the book's title?");
    }

    public void askForAuthor(){
        System.out.println("Who is your book's author?");
    }

    public void askForNumberOfPages(){
        System.out.println("How many pages does your book have?");
    }

    public void deleteBookPrompt(){
        System.out.println("What is the title of the book you would like to delete?");
    }

    public String updatePromptForSearch(){
        System.out.println("What is the title of the book you would like to update?");
        return scanner2.nextLine();
    }

    public String updateWhichPropertyPrompt(){
        System.out.println("Update [1] Title, [2] Author, [3] Number Of Pages");
        return scanner2.nextLine();
    }
}
