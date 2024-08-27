package DSA.HEAPS;

import java.util.Comparator;
import java.util.PriorityQueue;

public class pq_objects {
    static class Students implements Comparable<Students> {
        String name;
        int rank;
        public Students(String name, int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Students o) {
            return this.rank- o.rank;
            }  
    }

    public static void main(String[] args) {
        PriorityQueue<Students> pq=new PriorityQueue<>();
       
        pq.add(new Students("anita",4)); //O(logn)
        pq.add(new Students("vasu",5));
        pq.add(new Students("utsav",7));
        pq.add(new Students("diapk",9));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());//O(1)
            pq.remove();//O(logn)
        }
    }
}
