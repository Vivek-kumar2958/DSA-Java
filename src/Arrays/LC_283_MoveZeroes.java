package Arrays;

public class LC_283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(i<nums.length-1 && j<nums.length-1){
            if(i==nums.length-2){
                i=j;
                j++;
            }
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
            i++;
        }
    }
}
