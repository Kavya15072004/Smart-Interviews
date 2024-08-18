/*
You are given an array of integers of size N. Create a new array such that the element at an index i in the new array is the product of all the elements of the original array except the element present at index i.

Input Format

First line of input contains T - number of test cases. For each test case, the first line contains N - the size of the array. The second line contains N integers - the elements of the array.

Constraints

1 <= T <= 100
1 <= N <= 105
0 <= A[i] <= 105

Output Format

For each test case, print the new array, separated by a newline. Since these numbers can be very large, print the numbers % 109 + 7

Sample Input 0

2
5
1 5 3 2 8
6
4 10 1 2 8 3
Sample Output 0

240 48 80 120 30
480 192 1920 960 240 640
Explanation 0

Test-Case 1
The product of all elements of the array except for the element at index 0 is 5 * 3 * 2 * 8 = 240
The product of all elements of the array except for the element at index 1 is 1 * 3 * 2 * 8 = 48
The product of all elements of the array except for the element at index 2 is 1 * 5 * 2 * 8 = 80
The product of all elements of the array except for the element at index 3 is 1 * 5 * 3 * 8 = 120
The product of all elements of the array except for the element at index 4 is 1 * 5 * 3 * 2 = 30
  */
import java.io.*;
import java.util.*;

public class Solution {
   
    public static int countZeros(long a[],int n)
    {
        int i,count=0;
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
                count++;
        }
        return count;
    }
  
    public static void main(String[] args) {
        
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        
        while(t>0)
        {
            int n=sc.nextInt();
            int i;
            long a[]=new long[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
            int z=countZeros(a,n);
        int mod=1000000000+7;
        long pp[]=new long[n];
        long sp[]=new long[n];
        pp[0]=a[0];
        sp[n-1]=a[n-1];
        for(i=1;i<n;i++)
        {
            pp[i]=(pp[i-1]*a[i])%mod;
        }
        for(i=n-2;i>=0;i--)
        {
            sp[i]=(sp[i+1]*a[i])%mod;
        }
            a[0]=sp[1];
            a[n-1]=pp[n-2];
            
            //long product=1;
            
            if(z==1)
            {
               for(i=1;i<n-1;i++)
               {   if(a[i]!=0)
                   a[i]=(sp[i+1]*pp[i-1])%mod;
                else
                    a[i]=0;
               }
            }
            else if(z==0)
            {
                for(i=1;i<n-1;i++)
                {
                        a[i]=(sp[i+1]*pp[i-1])%mod;
                    }
                
                }
            
            else
            {
                for(i=0;i<n;i++)
               {
                   a[i]=0;
               }
            }
            for(i=0;i<n;i++)
               {
                   System.out.print(a[i]+" ");
               }
            System.out.println();
                
            
            

            t--;
        }
    }
}
