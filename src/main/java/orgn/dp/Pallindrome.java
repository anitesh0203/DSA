package orgn.dp;

public class Pallindrome {



//    public int pal(String s, int n , String t, int m ) {
//        // dynamic programming iterative edition
//        int [][] k = new int[n+1][m+1];
//        // base condition both strings are empty
//        for (int i=0 ;i<n+1 ;i++){
//            k[i][0] = 0;
//        }
//        for (int i=0 ;i<m+1 ;i++){
//            k[0][i] = 0;
//        }
//
//        for (int i=1 ;i<n+1;i++ ) {
//            for(int j=1 ;j<m+1;j++ ) {
//                if(s.charAt(i-1)==t.charAt(j-1)) {
//                    k[i][j] = 1+ k[i-1][j-1];
//                } else {
//                    k[i][j] = 0;
//                }
//            }
//        }
//
//        for (int i=0;i<k.length;i++){
//            System.out.println();
//            for(int j=0 ;j<k[0].length;j++) {
//                System.out.print(k[i][j]);
//            }
//        }
//        return k[n][m];
//    }
//
//    public int longestPalindrome(String s) {
//        StringBuilder ss = new StringBuilder(s);
//        StringBuilder t = ss.reverse();
//        System.out.println(t.toString());
//        return pal("babbd",5,"dbbab",5);
//    }

    String ans;

    public String pal (String s , int x , String t , int y) {


        // base consition
        if(x==0 || y==0) {
            return "";
        }

        if(s.charAt(x)==t.charAt(y)) {
            ans = ans.concat(Character.toString(s.charAt(x)));
            System.out.println(ans);

            return ans.concat(pal(s,x-1,t,y-1));
        } else {
            return "";
        }
    }
    public String longestPalindrome(String s) {
        ans = new String();
        ans="";
        StringBuilder ss = new StringBuilder(s);
        StringBuilder t = ss.reverse();
        System.out.println(ans);
        return pal(s,s.length()-1,t.toString(),t.length()-1);

    }

    public static void main(String[] args) {
        Pallindrome pallindrome = new Pallindrome();
        String ans = pallindrome.longestPalindrome("babbd");
        System.out.println(ans);
    }
}
