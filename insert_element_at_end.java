public class insert_element_at_end {
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
public void insertatend(int value)
{
ListNode newnode=new ListNode(value);
if(head==null)
{
    head=newnode;
    return;
}
ListNode current=head;
while(current.next!=null)
{
    current=current.next;
}
current.next=newnode;
}
    public static void main(String[] args) {
        insert_element_at_end sll =new insert_element_at_end();
        sll.insertatend(10);
        sll.insertatend(50);
        sll.insertatend(25);
        sll.display();

    }
    
}
