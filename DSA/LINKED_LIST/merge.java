package DSA.LINKED_LIST;
import java.util.*;

public class merge {
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
    public Node findMid(Node head){  
        Node slow= head;
        Node fast= head.next; // 1st half ka last node
        while(fast != null && fast.next != null){
            slow= slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow; //mid node
    }
    private Node merge(Node head1,Node head2){
        Node mergeLL= new Node(-1);
        Node temp=mergeLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next=head1;
                head1= head1.next;
                temp = temp.next;

            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while (head1 != null ) {
            temp.next = head1;
            head1= head1.next;
            temp = temp.next;
        }
        while (head2 != null ) {
            temp.next = head2;
            head2= head2.next;
            temp = temp.next;
        }
        return mergeLL.next; //to delete dummy node
    }
    public Node  mergeSort(Node head){

        if(head ==null || head.next == null){
            return head;

        }
        //find mid
        Node mid=findMid(head);
        //left half & right half
        Node rightHead= mid.next;
        mid.next=null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        
        
        //merge
        return merge(newLeft,newRight);

    }
    public static void main(String[] args) {
        merge li=new merge();
        li.addFirst(1);
        li.addFirst(2);
        li.addFirst(3);
        li.addFirst(4);
        li.addFirst(5);
        li.print();
        li.head = li.mergeSort(li.head);
        li.print();

    }
}
