package DSA.GREEDY;

public class kthodd {
    public static int KthOdd(int L,int R,int K){
        int totalNum=R-L+1;
        int NumOfOddNums;
        if(L % 2 !=0 && R % 2 != 0){
            NumOfOddNums=(totalNum/2)+1;
        }else{
            NumOfOddNums=(totalNum/2);
        }
        if(K>NumOfOddNums){
            return 0;
        }
        int largest_value;
        if(R%2 != 0){
            largest_value=R;
        }
        else{
            largest_value=R-1;
        }
        return largest_value-(2*(K-1));
    }
    public static void main(String[] args) {
        int k=5;
        System.out.println(KthOdd(-3,10,k));
    }
}
