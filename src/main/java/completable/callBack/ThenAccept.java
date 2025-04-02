package completable.callBack;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenAccept {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture =
                CompletableFuture.supplyAsync(()->{
                    return "This is a Goood machine";
                });
        // accept does not return anything but has access to previous completable result
        CompletableFuture<Void> cf = completableFuture.thenAccept((x)->{
            System.out.println(x.length());
        });
        System.out.println(cf.get());
    }
}
