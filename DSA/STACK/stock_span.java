package DSA.STACK;

import java.util.Stack;

public class stock_span {
    public static void stockSpan(int[] stocks, int[] span) {
        Stack<Integer> s= new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int currprince = stocks[i];
            while(!s.isEmpty() && currprince> stocks[s.peek()]){ //s.peek() to check idx or put in stock and access that idx
                s.pop();

            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prevHigh=s.peek();
                span[i]=i -prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockSpan(stocks,span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }

    
}
