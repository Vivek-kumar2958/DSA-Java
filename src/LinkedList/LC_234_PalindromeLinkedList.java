package LinkedList;
import java.util.*;
public class LC_234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        // 1- by stringbuilder -
        // StringBuilder s=new StringBuilder();
        // while(head!=null){
        //     s.append(head.val);
        //     head=head.next;
        // }
        // String str=s.toString();
        // int i=0;
        // int j=s.length()-1;
        // while(i<j){
        //     if(s.charAt(i)!=s.charAt(j)){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return true;

        // 2- by stack -
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        while(head!=null){
            if(st.pop()!=head.val){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}
