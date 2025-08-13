package circular;

import java.util.NoSuchElementException;

public class remove_first_node {
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
    public remove_first_node()
    {
        last=null;
        length=0;
    }
    public boolean isEmpty()
    {
        return length==0;
    }
    public int length()
    {
        return length=0;
    }
    public void add(int data)
    {
        ListNode temp=new ListNode(data);
        if(last==null)
        {
            last=temp;
            last.next=last;
        }
        else
        {
            temp.next=last.next;
            last.next=temp;  
        }
        length++;
    }
    public ListNode removeFirst()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        ListNode temp=last.next;
        if(last.next==last)
        {
            last=null;
        }
        else{
            last.next=temp.next;
        }
        temp.next=null;
        length--;
        return temp;
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
    remove_first_node sll=new remove_first_node();
    sll.add(1);
    sll.add(2);
    sll.add(3);
    sll.print();
     while (!sll.isEmpty()) {
            System.out.println("Removed: " + sll.removeFirst().data);
            sll.print();
        }
}
    
}
