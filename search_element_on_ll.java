public class search_element_on_ll {
    private ListNode head;
    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
        }
        public void display(){
            ListNode current=head;
            while (current != null) {
                System.out.print(current.data + "-->");
                current = current.next;
        }
        System.out.println("null");
    }
         public void insert_at_end(int value) {
        ListNode newnode = new ListNode(value);
        if (head == null) {
            head = newnode;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }
    public Boolean searchelement(int key){
        if(head==null)
        {
            return false;
        }
        ListNode current = head;
        while (current!=null) {
            if(current.data==key)
            {
                return true;
            }
            current=current.next;
            
        }
        return false;
    }
        public static void main(String[] args) {
            search_element_on_ll list = new search_element_on_ll();
            list.insert_at_end(10);
            list.insert_at_end(20);
            list.insert_at_end(30);
            list.insert_at_end(40);
            list.display();
            Boolean result = list.searchelement(30);
            if(result==true)
            {
                System.out.println("found");
            }
            else{
                System.out.println("not found");
            }
        }

    }
      

