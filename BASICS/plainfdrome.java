import java.util.Scanner;

public class plainfdrome {
    public static boolean Palindrome(int number){
        int palindrome = number;
        int rev=0;
        while(palindrome != 0){
            int rem=palindrome % 10;
            rev=rev*10+rem;
            palindrome=palindrome/10;
        }
        if(number==rev){
            return true;
        }
        return false;
    }
        public static void main(String[] args) {
            System.out.println("enter number");
            Scanner sc= new Scanner(System.in);
            int palindrome=sc.nextInt();
            if(Palindrome(palindrome)){
                System.out.println("num is palindrome :"+palindrome);
            }
            else{
                System.out.println(" num is not plaindrome "+palindrome);
            }
    }   
}
