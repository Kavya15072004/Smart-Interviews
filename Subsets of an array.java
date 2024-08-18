/*
Given an array of unique integer elements, print all the subsets of the given array in lexicographical order.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array and second line contains the elements of the array.

Constraints

1 <= T <= 100
1 <= N <= 10
0 <= A[i] <= 100

Output Format

For each test case, print the subsets of the given array in lexicographical order, separated by new line. Print an extra newline between output of different test cases.

Sample Input 0

3
3
5 15 3 
2
57 96 
4
3 15 8 23 
Sample Output 0

3 
3 5 
3 5 15 
3 15 
5 
5 15 
15 

57 
57 96 
96 

3 
3 8 
3 8 15 
3 8 15 23 
3 8 23 
3 15 
3 15 23 
3 23 
8 
8 15 
8 15 23 
8 23 
15 
15 23 
23 
Explanation 0

Self Explanatory `
  */
import java.io.*;
import java.util.*;

public class Solution {
    void print(int[] ar,ArrayList<Integer> ans,int start)
    {
        if(ans.size()!=0)
        {
            for(int n:ans)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }
        for(int i=start;i<ar.length;i++)
        {
            ans.add(ar[i]);
            print(ar,ans,i+1);
            ans.remove(ans.size()-1);
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int ar[]=new int[n];
            for(int j=0;j<n;j++)
            {
                ar[j]=sc.nextInt();
            }
            Solution s=new Solution();
            Arrays.sort(ar);
            ArrayList<Integer> ans=new ArrayList<>();
            s.print(ar,ans,0);
            System.out.println();
        }
        
        
    }
}
