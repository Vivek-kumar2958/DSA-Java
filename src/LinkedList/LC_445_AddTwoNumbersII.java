package LinkedList;
import java.util.*;
public class LC_445_AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> st1=new Stack<>();
        Stack<ListNode> st2=new Stack<>();
        while(l1!=null){
            st1.push(l1);
            l1=l1.next;
        }
        while(l2!=null){
            st2.push(l2);
            l2=l2.next;
        }
        int carry=0;
        ListNode head=null;
        while(!st1.isEmpty() || !st2.isEmpty() || carry!=0){
            int sum=carry;
            if(!st1.isEmpty()){
                sum+=st1.pop().val;
            }
            if(!st2.isEmpty()){
                sum+=st2.pop().val;
            }
            carry=sum/10;
            ListNode curr=new ListNode (sum%10);
            curr.next=head;
            head=curr;
        }
        return head;
    }
}
