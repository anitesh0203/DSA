package lambda1.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(7);
        list.add(9);
        list.add(4);

        Set<Integer> set = new HashSet<>();
        List<Integer> temp = list.stream()
                .filter((x)->!set.add(x))
                .collect(Collectors.toList());

        System.out.println(temp);
    }
}
