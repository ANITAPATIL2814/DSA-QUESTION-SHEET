package DSA.GREEDY;

import java.util.*;

public class jobseq {

    static class Job{
        int deadline;
        int profit;
        int id; //0(A),1(B)...
        public  Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job>jobs= new ArrayList<>();

        for(int i=0;i<jobinfo.length;i++){
            jobs.add(new Job(i, jobinfo[i][0], jobinfo[i][1]));
        }
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit); //desc order  sorting bassed on profit
        ArrayList<Integer> seq= new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr= jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        //print seq
        System.out.println("max job = "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
