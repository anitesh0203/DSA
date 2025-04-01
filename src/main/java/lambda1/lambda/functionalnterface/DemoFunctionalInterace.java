package lambda1.lambda.functionalnterface;

@FunctionalInterface
public interface DemoFunctionalInterace {

    /**
     * functional interface are the gateway to functional programming.
     * they MUST have only 1 abstract method and can have multiple default methods.
     */
    public int modInt(int n);

    //This will throw error as 1 abstract method has already been declared.
    //public int modString(int n);

    default void greet() {
        System.out.println("Hello to functional programming !!");
    }

    default void greetr() {
        System.out.println("Hello to functional programming !!");
    }



}
