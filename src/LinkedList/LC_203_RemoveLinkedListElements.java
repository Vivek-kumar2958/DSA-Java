package LinkedList;
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class LC_203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        while(head!=null && head.val==val){
            head=head.next;
        }
        while(temp!=null && temp.next!=null ){
            if(temp.next.val==val){
                temp.next=temp.next.next;
            }
            else if(temp.next.val!=val){
                temp=temp.next;
            }
        }
        return head;
    }
}
