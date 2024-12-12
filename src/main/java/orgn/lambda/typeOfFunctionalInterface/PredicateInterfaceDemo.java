package orgn.lambda.typeOfFunctionalInterface;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = (x)->{
            return x>20;
        };
        System.out.println(predicate1.test(3));
    }
}
