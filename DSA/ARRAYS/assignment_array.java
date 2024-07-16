package DSA.ARRAYS;

public class assignment_array {
    /*Q1 Given an integer array nums, return true if any value appears at least twice in the array,
     and return false if every element is distinct
    public static boolean array_nums(int num[]){
        for(int i=0;i<num.length-1;i++){
            System.out.println("i is "+i );
            for(int j=i+1;j<num.length;j++){
                System.out.println("j is"+j);
                if(num[i]==num[j]){                    
                    return true;   
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        System.out.println(array_nums(num));
    }
        */

    //   Question 2:There is an integer array nums sorted in ascending order (with distinct values)  
        public int search(int nums[],int target){
            //min will be index of minimum element of nums it is an method
            int min=minSearch(nums);
            //find sorted left
            if(nums[min]<=target && target<=nums[nums.length-1]){
               
                return search(nums,min, target,nums.length-1);
                
            }
            //find sorted right
            else{
                return search(nums,0,min, target);
            }
        }
        //binary searcj to find target in left to right boundary
        public int search(int nums[],int left,int right,int target){
            int l=left;
            int r=right;
            while (l<=r) {
                int  mid=l+(r-l)/2;
                if(nums[mid] == target){
                    return mid;
                }
                else if(nums[mid] > target){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            return -1;
        }
        public static int minSearch(int[] nums) {
            int left=0;
            int right=nums.length-1;//6 : becz length will be 6
            while(left<right){
                int mid=left+(right-left)/2; // 3 5
                if(mid>0 && nums[mid-1] > nums[mid]){
                    return mid;
                }
                else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
                    left=mid+1; //4
                    System.out.println(left);
                }
                else{
                    right=mid-1; //4
                }
            }
            return left;
        }
        public static void main(String[] args) {
            int nums[]={4,5,6,7,0,1,2};
            System.out.println(minSearch(nums));
        }
}
