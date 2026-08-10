import java.util.LinkedList;
import java.util.Queue;

public class _1_Queue {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //add by offer()/add()
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);

        //remove by poll()/remove()
        System.out.println(q.poll());
        System.out.println(q);

        //dekhna by peek()/element()
        System.out.println(q.peek());

        //traversal
        for (Integer x : q){
            System.out.print(x + " ");
        }
        System.out.println();
        //for Each
        q.forEach(x-> System.out.print(x + " "));
        System.out.println();
    }
}