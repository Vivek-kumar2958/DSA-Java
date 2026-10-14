package LinkedList;

public class LC_19_RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        while(n>0){
            fast=fast.next;
            n--;
        }
        while(slow.next!=null){
            if(fast.next==null){
                slow.next=slow.next.next;
                break;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return dummy.next;
    }
}
