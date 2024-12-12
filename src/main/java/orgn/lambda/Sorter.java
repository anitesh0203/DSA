package orgn.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {
    static class  Person {
        int id;
        String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(33);
        list.add(399);
        list.add(33);
        list.add(0);
        list.add(30);
        list.add(9);

        // using the comarator interface
        list.sort(Comparator.comparingInt(x->x));
        System.out.println(list);

        list.clear();
        list.add(33);
        list.add(33);
        list.add(399);
        list.add(33);
        list.add(0);
        list.add(30);
        list.add(69);

        // using colleaction

        Collections.sort(list);
        System.out.println(list);

        /************
         * begins the demo for the Object base Sorting
         */

        Person p = new Person(12,"balma");
        Person p1 = new Person(1,"aalma");
        Person p2 = new Person(12,"dalma");
        Person p3 = new Person(199,"valma");
        Person p4 = new Person(100,"lalma");
        List<Person> l = new ArrayList<>();

        l.add(p);
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);

        //Using the comparator method
        l.sort(Comparator.comparing(Person::getName));

        System.out.println(l.toString());





    }
}
