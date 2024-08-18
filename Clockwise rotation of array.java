/*
Given an array, rotate it by K times in a clockwise direction.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array and K - the degree of rotation. The second line contains the elements of the array.

Constraints

10 points
1 <= T <= 100
1 <= N <= 103
1 <= K <= 103
1 <= ar[i] <= 100

40 points
1 <= T <= 100
1 <= N <= 104
1 <= K <= 109
1 <= ar[i] <= 100

Output Format

For each test case, print the k-rotated array, separated by newline.

Sample Input 0

1
7 3
3 10 4 5 10 7 2 
Sample Output 0

10 7 2 3 10 4 5 
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {
    void reverse(int ar[],int n,int start,int end)
    {
        while(start<=end)
        {
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
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
            int d=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                ar[j]=sc.nextInt();
            }
            d=d%n;
            s.reverse(ar,n,0,n-1);
            s.reverse(ar,n,0,d-1);
            s.reverse(ar,n,d,n-1);
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[j]+" ");
            }
            
            System.out.println();
        }
    }
}
