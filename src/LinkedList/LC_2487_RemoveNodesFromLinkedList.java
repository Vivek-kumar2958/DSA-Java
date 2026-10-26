package LinkedList;
import java.util.*;
public class LC_2487_RemoveNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
        // 1- with 2 stack -
        // Stack<ListNode> st=new Stack<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     st.push(temp);
        //     temp=temp.next;
        // }
        // Stack<ListNode> st2=new Stack<>();
        // st2.push(st.pop());
        // while(!st.isEmpty()){
        //     if(st.pop().val>=st2.peek().val){
        //         st2.push(top);
        //     }
        // }
        // ListNode curr=st2.pop();
        // ListNode tr=curr;
        // while(!st2.isEmpty()){
        //     tr.next=st2.pop();
        //     tr=tr.next;
        // }
        // return curr;

        // with 1 - stack -
        // Stack<ListNode>st=new Stack<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     st.push(temp);
        //     temp=temp.next;
        // }
        //     head=st.pop();
        // while(!st.isEmpty()){
        //     if(st.peek().val>=head.val){
        //     ListNode curr=st.pop();
        //     curr.next=head;
        //     head=curr;
        //     }
        //     else{
        //         st.pop();
        //     }
        // }
        // return head;

        // 3- by 1 stack optimised -
        ListNode temp=head;
        Stack<ListNode> st=new Stack<>();
        while(temp!=null){
            while(st.size()>0 && st.peek().val<temp.val){
                st.pop();
            }
            st.push(temp);
            temp=temp.next;
        }
        while(!st.isEmpty()){
            ListNode curr=st.pop();
            curr.next=temp;
            temp=curr;
        }
        return temp;
    }
}
