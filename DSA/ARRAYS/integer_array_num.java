package DSA.ARRAYS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class integer_array_num {
    public static List<List<Integer>> three_sum(int nums[]){
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length;i++){
            // System.out.println("i is "+i);
            for(int j=i+1;j<nums.length;j++){
                // System.out.println("j is "+j);
                for(int k=j+1;k<nums.length;k++){
                    // System.out.print("k is "+k);
                    if(nums[i]+nums[j]+nums[k] == 0){

                        

                        List<Integer> triplet = new ArrayList<Integer>(); 
                        triplet.add(nums[i]);  
                        triplet.add(nums[j]);  
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);  

                    }
                }
            }
        }

        result= new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }

    public static void main(String[] args) {
    int nums[]={-1,0,1,2,-1,4};
    System.out.println(three_sum(nums));

    }
}
