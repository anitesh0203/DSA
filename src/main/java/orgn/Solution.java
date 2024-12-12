package orgn;

public class Solution {

    int ROW;
    int COL;
    public boolean solve(char[][] board, int i , int j, char[]word, int index) {

        if(index==word.length) {
            return true;
        }
        // base condition
        if(i<0 || i>=ROW || j <0 || j >=COL || board[i][j] != word[index] || board[i][j] == '#') {
            return false;
        }
        board[i][j] = '#';

        return solve(board,i-1,j,word,++index) ||
                solve(board,i,j-1,word,++index) ||
                solve(board,i+1,j,word,++index) ||
                solve(board,i,j+1,word,++index);

    }
    public boolean exist(char[][] board, String word) {
        ROW=board.length;
        COL=board[0].length;
        for (int i= 0 ;i<ROW; i++) {
            for(int j=0 ;j<COL; j++) {
                if(solve(board,i,j,word.toCharArray(),0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
