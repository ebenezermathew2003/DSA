public class singlylinkedlist {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data)
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
    public int countlength()
    {
        if(head==null){
            return 0; 
        }
        int count=0;
        ListNode current=head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }
    public static void main(String[] args) {
          singlylinkedlist sll=new singlylinkedlist();
          sll.head=new ListNode(10);
          ListNode second=new ListNode(1);
          ListNode third=new ListNode(15);
          ListNode fourth =new ListNode(25);
          sll.head.next=second;
          second.next=third;
          third.next=fourth;
          sll.display();
          System.out.println("Length "+sll.countlength());


    }
    
}
