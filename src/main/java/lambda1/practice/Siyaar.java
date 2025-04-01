package lambda1.practice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Siyaar {
    public static void main(String[] args) {
        Consumer<Account> consumer = (acct)->{
            System.out.println("This is a "+acct.getType());
        };
        Checkings checkings = new Checkings("checkings");
        checkings.setType("checkings");
        consumer.accept(checkings);

        //predicate - takes 1 return boolean
        Predicate<Account> predicate= (x)->{
            if(x.getType().equalsIgnoreCase("checkings"))
                return true;
            else
                return false;
        };
        System.out.println(predicate.test(checkings));

        //supplier - dont take only give
        Supplier<Account> supplier = ()->{
            return checkings;
        } ;

        Function<Integer,Integer> funct = (x)->{
            int a = x.intValue();
            return a+5;
        };
        System.out.println(funct.apply(34));

    }
}
