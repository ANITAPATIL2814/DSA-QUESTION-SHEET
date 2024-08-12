package DSA.GREEDY;

import java.util.*;

public class max_length {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,40},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        int chainLen=1;
        int chainEnd=pairs[0][1]; //last selected pair end //chain end
        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){ //if pair start is greater than chain end
                chainLen++; //increase chain length
                chainEnd=pairs[i][1]; //update chain end
            }
        }
        System.out.println("max len of chain : "+chainLen);
    }   
}
