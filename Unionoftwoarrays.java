import java.util.HashSet;

public class Unionoftwoarrays {
    public static int union(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for (int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            set.add(i);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        System.out.println(union(arr1,arr2));
    }
}
