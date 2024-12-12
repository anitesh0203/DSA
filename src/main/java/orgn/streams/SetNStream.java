package orgn.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetNStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(7);
        list.add(9);
        list.add(4);

        Set<Integer> var = list.stream()
                .collect(Collectors.toSet());

        System.out.println(var);

    }
}
