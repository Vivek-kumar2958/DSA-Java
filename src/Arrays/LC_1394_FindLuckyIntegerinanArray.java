package Arrays;

public class LC_1394_FindLuckyIntegerinanArray {
    public int findLucky(int[] arr) {
        int [] ht=new int[501];
        for(int i=0;i<arr.length;i++){
            ht[arr[i]]++;
        }
        int finalCount=-1;
        for(int i=1;i<ht.length;i++){
            if(ht[i]==i){
                finalCount=i;
            }
        }
        return finalCount;
    }
}
