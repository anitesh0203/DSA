package basicsJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
/**
 * Snapshot of data
 * can not be modified once used
 */
public class StreamDemo {

    static public int pow(int n) {
        return (int) Math.pow(n,2);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        List<Integer> ans = list.stream()
                .filter(x -> x > 3)
                .map(StreamDemo::pow)
                .collect(Collectors.toList());
        //for each is the final operation on a stream
        ans.forEach(x-> System.out.println(x));


        // FUNCTION
        Function<String,Integer> function = s -> s.length();
        String str = "Anitesh";
        System.out.println(function.apply(str));

        //Predicate
        Predicate<Integer> predicate = s-> s>10?true:false;
        System.out.println(predicate.test(30));
        }

}
