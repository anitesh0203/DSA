package orgn.dp;

class Solution {

    int [] t;

    public Solution() {
        t = new int[1005];
        for (int i=0 ;i<t.length; i++) {
            t[i] = -1;
        }
    }


    public int min(int[] cost , int n, int end) {

        if(t[n]!=-1) {
            return t[n];
        }
        //base condition
        if(n>end) {
            return 0;
        }
        t[n] =  Math.max((cost[n]+min(cost,n+2,end)),min(cost,n+1,end));
        return t[n];
    }

    public int rob(int[] nums) {
        int a = min(nums,0, nums.length-2);
        for (int i=0 ;i<t.length; i++) {
            t[i] = -1;
        }
        int b = min(nums,1, nums.length-1);

        return Math.max(a,b);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.rob(new int[]{1,2,3}));
    }
}
