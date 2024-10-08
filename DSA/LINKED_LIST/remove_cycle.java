package DSA.LINKED_LIST;


public class remove_cycle {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    static int size =1;
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true;
            }
            
        }
        return false;
    }
    public static void removecycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle = false; //cycle not exist 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast=fast.next.next;
            if(fast == slow){
                cycle=true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        //find metting point
        slow=head;
        Node prev=null; //store last node
        while(slow != fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //remove cycle - last.next = null
        prev.next=null;
    }
    
    public static void main(String[] args) {
        head= new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        //1->2->3->2
        System.out.println(isCycle());
        removecycle();
        System.out.println(isCycle());
    }
}
