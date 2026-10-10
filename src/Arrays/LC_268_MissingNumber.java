package Arrays;

public class LC_268_MissingNumber {
    public int missingNumber(int[] nums) {
        int TotalSum=0;
        for(int i=0;i<nums.length;i++){
            TotalSum=TotalSum+nums[i];
        }
        int sum=nums.length*(nums.length+1)/2;
        return sum-TotalSum;
    }
}
