/*
--> ExecutorService <--
ExecutorService threads ko manage karne ke liye framework provide karta hai.
Instead of: new Thread(...) ==> baar-baar karne ke bajaye:
ExecutorService executor = Executors.newFixedThreadPool(3);
Tasks submit karo.
executor.submit(task);

--> Common Thread Pools <--
Fixed Thread Pool == Fixed Thread Pool
Single Thread Executor == One worker.
Scheduled Thread Pool == Scheduled Thread Pool
Cached Thread Pool == Dynamic worker management.

--> Atomic Classes <--
Important classes:
AtomicInteger
AtomicLong
AtomicBoolean
AtomicReference
LongAdder
LongAccumulator

Atomic Methods:
get()
set()
incrementAndGet()
getAndIncrement()
decrementAndGet()
addAndGet()
compareAndSet()

--> Semaphore <--
Limited number of threads ko simultaneously resource access karne deta hai.
Example:  Semaphore semaphore = new Semaphore(3);

--> CountDownLatch <--
CountDownLatch ek thread ko wait karwa sakta hai jab tak required count zero na ho.

--> CompletableFuture <--
Asynchronous tasks ko compose, combine aur handle karna.
runAsync() : Agar result nahi chahiye
supplyAsync() : Result chahiye
thenApply() : Previous result ko transform karta hai.
thenAccept() : Result consume karna:
thenRun() : Previous task complete hone ke baad action run karna, result consume nahi karna:
thenCompose() : Jab next operation khud CompletableFuture return kare.
thenCombine() : Do independent futures ke results combine karna:
allOf() : Multiple futures complete hone ka wait:
anyOf() : Multiple futures mein se jo pehle complete ho:
handle() : Success + failure dono handle:
whenComplete() : Completion ke baad side-effect/action:
Example : CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10 + 20);
Result : Integer result = future.join();


--> ForkJoinPool <--
ForkJoinPool large computational tasks ko:

 */

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//// --> Race Condition <--
//class Counter {
//    int count = 0;
//    void increment() {
//        count++;
//    }
//}

//AtomicInteger Example
class Counter {
    private AtomicInteger count =
            new AtomicInteger(0);
    void increment() {
        count.incrementAndGet();
    }
    int getCount() {
        return count.get();
    }
}

//RecursiveTask
//Result return karna ho:
class SumTask extends RecursiveTask<Integer> {
    @Override
    protected Integer compute() {
        return 0;
    }
    // compute()
}
//compute() task ko split karta hai.

public class _3_ExecutorService {
    static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(()-> System.out.println("Task 1"));
        executor.submit(()-> System.out.println("Task 2"));
        executor.submit(()-> System.out.println("Task 3"));
        executor.shutdown();

        //Thread pool
        ExecutorService pool = Executors.newFixedThreadPool(4);
        for (int i = 1; i <= 5; i++) {
            final int taskNumber = i;
            pool.submit(() -> {
                System.out.println("Task " + taskNumber + " executed by " + Thread.currentThread().getName());
            });
        }
        pool.shutdown();
//        pool.submit(()-> System.out.println("Task 1"));
//        pool.submit(()-> System.out.println("Task 2"));
//        pool.submit(()-> System.out.println("Task 3"));
//        pool.submit(()-> System.out.println("Task 4"));
//        pool.submit(()-> System.out.println("Task 5"));
//        pool.shutdown();

        //Locks
        Lock lock = new ReentrantLock();
        lock.lock();
        try{
//            count++;
        }finally {
            lock.unlock();
        }


        //Deadlock Example
        Object lock1 = new Object();
        Object lock2 = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                synchronized (lock2) {
                    System.out.println("T1");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                synchronized (lock1) {
                    System.out.println("T2");
                }
            }
        });

        //Semaphore Example
        Semaphore semaphore = new Semaphore(2);
        semaphore.acquire();
        try {
            System.out.println("Using resource");
        } finally {
            semaphore.release();
        }

        //CountDownLatch Example
        CountDownLatch latch =
                new CountDownLatch(3);
        Runnable task = () -> {
            try {
                System.out.println(
                        Thread.currentThread().getName()
                                + " completed"
                );
            } finally {
                latch.countDown();
            }
        };

    }
}
