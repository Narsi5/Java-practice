import java.util.Scanner;

public class Diagonaldiff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        int ans =diagonalDifference(arr);
        System.out.println(ans);
    }
    public static int diagonalDifference(int[][] arr){
        int diagonalp =0;
        int diagonalb =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    diagonalp+=arr[i][j];
                    System.out.println(arr[i][j]);
                }

            }
        }
        for(int i=0;i<arr.length;i++){
            int j = arr.length-(i+1);
                    diagonalb+=arr[i][j];
                    System.out.println(arr[i][j]);

        }


        return Math.abs(diagonalp-diagonalb);
    }
}
