public class find_middle_node {
    private ListNode head;
    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data=data;
            this.next=null;

    }

    
}
public void display()
{
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
public void insert_at_end(int value)
{
ListNode newNode =new ListNode(value);
if(head==null)
{
    head=newNode;
    return ;
}
ListNode current=head;
while(current.next!=null)
{
    current=current.next;
}
current.next=newNode;
}
public ListNode find_middle_node()
{
    if(head==null)
    {
        return head;
    }
    ListNode slowptr=head;
    ListNode fastptr=head;
    while(fastptr!=null && fastptr.next!=null)
    {
        slowptr=slowptr.next;
        fastptr=fastptr.next.next;
    }
    return slowptr;
}
public static void main(String[] args) {
    find_middle_node f1=new find_middle_node();
    f1.insert_at_end(1);
    f1.insert_at_end(2);
    f1.insert_at_end(3);
    f1.insert_at_end(4);
    f1.insert_at_end(5);
    f1.display();
    ListNode middle=f1.find_middle_node();
    System.out.println("Middle node is "+middle.data);
    
}
}
