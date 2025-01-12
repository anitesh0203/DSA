package orgn.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Encodings {

    int t[][] = new int[101][101];
    public int count (String s, int start, int end) {
        if(start>=0 && end >=0 && t[start][end]!=-1) {
            return t[start][end];
        }
        if(start==0 && valid(s,start,end)) {
            return 1;
        }
        if(start<0) {
            return 0;
        }
        if(valid(s,start,end)) {
            if(end-start==1) {
                t[start][end] = count(s,start-2, start-1)+count(s,start-1,start-1);
                return t[start][end];

            } else {
                t[start][end] = count(s,end-2, end-1)+count(s,end-1,end-1);
                return t[start][end];

            }
        }else {
            return 0;
        }
    }

    private boolean valid(String s, int start, int end) {
        List<String> list = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","" +
                "13","14","15","16","17","18","19","20","21","22","23","24","25","26");
        String a = s.substring(start,end+1);
        if(!list.contains(a)) {
            return false;
        }
        return true;
    }

    public int numDecodings(String s) {
        for (int i=0 ;i< t.length; i++) {
            for(int j=0 ;j<t[0].length;j++) {
                t[i][j]=-1;
            }
        }
        if (s.startsWith("0"))
            return 0;
        return count(s,s.length()-1,s.length()-1)+count(s,s.length()-2,s.length()-1) ;
    }

    public static void main(String[] args) {
        Encodings encodings = new Encodings();
        System.out.println(encodings.numDecodings("27"));
    }
}
