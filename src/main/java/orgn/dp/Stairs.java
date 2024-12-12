package orgn.dp;

public class Stairs {

    int t[] = new int [46];


    public int climbStairs(int n) {
        for (int x: t) {
            x=-1;
        }

        if(t[n]!=-1) {
            return t[n];
        }

        if(n==0) {
            return 1;
        }
        if(n<0) {
            return 0;
        }

        t[n] = climbStairs(n-1)+climbStairs(n-2);
        return t[n];

    }
}
