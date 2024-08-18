/*
Given an array, you have to find the frequency of a number x.

Input Format

First line of input contains N - size of the array. The next line contains N integers, the elements of the array. The next line contains Q - number of queries. Each of the next Q lines contains a single integer X, for which you have to find the frequency of X in the given array.

Constraints

30 points
1 <= N <= 105
1 <= Q <= 102
-108 <= ar[i] <= 108

70 points
1 <= N <= 105
1 <= Q <= 105
-108 <= ar[i] <= 108

Output Format

For each query, print the frequency of X, separated by newline.

Sample Input 0

9
-6 10 -1 20 -1 15 5 -1 15 
5
-1
10
8
15
20
Sample Output 0

3
1
0
2
1
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        int frequency(int ar[],int n,int q1, HashMap<Integer,Integer> mp)
        {
                if(mp.get(q1)!=null)
                {
                        return mp.get(q1);
                }
                else{
                        return 0;
                }
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            Solution s=new Solution();
            int n,q,q1;
            n=sc.nextInt();
            HashMap<Integer,Integer> mp=new HashMap<>();
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                    ar[i]=sc.nextInt();
            }
            
            for(int i=0;i<n;i++)
                {
                        if(mp.containsKey(ar[i]))
                        {
                               int k=mp.get(ar[i]);
                                mp.put(ar[i],k+1);
                        }
                    else{
                          mp.put(ar[i],1);     
                    }
            }
            
            q=sc.nextInt();
            for(int i=0;i<q;i++)
            {
                    q1=sc.nextInt();
                    System.out.println(s.frequency(ar,n,q1,mp));
            }
    }
}
