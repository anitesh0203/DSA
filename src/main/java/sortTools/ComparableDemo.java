package sortTools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * In case you want to implement the comparable interface you will need to provide
 * implementation of compare to interface.
 */
class Student implements  Comparable<Student>{
    int id;
    String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student that) {
        if(this.name.length()>that.name.length()){
            return 1;
        }else {
            return -1;
        }
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        Student s1 = new Student(22,"anotes");
        Student s2 = new Student(2,"an");
        Student s3 = new Student(18,"anotesh");
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);
        for(Student s : list) {
            System.out.println(s.id);
        }
    }
}
