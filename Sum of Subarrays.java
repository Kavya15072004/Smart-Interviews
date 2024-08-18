/*
Given an array of integers, answer queries of the form: [i, j] : Print the sum of array elements from A[i] to A[j], both inclusive.

Input Format

First line of input contains N - size of the array. The next line contains N integers - elements of the array. The next line contains Q - number of queries. Each of the next Q lines contains 2 space separated indexes: i and j.

Constraints

30 points
1 <= N,Q <= 10000

70 points
1 <= N,Q <= 500000

General Constraints
-109 <= A[i] <= 109
0 <= i <= j <= N-1

Output Format

For each query, print the sum of array elements from A[i] to A[j], both inclusive, separated by newline.

Sample Input 0

10
1 30 13 -4 -5 12 -53 -12 43 100 
4
0 5
1 7
2 3
7 9
Sample Output 0

47
-19
9
131
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        long solve(int a[],long sum[],int n,int start,int end)
        {
                if(start!=0)
                {
                        return (sum[end]-sum[start-1]);
                }
                else{
                        return sum[end];
                }
                
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            Solution s=new Solution();
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                    a[i]=sc.nextInt();
            }
            long sum[]=new long[n];
                sum[0]=a[0];
                for(int i=1;i<n;i++)
                {
                     sum[i]=sum[i-1]+(long)a[i];   
                }
           int q=sc.nextInt();
            for(int i=0;i<q;i++)
            {
                    int start=sc.nextInt();
                    int end=sc.nextInt();
                    System.out.println(s.solve(a,sum,n,start,end));
            }
    }
}
