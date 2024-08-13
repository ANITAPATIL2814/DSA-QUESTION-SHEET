package DSA.GREEDY;

import java.util.*;

public class chocola {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer costVer[]= {2,1,3,1,4};//m-1
        Integer costHor[]={4,1,2};//n-1
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
        int h=0,v=0; //horizonatal cut
        int hp=1,vp=1; //horizontal piece
        int cost=0;
        while(h<costHor.length && v<costVer.length){
            //vertical cost < hor cost
            if(costVer[v]<= costHor[h]){ //horizonatal cut
                cost+=(costHor[h]* vp);
                h++;
                hp++;
            }else{ //vertical cut
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while (h<costHor.length) {
            cost+=(costHor[h]* vp);
            hp++;
            h++;
        }
        while (v<costVer.length) {
            cost+=(costVer[h]* vp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts :"+cost);
    }
}
