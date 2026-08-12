public class _1_Thread {
    static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        System.out.println(Thread.currentThread().getName());
        Thread t0 = new Thread(()->{
            System.out.println("Task running");
            System.out.println(Thread.currentThread().getName());
        });
        //Thread name
        t0.setName("Azeem");
        t0.start();
        t0.join();
        System.out.println("Task finished");


    }

    //Thread class
    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    //sleep()  thread ko kuch time ke liye pause
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}