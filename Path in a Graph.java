/*
Given an undirected graph, you have to find if there exists a path between 2 given nodes of the graph.

Input Format

First line of input contains T - number of test cases. First line of each test case contains N - number of nodes and M - number of edges. Its followed by M lines, each contains a pair (u,v) - denoting an undirected edge between node u and node v. The next line contains Q - number of queries. Its followed by Q lines, each contains a pair (u,v) - denoting an query to check if there exits a path between node u and node v.

Constraints

1 <= T <= 1000
1 <= N <= 100
0 <= M,Q <= min(N*N, 100)
1 <= u,v <= N

Output Format

For each test case, first print the test case number as shown. For each query of a test case, print "Yes" if path exists between the nodes of the query, print "No" otherwise, separated by newline.

Sample Input 0

2
5 3
1 3
2 4
3 2
4
1 5
3 4
4 5
1 4
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
5
2 4
8 4
9 10
10 5
9 7
Sample Output 0

Test Case #1:
No
Yes
No
Yes
Test Case #2:
Yes
No
Yes
No
No
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
    static boolean check(ArrayList<Integer>[] ar,boolean[] visited,int x,int y)
    {
        visited[x]=true;
        if(x==y)
            return true;
        for(int it:ar[x])
        {
            if(!visited[it])
                if(check(ar,visited,it,y))
                    return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println("Test Case #"+(i+1)+":");
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
            int q=sc.nextInt();
            while(q-->0)
            {
                int x=sc.nextInt();
                int y=sc.nextInt();
                boolean visited[]=new boolean[v+1];
               // System.out.println(v+1);
                if(check(ar,visited,x,y))
                    System.out.println("Yes");
                else
                   System.out.println("No");
            }
            
            
            
        }
    }
}
