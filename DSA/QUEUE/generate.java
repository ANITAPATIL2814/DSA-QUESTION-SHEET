package DSA.QUEUE;

import java.util.*;

public class generate {
    public void generate(int n) {
        Queue<String> q = new LinkedList<String>(); 
        q.add("1");
    while (n-- > 0) 
    { 
        String s1 = q.peek(); 
        q.remove(); 
        System.out.println(s1);
        String s2 = s1;
        q.add(s1 + "0");
        q.add(s2 + "1");
        }
        }
        public static void main(String[] args){ 
            int n = 2;
            generate g = new generate();
            g.generate(n);
            
        }
        
}
