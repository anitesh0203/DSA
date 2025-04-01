package lambda1.lambda.functionalnterface;

public class DemoFIUsage {
    public static void main(String[] args) {
        // we are providing an implementation of the FI method via lambda function.
        DemoFunctionalInterace demoFunctionalInterace = x-> {return 3*x ; };
        DemoFunctionalInterace demo = x-> { return x*x;};
        System.out.println(demoFunctionalInterace.modInt(22));
        System.out.println(demo.modInt(429));
        demoFunctionalInterace.greet();
    }
}
