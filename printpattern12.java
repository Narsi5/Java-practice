public class printpattern12 {
    public static void main(String[] args) {
        /*
           1
          2 2
         3 3 3
        4 4 4 4
         */
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int spaces = (n - i);
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}
