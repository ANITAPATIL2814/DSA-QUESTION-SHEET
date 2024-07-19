package DSA.STACK;

import java.util.Stack;

public class max_area_in_histo {
    public static void maxArea(int arr[]){
        int maxarea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];

        //next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            //while 1
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            //2 if else
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            //3 push in s
            s.push(i);
        }
        
        //next smaller left
        s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            //while 1
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            //2 if else
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i]=s.peek();
            }
            //3 push in s
            s.push(i);
        }
       
        //current area :width =j-i-1 : nsr[j]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currarea=height*width;
            maxarea=Math.max(maxarea,currarea);
            }
            System.out.println("max area in histogram is : "+ maxarea);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3}; //height in histogram
        maxArea(arr);
    }
}
