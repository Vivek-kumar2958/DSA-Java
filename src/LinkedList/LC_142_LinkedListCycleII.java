package LinkedList;

public class LC_142_LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        // 1- by hashmap -
        // HashMap<ListNode,Integer>map=new HashMap<>();
        // ListNode temp=head;
        // int idx=0;
        // while(temp!=null){
        //     if(map.containsKey(temp)){
        //         return temp;
        //     }
        //     else{
        //         map.put(temp,idx);
        //         idx++;
        //     }
        //     temp=temp.next;
        // }
        // return null;

        // 2- by two pointer(slow,fast)-
        if(head==null)return null;
        if(head.next==null)return null;
        ListNode p1=head;
        ListNode p2=head;
        ListNode p3=head;
        while(p2!=null && p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
            if(p1==p2)break;
        }
        if(p2==null || p2.next==null)return null;
        while(p3!=p1){
            p3=p3.next;
            p1=p1.next;
        }
        return p3;
    }
}
