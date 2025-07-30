public class detect_loop_in_sll {
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
        int count = 0; // limit to prevent infinite loop
        while (current != null && count < 20) {
            System.out.print(current.data + "-->");
            current = current.next;
            count++;
        }
        System.out.println("...");
    }
public boolean detectloop()
{
    ListNode slwptr=head;
    ListNode fstptr=head;
    while(fstptr!=null && fstptr.next!=null)
    {
        fstptr=fstptr.next.next;
        slwptr=slwptr.next;
        if(slwptr==fstptr) return true;
    }
    return false;
}

public void insertloop()
{
    head=new ListNode(1);
    ListNode first=new ListNode(2);
    ListNode second=new ListNode(3);
    ListNode third=new ListNode(4);
    ListNode fourth=new ListNode(5);
    head.next=first;
    first.next=second;
    second.next=third;
    third.next=fourth;
    fourth.next=third;
}
public ListNode know_starting_point_of_loop()
{
    ListNode slwptr=head;
    ListNode fstptr=head;
    while(fstptr!=null && fstptr.next!=null)
    {
        fstptr=fstptr.next.next;
        slwptr=slwptr.next;
        if(slwptr==fstptr) return getStartingNode(slwptr);
    }
    return null;
}
    public ListNode getStartingNode(ListNode meetingPoint) {
        ListNode start = head;
        while (start != meetingPoint) {
            start = start.next;
            meetingPoint = meetingPoint.next;
        }
        return start;
    }
    public static void main(String[] args) {
        detect_loop_in_sll sll = new detect_loop_in_sll();
        sll.insertloop();
        sll.display();
boolean hasLoop = sll.detectloop();
        if (hasLoop) {
            System.out.println("Loop detected in the linked list.");

            ListNode loopStart = sll.know_starting_point_of_loop();
            if (loopStart != null) {
                System.out.println("Starting node of loop is: " + loopStart.data);
            }
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
    
}

