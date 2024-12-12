package orgn.graph;

import java.util.*;

public class Ocean {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0 ;i< heights.length; i++) {
            for (int j=0 ;j<heights[0].length;j++) {
                if(checkAtlantic(heights, i ,j ) && checkPacific(heights, i , j)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    ans.add(list);
                }
            }
        }
        return ans;
    }

    private boolean checkPacific(int[][] heights, int i, int j) {
        boolean visited [][] = new boolean[heights.length][heights[0].length];
        Queue<List<Integer>> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(j);
        q.add(list);
        while (!q.isEmpty()){
            List<Integer> v = q.poll();
            int x = v.get(0);
            int y = v.get(1);
            if(x==0 || y==0) {
                return true;
            }

            if (x > 0 && heights[x - 1][y] <= heights[x][y] && !visited[x-1][y]) {
                List<Integer> l = new ArrayList<>();
                l.add(x-1);
                l.add(y);
                q.add(l);
                visited[x-1][y] = true;
            }
            if (x < heights.length - 1 && heights[x + 1][y] <= heights[x][y] && !visited[x+1][y]) {
                List<Integer> l = new ArrayList<>();
                l.add(x+1);
                l.add(y);
                q.add(l);
                visited[x+1][y] = true;
            }
            if (y > 0 && heights[x][y - 1] <= heights[x][y]&& !visited[x][y-1]) {
                List<Integer> l = new ArrayList<>();
                l.add(x);
                l.add(y-1);
                q.add(l);
                visited[x][y-1] = true;
            }
            if (y < heights[0].length - 1 && heights[x][y + 1] <= heights[x][y] && !visited[x][y+1]) {
                List<Integer> l = new ArrayList<>();
                l.add(x);
                l.add(y+1);
                q.add(l);
                visited[x][y+1] = true;
            }
        }
        return false;
    }

    private boolean checkAtlantic(int[][] heights, int i, int j) {
        boolean visited [][] = new boolean[heights.length][heights[0].length];
        Queue<List<Integer>> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(j);
        q.add(list);
        while (!q.isEmpty()){
            List<Integer> v = q.poll();
            int x = v.get(0);
            int y = v.get(1);
            if(x==heights.length-1 || y==heights.length-1) {
                return true;
            }

            if (x > 0 && heights[x - 1][y] <= heights[x][y] && !visited[x-1][y]) {
                List<Integer> l = new ArrayList<>();
                l.add(x-1);
                l.add(y);
                q.add(l);
                visited[x-1][y] = true;
            }
            if (x < heights.length - 1 && heights[x + 1][y] <= heights[x][y] && !visited[x+1][y]) {
                List<Integer> l = new ArrayList<>();
                l.add(x+1);
                l.add(y);
                q.add(l);
                visited[x+1][y] = true;
            }
            if (y > 0 && heights[x][y - 1] <= heights[x][y]&& !visited[x][y-1]) {
                List<Integer> l = new ArrayList<>();
                l.add(x);
                l.add(y-1);
                q.add(l);
                visited[x][y-1] = true;
            }
            if (y < heights[0].length - 1 && heights[x][y + 1] <= heights[x][y] && !visited[x][y+1]) {
                List<Integer> l = new ArrayList<>();
                l.add(x);
                l.add(y+1);
                q.add(l);
                visited[x][y+1] = true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Ocean ocean = new Ocean();
        ocean.pacificAtlantic(new int [][]{{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}});
        System.out.println("hello");
    }
}


//    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//
//
//        Example 1:
//
//        Input: haystack = "sadbutsad", needle = "sad"
//        Output: 0
//        Explanation: "sad" occurs at index 0 and 6.
//        The first occurrence is at index 0, so we return 0.
//        Example 2:
//
//        Input: haystack = "leetcode", needle = "leeto"
//        Output: -1
//        Explanation: "leeto" did not occur in "leetcode", so we return -1.






//    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//        Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//        Example 1:
//
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
//        Example 2:
//
//        Input: s = "race a car"
//        Output: false
//        Explanation: "raceacar" is not a palindrome.
//        Example 3:
//
//        Input: s = " "
//        Output: true
//        Explanation: s is an empty string "" after removing non-alphanumeric characters.
//        Since an empty string reads the same forward and backward, it is a palindrome.