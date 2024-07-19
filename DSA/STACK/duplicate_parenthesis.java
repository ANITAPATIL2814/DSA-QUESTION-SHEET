package DSA.STACK;

import java.util.Stack;

public class duplicate_parenthesis {
    public static boolean isduplicate(String s){
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            //closing
            if(ch==')'){
                int count=0;
                while(st.peek() != '('){
                    st.pop();
                    count++;
                }
                if(count<1){
                    return true;
                    //dupicate
                }
                else{
                    st.pop(); //opening pair pop
                }
            }else{
                //opening, operand, operator
                st.push(ch);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String s="((a+b))"; //true
        String st1="(a-b)"; //false
        System.out.println(isduplicate(st1));
    }   
}
