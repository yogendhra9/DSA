package RECURSION.hard_backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n_queens {
    static void solve_nqueens(char [][] board,int r,ArrayList<ArrayList<String>> result,int count)
    {
        if (r == board.length) {
                // convert char[][] board into List<String>
                ArrayList<String> config = new ArrayList<>();
                for (char[] row : board) {
                    config.add(new String(row));
                }
                result.add(config);

            return;
        }
        for( int c=0;c<board.length;c++)
        {
            if(isSafe(board,r,c))
            {
                board[r][c] = 'Q';
                solve_nqueens(board,r+1,result,count);
                board[r][c] = '.';
            }
        }

    }
    static boolean isSafe(char[][] board,int r ,int c)
    {
        //checking top
       for(int i=r-1;i>=0;i--)
       {
           if(board[i][c] == 'Q') return false;
       }
        //checking the left diagonal
        if(c!=0)
        {
            for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--)
            {
                if(board[i][j] == 'Q')
                {
                    return false;

                }


            }

        }
        //right diagonal
        if(c!=board[0].length-1)
        {
            for(int i=r-1,j=c+1;i>=0 && j<board[0].length;i--,j++)
            {
                if(board[i][j] == 'Q')
                {
                    return false;

                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n =4;
        char board[][] = new char[4][4];
        for (int i = 0; i < 4; i++) {
              for(int j=0;j<4;j++)
              {
                  board[i][j] = '.';
              }
        }
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        int count=0;
        solve_nqueens(board,0,result,count);
        System.out.println(result);

    }
}
