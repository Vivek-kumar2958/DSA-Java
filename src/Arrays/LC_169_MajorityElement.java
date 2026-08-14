package Arrays;
import java.util.*;
public class LC_169_MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int anscount=1;
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
                // ht[i]=count;
            }
            else{
                count=1;
            }
            if(count>anscount){
                anscount=count;
                result=nums[i];
            }
        }
        return result;
    }
}
