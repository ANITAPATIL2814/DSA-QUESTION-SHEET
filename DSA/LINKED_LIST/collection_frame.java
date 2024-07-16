package DSA.LINKED_LIST;
import java.util.LinkedList;

public class collection_frame {
    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<>();
        li.addLast(1);
        li.addFirst(2);
        li.addFirst(0);

        System.out.println(li);
        li.removeLast();
        li.removeFirst();
        System.out.println(li);
    }
}
