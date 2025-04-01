package lambda1.lambda.typeOfFunctionalInterface;

import java.util.function.Function;

public class FunctionalInterface {
    /**
     * The Function interface consists of the following 4 methods as listed which are later discussed as follows:
     *
     * apply()- takes 1 arg and returns a value
     * andThen()-
     * compose()
     * identity()
     */
    public static void main(String[] args) {

        // Usage of the function as interface apply method
        Function<String,Integer> function = (str)->{
            return str.length();
        };
        System.out.println(function.apply("anitesh"));

        //usage of the function as interface for andThen method

        function = function.andThen((x->{
            return x*2;
        }));
        System.out.println(function.apply("anitesh"));

        //usage of the function as interface for compose method

        function = function.compose((x)-> {
            return String.valueOf(x.length()*2);
        });
        System.out.println(function.apply("hehe"));

        //usage of the function as interface for identity method

        Function<Integer,Integer> fun = Function.identity();
        System.out.println(fun.apply(234));




    }
}
