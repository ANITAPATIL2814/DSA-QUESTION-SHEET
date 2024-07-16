package DSA.ARRAY_LIST;

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        System.out.println(list);
        /*get
        int ele=list.get(0);
        System.out.println(ele);
        */
        
        /*delete
        list.remove(1);
        System.out.println(list);
        */
        
        /*set
        list.set(1, 10);
        System.out.println(list);
        */
        /*contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(10));
         */
        //size od arraylist
        System.out.println(list.size());
        //reverse of array
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
