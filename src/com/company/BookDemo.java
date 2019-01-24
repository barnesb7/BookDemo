package com.company;

import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    MessagePrompter messagePrompter = new MessagePrompter();

    boolean continueProgram = true;
    int userChoice;

    do{
    messagePrompter.showMenu();
    userChoice = userInput.nextInt();

    if(userChoice == 1){

    }else if (userChoice == 2){

    }else if (userChoice == 3){
        continueProgram = false;
    } else {
        messagePrompter.invalidInputPrompt();
    }




    }while(continueProgram);

    }
}
