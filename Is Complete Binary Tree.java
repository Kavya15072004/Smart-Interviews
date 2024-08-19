/*
Given an array of unique elements, construct a Binary Search Tree and check if its a complete tree. In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, print "Yes" if it is a Complete Binary Search Tree, "No" otherwise, separated by newline.

Sample Input 0

3
5
1 2 3 4 5 
5
4 2 5 3 1 
7
4 5 15 0 1 7 17 
Sample Output 0

No
Yes
No
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node right,left;
    Node(int data)
    {
        this.data=data;
        //this.ver=ver;
    }
}
class Tree
{
    Node insert(Node root,int k)
    {
        if(root==null)
        {
            return new Node(k);
        }
        if(root.data<k)
        {
            root.right=insert(root.right,k);
        }
        if(root.data>k)
        {
            root.left=insert(root.left,k);
        }
        return root;
    }
   
    boolean ans(Node root,int level,int n)
    {
        if(root==null)
            return true;
        if(level>=n)
            return false;
        return ans(root.left,2*level+1,n) && ans(root.right,2*level+2,n);
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
                root=t.insert(root,h);
            }
            if(t.ans(root,0,k)==true)
                System.out.println("Yes");
            else
                System.out.println("No");
            
            
        }
        
        
    }
}
