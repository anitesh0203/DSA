package orgn.lambda.typeOfFunctionalInterface;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void main(String[] args) {
        // supplier interface with implementation for the get method
        Supplier<Double> supplier = ()-> {
            return Math.random();
        };
        System.out.println(supplier.get());

    }
}
