/*
Given a string, find the length of the largest palindromic substring.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. The first line contains N - the size of the string and the second line contains a string of size N, containing only lowercase english alphabets.

Constraints

30 points
1 <= T <= 200
1 <= len(S) <= 102
'a' <= S[i] <= 'z'

70 points
1 <= T <= 200
1 <= len(S) <= 103
'a' <= S[i] <= 'z'

Output Format

For each test case, print the length of the largest palindromic substring, separated by newline.

Sample Input 0

5
8
pfyafafd
9
sllwffoqq
6
yoogvb
4
hcch
23
mzmqnnrkurfmmfrukrnnqsm
Sample Output 0

3
2
2
4
18
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {
        int solve(int n,String s)
        {
                int ans=1;
                int len=s.length();
                for(int i=0;i<len;i++)
                {
                        int l1=i,r1=i;
                        int l2=i,r2=i+1;
                        while(l1>=0 && r1<len && s.charAt(l1)==s.charAt(r1))
                        {
                                l1--;
                                r1++;
                        }
                         while(l2>=0 && r2<len && s.charAt(l2)==s.charAt(r2))
                        {
                                l2--;
                                r2++;
                        }
                        if((r1-l1-1)>(r2-l2-1))
                        {
                                if((r1-l1-1)>ans)
                                {
                                ans=r1-l1-1;
                                }
                        }
                        else
                        {
                                if((r2-l2-1)>ans)
                                {
                                ans=r2-l2-1;
                                }
                              
                        }
                }
                return ans;
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            Solution s1=new Solution();
            int t=sc.nextInt();
            for(int i=0;i<t;i++)
            {
                    int n=sc.nextInt();
                    String s=sc.next();
                    System.out.println(s1.solve(n,s));
            }
    }
}
