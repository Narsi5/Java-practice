public class printpattern11 {
    public static void main(String[] args) {
        /*
             *****
            *****
           *****
          *****
         *****
         */
        int n = 4;
        for (int i = n; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=5 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
