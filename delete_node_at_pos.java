public class delete_node_at_pos {
    private ListNode head;
    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public void display(){
        ListNode current=head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current=current.next;
        }
        System.out.println("null");
    }
        public void insert_at_end(int value) {
        ListNode newnode = new ListNode(value);
        if (head == null) {
            head = newnode;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }
    public ListNode delete_node_at_pos(int pos) {
    if(pos==1)
    {
        head=head.next;
    }
    ListNode previous=head;
    int count=1;
    while (count<pos-1) {
        previous=previous.next;
        count++;
    }
    ListNode current=previous.next;
    previous.next=current.next;
    return current;
    }
        public static void main(String[] args) {
            delete_node_at_pos obj = new delete_node_at_pos();
            obj.insert_at_end(10);
            obj.insert_at_end(20);
            obj.insert_at_end(30);
            obj.insert_at_end(40);
            obj.insert_at_end(50);
            System.out.println("Linked List: ");
            obj.display();
            obj.delete_node_at_pos(3);
            obj.display();

        }
    
    
}
