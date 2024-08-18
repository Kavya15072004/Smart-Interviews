/*
You are given an array of 0's and 1's. Sort the array in ascending order and print it.
Note: Solve using two-pointer technique.

Input Format

First line of input contains T - the number of test cases. Its followed by 2T lines, the first line contains N - the size of the array.
The second line contains the elements of the array.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= A[i] <= 1

Output Format

For each test case, sort the array in ascending order and print it on a new line.

Sample Input 0

2
5
0 1 1 0 1
6
1 1 1 1 1 0
Sample Output 0

0 0 1 1 1
0 1 1 1 1 1
Explanation 0

Self explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int l=0;l<t;l++)
            {
                    int n=sc.nextInt();
                    int ar[]=new int[n];
                    for(int i=0;i<n;i++)
                    {
                            ar[i]=sc.nextInt();
                    }
                    int p1=0,p2=n-1;
                    while(p1<p2)
                    {
                            if(ar[p1]==0)
                            {
                                    p1+=1;
                            }
                            else if(ar[p2]==1)
                            {
                                    p2-=1;
                            }
                            else if(ar[p1]>ar[p2])
                            {
                                    int temp=ar[p1];
                                    ar[p1]=ar[p2];
                                    ar[p2]=temp;
                            }
                            
                    }
                    for(int i=0;i<n;i++)
                            {
                                    System.out.print(ar[i]+" ");
                            }
                            System.out.println();
            }
    }
}
