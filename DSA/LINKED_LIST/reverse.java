package DSA.LINKED_LIST;

public class reverse {
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
    public void addLast(int data ){
        Node newNode= new Node(data);
    
        size++;
        if(head == null) { //if link list is empty then head =null
            head  = tail =newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void add(int idx,int data){
        if(idx ==0 ){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp= head;
        int i=0;
        while(i< idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        
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
    public void reverse(){
        Node prev=null;
        Node curr= tail=head;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        reverse ad=new reverse();
        ad.addFirst(1);
        ad.addFirst(2);
        ad.addLast(3);
        ad.addLast(4);
        ad.add(2, 9);
        ad.print();
        ad.reverse();
        ad.print();
    }
}
