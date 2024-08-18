/*
Implement Insertion Sort and print the index at which the ith element gets inserted [i>=1].

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array. The next line contains N integers - elements of the array.

Constraints

1 <= T <= 100
2 <= N <= 100
-1000 <= ar[i] <= 1000

Output Format

For each test case, print the index at which the ith element gets inserted [i>=1], separated by space. Separate the output of different tests by newline.

Sample Input 0

4
8
176 -272 -272 -45 269 -327 -945 176 
2
-274 161
7
274 204 -161 481 -606 -767 -351
2
154 -109
Sample Output 0

0 1 2 4 0 0 6 
1 
0 0 3 0 0 2 
0 
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {
        void ans(int ar[],int n)
        {
                for(int i=1;i<n;i++)
                {
                        int temp=ar[i];
                        int j=i-1;
                                while(j>=0 && ar[j]>temp)
                                {
                                        ar[j+1]=ar[j];
                                        j--;
                                        
                                }
                                ar[j+1]=temp;
                                System.out.print(j+1+" ");
                        }
                
                System.out.println(" ");
        }

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
                    s.ans(ar,n);
            }
    }
}
