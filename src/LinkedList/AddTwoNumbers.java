package LinkedList;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int q=0;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(l1!=null && l2!=null){
            int total=l1.val+l2.val+q;
            int rem=total%10;
            q=total/10;
            ListNode nn=new ListNode(rem);
            temp.next=nn;
            temp=temp.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int total=l1.val+q;
            int rem=total%10;
            q=total/10;
            ListNode nn=new ListNode(rem);
            temp.next=nn;
            temp=temp.next;
            l1=l1.next;
        }
        while(l2!=null){
            int total=l2.val+q;
            int rem=total%10;
            q=total/10;
            ListNode nn=new ListNode(rem);
            temp.next=nn;
            temp=temp.next;
            l2=l2.next;
        }
        if(q==1) {
            ListNode nn=new ListNode(1);
            temp.next=nn;
        }
        return dummy.next;
    }
}
