package circular;

public class insert_node_at_end {
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
    public insert_node_at_end()
    {
        last=null;
        length=0;
    }
    public void length()
    {
        int length=0;
    }
    public boolean isEmpty()
    {
        return length == 0;
    }
    public void insert_node(int value)
    {
    ListNode temp=new ListNode(value);
    if(last==null)
    {
        last=temp;
        last.next=last;
    }else{
        temp.next=last.next;
        last.next=temp;
        last=temp;
    }
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
    public static void main(String[] args) {
       insert_node_at_end list = new insert_node_at_end();
        list.insert_node(1);
        list.insert_node(2);
        list.insert_node(3);
        list.print();
    }
}
