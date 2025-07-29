public class remove_duplicates_from_sorted_SLL {
    private ListNode head;
    private class ListNode{
        private int data;;
        private ListNode next;

        ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void display()
{
    if(head==null)
    {
        return ;
    }
ListNode current=head;
while(current!=null)
{
    System.out.print(current.data+"-->");
   current=current.next; 
}
System.out.println("null");
}
public void insert_at_end(int value)
{
    ListNode newNode=new ListNode(value);
    if(head==null)
    {
        head=newNode;
        return;
    }
    ListNode current=head;
    while(current.next!=null)
    {
        current=current.next;
    }
    current.next=newNode;
}
public void remove_duplicates()
{
    ListNode current=head;
    while(current!=null && current.next!=null)
    {
        if(current.data==current.next.data)
        {
            current.next=current.next.next;
        }
        else{
            current=current.next;
        }
    }
}
    public static void main(String[] args) {
        remove_duplicates_from_sorted_SLL sll = new remove_duplicates_from_sorted_SLL();
        sll.insert_at_end(1);
        sll.insert_at_end(1);
        sll.insert_at_end(1);
        sll.insert_at_end(1);
        sll.insert_at_end(1);
        sll.insert_at_end(2);
        sll.insert_at_end(2);
        sll.insert_at_end(2);
        sll.insert_at_end(3);
        sll.display();
        sll.remove_duplicates();
        sll.display();

    }
    
}
