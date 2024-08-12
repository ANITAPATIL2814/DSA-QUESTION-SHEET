package DSA.QUEUE;

import java.util.Deque;
import java.util.LinkedList;

public class queue_deque {
    static class deque{
        Deque<Integer> q1 = new LinkedList<>();
        public void add(int data){
            q1.addLast(data);
        }
        
        public int remove(){
            return q1.removeFirst();
        }
        public int peek(){
            return q1.getFirst();
        }
    }
    public static void main(String[] args) {
        deque d = new deque();
    d.add(1);
    d.add(2);
    d.add(3);
    System.out.println("peek :"+d.peek());
    System.out.println("pop :"+d.remove());
    System.out.println(d.remove());
    System.out.println(d.remove());
    }
}
