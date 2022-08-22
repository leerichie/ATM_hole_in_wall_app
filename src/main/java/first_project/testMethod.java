//package first_project;
//
//import java.util.Scanner;
//
//public class testMethod {
//    public static void main(String[] args) {
//
//        public static void calculator() {
//            Scanner input = new Scanner(System.in);
//            double initBalance = 500.0;
//            double toDeduct;
//            double newBalance;
//
//            System.out.println("Your current balance is: " + initBalance + " PLN\n" +
//                    "Enter amount to withdraw: ");
//            toDeduct = input.nextInt();
//
//            newBalance = initBalance - toDeduct;
//
//            if (toDeduct <= 0) {
//                System.out.println("Invalid amount, try again");
//                input.nextInt();
//            } else if (toDeduct > initBalance) {
//                System.out.println("Insufficient funds, enter a lower amount:");
//                input.nextInt();
//            } else {
//                System.out.println("Your current balance is: " + newBalance + " PLN\n\n" +
//                        "Press '0' to return to the main menu.");
//            }
//        }
//    }
//
//    public static void setAmounts(int choice){
//        double balance = 500.0;
//        switch (choice) {
//            case 1:
//                balance = balance - 20;
//                break;
//            case 2:
//                balance = balance - 50;
//                break;
//            case 3:
//                balance = balance - 150;
//                break;
//        }
//
//
//    }
//}