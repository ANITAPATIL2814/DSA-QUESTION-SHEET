package DSA.LINKED_LIST;

public class zig_zag {
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
    public void addFirst(int data ){
        Node newNode= new Node(data);
        size++;
        if(head == null) { //if link list is empty then head =null
            head  = tail =newNode;
            return;
        }
        
        newNode.next=head; //linked step
        head=newNode;//head point new node which is create inside step1
    }
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data+" - > ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void zigzag(){
        //find mid
        Node slow= head;
        Node fast= head;
        while(fast != null && fast.next != null){
            slow= slow.next;//+1
            fast=fast.next.next;//+2
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next= null;
        Node prev = null;
        Node next;
        while(curr != null ){
            //reverse link list
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        //zigzag merge
        while(left != null && right != null){
            nextL=left.next;
            left.next= right;
            nextR= right.next;
            right.next= nextL;
            left = nextL;
            right = nextR;

        }
    }
    public static void main(String[] args) {
        zig_zag z= new zig_zag();
        z.addFirst(1);
        z.addFirst(2);
        z.addFirst(3);
        z.addFirst(4);
        z.addFirst(5);
        z.print();
        z.zigzag();
        z.print();
    }
}
