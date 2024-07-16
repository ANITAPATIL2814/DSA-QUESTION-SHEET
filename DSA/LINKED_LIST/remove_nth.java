package DSA.LINKED_LIST;

public class remove_nth {
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
    public void delete_nth_from_end(int n){
        //calculate size
        int size=0;
        Node temp=head;
        while(temp != null){
            temp=temp.next;
            size++;
        }
        if(n == size){ //if we want to delete head
            head=head.next; //removefirst
            return;
        }
        //size-n
        int i=1;
        int idxToFind=size-n;
        Node prev=head;
        while(i<idxToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public void addFirst(int data ){
          Node newNode= new Node(data);

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
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        remove_nth rn=new remove_nth();
        rn.addFirst(1);
        rn.addFirst(2);
        rn.addFirst(3);
        rn.addFirst(4);
        rn.print();////4 3 2 1
        rn.delete_nth_from_end(3);
        rn.print();  //4 2 1
        
    }
}
