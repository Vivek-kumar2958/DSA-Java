package Arrays;
import java.util.*;
public class LC_1089_DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                al.add(arr[i]);
            }
            else{
                al.add(arr[i]);
                al.add(0);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=al.get(i);
        }
    }
}
