package Queue;

public class insert_into_queue {
    private ListNode front;
    private ListNode rear;
    private int length;
    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public int length()
    {
        return length;
    }
    public boolean isEmpty()
    {
        return length == 0;
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("null");
        }
        ListNode current=front;
        while(current!=null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void enqueue(int data)
    {
        ListNode temp=new ListNode(data);
        if(isEmpty())
        {
            front=temp;
        }else{
            rear.next=temp;
        }
        rear=temp;
        length++;
    }
    public static void main(String[] args) {
    insert_into_queue enqu=new insert_into_queue();
    enqu.enqueue(10);
    enqu.enqueue(20);
    enqu.enqueue(30);
    enqu.enqueue(40);
    enqu.enqueue(50);
    enqu.display();

        
    }
}
