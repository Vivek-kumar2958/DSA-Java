package Arrays;
import java.util.*;
public class LC_350_IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int []result = new int[nums1.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                result[k]=nums1[i];
                k++;
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{j++;}
        }
        return Arrays.copyOf(result,k);
    }
}
