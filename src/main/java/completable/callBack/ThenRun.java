package completable.callBack;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenRun {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture =
                CompletableFuture.supplyAsync(()->{
                    return "This is a Goood machine";
                });
        //then run does not return and does not have access to previous completable future
        CompletableFuture<Void> cf = completableFuture.thenRun(()->{
            System.out.println("No access to previous completable");
        });
        System.out.println(cf.get());
    }
}
