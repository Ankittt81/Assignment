package LinkedList;

class Node {
    int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}

public class SearchinLinkedList {
    public boolean searchKey(Node head, int key) {
        // Code here
        Node temp=head;
        while(temp!=null){
            if(temp.data==key) return true;
            temp=temp.next;
        }
        return false;
    }
}
