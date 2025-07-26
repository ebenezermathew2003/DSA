public class reverse_linkedlist {
    private ListNode head;
    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
    if(head==null)
    {
        return;
    }
    ListNode current=head;
    while(current!=null)
    {
        System.out.print(current.data+"-->");
        current=current.next;
    }
    System.out.println("null");
    }
    public ListNode reverse(){
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous; 
    }
public void insert_at_end(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
        public static void main(String[] args) {
            reverse_linkedlist ll=new reverse_linkedlist();
            ll.insert_at_end(10);
            ll.insert_at_end(20);
            ll.insert_at_end(30);
            ll.display();
            ll.head=ll.reverse();
            ll.display();

    }
    
}
