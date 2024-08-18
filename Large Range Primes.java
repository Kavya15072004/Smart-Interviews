/*
Given 2 numbers M and N (M<=N), print all prime numbers between M and N (inclusive).

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains 2 space separated integers - M and N.

Constraints

30 points
1 <= T <= 100
0 <= M <= N <= 106
0 <= N-M <= 105

70 points
1 <= T <= 100
0 <= M <= N <= 1012
0 <= N-M <= 105

Output Format

For each test case, print all prime numbers p such that M <= p <= N, separated by newline. Print a extra newline between outputs of different test cases.

Sample Input 0

2
1 10
3 5
Sample Output 0

2
3
5
7

3
5
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {
    public static int[] preCompute()
    {   
     long j;
     int i;
        boolean pr[]=new boolean[1000001];
     pr[0]=false;
     pr[1]=false;
     for(i=2;i<1000001;i++)
         pr[i]=true;
     for(i=2;i<=Math.sqrt(1000001);i++)
     {
         if(pr[i]==true)
         {
             for(j=i*i;j<1000001;j+=i)
             {   int idx=(int)j;
                 pr[idx]=false;
             }
         }
     }
     
        int count=0;
        for(i=2;i<1000001;i++)
            if(pr[i]==true)
                count++;
       // System.out.println(c);
        int p[]=new int[count];
        int c=0;
        for(i=2;i<1000001;i++)
            if(pr[i]==true)
                p[c++]=i;
       /* for(i=0;i<c;i++)
            System.out.print(p[i]+" ");*/
     return p;
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        int p[]=preCompute();
        
        while(t>0)
        {
            
            int i,c=0;
            long a,b;
            a=sc.nextLong();
            b=sc.nextLong();
            long x=0,j;
            int s=(int)(b-a+1);
            boolean range[]=new boolean[s];
            for(i=0;i<s;i++)
                range[i]=true;
            
             if(a==1)
                   range[0]=false;
            if(a==0){
                 range[0]=false;
                  range[1]=false;
                //a=1;
            }
                   
            for(i=0;(long)p[i]*p[i]<=(b);i++)
            {   
                
                if(a%p[i]==0){
                    x=a;
                }
                if(a==p[i])
                    x=p[i]*2;
                
                
                if(a%p[i]!=0){
                    x=((a/p[i])+1)*p[i];
                }
               
                
              if(a==0||a==1)
                x=p[i]*2;
                
                 if(x==p[i])
                    x=p[i]*2;
                
                for(j=x;j<=b;j+=p[i])
                {   
                    int idx=(int)(j-a);
                    range[idx]=false;
                }
                
                
                
                
               
            }
            
          /* for(i=0;i<s;i++)
                System.out.print(range[i]);*/
            
           for(i=0;i<b-a+1;i++){
                    if(range[i]==true)
                    {   long idx=a+i;
                        System.out.println(idx);
                    }}
                
           if(t>1)
                 System.out.println();
            
            
            
            t--;
        
        
        
        
        
        }
    }}
