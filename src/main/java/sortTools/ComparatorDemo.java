package sortTools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(10);
        list.add(80);
        list.add(2);
        /**
         * Comparators are used with the collections class to implement SORT method
         * you can have your own sort method but you may specify the sort method
         * by PROVIDING the Impl of "COMPARE" method inside the functional interface
         * COMPARATOR
         */

        Comparator<Integer> customComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                //reverse sort
                if(a<b)
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(list,customComparator);
        System.out.println(list);
    }
}
