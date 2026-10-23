package LinkedList;

public class LC_1669_MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list1;
        while(a>1){
            temp1=temp1.next;
            a--;
        }
        while(b>=0){
            temp2=temp2.next;
            b--;
        }
        temp1.next=list2;
        ListNode curr=list2;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp2;
        return list1;
    }
}
