package DSA.RECURSION;

public class tiling {
    public static int tiling(int n){ //2 x n (floor size)
         //base case
         if(n == 0  || n == 1){
            return 1;
         }
        //kaam 
        //vertical choice
      //   int fn1= tiling(n-1);
      //   //horizontal choice
      //   int fn2= tiling(n-2);
      //   int totalway= fn1+fn2;
      //   return totalway;
        return tiling(n-1)+tiling(n-2);
    }
 public static void main(String[] args) {
    System.out.println(tiling(3));
 }   
}
