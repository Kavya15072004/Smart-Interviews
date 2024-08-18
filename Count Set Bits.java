/*
Given a number N, find the number of bits that are set to 1 in its binary representation.

Input Format

First line of input contains T - the number of test cases. It is followed by T lines, each line contains a single integer N.

Constraints

1 <= T <= 104
0 <= N <= 1018

Output Format

For each test case, print the number of bits set to 1 in the binary representation of N, separated by a new line.

Sample Input 0

3
4
15
10
Sample Output 0

1
4
2
Explanation 0

Test-Case 1:
The binary representation of 4 is 100. The number of 1's in the binary representation of 4 is 1.

Test-Case 2:
The binary representation of 15 is 1111. The number of 1's in the binary representation of 15 is 4.
  */
import java.io.*;
import java.util.*;

public class Solution {
    boolean checkbit(long n,int i)
    {
        if(((n>>i)&1)==1)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int t=sc.nextInt();
        for(int y=0;y<t;y++)
        {
            int c=0;
            long n=sc.nextLong();
            for(int i=0;i<64;i++)
            {
                if(s.checkbit(n,i))
                {
                  c+=1;  
                }
            }
            System.out.println(c);
        }
        
    }
}
