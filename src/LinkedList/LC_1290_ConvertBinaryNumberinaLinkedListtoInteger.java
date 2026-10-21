package LinkedList;

public class LC_1290_ConvertBinaryNumberinaLinkedListtoInteger {
    public int getDecimalValue(ListNode head) {
        // 1 - brute force -
        // if(head==null)return 0;
        // StringBuilder s=new StringBuilder();
        // ListNode temp=head;
        // while(temp!=null){
        //     s.append(temp.val);
        //     temp=temp.next;
        // }
        // String str=s.toString();
        // int ans=0;
        // int p=0;
        // int j=s.length()-1;
        // while(j>=0){
        //     int n=s.charAt(j)-'0';
        //     if(n==1){
        //         ans+=Math.pow(2,p);
        //     }
        //         p++;
        //         j--;
        // }

        // 2 -
        int ans=0;
        while(head!=null){
            ans=ans*2+head.val;
            head=head.next;
        }
        return ans;
    }
}
