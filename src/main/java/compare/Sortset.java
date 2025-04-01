package compare;

import compare.model.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Sortset {
    public static void main(String[] args) {

        // New HashSet
        HashSet<Student> set = new HashSet<>();

        // Adding elements to the set
        set.add(new Student(500));
        set.add(new Student(300));
        set.add(new Student(400));
        set.add(new Student(100));
        set.add(new Student(200));
        System.out.println(set);

        Set<Student> seti = set.stream()
                .sorted()
                // Very important linked hash set is needed
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(seti);



    }
}
