package orgn.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Walls {

    public int orangesRotting(int[][] grid) {
        int count =0;
        Queue<int[]> q = new LinkedList<>();
        for (int i=0 ;i<grid.length; i++) {
            for(int j=0 ;j<grid[0].length; j++) {
                if(grid[i][j]==2) {
                    //found a gate add to queve
                    int [] entry= new int[2];
                    entry[0] = i;
                    entry[1] = j;
                    q.add(entry);
                }
            }
        }
        while (!q.isEmpty()) {
            List<int[]> l = new ArrayList<>();
            while (!q.isEmpty()) {
                int[] val = q.poll();
                int x = val[0];
                int y = val[1];
                // get all the 4 direction elements in the list
                if (x > 0 && grid[x - 1][y] == 1) {
                    int[] list = new int[2];
                    list[0] = x - 1;
                    list[1] = y;
                    grid[x - 1][y] = 2;
                    l.add(list);
                }
                if (x < grid.length - 1 && grid[x + 1][y] == 1) {
                    int[] list = new int[2];
                    list[0] = x + 1;
                    list[1] = y;
                    grid[x + 1][y] = 2;
                    l.add(list);

                }
                if (y > 0 && grid[x][y - 1] == 1) {
                    int[] list = new int[2];
                    list[0] = x;
                    list[1] = y - 1;
                    grid[x][y - 1] = 2;
                    l.add(list);

                }
                if (y < grid[0].length - 1 && grid[x][y + 1] == 1) {
                    int[] list = new int[2];
                    list[0] = x;
                    list[1] = y + 1;
                    grid[x][y + 1] = 2;
                    l.add(list);
                }
            }
            if(!l.isEmpty()) {
                for (int [] ele : l) {
                    q.add(ele);
                }
            }
            count++;
        }

        for (int i=0 ;i<grid.length; i++) {
            for(int j=0 ;j<grid[0].length; j++) {
                if(grid[i][j]==1) {
                    return -1;
                }
            }
        }

        return count;
    }
    public void wallsAndGates(int[][] rooms) {
        Queue<int[]> q = new LinkedList<>();
        for (int i=0 ;i<rooms.length; i++) {
            for(int j=0 ;j<rooms[0].length; j++) {
                if(rooms[i][j]==0) {
                    //found a gate add to queve
                    int [] entry= new int[2];
                    entry[0] = i;
                    entry[1] = j;
                    q.add(entry);
                }
            }
        }
        while (!q.isEmpty()) {
            int[] val = q.poll();
            int x= val[0];
            int y = val[1];
            // get all the 4 direction elements in the list
            if(x>0 && rooms[x-1][y]!=-1 && rooms[x-1][y]!=0 && rooms[x-1][y]==2147483647) {
                int[] list = new int[2];
                list[0]=x-1;
                list[1]=y;
                rooms[x-1][y] = rooms[x][y]+1;
            }
            if(x<rooms.length-1 && rooms[x+1][y]!=-1 && rooms[x+1][y]!=0 && rooms[x+1][y]==2147483647) {
                int[] list = new int[2];
                list[0]=x+1;
                list[1]=y;
                rooms[x+1][y] = rooms[x][y]+1;
            }
            if(y>0 && rooms[x][y-1]!=-1 && rooms[x][y-1]!=0 && rooms[x][y-1]==2147483647) {
                int[] list = new int[2];
                list[0]=x;
                list[1]=y-1;
                rooms[x][y-1] = rooms[x][y]+1;
            }
            if(y<rooms[0].length-1 && rooms[x][y+1]!=-1 && rooms[x][y+1]!=0 && rooms[x][y+1]==2147483647) {
                int[] list = new int[2];
                list[0]=x;
                list[1]=y+1;
                rooms[x][y+1] = rooms[x][y]+1;
            }
        }
    }



    public static void main(String[] args) {
        Walls walls = new Walls();
        walls.wallsAndGates(new int[][]{{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}});

    }
}
