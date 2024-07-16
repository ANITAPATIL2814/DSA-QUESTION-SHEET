package DSA.RECURSION;

public class pair {
    public static int friendpair(int n){
        //base case
        if(n == 1 || n == 2){
            return n;
        }
        // //choice
        // //single
        // int fn1= friendpair(n-1);
        // //pair
        // int fn2=friendpair(n-2);
        // int pairways=(n-1)*fn2;
        // int totalways=fn1+pairways;
        // return totalways;
        return friendpair(n-1) + (n-1) * friendpair(n-2);
    }
    public static void main(String[] args) {
       System.out.println( friendpair(3));        
    }
}
