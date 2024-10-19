public class insert_node_at_beginning {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void display()
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+ "-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void insertfirst(int value)
    
    {
        ListNode newnode=new ListNode(value);
        newnode.next=head;
        head=newnode;
    }
    public static void main(String[] args) {
    insert_node_at_beginning sll=new insert_node_at_beginning();
    sll.insertfirst(11);
    sll.display();
        
    }
    
}
