/*
Given an array of unique elements, construct a Binary Search Tree and print the top-view of the tree. Top view of a Tree is the set of nodes visible when tree is viewed from top.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, print the top-view of the Binary Search Tree, separate by newline. Print the set of visible nodes from left to right.

Sample Input 0

3
6
10 20 13 3 17 18 
6
10 3 20 15 14 12 
7
10 3 8 20 7 6 4 
Sample Output 0

3 10 20 18 
12 3 10 20 
4 6 3 10 20 
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;
class Node
{
    int data,ver;
    Node right,left;
    Node(int data,int ver)
    {
        this.data=data;
        this.ver=ver;
    }
}
class Tree
{
    Node insert(Node root,int k,int ver)
    {
        if(root==null)
        {
            return new Node(k,ver);
        }
        if(root.data<k)
        {
            root.right=insert(root.right,k,ver+1);
        }
        if(root.data>k)
        {
            root.left=insert(root.left,k,ver-1);
        }
        return root;
    }
   
    
   void ans(Node root)
    {
        TreeMap<Integer, Integer> tm=new TreeMap<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
       /* tm.put(0,new ArrayList<>());
        tm.get(0).add(root.data);
        */
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            if(!tm.containsKey(temp.ver))
                tm.put(temp.ver,temp.data);
            //tm.get(temp.ver).add(temp.data);
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
            
        }
       
      for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            //System.out.println(value);
          //Collections.sort(value);
              System.out.print(entry.getValue()+" ");
      }
        }
    
    
    
    
    }
    
 
    
    

public class Solution {
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            Node root=null;
            Tree t=new Tree();
            for(int j=0;j<k;j++)
            {
                int h=sc.nextInt();
                root=t.insert(root,h,0);
            }
            
            t.ans(root);
            System.out.println();
        }
        
        
    }
}
