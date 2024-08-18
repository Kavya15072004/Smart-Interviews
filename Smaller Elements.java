/*
You are given an array of integers. For each element in the array, find the number of smaller elements on the right side and print the total count.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array. The second line contains the elements of the array.

Constraints

30 points
1 <= N <= 1000

70 points
1 <= N <= 100000

General Constraints
1 <= T <= 100
-10000 <= A[i] <= 10000

Output Format

For each test case, print the sum of count of smaller elements on right side of each element in the array, separated by new line.

Sample Input 0

2
5
5 10 54 11 8 
6
15 35 25 7 15 12 
Sample Output 0

4
10
Explanation 0

Test Case 1
Smaller Elements on right side of 5 : 0
Smaller Elements on right side of 10 : 1
Smaller Elements on right side of 54 : 2
Smaller Elements on right side of 11 : 1
Smaller Elements on right side of 8 : 0
Total Count = 0 + 1 + 2 + 1 + 0 = 4


Test Case 2
Smaller Elements on right side of 15 : 2
Smaller Elements on right side of 35 : 4
Smaller Elements on right side of 25 : 3
Smaller Elements on right side of 7 : 0
Smaller Elements on right side of 15 : 1
Smaller Elements on right side of 12 : 0
Total Count = 2 + 4 + 3 + 0 + 1 + 0 = 10
  */
import java.util.*;
class Solution {
    long count = 0;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0) {
            int n=s.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=s.nextInt();
            Solution sol=new Solution();
            sol.mergesort(a,0,n-1);
            System.out.println(sol.count);
            sol.count = 0;
        }
    }
    void mergesort(int a[],int lo,int hi) {
        if (lo==hi) 
            return;
            int mid=(lo+hi)/2;
            mergesort(a,lo,mid);
            mergesort(a,mid+1,hi);
            merge(a,lo,mid,hi);
    }
    void merge(int a[],int lo,int mid,int hi) {
        int temp[]=new int[hi-lo+1];
        int k=0,x=mid+1, low=lo;
        while(lo<=mid && x<=hi) {
            if(a[lo]<=a[x]) {
                temp[k++]=a[lo++];
            } else {
                count+=(mid-lo+1);
                temp[k++]=a[x++];
            }
        }
        while(lo<=mid) {
            temp[k++]=a[lo++];
        }
        while(x<=hi) {
            temp[k++]=a[x++];
        }
        for(int i=0;i<hi-low+1;i++) {
            a[low+i]=temp[i];
        }
    }
}
