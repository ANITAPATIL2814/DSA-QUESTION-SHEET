package DSA.sort;

import java.util.Arrays;
import java.util.Collections;


public class inbuilt_sort {
    public static void print_arr(Integer arr[])
    {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
   
    public static void main(String[] args) {
        Integer arr[]={1,4,3,2,5};
        
        /*ascending order
        Arrays.sort(arr);
        Arrays.sort(arr,0,3);*/
        //desc
        // Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,4,Collections.reverseOrder());

        print_arr(arr);
    }
    
}

