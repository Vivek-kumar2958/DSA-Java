package LinkedList;

public class LC_876_MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        int size=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        size=size/2;
        temp=head;
        while(size>0){
            temp=temp.next;
            size--;
        }
        return temp;
    }
}
