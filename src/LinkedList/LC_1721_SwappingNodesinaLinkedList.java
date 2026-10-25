package LinkedList;

public class LC_1721_SwappingNodesinaLinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        ListNode curr=head;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        dummy.next=head;
        ListNode temp1=dummy;
        int n=k-1;
        while(n>0){
            temp1=temp1.next;
            n--;
        }
        ListNode temp2=dummy;
        int n2=size-k;
        while(n2>0){
            temp2=temp2.next;
            n2--;
        }
        int x=temp1.next.val;
        temp1.next.val=temp2.next.val;
        temp2.next.val=x;
        return head;
    }
}
