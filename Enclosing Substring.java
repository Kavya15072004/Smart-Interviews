/*
Given 2 strings A and B, find the smallest substring of B having all the characters of A, in any order.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing 2 space separated strings - A and B.

Constraints

20 points
1 <= T <= 100
1 <= size(A), size(B) <= 100

60 points
1 <= T <= 100
1 <= size(A), size(B) <= 1000

120 points
1 <= T <= 100
1 <= size(A), size(B) <= 10000

General Constraints
'a' <= A[i],B[i] <= 'z'

Output Format

For each test case, print the length of the smallest substring of B having all the characters of A, separated by newline. If no such substring found, print -1.

Sample Input 0

4
fkqyu frqkzkruqmfqyuzlkyg
onmwvytbytn uqhmfjaqtgngcwkuzyamnerphfmw
bloets lwbcrsfothplxseplrtbshbtstjloxsf
dzpd dclzztpjldkndgbdqqzmbp
Sample Output 0

7
-1
13
9
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {
        boolean valid(int cntb[],int cnta[])
        {
                for(int i=0;i<26;i++)
                {
                        if(cntb[i]>cnta[i])
                        {
                                return false;
                        }
                }
                return true;
        }
        boolean check(int cntb[],int mid,String a)
        {
                int cnta[]=new int[26];
                for(int i=0;i<26;i++)
                {
                        cnta[i]=0;
                }
                for(int i=0;i<mid;i++)
                {
                  cnta[a.charAt(i)-'a']++;      
                }
                if(valid(cntb,cnta))
                {
                        return true;
                }
                for(int i=mid;i<a.length();i++)
                {
                       cnta[a.charAt(i-mid)-'a']--;
                        cnta[a.charAt(i)-'a']++;
                        if(valid(cntb,cnta))
                {
                        return true;
                }
                }
                return false;
        }
        int solve(String b,String a)
        {
                int cntb[]=new int[26];
                for(int i=0;i<26;i++)
                {
                        cntb[i]=0;
                }
                for(int i=0;i<b.length();i++)
                {
                        cntb[b.charAt(i)-'a']++;
                }
                int minlen=-1;
                int low=0;
                int high=a.length()-1;
                while(low<=high)
                {
                       int mid=(low+high)/2;
                        if(check(cntb,mid,a))
                        {
                                minlen=mid;
                                high=mid-1;
                        }
                        else{
                                low=mid+1;
                        }
                }
                return minlen;
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            Solution s=new Solution();
            int t=sc.nextInt();
            for(int i=0;i<t;i++)
            {
                    String b=sc.next();
                    String a=sc.next();
                    System.out.println(s.solve(b,a));
            }
    }
}
