package Arrays;
import java.util.*;
public class LC_961_NRepeatedElementinSize2NArray {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        Arrays.sort(nums);
        int count=1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]==nums[i]){
                count++;
                if(count==n){
                    return nums[i];
                }
            }
            else{count=1;}
        }
        return -1;
    }
}
