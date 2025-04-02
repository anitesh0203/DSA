package completable;

import java.util.concurrent.CompletableFuture;

public class ErrorHandling {
    public static void main(String[] args) {
        //using excpetionally
        CompletableFuture<Integer> future1 =
                CompletableFuture.supplyAsync(()->{
                    //throw an exception here
                    return 1/0;
                }).exceptionally(ex->{
                    System.out.println(ex.getCause()+"has occured");
                    return 0;
                });
        future1.thenApply((x)->{
            return x *2;
        });

        //using handle
        CompletableFuture<Integer> future2 =
                CompletableFuture.supplyAsync(()->{
                    //throw an exception here
                    return 1/0;
                }).handle((res,ex)->{
                    if(ex != null) {
                        System.out.println(ex.getCause()+"has occured");
                        return 0;
                    }
                    return res;
                });
        future1.thenApply((x)->{
            return x *2;
        });
    }
}
