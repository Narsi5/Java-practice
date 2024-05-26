import java.util.HashMap;
import java.util.Map;

public class leetcodeweek399 {
    //Question no 1
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                int d = nums2[j] * k;
                if(nums1[i]%d == 0){
                    count++;
                }
            }
        }
        return count;

    }
    //Question no 2
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int i = 0;
        while(i<word.length()){
            char c = word.charAt(i);
            int count = 0;
            while(i< word.length() && word.charAt(i) == c && count<9){
                i++;
                count++;
            }
            comp.append(count);
            comp.append(c);
        }
        return comp.toString();
    }
    //Question no 3
    public long numberofPairs(int[] nums1, int[] nums2, int k) {
        long count = 0;
        HashMap<Integer,Integer> divisorsmap = new HashMap<>();
        for(int num: nums2){
            int divisor = num * k;
            divisorsmap.put(divisor,divisorsmap.getOrDefault(divisor,0)+1);
        }
        for(int num : nums1){
            for (Map.Entry<Integer, Integer> entry : divisorsmap.entrySet()) {
                if (num % entry.getKey() == 0) {
                    count += entry.getValue();
                }
            }
        }
        return count;
    }
}
