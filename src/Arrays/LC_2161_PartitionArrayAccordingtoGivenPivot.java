package Arrays;
import java.util.*;
public class LC_2161_PartitionArrayAccordingtoGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less=new ArrayList<>();
        ArrayList<Integer> more=new ArrayList<>();
        ArrayList<Integer> equal=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
            }
            else if(nums[i]==pivot){
                equal.add(nums[i]);
            }
            else{
                more.add(nums[i]);
            }
        }
        int [] ans=new int[nums.length];
        int index=0;
        for(int x:less){ans[index++]=x;}
        for(int x:equal){ans[index++]=x;}
        for(int x:more){ans[index++]=x;}
        return ans;
    }
}
