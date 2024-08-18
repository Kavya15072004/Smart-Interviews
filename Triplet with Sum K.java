/*
You are given an integer array and a number K. You have to tell if there exists i,j,k in the given array such that ar[i]+ar[j]+ar[k]=K, i≠j≠k.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N and K - the size of the array and the number K. The second line contains the elements of the array.

Constraints

30 points
1 <= T <= 100
3 <= N <= 100

70 points
1 <= T <= 100
3 <= N <= 1000

General
-100000 <= A[i] <= 100000
0 <= K <= 100000

Output Format

For each test case, print "true" if the arrays contains such elements, false otherwise, separated by new line.

Sample Input 0

3
5 60
1 20 40 100 80 
12 54
12 45 52 65 21 645 234 -100 14 575 -80 112 
3 15
5 5 5
Sample Output 0

false
true
true
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
   
                for(int i=0;i<n-1;i++)
                {
                        for(int j=i+1;j<n;j++)
                        {
                                if(mp.containsKey(k-ar[i]-ar[j]))
                                {
                                        return true;
                                }
                        }
                          mp.put(ar[i],1);
                      
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
                    System.out.println(s.checkpair(ar,k,n));
                    
            
            }
    }
}
