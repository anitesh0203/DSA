package completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableRunAsync {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture =
                CompletableFuture.runAsync(()->{
                    System.out.println("Running inside the completable future");
                });
        completableFuture.join();
        completableFuture.get();
    }
}
