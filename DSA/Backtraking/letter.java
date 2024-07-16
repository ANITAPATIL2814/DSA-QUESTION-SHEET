import java.util.*;
public class letter {
    
public static  void leetCombinations(String digits){
    int len=digits.length();
    if(len ==0){
        System.out.println("");
        return;
    }
    recursion(0,len,new StringBuilder(),digits);
    }
    public static void recursion(int pos, int len, StringBuilder sb, String D) {
        if(pos == len){
            System.out.println(sb.toString());
        }   
        else{
            char[] letters=L[Character.getNumericValue(D.charAt(pos))];
            for(int i=0;i<letters.length;i++){
                recursion(pos+1, len, new StringBuilder(sb).append(letters[i]), D);
            }
        }
    }
    final static char[][] L={
        {},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}
    };
    public static void main(String[] args) {
        leetCombinations("24");
    }

}