package DSA.LEETCODE;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class lonely_num {
    public static  ArrayList<Integer> LonelyNum(int array[]){
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            if(i==0){
                if(array[i+1] != array[i] + 1 && array[i+1] != array[i])
                list.add(array[i]);
            }else if(i== array.length-1){
                if(array[i-1] != array[i] - 1 && array[i-1] != array[i])

                list.add(array[i]);
            }else{
                if(array[i-1] != array[i] - 1 && array[i+1] != array[i]+1 && array[i-1] != array[i] && array[i+1] != array[i])
                list.add(array[i]);
            }
        } return list;

    }
    public static void main(String[] args) {
       
        int array2[]={1,3,5,3};
        System.out.println(LonelyNum(array2));
    }
}

