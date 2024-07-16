package DSA.divide_conquer;

public class rotated_array {
    public static int search(int arr[],int tar,int si, int ei){
        //base case
        if(si >ei){
            return -1;
        }
        //kaam - find mid
        int mid=si+(ei-si)/2;
        //case found
        if(arr[mid]==tar){
            return mid;
        }
        //mid on l1
        if(arr[si] <= arr[mid]){
            //case a: left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            else{
                //case b:right
                return search(arr, tar, mid+1, ei);
            }
        }
        //mid on l2
        else{
            //case c: right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                //case d=left
                return search(arr, tar, si, mid-1);
            }
        }

    }   
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tar=0;
        System.err.println(search(arr, tar, 0, arr.length-1));
    }
}

// class Solution {
//     public int search(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1;

//         while (left <= right) {
//             int mid = (left + right) / 2;

//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] >= nums[left]) {
//                 if (nums[left] <= target && target <= nums[mid]) {
//                     right = mid - 1;
//                 } else {
//                     left = mid + 1;
//                 }
//             } else {
//                 if (nums[mid] <= target && target <= nums[right]) {
//                     left = mid + 1;
//                 } else {
//                     right = mid - 1;
//                 }
//             }
//         }

//         return -1;        
//     }
// }