package LinkedList;

public class LC_328_OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head==null )return null;
        if(head.next==null)return head;
        ListNode odd=head;
        ListNode even =head.next;
        ListNode connect=head.next;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next=connect;
        return head;
    }
}
