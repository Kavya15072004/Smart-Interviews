/*
You are given an array of size N containing integers. Find the size of the largest subarray that can be rearranged to form a contiguous sequence.
A contiguous sequence means that the difference of adjacent elements should be 0 or 1.

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
10
15 13 14 8 5 2 3 3 1 1
9
8 8 6 7 3 5 7 4 1
Sample Output 0

5
8
Explanation 0

Test-Case 1
The largest subarray which can be rearranged to form a continguous sequence is [2, 3, 3, 1, 1] which can be rearranged to form [1, 1, 2, 3, 3].

Test-Case 2
The largest subarray which can be rearranged to form a continguous sequence is [8, 8, 6, 7, 3, 5, 7, 4] which can be rearranged to form [3, 4, 5, 6, 7, 7, 8, 8].
  */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int rearrange(int ar[],int n)
    {
        int i,j;
        int ans=0,a,b;
        for(i=0;i<n;i++)
        {   a=ar[i];
            b=ar[i];
         HashSet<Integer> h=new HashSet<>();
            for(j=i;j<n;j++)
            {   if(ar[j]>a)
                a=ar[j];
                if(ar[j]<b)
                b=ar[j];
                
                h.add(ar[j]);
           if (h.size() == a-b+1) {
                    if (j-i+1 > ans)
                        ans =j-i+1;
            }}
        }
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n,i;
            n=sc.nextInt();
            int ar[]=new int[n];
            for(i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            System.out.println(rearrange(ar,n));
            t--;
        }
    }
}
