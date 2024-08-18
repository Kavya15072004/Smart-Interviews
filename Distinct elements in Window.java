/*
Given an array of integers and a window size K, find the number of distinct elements in every window of size K of the given array.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array and K - size of the window. The second line contains N integers - elements of the array.

Constraints

1 <= T <= 1000
1 <= N <= 10000
1 <= K <= N
-100 <= ar[i] <= 100

Output Format

For each test case, print the number of distinct elements in every window of size K, separated by newline.

Sample Input 0

3
5 3
-2 -4 -2 4 -2 
10 7
3 -4 -3 -4 -2 0 2 -2 6 0 
17 13
-5 -1 4 8 -5 -3 -4 7 4 -4 0 8 0 -2 3 2 5 
Sample Output 0

2 3 2 
6 5 6 5 
8 9 9 10 11 
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        void solve(int ar[],int n,int k)
        {
                HashMap<Integer,Integer> mp=new HashMap<>();
                for(int i=0;i<=k-1;i++)
                {
                        if(mp.containsKey(ar[i]))
                        {
                                int l=mp.get(ar[i]);
                                mp.put(ar[i],l+1);
                                
                        }
                        else
                        {
                               mp.put(ar[i],1); 
                        }
                       
                }
                 System.out.print(mp.size()+" ");
                for(int i=k;i<n;i++)
                {
                   int p=mp.get(ar[i-k]);
                     mp.put(ar[i-k],p-1); 
                        if(mp.containsKey(ar[i]))
                        {
                           int l=mp.get(ar[i]);
                                mp.put(ar[i],l+1);     
                        }
                                else
                                {
                                     mp.put(ar[i],1);     
                                }
                        if(mp.get(ar[i-k])==0)
                                mp.remove(ar[i-k]);
                         System.out.print(mp.size()+" "); 
                           
                }
                
                  System.out.println();
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            Solution s=new Solution();
            int t=sc.nextInt();
            for(int i=0;i<t;i++)
            {
                    int n=sc.nextInt();
                    int k=sc.nextInt();
                    int ar[]=new int[n];
                    for(int j=0;j<n;j++)
                    {
                            ar[j]=sc.nextInt();
                    }
                    s.solve(ar,n,k);
            }
    }
}
