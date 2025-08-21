package Queue;

import java.util.NoSuchElementException;

public class delete_from_queue {
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
    public int dequeue()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        int result=front.data;
        front=front.next;
        if(front==null)
        {
            rear=null;
        }
        length--;
        return result;
    }
    public static void main(String[] args) {
        delete_from_queue dque=new delete_from_queue();
        dque.enqueue(10);
         dque.enqueue(20);
         dque.enqueue(30);
        dque.enqueue(40);
        dque.enqueue(50);
        dque.display();
        dque.dequeue();
        dque.display();
        dque.dequeue();
        dque.display();
    }
    
}
