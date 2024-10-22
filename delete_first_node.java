public class delete_first_node {
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
        ListNode current =head;
        while(current!=null)
        {
            System.out.print(current.data+ "-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public ListNode deletefirst()
    {
        if(head==null)
        {
            return null;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;

    }
    public void insertnode(int data)
    {
        ListNode node=new ListNode(data);
        node.next=head;
        head=node;
        

    } 
    public static void main(String[] args) {
        delete_first_node dfn=new delete_first_node();
        dfn.insertnode(10);
        dfn.insertnode(25);
        dfn.insertnode(30);
        dfn.display();
        dfn.deletefirst();
        dfn.display();
    }
    
}
