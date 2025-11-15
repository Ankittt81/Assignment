package LinkedList;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int n=size(head);
        k=k%n;
        if(k==0) return head;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        temp=head;
        int tobelast=n-k;
        for(int i=1;i<tobelast;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
    int size(ListNode head){
        if(head==null) return 0;
        int size=1;
        while(head.next!=null){
            head=head.next;
            size++;
        }
        return size;
    }
}
