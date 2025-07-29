public class remove_node_in_sorted_sll {
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
public void remove_node(int key)
{
    if(head==null)
    {
        return;
    }
    ListNode current=head;
    ListNode temp=null;
    while(current!=null && current.data!=key)
    {
        temp=current;
        current=current.next;
    }
    if(current==null)return ;
    temp.next=current.next;
}
public static void main(String[] args) {
    remove_node_in_sorted_sll sll=new remove_node_in_sorted_sll();
    sll.insert_at_end(10);
    sll.insert_at_end(20);
    sll.insert_at_end(5);
    sll.display();
    sll.remove_node(20);
    sll.display();
}
}
