package DSA.STACK;

import java.util.*;

public class valid_parenthesis {
    public static boolean isValid(String s) {
        Stack<Character> si= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == '('|| ch=='{'|| ch=='['){ //opening
                si.push(ch);
            }
            else{//closing
                if(si.isEmpty())
                {
                    return false;
                }
                if(si.peek() == '(' && ch == ')' || si.peek() == '{' && ch == '}' || si.peek() == '[' && ch == ']') 
                {
                    si.pop();
                }else
                {
                    return false;
                }
            }
        }
        if(si.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        String str="{()[]}";
        System.out.println(isValid(str));
    }

    
}
