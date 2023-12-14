import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long[] arr = new long[5];
        for(int i=0;i<=4;i++){
            arr[i]=scan.nextInt();
        }
        miniMaxSum(arr);
    }
    public static void miniMaxSum(long[] arr){
        long max=arr[0],min=arr[0],sum=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }

            //for maximum score

        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println((sum-min)+" "+(sum-max));
    }
}
