package DSA.GREEDY;
import java.util.*;
public class activity_sort_selection {

    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int activites[][]= new int[start.length][3];

        for(int i=0;i<start.length;i++){
            activites[i][0]=i;
            activites[i][1]=start[i];
            activites[i][2]=end[i];
        }
        //lambda function = short function 
        //comparaters is an interface for sorting java objects
        Arrays.sort(activites,Comparator.comparingDouble(o -> o[2]));
        //end time basis sort
        int maxAct=0;
        ArrayList<Integer> ans= new ArrayList<>();
    
    //1st activity
    maxAct=1;
    ans.add(activites[0][0]);
    int lastend=activites[0][2];
    for(int i=1;i<end.length;i++){
        if(activites[i][1]>=lastend){
            //select activity
            maxAct++;
            ans.add(activites[i][0]);
            lastend=activites[i][2];
        }
    }
    System.out.println("max activites = "+maxAct);
    for(int i=0;i<ans.size();i++){
        System.out.print("A"+ans.get(i)+" ");
    }
    System.out.println();
    }

}
