package orgn.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//A stream in Java is a sequence of objects which operates on a data source such
// as an array or a collection and supports various methods.

public class StreamBasic {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(-1);
        list.add(39);
        list.add(36);
        // sort the list
        List<Integer> ans = list.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(ans);

        // filter the list

        ans = list.stream()
                .filter((x)->{
                    return x>0;
                }).collect(Collectors.toList());

        System.out.println(ans);

        // add all the elements in the stream
        int result = list.stream()
                .reduce((x,y)->{
                    return x+y;
                }).get();
        System.out.println(result);

        // use the map
        ans = list.stream()
                .map(StreamBasic::raise)
                .collect(Collectors.toList());
        System.out.println(ans);

    }

    public static int raise(int x) {
        return x*x;
    }
}

//    Given an array nums of distinct integers, return all the possible
//        permutations
//        . You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3]
//        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//        Example 2:
//
//        Input: nums = [0,1]
//        Output: [[0,1],[1,0]]
//        Example 3:
//
//        Input: nums = [1]
//        Output: [[1]]
