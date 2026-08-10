import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class _3_PriorityQueue {
    static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //add
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(40);
        System.out.println(pq);

        //peek()
        System.out.println(pq.peek());

        //poll()
        System.out.println(pq.poll());
        System.out.println(pq);
    PriorityQueue<Integer> pd = new PriorityQueue<>(Collections.reverseOrder());
        pd.offer(30);
        pd.offer(10);
        pd.offer(20);
        pd.offer(40);
        System.out.println(pd); //Collections ki vajah se decresing order follow krega
        //modern way for decreasing order
        PriorityQueue<Integer> pq1 = new PriorityQueue<>((a, b) -> b - a);
        //But integer subtraction comparator me overflow ka theoretical issue ho sakta hai. Safer:
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        //PriorityQueue with Objects
        PriorityQueue<_4_PQ_Objects> pq3 = new PriorityQueue<>((a, b) -> Integer.compare(b.marks, a.marks));
        pq3.offer(new _4_PQ_Objects("Azeem",95));
        pq3.offer(new _4_PQ_Objects("Abdul",99));
        pq3.offer(new _4_PQ_Objects("Ali",88));
        for (_4_PQ_Objects x : pq3){
            System.out.println("Name: " + x.getName() + " Marks: " + x.getMarks());
        }

        //poll()

        pq3.poll();
        System.out.println("After poll");
        for (_4_PQ_Objects x : pq3){
            System.out.println("Name: " + x.getName() + " Marks: " + x.getMarks());
        }
    }
}
