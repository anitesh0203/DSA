package orgn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permute {

    Set<String> set = new HashSet<>();
    public void solve(String input, int index, String temp, List<String> ans) {

        // base condition
        if(index>=input.length()) {
            ans.add(input);
            set.add(input);
            return;
        }

        // Iterate through each element in the list
        for (int i=index ;i<input.length(); i++) {
            swapit(input, index, i);
            if(!existss(input,set)) {
                solve(input, index+1, temp,ans);
            }
            swapit(input, i , index);
            solve(input, index+1, temp,ans);

        }

    }

    private boolean existss(String input, Set<String> set) {
        return set.contains(input);
    }

    private void swapit(String input, int index, int i) {
        char arr [] = input.toCharArray();
        char temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
        input = new String(arr);
    }

    public static void main(String[] args) {
        Permute permute = new Permute();
        permute.solve("abc", 0, "", new ArrayList<>());
        System.out.println("hello");
    }
}
