package DSA.STACK;

import java.util.Stack;

public class simplify_path {
    public static String simplifyPath(String path) {
        String array[]=path.split("/");
        String output="/";
        int i=0;
        Stack<String> stack=new Stack<>();
        for(String s: array){ //s=array[j]
            if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    continue;
                }        
                }else if(s.equals(".")|s.isEmpty()|s.equals("/"))
                {
                    continue;
                }else{
                    stack.push(s);
                    }
            }
            while(!stack.isEmpty()){
                array[i++] = stack.pop();
            }
            for(int j=i-1;j>=0;j--){
            if(j !=0){
                output = output +  array[j]+"/";
            }
            else{
                output = output + array[j];
            }
            }
            return output;
        }
    
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home"));
        System.out.println(simplifyPath("/home//fool/"));
        System.out.println(simplifyPath("/h/users/doc/../pic/"));
    }

    
}
