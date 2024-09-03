package DSA.LEETCODE;

public class longest_seq {

    //brute force
    public int helper(int []nums,int prevIndex,int nextIndex){
        if(nextIndex<nums.length){
        int len=helper(nums, prevIndex, nextIndex+1);
        if(prevIndex==-1||nums[prevIndex]<nums[nextIndex]){
            len=Math.max(len,1+helper(nums, prevIndex, nextIndex+1));
        }
        return len;
    }
    else{
        return 0;
    }
}
    
    public int lengthOfLIS(int[] nums) {
        return helper(nums, -1, 0);
    }
}
