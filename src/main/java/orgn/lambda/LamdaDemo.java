package orgn.lambda;

public class LamdaDemo {
    public static void main(String[] args) {
        // functional interface is been defined here
        Modifier mod = (int x) -> x*2;
        // Invoking the functional interface
        System.out.println(mod.multiplier(3));
        mod.greet();
    }
}
