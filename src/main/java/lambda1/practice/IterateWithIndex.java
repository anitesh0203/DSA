package lambda1.practice;

import java.util.stream.IntStream;

public class IterateWithIndex {
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,8,9};

        IntStream.range(0,nums.length)
                .forEach(i->{
                    System.out.println(nums[i]);
                });
    }
}
