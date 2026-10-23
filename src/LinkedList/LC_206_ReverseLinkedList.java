package LinkedList;

public class LC_206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // 1 - by array -
        // if(head==null)return head;
        // int size=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;
        // }
        // int [] arr=new int[size];
        // int idx=0;
        // while(head!=null){
        //     arr[idx]=head.val;
        //     idx++;
        //     head=head.next;
        // }
        // ListNode curr=new ListNode(arr[size-1]);
        // ListNode temp2=curr;
        // for(int i=size-2;i>=0;i--){
        //     curr.next=new ListNode(arr[i]);
        //     curr=curr.next;
        // }
        // return temp2;

        // 2 - by only linked list -
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
