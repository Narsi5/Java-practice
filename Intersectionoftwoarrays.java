import java.util.HashSet;

public class Intersectionoftwoarrays {
    public static int intersection(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        int count = 0;
        for(int i:arr2){
            if(set.contains(i)){
                count++;
                set.remove(i);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        System.out.println(intersection(arr1,arr2));
    }
}
