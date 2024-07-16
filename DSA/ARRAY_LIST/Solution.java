package DSA.ARRAY_LIST;

import java.util.ArrayList;

class Solution{
    public static int mostFrequent(ArrayList<Integer>list, int key) {
        int count[]=new int[1001];
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)== key){
                count[list.get(i+1)]++;
            }
        }
        int maxvalue=0;
        int target=0;
        for(int i=0;i<count.length;i++){
            if(count[i]>maxvalue){
                target=i;
                maxvalue=count[i];
            }
        }
        return target;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(5);
        System.out.println(mostFrequent(list, 1));
        
    }
}