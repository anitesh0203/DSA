package orgn.practice;

import java.util.Arrays;

public class CountOccurance {

    public static void main(String[] args) {
        String str = "anstesh";

        char ch = 's';
        long ans = str.chars().
                filter(x -> x==ch)
                .count();

        System.out.println(ans);

    }
}
