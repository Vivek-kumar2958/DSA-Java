package Arrays;

public class LC_2149_RearrangeArrayElementsbySign {
    public int[] rearrangeArray(int[] nums) {
        // ArrayList<Integer> pos=new ArrayList<>();
        // ArrayList<Integer> neg=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0){
        //         pos.add(nums[i]);
        //     }
        //     else{
        //         neg.add(nums[i]);
        //     }
        // }
        // int [] ans=new int[nums.length];
        // int k=0;
        // int l=0;
        // for(int i=0;i<ans.length;i++){
        //     if(i%2==0){
        //     ans[i]=pos.get(k);
        //     k++;
        //     }
        //     else{
        //         ans[i]=neg.get(l);
        //         l++;
        //     }
        // }
        // return ans;

        int[] ans = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }
}
