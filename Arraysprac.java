import java.util.Scanner;

public class Arraysprac {
    public static void main(String[] args) {
        // 1D arrays
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int size = sc.nextInt();
//        System.out.println("Enter the elements of the array");
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the no to be searched");
//        int x= sc.nextInt();
//        for (int i = 0; i < size; i++) {
//         if (arr[i]==x){
//             System.out.println(i);
//         }
//        }

        // 2d arrays practice
        System.out.println("enter no of rows and columns respectively");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int [][] numbers = new int[rows][columns];
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number to be searched");
        int y = sc.nextInt();
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                if(numbers[i][j]==y) {
                    System.out.println(i+" "+ j);
                }
            }
        }

    }
}
