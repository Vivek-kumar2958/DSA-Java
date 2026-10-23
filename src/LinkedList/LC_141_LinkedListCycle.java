package LinkedList;

public class LC_141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        // 1- by hashmap -
        // ListNode temp=head;
        // HashMap<ListNode,Integer>map=new HashMap<>();
        // while(temp!=null){
        //     if(map.containsKey(temp)){
        //         return true;
        //     }
        //     else{
        //         map.put(temp,1);
        //     }
        //     temp=temp.next;
        // }
        // return false;

        // 2- by two pointer(slow - fast) -
        if(head==null)return false;
        if(head.next==null)return false;
        ListNode p1=head;
        ListNode p2=head.next;
        while(p1!=p2){
            p1=p1.next;
            if(p2==null || p2.next==null || p2.next.next==null)return false;
            p2=p2.next.next;
        }
        return true;
    }
}
