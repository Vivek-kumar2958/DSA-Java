package Arrays;

public class LC_41_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        long []ht=new long[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && nums[i]<=nums.length){
                ht[nums[i]]++;
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(ht[i]==0){
                return i;
            }
        }
        return nums.length+1;
    }
}
