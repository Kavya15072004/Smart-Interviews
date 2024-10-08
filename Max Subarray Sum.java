/*
Given an array of integers, find the maximum subarray sum.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array and the second line contains N integers - elements of the array.

Constraints

30 points
1 <= T <= 100
1 <= N <= 10000
-1000 <= ar[i] <= 1000

70 points
1 <= T <= 1000
1 <= N <= 10000
-1000 <= ar[i] <= 1000

Output Format

For each test case, print the maximum subarray sum, followed by the start and end indices of the subarray, separated by newline. If multiple subarrays give the same sum, consider the lexicographically smaller one for the answer.

Sample Input 0

3
9
-24 0 28 28 55 -31 -27 -45 -24 
10
40 5 39 45 31 -44 73 -16 -31 27 
7
57 18 -14 17 31 16 -16 
Sample Output 0

111 1 4
189 0 6
125 0 5
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {
        void solve(int ar[],int n)
        {
                int max=Integer.MIN_VALUE,start=0,end=0;
                for(int i=0;i<n;i++)
                {
                        int sum=0;
                        for(int j=i;j<n;j++)
                        {
                               
                                        sum+=ar[j];
                                
                                if(sum>max)
                        {
                                max=sum;
                                        start=i;
                                        end=j;                
                        }
                        }
                         
                } 
                System.out.println(max+" "+start+" "+end);
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
                    s.solve(ar,n);
            }
    }
}
