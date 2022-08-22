public class Loops {
    public static void main(String[] args) {

        // TIMES TABLE
        for (int i = 1; i <= 100; i++) {
            System.out.print(String.format("%4s", i));        // CONDITION for you :)
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        // SHAPE 1 - 10
        for (int i = 1; i <= 10; i++) {              //  Depend
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // SHAPE 10 - 1
        int k = 10;
        for (int i = 1; i <= 10; i++) {
            for (int j = k; j >= 1; j--) {
                System.out.print(j);
            }
            k--;
            System.out.println();
        }
    }
}