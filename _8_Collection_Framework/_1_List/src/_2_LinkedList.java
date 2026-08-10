import java.util.LinkedList;
import java.util.List;

public class _2_LinkedList {
    static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        //add()
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        //addFirst()
        list.addFirst(5);
        System.out.println(list);

        //addLast()
        list.addLast(40);
        System.out.println(list);

        //getFist()
        System.out.println(list.getFirst());

        //getLast()
        System.out.println(list.getLast());

        //removeFirst()
        System.out.println(list.removeFirst());
        System.out.println(list);

        //removeLast()
        System.out.println(list.removeLast());
        System.out.println(list);

        //LinkedList Queue Ki Tarah  (LinkedList Deque bhi implement karta hai)
        LinkedList<Integer> queue = new LinkedList<>();
        //add
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);
        System.out.println(queue);

        //remove
        queue.poll();  //start se
        System.out.println(queue);
        queue.pollFirst();  //start se
        System.out.println(queue);
        queue.pollLast();  //last se
        System.out.println(queue);

        //LinkedList Stack Ki Tarah
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack);
        stack.pop(); //last remove
        System.out.println(stack);

    }
}
