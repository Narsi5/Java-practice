import java.util.Scanner;

public class InsertionSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] getArray(int n) {
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;

    }

    public static void main(String[] args) {
        System.out.println("Enter the no of elements");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = getArray(n);
        System.out.println("Array before sorting");
        printArray(arr);
        //timecomplexity is O(n^2)
        //insertion sort
        for (int i = 1;i<arr.length;i++){
            int current = arr[i];
            int j = i -1;
            while (j>=0&& current <arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1]=current;
        }
        printArray(arr);


    }
}