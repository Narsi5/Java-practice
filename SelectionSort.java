import java.util.Scanner;

public class SelectionSort {
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
    public static void main(String[] args) {
        System.out.println("Enter the no of elements");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = getArray(n);
        System.out.println("Array before sorting");
        printArray(arr);
        //time complexity is O(n^2)
        //selectionsort
        for(int i = 0;i<arr.length - 1;i++){
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp =  arr[smallest];
            arr[smallest]= arr[i];
            arr[i] = temp;
        }
        System.out.println("Array after sorting");
        printArray(arr);
    }

}
