public class merge_two_sorted_sll {
    private ListNode head;
    private class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void display(ListNode head)
    {
        if(head==null)
        {
            System.out.println("null");
        }
    ListNode current=head;
    while(current!=null)
    {
        System.out.print(current.data+"-->");
        current=current.next;

    }
    System.out.println("null");
    }
    public ListNode sll1()
    {
        ListNode head=new ListNode(0);
        ListNode first =new ListNode(1);
        ListNode second =new ListNode(3);
        ListNode third =new ListNode(5);
        ListNode fourth =new ListNode(6);
        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
    return head;
    }
    public ListNode sll2()
    {
        ListNode head =new ListNode(2);
        ListNode fifth =new ListNode(4);
        ListNode sixth=new ListNode(7);

        head.next=fifth;
        fifth.next=sixth;
        sixth.next=null;
    return head;
    }
    public ListNode merge(ListNode a,ListNode b)
    {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(a!=null && b!=null)
        {
            if(a.data<=b.data)
            {
                tail.next=a;
                a=a.next;
            }
            else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a==null)
        {
            tail.next=b;
        }
        else{
            tail.next=a;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        merge_two_sorted_sll sll = new merge_two_sorted_sll();
        ListNode a=sll.sll1();
        sll.sll1();
        ListNode b=sll.sll2();
        ListNode res=sll.merge(a,b);
        sll.display(res);
        
    }
    
}
