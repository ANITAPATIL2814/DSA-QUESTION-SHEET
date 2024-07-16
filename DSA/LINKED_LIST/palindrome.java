package DSA.LINKED_LIST;

public class palindrome {
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
        //step 1: create new node
        //syntax: className obj=new className(constructor)
        Node newNode= new Node(data);
        size++;
        if(head == null) { //if link list is empty then head =null
            head  = tail =newNode;
            return;
        }
        
        //step 2: newNode next= head
        //store head reference(address) inside next 
        newNode.next=head; //linked step
        //step 3: head value =newNode
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
    //slow-fast approach
    public Node findMid(Node head){ //helper 
        Node slow= head;
        Node fast= head;
        while(fast != null && fast.next != null){
            slow= slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow; //slow is middle
    }
    public boolean checkpalindrome(){
        if(head == null || head.next == null){ 
            //head == null : link list empty
            //head.next == null : means link list contain single ele
            return true;
        }

        //to find mid
        Node miNode=findMid(head);

        //reverse 2nd half
        Node prev = null;
        Node curr = miNode;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next=prev;
            prev= curr;
            curr=next;
        }
        Node right = prev; //right half head
        Node left= head; //left half 
        //check left half & right half
        while (right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next ;

        }
        return true;
    }
    public static void main(String[] args) {
        palindrome p=new palindrome();
        p.addFirst(1);
        p.addFirst(2);
        p.addFirst(2);
        // p.addFirst(1);
        p.print();
        System.out.println(p.checkpalindrome());
    }
}
