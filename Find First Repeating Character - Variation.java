/*
Given a string of characters, find the first repeating character.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single string of characters.

Constraints

1 <= T <= 1000
'a' <= str[i] <= 'z'
1 <= len(str) <= 104

Output Format

For each test case, print the first repeating character, separated by newline. If there are none, print '.'.

Sample Input 0

4
datastructures
algorithms
smartinterviews
hackerrank
Sample Output 0

a
.
t
r
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {
        char repeting(String s)
        {
           int cnt[]=new int[26];
                for(int i=0;i<26;i++)
                {
                        cnt[i]=0;
                }
                for(int i=0;i<s.length();i++)
                {
                        
                if(cnt[s.charAt(i)-'a']>=1)
                {
                        return s.charAt(i);
                }
                        else
                        {
                                cnt[s.charAt(i)-'a']++;
                        }
        }
                return '.';
        }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            Solution s1=new Solution();
            int t=sc.nextInt();
            for(int i=0;i<t;i++)
            {
                    String s=sc.next();
                                        
 System.out.println(s1.repeting(s));
            }
    }
}
