/*
Write a program to generate all possible strings with balanced paranthesis having N pairs of curly braces.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each contains a single integer N.

Constraints

1 <= T <= 12
1 <= N <= 12

Output Format

For each test case, print each combinational pair of balanced paranthesis of length N in a lexicographical order along with the test case number, separated by newline.

Sample Input 0

2
3
2
Sample Output 0

Test Case #1:
{{{}}}
{{}{}}
{{}}{}
{}{{}}
{}{}{}
Test Case #2:
{{}}
{}{}
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {
        void genParanthesis(char a[],int n,int index,int oc,int cc)
        {
                
                if(index==n)
                {
                        
                        // for(int i=0;i<n;i++)
                        // {
                        //         System.out.print(a[i]);
                        // }
                        System.out.println(a);
                        return ;
                }
                if(oc<n/2)
                {
                        a[index]='{';
                        genParanthesis(a,n,index+1,oc+1,cc);
                }
                if(cc<oc)
                {
                        a[index]='}';
                        genParanthesis(a,n,index+1,oc,cc+1);
                }
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            Solution s=new Solution();
            int t=sc.nextInt();
            for(int j=0;j<t;j++)
            {
                    int n=sc.nextInt();
                    n=2*n;
                    int oc=0;
                    int cc=0;
                    int index=0;
                    char a[]=new char[n];
                    System.out.println("Test Case #"+(j+1)+":");
                    s.genParanthesis(a,n,index,oc,cc);
                    
            }
    }
}
