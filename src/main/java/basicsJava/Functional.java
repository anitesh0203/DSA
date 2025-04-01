package basicsJava;

/**
 * Functional interface has only ONE method which can be defined while creating object at the
 * run time using LAMBDA expressions. NOTE we can also define the method using anonymous inner class
 * using lambda will just make it concise.
 *
 * Using annotation will give you compile time warnings if you declare more than 1 method in the interface.
 */


@FunctionalInterface
interface Activity {
    int run (int a , int b);
}

public class Functional {
    public static void main(String[] args) {
        Activity ready = (a,b)-> a+b;
        System.out.println(ready.run(2,3));
    }
}
