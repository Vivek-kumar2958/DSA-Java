package Arrays;

public class LC_26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        // Set<Integer> t=new TreeSet<>();

        //     for(int i=0;i<nums.length;i++){
        //         t.add(nums[i]);
        //     }
        //     int k=0;
        //     for(int i=0;i<t.size();i++){
        //                 nums[i]=t(i);
        //     }
        // return nums.length;
        if(nums.length==0){
            return 0;
        }
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
