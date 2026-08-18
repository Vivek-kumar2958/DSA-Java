package Arrays;
import java.util.*;
public class LC_4_Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // int [] ans=new int[nums1.length+nums2.length];
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            al.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            al.add(nums2[i]);
        }
        Collections.sort(al);
        double median=0;
        if(al.size()%2!=0){
            median=al.get(al.size()/2);
            return median;
        }
        else{
            int l=al.size()/2;
            int r=(al.size()/2)-1;
            median=(al.get(l)+al.get(r))/2.0;
        }
        return median;
    }
}
