package multiThreading;

import java.util.concurrent.*;
import java.util.function.Function;

public class ExecutorFixed {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Function<Integer,Integer> function = (x)->{
            return x*4;
        };
        //this is the thread manager which will use 5 threads from the pool
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Runnable task1 = ()->{
            System.out.println(Thread.currentThread().getName()+ " is running");
        };
        Runnable task2 = ()->{
            System.out.println(Thread.currentThread().getName()+ " is running");
        };
        Callable<Integer> task3 = () -> function.apply(3);
        executorService.submit(task1);
        executorService.submit(task2);
        Future<Integer> future = executorService.submit(task3);
        System.out.println(future.get());
        executorService.shutdown();
    }
}
