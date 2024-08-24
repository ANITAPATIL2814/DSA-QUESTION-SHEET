public class fibonacci_series {
    public static void fib(int n){
        int num1 =0,num2=1;
        for(int i=0;i<=n;i++){
            System.out.println(num1);
            int temp=num2+num1;
            num1=num2;
            num2=temp;
        }
        
    }
    public static void main(String[] args) {
        int n=10;
        fib(n);
    }
}
