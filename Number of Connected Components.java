/*
Given an undirected graph, you have to find the number of connected components in the graph.

Input Format

First line of input contains T - number of test cases. First line of each test case contains N - number of nodes and M - number of edges. Its followed by M lines, each contains a pair (u,v) - denoting an undirected edge between node u and node v.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= M <= min(N*N, 1000)
1 <= u,v <= N

Output Format

For each test case, print the number of connected components, separated by newline.

Sample Input 0

2
5 3
1 3
2 4
3 2
10 9
3 4
5 1
2 5
4 6
2 3
6 3
1 4
8 9
8 10
Sample Output 0

2
3
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;
import java.util.ArrayList.*;
public class Solution {

    static void addEdge(ArrayList<Integer>[] ar,int e1,int e2)
    {
        ar[e1].add(e2);
        ar[e2].add(e1);
    }
    static void check(ArrayList<Integer>[] ar,boolean[] visited,int x)
    {
        
        visited[x]=true;
        
        for(int it:ar[x])
        {
            if(!visited[it])
                check(ar,visited,it);
                    
        }
       
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            //System.out.println("Test Case #"+(i+1)+":");
            int v=sc.nextInt();
            //System.out.println(v);
            int ed=sc.nextInt();
            ArrayList<Integer> ar[]=new ArrayList[v+1];
            for(int j=1;j<=v;j++)
            {
                ar[j]=new ArrayList<>();
            }
            //int e=sc.nextInt();
            for(int k=0;k<ed;k++)
            {
                int e1=sc.nextInt();
                int e2=sc.nextInt();
                addEdge(ar,e1,e2);
            }
            boolean visited[]=new boolean[v+1];
            for(int r=1;r<=v;r++)
            {
                visited[r]=false;
            }
            int cnt=0;
            for(int r=1;r<=v;r++)
            {
                if(visited[r]==false)
                {
                    cnt+=1;
                    check(ar,visited,r);
                }
            }
            System.out.println(cnt);
            
            
            
        }
    }
}
