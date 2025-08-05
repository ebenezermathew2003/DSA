package DLL;

import java.util.NoSuchElementException;

public class print_nodes {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data=data;
    }
}
    public print_nodes()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty()
    {
        return length==0;
    }
    public void insert_first(int value)
    {
        ListNode newNode = new ListNode(value);
        if(isEmpty())
        {
            tail=newNode;
        }else{
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }
    public void insertlast(int value)
    {
        ListNode newNode=new ListNode(value);
        if(isEmpty())
        {
            head=newNode;
        }
       else
       {
        tail.next=newNode;
       }
       newNode.previous=tail;
       tail=newNode;
       length++;
    }
public void print_front_nodes()
{
    if(head==null)
    {
        return;
    }
    ListNode temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    System.out.println("null");
}
public ListNode delete_first_node()
{
    if(isEmpty())
    {
        throw new NoSuchElementException();
    }
    ListNode temp=head;
    if(head==tail)
    {
        tail=null;
    }else{
        head.next.previous=null;
    }
    head=head.next;
    temp.next=null;
    return temp;
}
public void print_previous()
{
    if(tail==null)
    {
        return;
    }
    ListNode temp=tail;
    while(temp!=null)
    {
        System.out.print(temp.data+"-->");
        temp=temp.previous;
    }
    System.out.println("null");
}
    public static void main(String[] args) {
        print_nodes dll = new print_nodes();
        dll.insertlast(10);
        dll.insertlast(20);
        dll.insertlast(30);
        dll.insertlast(40);
        dll.print_front_nodes();
        dll.print_previous();
        dll.insert_first(10);
        dll.insert_first(15);
        dll.insert_first(20);
        dll.insert_first(25);
        dll.insert_first(30);
        dll.print_front_nodes();
        dll.print_previous();
        dll.delete_first_node();
        dll.delete_first_node();
        dll.delete_first_node();
        dll.print_front_nodes();
        
    }
}