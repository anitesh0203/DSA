package orgn.graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Island {

    public int maxAreaOfIsland(int[][] grid) {
        int curr = 1;
        int ans = Integer.MIN_VALUE;
        Queue<int[]> q = new LinkedList<>();
        checkVisited(grid,q);
        if(q.size()==0) {
            return 0;
        }

        while (!q.isEmpty()) {
            int[] v = q.poll();
            int x = v[0];
            int y = v[1];

            if(x>0 && grid[x-1][y]==1) {
                    int[] list = new int[2];
                    list[0]=x-1;
                    list[1]=y;
                    curr++;
                    q.add(list);
                    grid[x-1][y] = 0;
            }
            if(x<grid.length-1 && grid[x+1][y]==1) {
                    int[] list = new int[2];
                    list[0]=x+1;
                    list[1]=y;
                    q.add(list);
                    curr++;
                    grid[x+1][y] = 0;
            }
            if(y>0 && grid[x][y-1]==1) {
                    int[] list = new int[2];
                    list[0]=x;
                    list[1]=y-1;
                    q.add(list);
                    grid[x][y-1] = 0;
                    curr++;
            }
            if(y<grid[0].length-1 && grid[x][y+1]==1) {
                    int[] list = new int[2];
                    list[0]=x;
                    list[1]=y+1;
                    q.add(list);
                    grid[x][y+1] = 0;
                    curr++;
            }
            if(q.isEmpty()) {
                //count++;
                if(curr>ans) {
                    ans = curr;
                }
                checkVisited(grid,q);
                if(!q.isEmpty()) {
                    curr=1;
                }
            }
        }
        return ans;
    }

    private void checkVisited(int[][] grid,  Queue<int[]> q) {
        for (int i=0 ;i<grid.length; i++) {
            for(int j=0 ;j<grid[0].length; j++) {
                if(grid[i][j]==1) {
                    int[] list = new int[2];
                    list[0]=i;
                    list[1]=j;
                    q.add(list);
                    grid[i][j]= 0;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Island island = new Island();
        //island.numIslands(new int[] [] {{"1","0"},{"0","1"}});
    }
}
