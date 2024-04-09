import java.util.*;
public class BubbleSort {
    public static void printArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] getArray(int n){
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<n ;i++){
            arr[i]=sc.nextInt();
        }
        return arr;

    }
//time complexity = O(n^2)

    public static void main(String[] args) {
        System.out.println("Enter the no of elements");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = getArray(n);
        //bubble sort
        for(int i =0;i<arr.length-1;i++){//n-1
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        printArray(arr);
    }
}
