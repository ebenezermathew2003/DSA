public class find_nth_node_from_last {
    private ListNode head;
    private class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
        this.data=data;
        this.next=null;

    }
}
public ListNode find_nth_node(int n)
{
    ListNode mnptr=head;
    ListNode refptr=head;
    int count=0;
    while(count<n)
    {
        refptr=refptr.next;
        count++;
    }
    while(refptr!=null)
    {
        refptr=refptr.next;
        mnptr=mnptr.next;
    }
    return mnptr;
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
public static void main(String[] args) {
    find_nth_node_from_last f = new find_nth_node_from_last();
    f.insert_at_end(1);
    f.insert_at_end(0);
    f.insert_at_end(3);
    f.insert_at_end(4);
    f.insert_at_end(5);
    f.insert_at_end(6);
    f.insert_at_end(7);
    f.display();
    ListNode res=f.find_nth_node(3);
    System.out.println(res.data);
}
}