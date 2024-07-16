package DSA.BIT;

public class odd_even {
    public static int odd_even_num(int n){
        int bitmask=1;
        if((n & bitmask) ==0){
            //even num
            System.out.println("even number");   
        }
        else{
            System.out.println("odd number");
        }
        return bitmask;
    }
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setItBit(int n,int i){
        int bitMask=1<<i;
       return n|bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
       return n&bitMask;
    }
    /*
     *  public static int updatebit(int n,int i,int newbit){
            if (newbit ==0) {
                return clearIthBit(n, i);
            }
            else{
                return setItBit(n, i);
            }
            n=clearIthBit(n, i);
            int bitMask=newbit<<i;
            return n|bitMask;
        }
     */
       
    public static int clear_last_bits(int i,int n){
        int bitMask = (~0) << i;
        return n & bitMask;
    }
    public static int clear_range(int n,int i,int j) {
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n & bitMask;
    }
    public static boolean ispower(int n){
        return (n&(n-1)) ==0;
    }
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1) !=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fast_expo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1) != 0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }


    public static void main(String[] args) {
    //    odd_even_num(2);
    //    odd_even_num(11);
    //    System.err.println(getIthBit(10, 2));
    //    System.out.println(setItBit(10, 2));
    //    System.out.println(clearIthBit(10, 1));
    //    System.out.println(updatebit(10, 2, 1));
    //    System.out.println(clear_last_bits(15, 2));
    //    System.out.println(clear_range(10, 2, 4));
    //    System.out.println(ispower(17));
    //    System.out.println(ispower(2));
    //    System.out.println(countsetbits(15));
    System.out.println(fast_expo(3, 5));
    }
}
