package com.company;

public class MessagePrompter {

    private String welcomePrompt = "Wud up? You know about books?";
    private String seeNumberOfBooksOption = "[1] See how many books I have";
    private String addBookOption = "[2] Add a book to my library";
    private String exitPrompt = "[3] Exit";
    private final String NEWLINE = "\n";

    public void showMenu(){
        System.out.println(welcomePrompt + NEWLINE + seeNumberOfBooksOption + NEWLINE + addBookOption + NEWLINE + exitPrompt);

    }

    public void invalidInputPrompt() {
        System.out.println("Please input only the digits [1], [2], or [3]");
    }

    public void askForTitle(){
        System.out.println("What is your book's title?");
    }

    public void askForAuthor(){
        System.out.println("Who is your book's author?");
    }

    public void askForNumberOfPages(){
        System.out.println("How many pages does your book have?");
    }
}
