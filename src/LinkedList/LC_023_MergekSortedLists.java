package LinkedList;

public class LC_023_MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode curr=null;
        for(int i=0;i<lists.length;i++){
            if(lists[i]==null){
                continue;
            }
            if(curr==null){
                curr=lists[i];
            }
            else{
                ListNode temp=curr;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=lists[i];
            }
        }
        if(curr==null)return curr;
        PriorityQueue<ListNode >pq=new PriorityQueue<>((a,b)->a.val-b.val);
        ListNode temp=curr;
        while(temp!=null){
            pq.add(temp);
            temp=temp.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(!pq.isEmpty()){
            dummy.next=pq.poll();
            dummy=dummy.next;
        }
        dummy.next=null;
        return ans.next;
    }
}
