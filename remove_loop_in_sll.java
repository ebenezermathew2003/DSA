public class remove_loop_in_sll {
    private ListNode head;
    private class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
        public void display() {
        ListNode current = head;
        int count = 0;
        while (current != null && count < 20) {
            System.out.print(current.data + "-->");
            current = current.next;
            count++;
        }
        System.out.println("...");
    }
    public void removeLoop() {
        ListNode slwptr=head;
    ListNode fstptr=head;
    while(fstptr!=null && fstptr.next!=null)
    {
        fstptr=fstptr.next.next;
        slwptr=slwptr.next;
        if(slwptr==fstptr)
        { 
            removelooping(slwptr);
            return;
        }
    } 
}
public void removelooping(ListNode slwptr)
{
    ListNode temp=head;
    if (slwptr == head) {
            while (slwptr.next != head) {
                slwptr = slwptr.next;
            }
            slwptr.next = null;
            return;
        }
   while (temp.next != slwptr.next) {
            temp = temp.next;
            slwptr = slwptr.next;
        }
        slwptr.next = null;
}
public void insertloop() {
        head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
    }
public static void main(String[] args) {
    remove_loop_in_sll sll = new remove_loop_in_sll();
    sll.insertloop();
        System.out.println("Before removing loop:");
        sll.display();

        sll.removeLoop();

        System.out.println("After removing loop:");
        sll.display();
}
}
