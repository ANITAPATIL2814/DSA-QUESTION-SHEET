package DSA.QUEUE;

import java.util.*;

public class stack_using_queue {
    static class Stack{
        static Queue<Integer> q1= new LinkedList<>();
    static Queue<Integer> q2= new LinkedList<>();
    public static boolean  isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }
    public static void push(int data){
        if(!q1.isEmpty()){
            q1.add(data);
        }
        else{
            q2.add(data);
        }
    }
    public static int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        int top=-1;
        //case 1:
        if(!q1.isEmpty()){
            while (!q1.isEmpty()) {
                top=q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top); //if last element not their
            }
            
        } else{ //case 2 
            while (!q2.isEmpty()) {
                top=q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top); //if last element not their
            }
        }
        return top;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        int top=-1;
        //case 1:
        if(!q1.isEmpty()){
            while (!q1.isEmpty()) {
                top=q1.remove();
                q2.add(top); //if last element not their
            }
            
        } else{ //case 2 
            while (!q2.isEmpty()) {
                top=q2.remove();
                q1.add(top); //if last element not their
            }
        }
        return top; //top most element value store here 
    }
    }
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
