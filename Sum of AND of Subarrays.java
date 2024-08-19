/*
You are given an array of size N. Find the sum of the results of bitwise AND of all the subarrays.

Input Format

First line of input contains T - the number of test cases. Its followed by 2T lines, the first line contains N - the size of the array. The second line contains the elements of the array.

Constraints

10 points
1 <= T <= 100
1 <= N <= 100
0 <= A[i] <= 105

20 points
1 <= T <= 100
1 <= N <= 1000
0 <= A[i] <= 105

70 points
1 <= T <= 1000
1 <= N <= 104
0 <= A[i] <= 105

Output Format

For each test case, print the result separated by a newline.

Sample Input 0

2
4
3 2 0 1 
6
1 9 8 1 12 0 
Sample Output 0

8
40
Explanation 0

Test Case 1:
The sum of bitwise AND of all subarrays is 3 + 2 + 0 + 1 + 3&2 + 2&0 + 0&1 + 3&2&0 + 2&0&1 + 3&2&0&1,
which is 3 + 2 + 0 + 1 + 2 + 0 + 0 + 0 + 0 + 0 = 8
  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int ar[]=new int[n];
            for(int j=0;j<n;j++)
            {
                ar[j]=sc.nextInt();
            }
            long ans=0;
            for(int j=0;j<n;j++)
            {
                int and=ar[j];
                for(int k=j;k<n;k++)
                {
                    and&=ar[k];
                    if(and==0)
                    {
                        break;
                    }
                    ans+=and;
                }
            }
            System.out.println(ans);
        }
    }
}
