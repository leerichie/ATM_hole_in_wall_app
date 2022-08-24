package first_project;

import java.util.Scanner;

public class ATMProgramme {

        // globally accessible variable - BALANCE
    static double balance = 500;


    // start MENU
    public static void mainMenu() {
        System.out.println("""
                Choose an option:\s
                1. Make a withdrawal\s
                2. Show balance\s
                3. Exit""");
        menuOptions();
    }

    public static void setAmounts(int choice) {

        switch (choice) {
            case 1 -> {
                balance = balance - 20.0;
                System.out.println("You have withdrawn: 20.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
            }
            case 2 -> {
                balance = balance - 50.0;
                System.out.println("You have withdrawn: 50.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
            }
            case 3 -> {
                balance = balance - 100.0;
                System.out.println("You have withdrawn: 100.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
            }
            case 4 -> {
                balance = balance - 150.0;
                System.out.println("You have withdrawn: 150.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
            }
            case 5 -> {
                balance = balance - 200.0;
                System.out.println("You have withdrawn: 200.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
            }
            case 6 -> {
                balance = balance - 250.0;
                System.out.println("You have withdrawn: 250.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
            }
            case 7 -> {
                balance = balance - 500;
                System.out.println("You have withdrawn: 500.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
            }
            case 8 -> System.out.println("Your current balance is: " + balance + " PLN");
        }
        System.out.println("\nPress '0' to return to main menu.");{
            returnToMainMenu();
        }
    }

        // press 0 for main menu
    public static void returnToMainMenu(){
        Scanner input = new Scanner(System.in);
        int returnMenu = input.nextInt();

        if (returnMenu == 0){
            mainMenu();
        } else {
            System.out.println("Invalid choice, try again!");
            returnToMainMenu();
        }
    }

    // calculation of custom balance
    public static void customBalance() {
        Scanner input = new Scanner(System.in);
        double toDeduct;

        System.out.println("Your current balance is: " + balance + " PLN\n" +
                "Enter amount to withdraw: ");
        toDeduct = input.nextInt();

        if (toDeduct <= 0) {
            System.out.println("Invalid amount, try again");
            // toDeduct = input.nextInt();
            customBalance();
        } else if (toDeduct > balance) {
            System.out.println("Insufficient funds, enter a lower amount:");
            //toDeduct = input.nextInt();
            customBalance();
        } else {
            balance = balance - toDeduct;
            System.out.println("Your current balance is: " + balance + " PLN\n\n");
            returnToMainMenu();
        }
    }

    // options MENU
    public static void menuOptions() {

        Scanner input = new Scanner(System.in);
        int options = input.nextInt();

        if (options == 1 || options == 2 || options == 3) {
            switch (options) {
                case 1 -> withdraw();

                case 2 -> setAmounts(8);

                case 3 -> System.out.println("See you again soon!\n\n");

                case 0 -> mainMenu();
                default -> {
                    System.out.println("Invalid choice, please try again.\n\n");
                    mainMenu();
                }

            }
        }
        else {
            System.out.println("Invalid choice, choose an option from 1 to 3\n");
            mainMenu();
        }
    }

    // withdraw MENU
    public static void withdraw() {
        System.out.println("""
                            How much would you like to withdraw:\s

                            1. 20      5. 200
                            2. 50      6. 250
                            3. 100     7. 500
                            4. 150     8. custom\s

                            Press '0' to return to main menu.
                            """);
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 0) {
            mainMenu();
        }
        switch (choice) {
            case 1 -> {
                setAmounts(1);
                returnToMainMenu();
            }
            case 2 -> {
                setAmounts(2);
                returnToMainMenu();
            }
            case 3 -> {
                setAmounts(3);
                returnToMainMenu();
            }
            case 4 -> {
                setAmounts(4);
                returnToMainMenu();
            }
            case 5 -> {
                setAmounts(5);
                returnToMainMenu();
            }
            case 6 -> {
                setAmounts(6);
                returnToMainMenu();
            }
            case 7 -> {
                setAmounts(7);
                returnToMainMenu();
            }
            case 8 -> {
                customBalance();
                returnToMainMenu();
            }
        }
    }

    // main

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final int pin = 1234;
        int count = 3;

        System.out.println("Enter pin: ");
        int checkPin = input.nextInt();

        for (int i = 0; i < 3; i++) {
            if (checkPin < 1000 || checkPin > 9999) {
                System.out.println("Pin must have 4 digits only");
                System.out.println("Enter pin: ");
                checkPin = input.nextInt();
            }

            if (checkPin == pin) {

                System.out.println("* Welcome back! *\n");
                mainMenu();

            } else {
                count--;
                System.out.println("Invalid pin, you have " + count + " tries remaining");

                System.out.println("Enter pin: ");
                checkPin = input.nextInt();

            }

            if (count == 0) {
                System.out.println("Pin blocked");
            }
        }
    }
}