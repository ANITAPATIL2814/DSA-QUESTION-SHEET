import java.util.*;
public class function_methods {
    /* function with parameter
    public static void calculatesum(int a, int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20; 
    calculatesum(a, b);
    }
    */
    
    /* swaping of num using function  
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a:"+a);
        System.out.println("b : "+b);
    }
    public static void main(String[] args) {
            int a=10;
            int b=20; 
        swap(a, b);
        
    }
    */

    /* product of two num
    public static int product(int a, int b){
        int pro = a * b;
        return pro;
        
    }
    public static void main(String[] args) {
            int a=10;
            int b=20;
            int prod = product(a,b); //pass copy of a and b 
            System.out.println("a * b : "+prod);
    }
     */

     /* Factorial of num
     public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++) {
            f=f*i;
           
        }
        return f;
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(2));
    }
     */

    /* Binomial coffient
     public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++) {
            f=f*i;
           
        }
        return f;
    }
    public static int bicoff(int n, int r){
         int fact_n=factorial(n);
         int fact_r=factorial(r);
         int fact_nmr=factorial(n-r);
         int bicoff =fact_n/(fact_r*fact_nmr);
         return bicoff;
    }
    public static void main(String[] args) {
        System.out.println(bicoff(5,2));
    }
     */
    /*
    Function overloading using parameters
    public static int sum(int a,int b) {
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 30, 30));
    }
    
    function overloading using data type
    public static int sum(int a,int b) {
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(10.5f, 20.5f));
        System.out.println(sum(10, 20));
    }
     */
    /*
     public static boolean isPrime(int n){
        
        for(int i=2;i<=n-1;i++){
            if(n%i==0){ //checking if num is completely divide
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
     */
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){ //checking if num is completely divide
                return false;
            }
        }
        return true;
        
    }
    // public static void main(String[] args) {
    //     System.out.println(isPrime(16));
    // }

    // public static void primeisrange(int n) {
    //     for(int i=2;i<=n;i++){
    //         if(isPrime(i)) // if condition true print num
    //         { 
    //             System.out.print(i);
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     primeisrange(20); // print num from 2 to 20
    // }
    
    /* BINARY TO DECIMAL 
     *  public static void binDec(int binNum) {
        int mynum=binNum;
        int pow=0;
        int decnum=0;
        while(binNum>0){
            int lastdigit=binNum % 10;
            decnum = decnum + (lastdigit * (int)Math.pow(2, pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of  "+mynum+" is: "+decnum);
    }
    public static void main(String[] args) {
        binDec(110); // print num from 2 to 20
    }

    */
    /* decimal to binary
     * public static void decbin(int n) {
        int mynum=n;
        int pow=0;
        int binNum=0;
        while(n>0){
            int  rem= n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println("binary of  "+mynum+" is: "+binNum);
    }
    public static void main(String[] args) {
        decbin(11); // print num from 2 to 20
    }
     */
    
    //
   
    public static double avg(double a, double b, double c) {
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first num");
        double a=sc.nextDouble();
        System.out.println("Enter second num");
        double b=sc.nextDouble();
        System.out.println("Enter third num");
        double c=sc.nextDouble();
        System.out.println("The average is : "+avg(a, b, c));
   }
}
