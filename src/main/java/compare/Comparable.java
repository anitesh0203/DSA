package compare;


import compare.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {

    public static void main(String[] args) {
        Person person = new Person(4,"anitesh",34);
        Person person1 = new Person(3,"ramesh",14);
        Person person2 = new Person(1,"suresh",30);
        Person person3 = new Person(8,"jignesh",84);
        Person person4 = new Person(9,"suresh",66);
        List<Person> list = new ArrayList<>();
        list.add(person);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);

        System.out.println(list);

        // sort the object list basis of id
        Collections.sort(list);

        System.out.println(list);


    }
}
