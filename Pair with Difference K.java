/*
You are given an integer array and a positive integer K. You have to tell if there exists a pair of integers in the given array such that ar[i]-ar[j]=K and i≠j.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N and K - the size of the array and the number K. The second line contains the elements of the array.

Constraints

40 points
2 <= N <= 1000

60 points
2 <= N <= 100000

General Constraints
1 <= T <= 100
-105 <= ar[i], K <= 105

Output Format

For each test case, print "true" if the arrays contains such elements, false otherwise, separated by new line.

Sample Input 0

2
5 60
1 20 40 100 80 
10 11
12 45 52 65 21 645 234 14 575 112 
Sample Output 0

true
false
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        boolean checkpair(int ar[],int k,int n,int p1,int p2)
        {
                HashMap <Integer,Integer>mp=new HashMap<>();
   
                for(int i=0;i<n;i++)
                {
                        if(mp.containsKey(k+ar[i]) ||mp.containsKey(-k+ar[i]))
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
                    System.out.println(s.checkpair(ar,k,n,0,1));
                    
            
            }
    }
}
