public class delete_last_node {
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
public void insert(int data)
{
    ListNode newnode=new ListNode(data);
    newnode.next=head;
    head=newnode;
}
public ListNode deletelastnode()
{
    if(head==null || head.next==null){
        return head;
    }
    ListNode current=head;
    ListNode previous=null;
    while(current.next!=null)
    {
        previous=current;
        current=current.next;
       
    }
    previous.next=null;
    return current;

    
}
    public static void main(String[] args) {
        delete_last_node dln=new delete_last_node();
        dln.insert(20);
        dln.insert(30);
        dln.insert(40);
        dln.display();
        dln.deletelastnode();
        dln.display();
        }
    
}
