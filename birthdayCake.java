import java.util.Scanner;

public class birthdayCake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
          int ans =birthdayCakeCandles(arr);
        System.out.println(ans);
    }


        public static int birthdayCakeCandles(int[] arr){
            int max=arr[0];
            int count=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>max) {
                    max = arr[i];
                }
            }
            for(int i=0;i<arr.length;i++){
                if(max==arr[i]){
                    count++;
                }
            }
            return count;
        }
    }

