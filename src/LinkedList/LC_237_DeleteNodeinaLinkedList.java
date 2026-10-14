package LinkedList;

public class LC_237_DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        ListNode temp=node;
        temp.val=temp.next.val;
        // if(temp.next!=null){
        temp.next=temp.next.next;
        // }
    }
}
