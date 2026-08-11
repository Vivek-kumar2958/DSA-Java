package Arrays;

public class LC_485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                // max=count;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
                // max=Math.max(count,max);
                // continue;
            }
        }
        return max;
    }
}
