package forkJoinTutorial;

import java.util.concurrent.ForkJoinPool;

public class ForkDemo {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        //forkJoinPool.execute(new SampleTask(new int[]{1, 2, 3, 4, 5, 6}, 0, 6));
        System.out.println(forkJoinPool.invoke(new SampleTask(new int[]{1, 2, 3, 4, 5, 6}, 0, 6)));
    }
}
