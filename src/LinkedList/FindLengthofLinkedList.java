package LinkedList;

//class Node{
//    int data;
//    Node next;
//    Node(int a){  data = a; next = null; }
//}

public class FindLengthofLinkedList {
    public int getCount(Node head) {
        // code here
        if(head==null) return 0;
        int size=1;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }

        return size;
    }
}
