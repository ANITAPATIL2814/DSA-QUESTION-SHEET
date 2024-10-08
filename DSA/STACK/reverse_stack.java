package DSA.STACK;

import java.util.Stack;

public class reverse_stack {
     public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }
    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        //top reverse when we traverse at top
        int top=s.pop();
        reverseStack(s);
        //push at bottom
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       // 3 - 2 - 1
        reverseStack(s);
        printStack(s);
    }
    
    
}
