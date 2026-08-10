import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Deque;

public class _2_Deque {
    static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        //addFirst()/offerFirst()  || addLast()/offerLast()
        d.offerFirst(10);
        System.out.println(d);
        d.offerFirst(20);
        System.out.println(d);
        d.offerLast(30);
        System.out.println(d);
        d.offerLast(40);
        System.out.println(d);

        //removeFirst()/pollFirst()  || removeLast()/pollLast()
        System.out.println(d.pollLast());
        System.out.println(d);
        System.out.println(d.pollFirst());
        System.out.println(d);

        //getFirst()/peekFirst()  || getLast()/peekLast()
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
    }
}
