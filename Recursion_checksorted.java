public class Recursion_checksorted {
    public static int flag = 0;
    public static void checkSorted(int[] arr,int index) {
        if(index == arr.length-1){
            if(flag != -1){
                System.out.println("Its  sorted array");
            }else {
                System.out.println("Its not sorted array");
            }
            return;
        }
        if(arr[index]>arr[index+1]){
            flag = -1;
        }
        checkSorted(arr,index+1);

    }
    public static void main(String[] args) {
        int[] arr ={1,2,77,4,5};
        checkSorted(arr,0);

    }
}
