package DSA.ARRAY_LIST;

import java.util.*;

public class sort {
    public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    //add
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(6);
    list.add(8);
    //asc order
        System.out.println(list);
        Collections.sort(list);
        System.out.println("asc : "+list);
    //desc order
    Collections.sort(list,Collections.reverseOrder());
    System.out.println("dec : "+list);
    }
}
