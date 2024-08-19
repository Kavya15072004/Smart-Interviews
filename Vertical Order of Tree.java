/*
Given an array of unique elements, construct a Binary Search Tree and print the tree in a Vertical Order, starting from the left-most node. Print the nodes in each vertical in sorted order.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, print the Vertical Levels of the Binary Search Tree, separate each level by newline. Separate the output of different test cases with an extra newline.

Sample Input 0

3
5
1 2 3 4 5 
5
3 1 2 5 4 
7
4 5 15 0 1 7 17 
Sample Output 0

1 
2 
3 
4 
5 

1 
2 3 4 
5 

0 
1 4 
5 7 
15 
17 
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
        TreeMap<Integer, ArrayList<Integer>> tm=new TreeMap<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
       /* tm.put(0,new ArrayList<>());
        tm.get(0).add(root.data);
        */
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            if(!tm.containsKey(temp.ver))
                tm.put(temp.ver,new ArrayList<>());
            tm.get(temp.ver).add(temp.data);
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
            
        }
       
      for (Map.Entry<Integer, ArrayList<Integer>> entry : tm.entrySet()) {
            Integer key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            //System.out.println(value);
          Collections.sort(value);
          for(int i:value)
          {
              System.out.print(i+" ");
          }
          System.out.println();
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
