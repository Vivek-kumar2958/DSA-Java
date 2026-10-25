package LinkedList;

public class LC_2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d1=l1;
        ListNode d2=l2;
        ListNode i=l1;
        ListNode j=l2;
        int size1=0;
        int size2=0;
        while(d1!=null){
            size1++;
            d1=d1.next;
        }
        while(d2!=null){
            size2++;
            d2=d2.next;
        }
        ListNode temp=l1;
        if(size1<size2){
            temp=l2;
        }
        if(size1>size2){
            ListNode t2=l2;
            while(t2.next!=null){
                t2=t2.next;
            }
            int x=size1-size2;
            while(x>0){
                t2.next=new ListNode (0);
                t2=t2.next;
                x--;
            }
        }
        if(size1<size2){
            ListNode t2=l1;
            while(t2.next!=null){
                t2=t2.next;
            }
            int x=size2-size1;
            while(x>0){
                t2.next=new ListNode (0);
                t2=t2.next;
                x--;
            }
        }
        ListNode prev=null;
        ListNode ans=temp;
        int carry=0;
        while(temp!=null && i!=null && j!=null){
            int sum=i.val+j.val+carry;
            temp.val=sum%10;
            carry=sum/10;
            prev=temp;
            temp=temp.next;
            i=i.next;
            j=j.next;
        }
        if(carry>0){
            prev.next=new ListNode(carry);
        }
        return ans;
    }
}
