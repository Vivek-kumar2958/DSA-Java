package LinkedList;
import java.util.*;
public class LC_3217_DeleteNodesFromLinkedListPresentinArra {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode temp=head;
        while(head!=null && set.contains(head.val)){
            head=head.next;
        }
        while(temp!=null && temp.next!=null){
            if(set.contains(temp.next.val)){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}
