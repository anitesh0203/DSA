package lambda1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

    public void solve(int [] nums, int index, List<Integer>list, List<List<Integer>> ans) {

        ans.add(new ArrayList<>(list));
        for (int i=index ;i<nums.length;i++) {
            //condition
            List<Integer> temp = new ArrayList<>(list);
            temp.add(nums[i]);
            if(!ans.contains(temp)) {
                list.add(nums[i]);
                solve(nums,i+1,list,ans);
                list.remove(list.size()-1);
            }
        }
    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums, 0 , new ArrayList<>(),ans);
        return ans;
    }

    public static void main(String[] args) {
        Subset subset = new Subset();
        List<List<Integer>> ans = subset.subsets(new int[]{4,4,4,1,4});
        System.out.println("answer is "+ans);
    }

}
