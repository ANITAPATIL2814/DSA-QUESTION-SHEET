package DSA.LEETCODE;

public class lon_palindrome {
    //brute force
    /*public int longestPalindromeSubseq(String s) {
        int [][]dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            dp[i][i]=1;

        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=2;
            }
            else{
                dp[i][i+1]=1;
            }
        }
        for(int len=3;len<s.length();len++){
            for(int i=0;i<s.length()-len;i++){
                if(s.charAt(i)==s.charAt(i+len-1)){
                    dp[i][i+len-1]=2+dp[i+1][i+len-2];
                }
                else{
                    dp[i][i+len-1]=Math.max(dp[i+1][i+len-1], dp[i+1][i+len-2]);
                }
            }
        }
        return dp[0][s.length()-1];
    }*/
    private int helper(String s, int l, int r, int[][] dp) {
        if(l>r){
            return 0;
        }   
        if(l==r){
            return 1;
        }
        if(dp[l][r]!=0){
            return dp[l][r];
        }
        if(s.charAt(l)==s.charAt(r)){
            dp[l][r]=helper(s, l+1, r-1, dp)+2;
            return dp[l][r];
        }else{
            dp[l][r]=Math.max(helper(s, l+1, r, dp),helper(s, l, r-1, dp));
            return dp[l][r];
        }

    }
    public int longestPalindromeSubseq(String s) {

        int [][]dp=new int[1000][1000];
        return helper(s,0,s.length()-1,dp);
    }

   
}
