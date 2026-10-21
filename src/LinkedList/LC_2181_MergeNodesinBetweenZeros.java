package LinkedList;

public class LC_2181_MergeNodesinBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        int count=0;
        int sum=0;
        ListNode ans=null;
        ListNode curr=null;
        head=head.next;
        while(head!=null){
            if(head.val!=0){
                sum+=head.val;
            }
            else{
                ListNode temp=new ListNode(sum);
                if(count==0){
                    ans=temp;
                    count++;
                    curr=ans;
                }
                else{
                    curr.next=temp;
                    curr=curr.next;
                }
                sum=0;
            }
            head=head.next;
        }
        return ans;
    }
}
