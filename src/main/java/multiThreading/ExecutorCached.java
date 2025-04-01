package multiThreading;

import java.util.concurrent.*;

public class ExecutorCached {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService cachedExecutorService = Executors.newCachedThreadPool();
        for (int i=0 ;i<3;i++) {
            Runnable task1 = ()->{
                System.out.println(Thread.currentThread().getName() + " is running !");
                try {
                    Thread.sleep(62000);
                    System.out.println("woke up from sleep");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            };
            cachedExecutorService.submit(task1);
        }
        cachedExecutorService.shutdown();
    }
}
