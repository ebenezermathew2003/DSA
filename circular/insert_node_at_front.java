package circular;

public class insert_node_at_front {
    private ListNode last;
    private int length;

    private class ListNode{
    private int data;
    private ListNode next;

    public ListNode(int data)
        {
this.data=data;
        }
    }
public void insert_frontnode(int value)
{
    ListNode temp=new ListNode(value);
    if(last==null)
    {
        last=temp;
    }
    else{
        temp.next=last.next;
    }
    last.next=temp;
    length++;
}
public void print()
{
    if(last==null)
    {
        return;
    }
    ListNode first=last.next;
    while(first!=last)
    {
        System.out.print(first.data+"-->");
        first=first.next;
    }
    System.out.println(first.data+" ");

}
public insert_node_at_front()
{
    last=null;
    length=0;
}
public int length()
{
    return length;
}
public boolean isEmpty()
{
    return length == 0;
}
    public static void main(String[] args) {
        insert_node_at_front sll=new insert_node_at_front();
        sll.insert_frontnode(10);
        sll.insert_frontnode(20);
        sll.insert_frontnode(30);
        sll.insert_frontnode(40);
        sll.print();
    }
    
}
