/*
You are given an array of integers of size N. You are also given Q queries consisting of three integers i, j and x.
For each query, increment each element of the array from index i to j by a value of x. At the end, print the sum of all the elements of the array.

Input Format

First line of input contains T - number of test cases. For each test case, the first line contains N - the size of the array.The second line contains N integers - the elements of the array.
The third line contains Q - the number of queries.The Q subsequent lines each contain 3 integers i, j - the indices denoting the subarray and x - the value to be added to the elements of the subarray .

Constraints

1 <= T <= 100
1 <= N <= 105
1 <= Q <= 10000
-105 <= A[i], x <= 105
0 <= i <= j < N

Output Format

For each test case, after processing all the queries, print the sum of all the elements of the entire array, separated by newline.

Sample Input 0

2
5
1 5 -3 2 8 
2
1 3 1
0 1 2
6
4 10 -1 2 8 -3 
1
3 5 6
Sample Output 0

20
38
Explanation 0

Test Case 1
Query 1: Adding 1 to each element of the array from indices 1 to 3 will make the array [1, 6, -2, 3, 8].
Query 2: Adding 2 to each element of the array from indices 0 to 1 will make the array [3, 8, -2, 3, 8].
The sum of all the elements is 20.
  */
import java.io.*;
import java.util.*;

public class Solution {

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
                    int pr[]=new int[n];
                    for(int j=0;j<n;j++)
                    {
                            pr[j]=0;
                    }
                    int q=sc.nextInt();
                    long sum=0;
                    for(int j=0;j<q;j++)
                    {
                            int a=sc.nextInt();
                            int b=sc.nextInt();
                            int x=sc.nextInt();
                            pr[a]+=x;
                            if(b+1<n)
                            {
                                 pr[b+1]+=-x;  
                            }
                    }
                    
                    
                    for(int j=1;j<n;j++)
                    {
                       pr[j]=pr[j]+pr[j-1];    
                    }
                    
                     for(int j=0;j<n;j++)
                    {
                       ar[j]=ar[j]+pr[j];    
                    }
                    
                    
                    for(int j=0;j<n;j++)
                    {
                            sum+=(long)ar[j];
                    }
                    System.out.println(sum);
            }
            
    }
}
