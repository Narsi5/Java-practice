public class printpattern10 {
    public static void main(String[] args) {
        /*butterfly pattern
         *      *
         **    **
         ***  ***
         ********
         ********
         ***  ***
         **    **
         *      *

         */
        int n = 4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i >0 ; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
