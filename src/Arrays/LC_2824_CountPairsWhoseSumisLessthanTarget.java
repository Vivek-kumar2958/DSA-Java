package Arrays;
import java.util.*;
public class LC_2824_CountPairsWhoseSumisLessthanTarget {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count=0;
        int left=0;
        int right=nums.size()-1;
        while(left<right){
            if(nums.get(left)+nums.get(right)<target){
                count+=(right-left);
                left++;
            }
            else{
                right--;
            }
        }
        // for(int i=0;i<nums.size();i++){
        //     for(int j=i+1;j<nums.size();j++){
        //          if(nums.get(i)+nums.get(j)<target){
        //             count++;
        //          }
        //     }
        // }
        return count;
    }
}
