package DSA.LINKED_LIST;
public class CustomLinkedList {
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
    public Node head;
    public Node tail;
    public int size;
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
    public void print(){
        Node temp=head;
        while(temp != null ){
            System.out.print(temp.data + " <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void customDelete(int M, int N){
        Node curr = head;
        Node prev = null;
        int countM = M;
        int countN = N;
        boolean flag = true;
        while(curr != null){
            if(countM == 0){
                flag = false;
                countM = M;
                prev = curr.prev;
            }
            if(countN == 0){
                flag = true;
                countN = N;
                prev.next = curr.next;
                if(prev.next != null){
                    prev.next.prev = prev;
                } else {
                    tail = prev;
                }
            }
            if(flag){
                countM--;
            } else {
                countN--;
            }
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        CustomLinkedList c = new CustomLinkedList();
        c.addFirst(1);
        c.addFirst(3);
        c.addFirst(5);
        c.addFirst(9);
        c.addFirst(4);
        c.addFirst(10);
        c.addFirst(1);
        c.print();
        int M = 2;
        int N = 1;
        c.customDelete(M, N);
        c.print();
    }
}