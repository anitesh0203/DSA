package orgn.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamDemo {
    /**
     * It is a very useful feature of Java to use parallel processing, even if the whole program may
     * not be parallelized. Parallel stream leverage multi-core processors, which increases its performance.
     * Using parallel streams, our code gets divide into multiple streams which can be executed parallelly
     * on separate cores of the system and the final result is shown as the combination of all the individual
     * core’s outcomes
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(-1);
        list.add(39);
        list.add(36);

        List<Integer> ans = list.parallelStream().
                sorted()
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
