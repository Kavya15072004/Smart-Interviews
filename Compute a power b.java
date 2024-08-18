/*
Given 2 numbers - a and b, evaluate ab.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing 2 numbers - a and b, separated by space.

Constraints

30 points
1 <= T <= 1000
0 <= a <= 106
0 <= b <= 103

70 points
1 <= T <= 1000
0 <= a <= 106
0 <= b <= 109

Output Format

For each test case, print ab, separated by new line. Since the result can be very large, print result % 1000000007

Sample Input 0

4
5 2
1 10
2 30
10 10
Sample Output 0

25
1
73741817
999999937
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {
         boolean checkBit(int n,int i)
            {
                    if(((n>>i)&1)==1)
                            return true;
                    else
                            return false;
            }
                   
                    
            long compute(long a,int b)
            {
                     long res=1;
                    int mod=(int)1e9+7;
                    for(int i=0;i<32;i++)
                    {
                            if(checkBit(b,i))
                            {
                                    res=(res*a)%mod;
                            }
                                    
                    
                    a=(a*a)%mod;
                    }
                    return res;
            }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
           int t=sc.nextInt();
            for(int m=0;m<t;m++)
            {
           long a=sc.nextLong();
            int b=sc.nextInt();
            Solution s=new Solution();
                    System.out.println(s.compute(a,b));
                    
                   
            
    }
}
}
