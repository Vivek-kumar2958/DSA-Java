package Arrays;

public class LC_34_FindFirstandLastPositionElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int a=-1;
        int b=-1;
        // int start=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                a=i;
                break;
                // b=i+1;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                b=i;
                break;
            }
        }

        return new int [] {a,b};
    }
}
