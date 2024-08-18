/*
You are given an array of integers. Find the sum of XOR of all pairs formed by the elements of the array.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array. The second line contains the elements of the array.

Constraints

20 points
1 <= T <= 100
1 <= N <= 1000
0 <= A[i] <= 105

80 points
1 <= T <= 100
1 <= N <= 105
0 <= A[i] <= 105

Output Format

For each test case, print the sum of XOR of all pairs formed by the elements of the array, separated by a newline.

Sample Input 0

3
3
5 12 8 
5
4 10 54 11 8 
6
15 35 25 10 15 12 
Sample Output 0

52
560
680
Explanation 0

Test Case 1

XOR of all pairs will be:
(5 ^ 5) = 0
(5 ^ 12) = 9
(5 ^ 8) = 13
(12 ^ 5) = 9
(12 ^ 12) = 0
(12 ^ 8) = 4
(8 ^ 5) = 13
(8 ^ 12) = 4
(8 ^ 8) = 0

Sum of all the above = 52
  */
import java.io.*;
import java.util.*;

public class Solution {
        boolean checkBit(int n,int i)
            {
                    if(((n>>i)&1)==1)
                            return true;
                    else
                            return false;
            }
        long sum_of_xor(int n,int a[])
        {
                long ans=0;
                for(int i=0;i<=31;i++)
                {
                        int setbits=0;
                        for(int j=0;j<n;j++)
                        {
                                if(checkBit(a[j],i))
                                        setbits+=1;
                        }
                        ans+=(setbits)*(n-setbits)*(1l<<i);
                }
                return 2*ans;
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=0;i<t;i++)
            {
                    int n=sc.nextInt();
                    int a[]=new int[n];
                    for(int j=0;j<n;j++)
                    {
                            a[j]=sc.nextInt();
                    }
                    Solution s=new Solution();
                    System.out.println(s.sum_of_xor(n,a));
                    
            }
    }
}
