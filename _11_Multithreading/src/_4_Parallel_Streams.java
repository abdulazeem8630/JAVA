/*
--> Concurrent Collections <--
ConcurrentHashMap  == Ye normal HashMap ke comparison mein concurrent access ke liye designed hai.
CopyOnWriteArrayList
BlockingQueue  == Producer-consumer problems mein extremely useful.
ConcurrentLinkedQueue
ConcurrentSkipListMap
 */

import java.util.List;

public class _4_Parallel_Streams {
    static void main(String[] args) {
        List<Integer> num = List.of(10,20,25,30,35);
        num.parallelStream()
                .filter(n->n%2==0)
                .forEach(System.out::println); //Output order guaranteed nahi hota.
                //forEachOrdered()  Agar encounter order maintain karna ho:
    }
}
