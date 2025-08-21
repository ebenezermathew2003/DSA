package Queue;

public class implementation {
    private ListNode rear;
    private ListNode first;
    private int length;
    private class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data)
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
    
}
