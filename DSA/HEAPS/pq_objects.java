package DSA.HEAPS;

import java.util.Comparator;
import java.util.PriorityQueue;

public class pq_objects {
    static class A implements Comparable<A> {
        String name;
        int rank;
        Public A(String name, int rank){
            this.name=name;
            this.rank=rank;
            return null;
        }
        @Override
        public int compareTo(A o) {
            return o.rank- o.rank;
            }
        
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3); //O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());//O(1)
            pq.remove();//O(logn)
        }
    }
}
