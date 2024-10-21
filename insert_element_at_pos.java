public class insert_element_at_pos {
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
    public void insertatpos(int data,int position)
    {
        ListNode node=new ListNode(data);
        if(position ==1)
        {
            node.next=head;
            head=node;
        }
        else{
            ListNode previous=head;
            int count=1;
            while(count<position-1)
            {
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            node.next=current;
            previous.next=node;
        }
    }
    public static void main(String[] args) {
        insert_element_at_pos ele =new insert_element_at_pos();
        ele.insertatpos(25,1);
        ele.insertatpos(52, 2);
        ele.display();
    }
    
}
