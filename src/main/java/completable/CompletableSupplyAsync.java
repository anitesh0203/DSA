package completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableSupplyAsync {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> completableFuture =
                CompletableFuture.supplyAsync(()->{
                    return 2;
                });

        completableFuture.join();
        System.out.println(completableFuture.get());
    }
}
