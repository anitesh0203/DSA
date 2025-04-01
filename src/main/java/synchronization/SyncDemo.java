package synchronization;

public class SyncDemo {
    static int counter =0;

    /**
     * If we dont use synchronized both method will try to update the counter and one of them will be
     * success hence the counter will be less than 2000.
     * @throws InterruptedException
     */
    public synchronized void increment() throws InterruptedException {
        counter++;
        Thread.sleep(500);
    }
    public static void main(String[] args) throws InterruptedException {
        SyncDemo syncDemo = new SyncDemo();
        /**
         * Both threads are trying to access the same block
         */
        Thread t1 = new Thread(()->{
            for (int i=0;i<1000;i++) {
                try {
                    syncDemo.increment();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(()->{
            for (int i=0;i<1000;i++) {
                try {
                    syncDemo.increment();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter);

    }
}
