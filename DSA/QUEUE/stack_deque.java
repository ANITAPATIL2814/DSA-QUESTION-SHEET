package DSA.QUEUE;

import java.util.*;
public class stack_deque {
    
    static class stack{
        Deque<Integer> q = new LinkedList<>();
        public void push(int x){
            q.addLast(x);
        }
        public int pop(){
            return q.removeLast();
        }
        public int peek(){
            return q.getLast();
        }
    }
    
    public static void main(String[] args) {
        stack s= new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek :"+s.peek());
        System.out.println("pop :"+s.pop());

    

    }
}
