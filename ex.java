public class ex {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            temp[i] = nums[i];
        }
        int n =0;
        for(int i =0;i<nums.length;i++){
            if(nums.length%2 == 0){
                if(i+k <nums.length){
                    nums[i] = temp[i+k];
                    n = i;
                }
            }
            if(nums.length%2 !=0){
                if(i+k<nums.length-1){
                    nums[i] = temp[i+k+1];
                    n=i;
                }
            }
        }
        int j =0;
        if(n!=0){
            for(int i = n+1;i<nums.length;i++){
                if(j<=k){
                    nums[i] = temp[j];
                    j++;
                }
            }
        }
        else{
            for(int i = n;i<nums.length;i++){
                if(j<=k){
                    nums[i] = temp[j];
                    j++;
                }
            }
        }
    }

}
