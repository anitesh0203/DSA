package lambda1;

import java.util.ArrayList;
import java.util.List;

public class Awara {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }

    public void backtrack(List<Integer> perm, int[] nums, boolean[] pick) {
        if (perm.size() == nums.length) {
            res.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!pick[i]) {
                perm.add(nums[i]);
                pick[i] = true;
                backtrack(perm, nums, pick);
                perm.remove(perm.size() - 1);
                pick[i] = false;
            }
        }
    }
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> subset = new ArrayList<>();
            dfs(nums, 0, subset, res);
            return res;
        }

        private void dfs(int[] nums, int i, List<Integer> subset, List<List<Integer>> res) {
            //CANBN
            // Condition
            if (i == nums.length) {
                res.add(new ArrayList<>(subset));
                return;
            }
            if(i>nums.length) {
                return;
            }
            // add
            subset.add(nums[i]);
            // call for next step
            dfs(nums, i + 1, subset, res);
            // backtrack
            subset.remove(subset.size() - 1);
            // call next step
            dfs(nums, i + 1, subset, res);
        }

    /**
     * Input: candidates = [2,3,6,7], target = 7
     * Output: [[2,2,3],[7]]
     */


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        dfss(0,candidates,0,target, ans, finalList);
        return finalList;

    }

    private void dfss(int i, int[] candidates, int curr,int target, List<Integer> ans, List<List<Integer>> finalList) {
        //CANBN

        // condition to add and return to the stack
        if(curr == target) {
            finalList.add(new ArrayList<>(ans));
            return;
        } else if(target < curr || i>=candidates.length) {
            return;
        }

        // add to list
        ans.add(candidates[i]);
        //next step
        dfss(i, candidates, curr+candidates[i],target, ans, finalList);
        //backtrack
        ans.remove(ans.size()-1);
        dfss(i+1, candidates, curr,target, ans, finalList);



    }

    private int  checksum(List<Integer> ans, int target) {
        int sum =0;
        for(int a : ans) {
            sum+=a;
        }
        return sum;
    }

    public static void main(String[] args) {
        Awara awara = new Awara();
        List<List<Integer>> ans = awara.permute(new int[]{1,2,3});
        System.out.println();
    }
}
