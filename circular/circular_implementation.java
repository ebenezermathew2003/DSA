package circular;

public class circular_implementation {
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data)
        {
            this.data=data;

        }
    }
    public circular_implementation()
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

    public void printcsll()
    {
        if(last==null)
        {
            System.out.println("List is empty");
        }
        ListNode first=last.next;
        while(first!=last)
        {
            System.out.print(first.data+"-->");
            first=first.next;
        }
        System.out.println(first.data+" ");
    }
    public void createcsll()
    {
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;

        last=fourth;
    }
    public static void main(String[] args) {
        circular_implementation csll=new circular_implementation();
        csll.createcsll();
        csll.printcsll();
    }
    
}
