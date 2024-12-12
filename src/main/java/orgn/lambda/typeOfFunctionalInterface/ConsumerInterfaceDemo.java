package orgn.lambda.typeOfFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
    public static void main(String[] args) {

        // supplying the implementation for the accept method via lambda
        Consumer<String> consumer = (str) -> {
            System.out.println(str.toLowerCase());
        };
        consumer.accept("THIS IS A STRING IN UPPERCASE");

        // DEMO WITH AND THEN ACCEPT FUNCTIONALITY

        String st = "haluwa in lowercase";
        Consumer<String> consumer1 = (str) -> {
             str = str.toUpperCase();
        };


        Consumer<String> consumer2 = (str) -> {
             str = str.concat("123");
        };
        consumer1.andThen(consumer2).accept(st);
        System.out.println(st);
//        no change in the st value why ???
//        In Java, when you pass a primitive type (like int) to a method or a lambda expression, it's passed by value,
//        meaning a copy of the value is passed to the method or lambda, not the actual variable itself. Therefore, any
//        modifications made to the parameter inside the lambda expression will only affect the local copy of the parameter,
//        not the original variable outside the lambda


        String stArray[] = new String[1];
        stArray[0] = st;
        Consumer<String[]> consumer3 = (str) -> {
             stArray[0] = str[0].toUpperCase();
        };


        Consumer<String[]> consumer4 = (str) -> {
             stArray[0] = str[0].concat("123");
        };
        consumer3.andThen(consumer4).accept(stArray);
        System.out.println(stArray[0]);



    }
}
