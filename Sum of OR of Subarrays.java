/*
You are given an array of size N. Find the sum of the results of bitwise OR of all the subarrays.

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

21
201
Explanation 0

Test Case 1:
The sum of bitwise OR of all subarrays is 3 + 2 + 0 + 1 + 3|2 + 2|0 + 0|1 + 3|2|0 + 2|0|1 + 3|2|0|1 = 21
  */
import java.io.*;
import java.util.*;

public class Solution {
    boolean checkbit(int n,int i)
    {
        if(((n>>i)&1)==1)
        {
            return true;
        }
        return false;
    }
    long solve(int ar[],int n)
    {
        long ans=0;
        for(int i=0;i<32;i++)
        {
            int cnt=0;
            for(int j=0;j<n;j++)
            {
               if(checkbit(ar[j],i)) 
               {
                   ans+=(long)((n-j)*(cnt+1)*(long)(1<<i));
                   cnt=0;
               }
                else
                {
                    cnt+=1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            System.out.println(s.solve(ar,n));
            
        }
        
    }
}
