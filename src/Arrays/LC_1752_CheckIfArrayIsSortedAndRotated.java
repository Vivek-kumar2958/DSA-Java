package Arrays;
import java.util.*;
public class LC_1752_CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        // 1 more TC -
        //   int [] b=new int[nums.length];
        //   for(int i=0;i<nums.length;i++){
        //     b[i]=nums[i];
        //   }
        //  Arrays.sort(b);
        //  int x=0;
        //  while(x<nums.length){
        //   int count=0;
        //  for(int i=0;i<nums.length;i++){
        //     if(b[i]==nums[(i+x)%nums.length]){
        //             count++;
        //             if(count==nums.length){
        //                 return true;
        //             }
        //     }
        //  }
        //  x++;
        //  }
        //  return false;

        // 2 - less TC -
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        if(count<=1)return true;
        return false;
    }
}
