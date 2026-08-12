package Arrays;

public class LC_01_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int max=0;
        int a=-1;
        int b=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    max=1;
                    a=i;
                    b=j;
                    // return new int []{i,j};
                    break;
                }
            }
            if(max==1){break;}
        }
        return new int [] {a,b};
    }
}
