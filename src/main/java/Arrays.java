import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        String name [] = new String[5];
//        name[0] = "hello";
//        name[1] = "Rafał";
//        name[2] = "how";
//        name[3] =  "are";
//        name[4] =  "you?";
//
//        for (int i = 0; i < name.length; i++) {
//            System.out.print(name[i] + " ");
//        }
//        System.out.println("");
//
//        String name1 [] = new String [] {"Hello", "how", "are", "you?"};
//
//        for (int i = 0; i < name1.length; i++){
//            System.out.print(name1[i] + " ");
//        }
//
//        Scanner input = new Scanner(System.in);
//
//        String name2 [] = new String[5];
//
//        // loop user input !!!
//        for (int i = 0; i < name2.length; i++){
//            System.out.println("Provide new array input: ");
//            String add = input.next();
//            name2[i] = add;
//        }
//
//        // print user input !!!                         Imagine
//        for (int i = 0; i < name2.length; i++) {
//            System.out.print(name2[i] + " ");
//        }
//
//        int num [][] = new int[5][5];
//
//        for(int i=0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                if (i == 2){
//                    num[i][j] = 1;
//                }
//            }
//        }
//
//        for(int i=0; i < num.length; i++){
//            for (int j = 0; j < num[i].length; j++){
//                System.out.print(num[i][i]);
//            }
//            System.out.println();
//        }
//
//        System.out.println("\n" + "selected value is: " + num[0][2]);
//    }
        //    Wyświetl tablicę wyglądającą następująco:
//            0 0 0 0 0
//            0 1 0 0 0
//            0 0 2 0 0         diagonally
//            0 0 0 3 0         imagine
//            0 0 0 0 4

//        int array[][] = new int[5][5];      // creating object
//
//        for (int i = 0; i < array.length; i++){     // editing object & saving ARRAY to memory
//            for (int j=0; j < array[i].length; j++){
//                if (i == j){                  // ie. calculator - saving value of position to array position
//                    array[i][j] = i;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {        // accessing saved ARRAY
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//    }

        String array[][] = new String[5][5];      // creating object

        for (int i = 0; i < array.length; i++){     // editing object & saving ARRAY to memory
            for (int j=0; j < array[i].length; j++){
                if (i == j){                  // ie. calculator - saving value of position to array position
                    array[i][j] = String.valueOf(i);
                } else {
                    array[i][j] = "0";
                }
            }
        }
        for (int i = 0; i < array.length; i++) {        // accessing saved ARRAY
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }

}
