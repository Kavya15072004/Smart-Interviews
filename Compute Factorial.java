/*
Given a number N, print N!.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each containing a single number N.

Constraints

1 <= T <= 1000000
0 <= N <= 1000000

Output Format

For each test case, print N!. Since the result can be very large, print N! % 1e9+7.

Sample Input 0

3
5
20
50
Sample Output 0

120
146326063
318608048
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            
        Scanner sc=new Scanner(System.in);
            long[] ar=new long[1000001];
            ar[0]=1;
            int m=(int)1e9+7;
            for(int i=1;i<=1000000;i++)
            {
                    ar[i]=(ar[i-1]*i)%m;
            }
            int t=sc.nextInt();
            for(int i=0;i<t;i++)
            {
                    int n=sc.nextInt();
                    System.out.println(ar[n]);
            }
            
         
    }
}
