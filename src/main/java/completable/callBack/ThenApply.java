package completable.callBack;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenApply {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture =
                CompletableFuture.supplyAsync(()->{
                    return "This is a Goood machine";
                });
        CompletableFuture<String> cf = completableFuture.thenApply((x)->{
            return x.toUpperCase();
        });
        System.out.println(cf.get());
    }
}
