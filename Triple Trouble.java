/*
Given an array of size 3X+1, where every element occurs three times, except one element, which occurs only once. Find the element that occurs only once.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array (of the form 3X + 1) and second line contains the elements of the array.

Constraints

1 <= T <= 300
1 <= N <= 104
1 <= A[i] <= 109

Output Format

For each test case, print the number which occurs only once, separated by new line.

Sample Input 0

2
10
5 7 8 7 7 5 5 9 8 8 
7
10 20 20 30 20 10 10 
Sample Output 0

9
30
Explanation 0

Self Explanatory
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
        int value(int n,int a[])
        {
            int res=0;
                for(int i=0;i<32;i++)
                {
                        int c=0;
                        for(int j=0;j<n;j++)
                        {
                                if(checkBit(a[j],i))
                                {
                                        c+=1;
                                }
                        }
                        if((c%3)!=0)
                        {
                                res+=(1<<i);
                        }
                }
                return res;
                
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
                    System.out.println(s.value(n,a));
                    
            }
    }
}
