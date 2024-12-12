package orgn.lambda.functionalnterface;

public class DemoFIUsage {
    public static void main(String[] args) {
        // we are providing an implementation of the FI method via lambda function.
        DemoFunctionalInterace demoFunctionalInterace = x-> {return 3*x ; };
        System.out.println(demoFunctionalInterace.modInt(22));
        demoFunctionalInterace.greet();
    }
}
