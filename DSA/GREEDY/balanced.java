package DSA.GREEDY;

public class balanced {
    static int balancedPartition(String s){
        if(s.length()==0){
            return 0;
        }
        int r=0,l=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                r++;
            } else if(s.charAt(i)=='L'){
                l++;
            }
            if(r==l){
                ans++;
                r=0;
                l=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="LLRRRLLRRL";
        // int n=str.length();
        System.out.println(balancedPartition(s));
    }
}
