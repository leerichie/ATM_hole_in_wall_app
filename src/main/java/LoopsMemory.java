import java.util.Scanner;

public class LoopsMemory {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter number of users: ");
//        int users = input.nextInt();
//
//        String names[] = new String[users];
//        String pw[] = new String[users];
//        String name_test;
//        String pw_test;
//        boolean right = false;
//
//        for (int i = 0; i < users; i++) {
//            System.out.println("enter name " + i);
//            names[i] = input.next();
//            System.out.println("enter pass: " + i);
//            pw[i] = input.next();
//        }
//
//        System.out.println("enter name to test ");
//        name_test = input.next();
//
//        System.out.println("enter pw to test ");
//        pw_test = input.next();
//
//        for (int i = 0; i < users; j++) {
//            if (names[i].equals(name_test) && pw[i].equals(pw_test)) {
//                right = true;
//                System.out.println("Hello " + names[i]);
//            }
//        }
//
//        if (right == false) {
//            System.out.println("incorrect");
//    }

//        System.out.println("enter name");
//        String str = input.nextLine();
//
//        int len = str.length();
//        int space = str.indexOf(" ");
//        String str1=str.substring(0,space);
//        String str2=str.substring(space+1, len);
//
//        System.out.println(str1.substring(0,1).toUpperCase() + "." + str2.substring(0,1).toUpperCase());


//        System.out.println("Enter word to check palindrome");
//        String word = input.next();
//        int len = word.length();
//
//        for (int i=0; i<word.length(); i++){
//            if (word.substring(i,i+1).equals(word.substring(len-i-1,len-i))){
//                System.out.println(word.toUpperCase() + " - is a palindrome");
//                i=word.length()+1;
//            } else {
//                System.out.println(word.toUpperCase() + " - is no ot a palindrome");
//                break;
//            }
//        }


//        System.out.println("Enter number");
//        int num = input.nextInt();
//        int sum =1;
//        String str = "";
//
//        for (int i=1; i<=num; i++){
//            sum *= i;
//            str = str + i ;
//            if(i<num) {
//                str = str + " * ";
//            }
//            //System.out.print(str + i + " + ");
//        }
//        System.out.println(str + " = " + sum);


//        int a = 1;
//        int b = 1;
//
//        while (a < 50) {
//            System.out.println(a);
//            System.out.println(b);
//            a = a + b;
//            b = a + b;
//
//        }


//        System.out.println("enter num 1");
//        int num1 = input.nextInt();
//        System.out.println("enter num 2");
//        int num2 = input.nextInt();
//        int gcd = 1;
//
//        int smaller = 0;
//
//
//        if (num1 > num2) {
//            smaller = num2;
//
//        } else {
//            smaller = num1;
//        }
//        for (int i = 1; i <= smaller / 2; i++)
//        {
//            if (num1 % i == 0 && num2 % i == 0)
//            {
//                gcd = i;
//                System.out.println(i + gcd);
//            }
//        }
//        System.out.println(gcd);


//        int num = 0;
//        int count = 0;
//        int total = 0;
//        int avg = 0;
//
//        for (int i = 0; i <= 3; i++) {
//            count++;
//            System.out.println("Enter number " + count + " of 4");
//            num = input.nextInt();
//            total += num;
//        }
//        avg = total / 4;
//
//        System.out.println("Average is: " + avg);


//        for (int i = 1; i < 7; i++) {       // down
//            for (int j = 1; j < 5; j++) {   // across
//                System.out.print("*");
//            }
//            System.out.println();
//        }


    }
}