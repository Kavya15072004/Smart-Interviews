/*
You are given two numbers A and B. Write a program to count the number of bits to be flipped to change the number A to the number B. Flipping a bit of a number means changing a bit from 1 to 0 or vice versa.

Input Format

First line of input contains T - number of test cases. Each of the next T lines contains 2 integer A and B, separated by space.

Constraints

1 <= T <= 100000
0 <= N <= 109

Output Format

For each test case, print the number of bit flips required to convert A to B, separated by new line.

Sample Input 0

4
20 10
16 8
1 153
549 24
Sample Output 0

4
2
3
6
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {

    int setBit(int n,int i)
    {
        if(((n>>i)&1)==1)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int k,l,cnt=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int j=0;j<=31;j++)
            {
                k=s.setBit(a,j);
                l=s.setBit(b,j);
                if(k!=l)
                {
                    cnt+=1;
                }
            }
            System.out.println(cnt);
            
        }
    }
}
