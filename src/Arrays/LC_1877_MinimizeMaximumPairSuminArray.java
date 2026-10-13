package Arrays;
import java.util.*;
class pair{
    int st;
    int end;
    pair(int st,int end){
        this.st=st;
        this.end=end;
    }
}
public class LC_1877_MinimizeMaximumPairSuminArray {
    public int minPairSum(int[] nums) {
        ArrayList<pair> al=new ArrayList<>();
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int st=nums[l];
            int end=nums[r];
            pair p=new pair(st,end);
            al.add(p);
            l++;
            r--;
        }
        int [] ans=new int[nums.length/2];
        int k=0;
        for(pair i:al){
            int f=i.st;
            int la=i.end;
            ans[k]=f+la;
            k++;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>max){
                max=ans[i];
            }
        }
        return max;
    }
}
