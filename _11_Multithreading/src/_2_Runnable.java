import java.util.concurrent.*;

/*
Runnable ek function interface h

--> Future methods <--
future.get();
future.isDone();
future.isCancelled();
future.cancel(true);

 */
//@FunctionalInterface
//interface Runnable{
//    void run();
//}

public class _2_Runnable {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable task = ()-> System.out.println("Task running");
        Thread t = new Thread(task);
        t.start();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        //Callable
        Callable<Integer> task0 = ()-> {return 10 + 20;};
        //future
        Future<Integer> future = executor.submit(task0);
        System.out.println(future.get());
        executor.shutdown();
    }
}
