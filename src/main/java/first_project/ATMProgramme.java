package first_project;

import java.util.Scanner;

public class ATMProgramme {

    static double balance = 500;
    static int amounts;


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
            case 1:
                balance = balance - 20.0;
                System.out.println("You have withdrawn: 20.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
                break;
            case 2:
                balance = balance - 50.0;
                System.out.println("You have withdrawn: 50.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
                break;
            case 3:
                balance = balance - 100.0;
                System.out.println("You have withdrawn: 100.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
                break;
            case 4:
                balance = balance - 150.0;
                System.out.println("You have withdrawn: 150.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
                break;
            case 5:
                balance = balance - 200.0;
                System.out.println("You have withdrawn: 200.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
                break;
            case 6:
                balance = balance - 250.0;
                System.out.println("You have withdrawn: 250.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
                break;
            case 7:
                balance = balance - 500;
                System.out.println("You have withdrawn: 500.0 PLN \n" +
                        "Your current balance is: " + balance + " PLN");
                break;
            case 8:
                System.out.println("Your current balance is: " + balance + " PLN");
                break;
        }
        System.out.println("Press '0' to return to main menu.");
    }

    // calculation of custom balance
    public static void customBalance() {
        Scanner input = new Scanner(System.in);
        double initBalance = 500.0;
        double toDeduct;
        double newBalance;

        System.out.println("Your current balance is: " + initBalance + " PLN\n" +
                "Enter amount to withdraw: ");
        toDeduct = input.nextInt();

        newBalance = initBalance - toDeduct;

        if (toDeduct <= 0) {
            System.out.println("Invalid amount, try again");
            toDeduct = input.nextInt();
        } else if (toDeduct > initBalance) {
            System.out.println("Insufficient funds, enter a lower amount:");
            toDeduct = input.nextInt();
        } else {
            System.out.println("Your current balance is: " + newBalance + " PLN\n\n" +
                    "Press '0' to return to the main menu.");
        }

    }

    // options MENU
    public static void menuOptions() {

        Scanner input = new Scanner(System.in);
        int options = input.nextInt();
        amounts = options;
        switch (options) {
            case 1 -> {
                System.out.println("""
                        How much would you like to withdraw:\s

                        1. 20      5. 200
                        2. 50      6. 250
                        3. 100     7. 500
                        4. 150     8. custom\s

                        Press '0' to return to main menu.
                        """);
                if (input.nextInt() == 0) {
                    mainMenu();
                } else {
                    withdraw();
                }
            }
            case 2 -> {
                setAmounts(8);

//                System.out.println("""
//                        Your balance is:\s
//
//                        500 PLN\s
//
//                        Press '0' to return to the main menu.
//                        """);
                if (input.nextInt() == 0) {
                    mainMenu();
                }
            }
            case 3 -> System.out.println("See you again soon!\n\n");
            case 0 -> mainMenu();
            default -> {
                System.out.println("Invalid choice, please try again.\n\n");
                mainMenu();
            }
        }
    }

    // withdraw MENU
    public static void withdraw() {
        Scanner input = new Scanner(System.in);
        switch (amounts) {
            case 1 -> {
                setAmounts(1);
//                System.out.println("""
//                         The transaction is being processed, please wait...
//
//                         You have withdrawn: 20 PLN
//                         Your current balance is: 480 PLN
//
//                        - Goodbye
//
//                             Press '0' to return to the main menu.
//                             """);
                if (input.nextInt() == 0) {
                    mainMenu();
                }
            }
            case 2 -> {
                setAmounts(2);
//                System.out.println("""
//                         The transaction is being processed, please wait...
//
//                         You have withdrawn: 50 PLN
//                         Your current balance is: 450 PLN
//
//                        - Goodbye
//
//                             Press '0' to return to the main menu.
//                             """);
                if (input.nextInt() == 0) {
                    mainMenu();
                }
            }
            case 3 -> {
                setAmounts(3);
//                System.out.println("""
//                         The transaction is being processed, please wait...
//
//                         You have withdrawn: 100 PLN
//                         Your current balance is: 400 PLN
//
//                        - Goodbye
//
//                             Press '0' to return to the main menu.
//                             """);
                if (input.nextInt() == 0) {
                    mainMenu();
                }
            }
            case 4 -> {
                setAmounts(4);
//                System.out.println("""
//                         The transaction is being processed, please wait...
//
//                         You have withdrawn: 150 PLN
//                         Your current balance is: 350 PLN
//
//                        - Goodbye
//
//                             Press '0' to return to the main menu.
//                             """);
                if (input.nextInt() == 0) {
                    mainMenu();
                }
            }
            case 5 -> {
                setAmounts(5);
//                System.out.println("""
//                         The transaction is being processed, please wait...
//
//                         You have withdrawn: 200 PLN
//                         Your current balance is: 300 PLN
//
//                        - Goodbye
//
//                             Press '0' to return to the main menu.
//                             """);
                if (input.nextInt() == 0) {
                    mainMenu();
                }
            }
            case 6 -> {
                setAmounts(6);
//                System.out.println("""
//                         The transaction is being processed, please wait...
//
//                         You have withdrawn: 250 PLN
//                         Your current balance is: 250 PLN
//
//                        - Goodbye
//
//                             Press '0' to return to the main menu.
//                             """);
                if (input.nextInt() == 0) {
                    mainMenu();
                }
            }
            case 7 -> {
                setAmounts(7);
//                System.out.println("""
//                        The transaction is being processed, please wait...
//
//                        You have withdrawn: 500 PLN
//                        OOPS - you're broke!! Your current balance is: 0 PLN
//
//                        - Goodbye
//
//                            Press '0' to return to the main menu.
//                            """);
                if (input.nextInt() == 0) {
                    mainMenu();
                }
            }
            case 8 -> {
                customBalance();
                if (input.nextInt() == 0) {
                    mainMenu();
                }
            }
        }
    }

    // main

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final int pin = 1234;
        int count = 3;
        double balance = 500.0;

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