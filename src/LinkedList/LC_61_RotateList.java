package LinkedList;

public class LC_61_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        if(head.next==null)return head;
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        k=k%size;
        if(k==0)return head;
        ListNode end=head;
        int p=size-1;
        while(p>0){
            end=end.next;
            p--;
        }
        ListNode curr=head;
        for(int i=1;i<size-k;i++){
            curr=curr.next;
        }
        ListNode h1=curr.next;
        end.next=head;
        curr.next=null;
        return h1;
    }
}
