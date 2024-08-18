/*
Given an array of integers and a number K, check if there exist a pair of indices i,j s.t. a[i] + a[j] = K and i!=j.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, first line of each test case contains N - size of the array and K, and the next line contains N integers - the elements of the array.

Constraints

30 points
1 <= T <= 100
2 <= N <= 1000

70 points
1 <= T <= 300
2 <= N <= 10000

General Constraints
-108 <= K <= 108
-108 <= ar[i] <= 108

Output Format

For each test case, print "True" if such a pair exists, "False" otherwise, separated by newline.

Sample Input 0

3
5 -15
-30 15 20 10 -10 
2 20
10 10 
4 7
-4 0 10 -7 
Sample Output 0

True
True
False
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        boolean checkpair(int ar[],int k,int n)
        {
                HashMap <Integer,Integer>mp=new HashMap<>();
                for(int i=0;i<n;i++)
                {
                        if(mp.containsKey(k-ar[i]))
                        {
                                return true;
                        }
                        else{
                        mp.put(ar[i],1);
                        }
                }
                return false;
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
           int n,i,j,t,k;
            t=sc.nextInt();
            for(i=0;i<t;i++)
            {
                    n=sc.nextInt();
                    k=sc.nextInt();
                      int ar[]=new int[n];
                    for(j=0;j<n;j++)
                    {
                           ar[j]=sc.nextInt(); 
                    }
                      Solution s=new Solution();
                    if(s.checkpair(ar,k,n))
                    {
                    System.out.println("True");
                    }
                    else
                    {
                        System.out.println("False");     
                    }
                    
            
            }
    }
}
