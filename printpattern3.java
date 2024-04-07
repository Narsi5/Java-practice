public class printpattern3 {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         1
         12
         123
         1234
         */
        int n = 4;
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
                //System.out.print("*");
            }
            System.out.println();

        }
        /*

         ****
         ***
         **
         *

         */
        System.out.println();

        for (int i = n; i >= 0; i--) {
            for (int j = i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
