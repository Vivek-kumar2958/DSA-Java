package LinkedList;

public class LC_021_MergeTwoSortedLists {
    static ListNode temp1=null;
    static ListNode temp2=null;
    static ListNode merge(){
        if(temp1==null)return temp2;
        if(temp2==null)return temp1;
        ListNode x=temp1;
        if(temp1.val<=temp2.val){
            temp1=temp1.next;
            return x;
        }
        else{
            x=temp2;
            temp2=temp2.next;
        }
        return x;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)return null;
        if(list1==null)return list2;
        if(list2==null)return list1;
        temp1=list1;
        temp2=list2;
        ListNode head=temp2;
        if(list1.val<=list2.val){
            head=temp1;
            temp1=temp1.next;
        }
        else{
            temp2=temp2.next;
        }
        ListNode curr=head;
        while(temp1!=null && temp2!=null){
            curr.next=merge();
            curr=curr.next;
        }
        // if(temp1==null && temp2==null)return head;
        if(temp1==null){
            while(temp2!=null){
                curr.next=temp2;
                curr=curr.next;
                temp2=temp2.next;
            }
        }
        if(temp2==null){
            while(temp1!=null){
                curr.next=temp1;
                curr=curr.next;
                temp1=temp1.next;
            }
        }
        return head;
    }
}
