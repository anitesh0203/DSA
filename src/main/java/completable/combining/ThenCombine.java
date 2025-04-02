package completable.combining;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenCombine {
    /**
     * While thenCompose() is used to combine two Futures where one future
     * is dependent on the other, thenCombine() is used when you want two
     * Futures to run independently and do something after both are complete.
     * @param args
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> futureDistance =
                CompletableFuture.supplyAsync(()->{
                   return 30;
                });
        CompletableFuture<Integer> futureTime =
                CompletableFuture.supplyAsync(()->{
                   return 2;
                });

        CompletableFuture<Integer> speedFuture = futureDistance.thenCombine(futureTime,(s,d)->{
            return s/d;
        });
        System.out.printf(String.valueOf(speedFuture.get()));
    }
}
