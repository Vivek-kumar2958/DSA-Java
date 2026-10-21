package LinkedList;

public class LC_2807_InsertGreatestCommonDivisorsinLinkedList {
    static int gcd(int temp,int temp2){
        if(temp2==0){
            return temp;
        }
        return gcd(temp2,temp%temp2);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null)return head;
        ListNode temp=head;
        ListNode temp2=head.next;
        while(temp2!=null){
            ListNode add=new ListNode(gcd(temp.val,temp2.val));
            ListNode next=temp2.next;
            add.next=temp2;
            temp.next=add;
            temp=temp.next.next;
            temp2=next;
        }
        return head;
    }
}
