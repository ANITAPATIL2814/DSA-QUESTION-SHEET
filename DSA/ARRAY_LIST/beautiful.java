package DSA.ARRAY_LIST;

import java.util.ArrayList;

public class beautiful {
    public static ArrayList<Integer> beautiful(int n){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans.add(1);
        while(ans.size()<n){
            ArrayList<Integer>temp=new ArrayList<>();
            int ans_size=ans.size();
            for(int i=0;i<ans_size;i++){
                if((ans.get(i)*2-1)<=n){
                    temp.add(ans.get(i)*2-1);
                }
            }
            for(int i=0;i<ans_size;i++){
                if((ans.get(i)*2-1)<=n){
                    temp.add(ans.get(i)*2);
                }
            }
            ans=temp;
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int n[]={1, 3, 5, 7, 9};
        System.out.println(beautiful(6));
        
    }   
}
