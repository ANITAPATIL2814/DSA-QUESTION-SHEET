package DSA.LINKED_LIST;

public class add_middle {
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
    public int removeFirst(){
        
        if(size ==0){ //if link list is empty
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){ //if head and tail is same
            int val=head.data;
            head = tail=null;
            size=0;
            return val;

        }
        int val= head.data;
        size --;
        head= head.next;
        return val;
    }
    public int  removeLast(){
        if(size ==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){ //if head and tail is same
            int val=head.data;
            head = tail=null; 
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data; //store tail data 
        prev.next =null;
        tail=prev;
        size--;
        return val;
    }
    public int search(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data ==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head ==null){
            return -1;
        }
        if(head.data ==key){
            return 0;
        }
        int idx=helper(head.next, key); 
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int RecSearch(int key){
        return helper(head, key);
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
        add_middle ad=new add_middle();
        ad.addFirst(1);
        ad.addFirst(2);
        ad.addLast(3);
        ad.addLast(4);
        ad.add(2, 9);
        ad.print(); //2 1 9 3 4 
        // ad.removeFirst();
        // ad.print();
        // ad.removeLast();
        // ad.print();
        // System.out.println(ad.size);
        // System.out.println(ad.search(3));
        // System.out.println(ad.search(10));
        // System.out.println(ad.RecSearch(3));
        // System.out.println(ad.RecSearch(10));
        ad.reverse();
        ad.print();
    }
}
