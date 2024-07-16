package DSA.LINKED_LIST;

public class basic {
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
    public void addFirst(int data ){
        //step 1: create new node
        //syntax: className obj=new className(constructor)
        Node newNode= new Node(data);

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
    public void addLast(int data ){
        Node newNode= new Node(data);
        if(head == null) { //if link list is empty then head =null
            head  = tail =newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        basic li=new basic();
        li.print();
        li.addFirst(1);
        li.print();
        li.addFirst(2);
        li.print();
        li.addLast(3);
        li.print();
        li.addLast(4);
        li.print();
    }

}
