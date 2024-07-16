package DSA.ARRAY_LIST;

import java.util.ArrayList;

public class multi_di {
    public static void main(String[] args) {
       /*  ArrayList<ArrayList<Integer>>mainList =new ArrayList<>(); //main list
        ArrayList<Integer> list1 =new ArrayList<>(); //list define inside main list 
        list1.add(1);
        list1.add(2);
        mainList.add(list1);
        ArrayList<Integer> list2 =new ArrayList<>(); //list define inside main list 
        list2.add(3);
        list2.add(4);
        mainList.add(list2);
        ArrayList<Integer> list3 =new ArrayList<>(); //list define inside main list 
        list3.add(5);
        list3.add(6);
        mainList.add(list3);
        for(int i=0;i<mainList.size();i++){ 
            //to find current list 
            ArrayList<Integer> currlist= mainList.get(i); //print all ith index  list
            for(int j=0;j<currlist.size();j++){ //print all element of that list
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println("mainList"+mainList);
    
        op:
        1 2 
        3 4
        5 6
        mainList[[1, 2], [3, 4], [5, 6]]
        */
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();
        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
        //to print list 
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>currList= mainList.get(i);

            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
      }
}
