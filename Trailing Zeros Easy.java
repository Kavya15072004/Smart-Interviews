/*
Count the number of trailing 0s in factorial of a given number.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each containing an integer N.

Constraints

1 <= T <= 10000
1 <= N <= 1015

Output Format

For each test case, print the number of trailing 0s in N!, separated by new line.

Sample Input 0

3
2
5
20
Sample Output 0

0
1
4
Explanation 0

2! = 2 [No trailing zeros]
5! = 120 [Trailing zeros=1]
20! = 2432902008176640000 [Trailing zeros=4]
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long n=sc.nextLong();
            long p=5;
            long res=0;
            while(n/p>0)
            {
                res+=n/p;
                p*=5;  
            }
            System.out.println(res);
        }
    }
}
