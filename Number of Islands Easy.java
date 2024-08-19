/*
You are given a 2D matrix consisting of the following:
1: land
0: water
Considering N-8 neighbourhood, your task is to find the number of islands in the given landscape.
Assume that the the 2D matrix is surrounded by water beyond the boundaries.

Definitions:
N-8 neighbourhood: 2 cells are considered neighbours, if they share an edge or a corner.
Island: A piece of connected land surrounded by water.

Input Format

First line of input contains T - number of test cases. The first line of each test case contains R, C - the size of the matrix. Its followed by a matrix of size RxC, consisting only of 0s and 1s.

Constraints

1 <= T <= 100
1 <= R,C <= 500

Output Format

For each test case, print the total number of islands, separated by new line.

Sample Input 0

3
4 8
01001101
10001010
00100100
01101101
6 1
0
1
0
0
1
1
9 5
00000
10001
00110
01100
10000
00000
00101
00011
00110
Sample Output 0

4
2
3
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {
static void dfs(int[][] ar,int i,int j)
{
    if(i<0 || i==ar.length || j<0 || j==ar[0].length || ar[i][j]==0)
        return ;
    ar[i][j]=0;
    dfs(ar,i+1,j);
    dfs(ar,i-1,j);
    dfs(ar,i,j+1);
    dfs(ar,i,j-1);
    dfs(ar, i + 1, j + 1); // Diagonal down-right
        dfs(ar, i - 1, j - 1); // Diagonal up-left
        dfs(ar, i + 1, j - 1); // Diagonal down-left
        dfs(ar, i - 1, j + 1); // Diagonal up-right

}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            
            // Read the matrix as a string
            String[] rowsArray = new String[m];
            for (int i = 0; i < m; i++) {
                rowsArray[i] = sc.next();
            }

            // Convert the string array to a 2D integer array
            int[][] grid = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = rowsArray[i].charAt(j) - '0'; // Convert char to int
                    //System.out.print(grid[i][j]+" ");
                }
                //System.out.println();
            }
            
            
            int cnt=0;
            for(int j=0;j<m;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(grid[j][k]==1)
                    {
                        dfs(grid,j,k);
                        cnt+=1;
                    }
                }
            }
            System.out.println(cnt);
            
        }
    }
}
