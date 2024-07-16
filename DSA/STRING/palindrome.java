package DSA.STRING;

public class palindrome {
    public static boolean isPalindrome(String s){
        int n=s.length();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s= "noon";
        System.out.println(isPalindrome(s));
    }
}
