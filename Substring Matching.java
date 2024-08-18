/*
You are given two strings A and B. You are also given Q queries with 4 indices i, j, k and l. Check whether the substring of A[i:j] matches the substring of B[k:l].

Input Format

First line of input contains T - number of test cases. In each test case, the first line contains the string A and the second line contains the string B.
The next line contains an integer Q - the number of queries. The Q subsequent lines each contain 4 integers i, j, k and l, separated by a space.

Constraints

30 points
1 <= T <= 100
1 <= len(A), len(B) <= 100
0 <= Q <= 1000

70 points
1 <= T <= 100
1 <= len(A), len(B) <= 10000
0 <= Q <= 10000

General Constraints
'a' <= A[i], B[i] <= 'z'
0 <= i <= j < len(A)
0 <= k <= l < len(B)

Output Format

For each query, on a new line, print "Yes" if the substring of A matches the substring of B, print "No" otherwise.

Sample Input 0

2
smartinterviews
intermediate
2
5 9 0 4
1 3 2 4
hackerrank
hackerearth
1
0 3 0 3
Sample Output 0

Yes
No
Yes
Explanation 0

Test Case 1
The substring of "smartinterviews" from index 5 to 9 is "inter". The substring of "intermediate" from 0 to 4 is also "inter". Since they are equal, the output is "Yes".
The substring of "smartinterviews" from index 1 to 3 is "mar". The substring of "intermediate" from 2 to 4 is "ter". Since they are not equal, the output is "No".
  */
import java.io.*;
import java.util.*;

public class Solution {
        boolean solve(String a,String b,int m,int n,int k,int l,long pha[],long phb[],long pwr[])
        {
                long hasha,hashb;
                long mod=(long)(1e9+7);
           int pr=31;
                if(m!=0)
                        hasha=(pha[n]-pha[m-1]+mod)%mod;
                else
                        hasha=pha[n];
                if(k!=0)
                        hashb=(phb[l]-phb[k-1]+mod)%mod;
                else
                        hashb=phb[l];
                if(m>k)
                {
                        hashb=(hashb*pwr[m-k])%mod;
                }
                else{
                        hasha=(hasha*pwr[k-m])%mod;
                }
                if(hashb==hasha)
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
            for(int z=0;z<t;z++)
            {
                    String a=sc.next();
                    String b=sc.next();
                    long q=sc.nextInt();
                    
                     int limit=Math.max(a.length(),b.length())+1;
                long pwr[]=new long[limit];
                pwr[0]=1;
                int pr=31;
                long mod=(long)(1e9+7);
                for(int i=1;i<limit;i++)
                {
                        pwr[i]=(pwr[i-1]*(long)pr)%mod;
                }
                long pha[]=new long[a.length()];
                pha[0]=(a.charAt(0)*pwr[1])%mod;
                for(int i=1;i<a.length();i++)
                {
                        pha[i]=((pha[i-1]+(long)a.charAt(i)*pwr[i+1])%mod)%mod;
                }
                long phb[]=new long[b.length()];
                phb[0]=(b.charAt(0)*pwr[1])%mod;
                for(int i=1;i<b.length();i++)
                {
                        phb[i]=((phb[i-1]+(long)b.charAt(i)*pwr[i+1])%mod)%mod;
                }
                    
                    
                    for(int j=0;j<q;j++)
                    {
                            int m=sc.nextInt();
                              int n=sc.nextInt();
                              int k=sc.nextInt();
                              int l=sc.nextInt();
                           if(s.solve(a,b,m,n,k,l,pha,phb,pwr))
                              {
                                       System.out.println("Yes");
                              }
                              else
                              {
                                       System.out.println("No");
                              }
                    }
            }
    }
}
