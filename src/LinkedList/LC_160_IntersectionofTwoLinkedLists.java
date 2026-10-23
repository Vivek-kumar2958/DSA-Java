package LinkedList;

public class LC_160_IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 1- by hashmap -
        // HashMap<ListNode,Integer>map=new HashMap<>();
        // ListNode temp1=headA;
        // ListNode temp2=headB;
        // while(temp1!=null){
        //     map.put(temp1,1);
        //     temp1=temp1.next;
        // }
        // while(temp2!=null){
        //     if(map.containsKey(temp2)){
        //         return temp2;
        //     }
        //     temp2=temp2.next;
        // }
        // return null;

        // 2- by two pointer -
        ListNode p1=headA;
        ListNode p2=headB;
        while(p1!=p2){
            if(p1==null){
                p1=headB;
            }
            else{
                p1=p1.next;
            }
            if(p2==null){
                p2=headA;
            }
            else{
                p2=p2.next;
            }
        }
        if(p1==p2){
            return p1;
        }
        return null;
    }
}
