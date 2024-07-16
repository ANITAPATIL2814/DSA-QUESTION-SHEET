package DSA.LINKED_LIST;

public class double_ll {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //addfirst
    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head == null){
            head = tail= newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }
    //addlast
    public void addLast(int data ){
        Node newNode= new Node(data);
        size++;
        if(head == null) { //if link list is empty then head =null
            head  = tail =newNode;
            return;
        }
        tail.next=newNode;
        tail.prev=newNode;
        tail=newNode;
    }
    //print
    public void print(){
        Node temp=head;
        while(temp != null ){
            System.out.print(temp.data + " <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    //remove last
    public int removeFirst(){
        if(head == null){
            System.out.println("doubly link list is empty ");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val=head.data;
            head= tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev= null;
        size --;
        return val;
    }
    public void reverse(){
    Node curr=head;
    Node prev=null;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next=prev;
        curr.prev=next;
        prev=curr;
        curr=next;
    }
    head= prev;
    }
    public static void main(String[] args) {
            double_ll li=new double_ll();
            li.addFirst(3);
            li.addFirst(2);
            li.addFirst(1);
            // li.print();
            // System.out.println(li.size);
            // li.addLast(3);
            // li.addLast(2);
            // li.addLast(1);
            li.print();
            li.reverse();
            // li.removeFirst();
            // li.removeLast();
            li.print();
            // li.print();
    }
}
