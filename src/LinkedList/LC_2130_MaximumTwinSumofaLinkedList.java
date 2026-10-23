package LinkedList;

public class LC_2130_MaximumTwinSumofaLinkedList {
    public int pairSum(ListNode head) {
        // ArrayList<Integer>list=new ArrayList<>();
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int [] arr=new int[size];
        int idx=0;
        while(head!=null){
            arr[idx]=head.val;
            idx++;
            head=head.next;
        }
        int i=0;
        int j=arr.length-1;
        int sum=0;
        int msum=0;
        while(i<j){
            sum=arr[i]+arr[j];
            msum=Math.max(sum,msum);
            i++;
            j--;
        }
        return msum;
    }
}
