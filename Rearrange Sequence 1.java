/*
You are given an array of size N containing unique integers. Find the size of the largest subarray that can be rearranged to form a contiguous sequence.
A contiguous sequence means that the difference of adjacent elements should be 1.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array.
The second line contains the elements of the array.

Constraints

1 <= T <= 100
1 <= N <= 1000
0 <= A[i] <= 105

Output Format

For each test case, print the size of the largest subarray that can be rearranged to form a contiguous sequence, on a new line.

Sample Input 0

2
5
1 3 2 6 5
9
0 8 6 5 7 10 3 2 1
Sample Output 0

3
4
Explanation 0

Test-Case 1
The largest subarray which can be rearranged to form a continguous sequence is [1, 3, 2], which can be rearranged to form [1, 2, 3].

Test-Case 2
The largest subarray which can be rearranged to form a continguous sequence is [8, 6, 5, 7], which can be rearranged to form [5, 6, 7, 8].
  */
import java.io.*;
import java.util.*;

public class Solution {
        int solve(int ar[],int n)
        {
                int ans=0;
                for(int i=0;i<n;i++)
                {
                        int a,b;
                        a=b=ar[i];
                        for(int j=i;j<n;j++)
                        {
                                if(ar[j]>a)
                                        a=ar[j];
                                if(b>ar[j])
                                        b=ar[j];
                                if(a-b==j-i)
                                         if(ans<(j-i+1))
                                                 ans=j-i+1;
                                                
                        }
                      
                        
                }
                
                return ans;
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            Solution s=new Solution();
            int t=sc.nextInt();
            for(int i=0;i<t;i++)
            {
                int n=sc.nextInt();
                    int ar[]=new int[n];
                    for(int j=0;j<n;j++)
                    {
                            ar[j]=sc.nextInt();
                    }
                    System.out.println(s.solve(ar,n));
            }
    }
}
