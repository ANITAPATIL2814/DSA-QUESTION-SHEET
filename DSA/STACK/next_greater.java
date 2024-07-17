package DSA.STACK;

import java.util.Stack;

public class next_greater {
    public static void main(String[] args) {
        int arr[]={4,1,2};
        Stack<Integer> s = new Stack<>();
        int nxtgreater []= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            //while 1
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();

            }
            //2 if else
            if(s.isEmpty()){
                nxtgreater[i] = -1;
            }
            else{
                nxtgreater[i]=arr[s.peek()];

            }
            //3 push in s
            s.push(i);

        }
        for(int i=0;i<nxtgreater.length;i++){
            System.out.print(nxtgreater[i]+" ");
        }
        System.out.println();
    }
}
