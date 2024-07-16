package DSA.LEETCODE;

public class leetocde {
   /*
    *  public static int single_num(int num[]){
        int r=0;
        for(int i=0;i<num.length;i++){
            r^=num[i];
        }
        return r;
    }
    public static void main(String[] args) {
        int num[]={2,2,1};
        System.out.println(single_num(num));
            
    }
    */
    public static int min(int start,int end){
    int n=start^end;
    int setBits=0;
    while(n != 0){
        n=n&(n-1);
        setBits++;
    }
    return setBits;
    }
    public static void main(String[] args) {
        System.out.println(min(10, 7));
    }
}
